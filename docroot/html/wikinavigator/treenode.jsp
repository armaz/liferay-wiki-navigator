<%@include file="init.jsp" %>


<%
Log logger = LogFactoryUtil.getLog("no.uninett.fas.AWNServicePortlet"); 

WikiNode wnode=null;
String ulclass="";


//PortletURL url=renderResponse.createActionURL();
//url.setParameter(ActionRequest.ACTION_NAME,"clicked");
String currentTitle=renderRequest.getParameter("title");


//
// Find wikipages for each folder
//
List<WikiPage> plist = new ArrayList<WikiPage>(1);
WikiPage node= (WikiPage)request.getAttribute("no.uninett.fas.wpage");
Integer wpageLevel = (Integer)request.getAttribute("no.uninett.fas.wpage.level");
int intLevel = wpageLevel.intValue();

if (node==null){
	try {		
		Group group = GroupLocalServiceUtil.getGroup(PortalUtil.getScopeGroupId(request)); 
		wnode = WikiNodeLocalServiceUtil.getNode(group.getGroupId(),"Main");			
	} catch (Exception e) {
		e.printStackTrace();
		logger.error("Error: Could'nt find the default initial wiki");
	}
	plist=  WikiPageLocalServiceUtil.getChildren(wnode.getNodeId(), true, ""); //WikiPageLocalServiceUtil.getPage(wnode.getNodeId(),"Forsiden");
	
	logger.debug("Antall sider returnert for Wiki Main:"+plist.size());
	ulclass="wiki_navigator";
} else {
	plist=node.getChildPages();
	ulclass="sub_wiki_navigator";
}
request.removeAttribute("no.uninett.fas.wpage");
//
// Travers and write wikipages for this folder and traver further down
//

String valgtclass="";
if (plist.size()>0){
	out.append("<ul class='" + ulclass + "'>");
	for (WikiPage wpage : plist){
		
		if (wpage.getRedirectPage()!=null){ // If this is a page that is renamed (it is only a  redirect)
			continue;
		}
		//url.setParameter("wikiTitle",String.valueOf(wpage.getTitle()));

		String cssClass = "";
		if(intLevel == 0) {
			cssClass = "wpage-rootlevel";
		} else if(intLevel == 1) {
			cssClass = "wpage-sublevel";
		} else {
			cssClass = "wpage-leaflevel";
		}
		
		if (wpage.getTitle().equals(currentTitle)) {
			valgtclass = "valgt" + " " + cssClass;
		} else {
			valgtclass = cssClass;
		}
		
		if (permissionChecker.hasPermission( // If allowed for the user to see
				wpage.getGroupId(), 
				WikiPage.class.getName(),
				wpage.getResourcePrimKey(), 
				ActionKeys.VIEW)) {
			
			logger.debug("getPrimaryKey : Har tilgang : "+wpage.getPrimaryKey());	
			
			WikiIndexPage wipage=WikiIndexPageLocalServiceUtil.getWikiIndexPage(wpage.getPageId());
			out.append("<li class='" + valgtclass + "' name='wpi_"+wpage.getPageId()+"' index='"+wipage.getOrder()+"'>");			

            String urlTitle = wpage.getTitle().replace("/", "<SLASH>").replace("+","<PLUS>").replace("?","<QUESTION>");
			out.append("<a href='"+baseurl+ HttpUtil.encodeURL(urlTitle)+"'>"+wipage.getTitle()+"</a> ");
		} else {
			logger.debug("Missing permissions (" + wpage.getTitle() + ") ");			
		}
		request.setAttribute("no.uninett.fas.wpage",wpage);
		wpageLevel = new Integer(intLevel + 1);
		request.setAttribute("no.uninett.fas.wpage.level", wpageLevel);
		%>
		<jsp:include page="treenode.jsp"/>
		</li>
		<% 
		
	}
	out.append("</ul>");
}
%>

