
<%@page import="javax.portlet.ResourceURL"%>
<%@page import="javax.portlet.MimeResponse"%>
<%@page import="com.liferay.portal.kernel.portlet.LiferayWindowState"%>
<%@page import="com.liferay.portal.kernel.language.LanguageUtil"%>
<%@page import="com.liferay.portal.model.User" %>
<%@page import="com.liferay.portal.kernel.util.WebKeys" %>
<%@include file="init.jsp" %>
<%



 Log logger = LogFactoryUtil.getLog("no.uninett.fas.AWNServicePortlet"); 
 List<WikiNode> wlist=null;
 WikiNode wnode=null;
try {
	
	Group group = GroupLocalServiceUtil.getGroup(PortalUtil.getScopeGroupId(request)); 
	wlist = WikiNodeLocalServiceUtil.getNodes(group.getGroupId());
	if(wlist.size() > 0) {
		wnode = wlist.get(0);
		logger.debug("found wikinode : " + wnode.getName());		
		
	} else {
		logger.debug("Error: no wiki in this group");
	}
		
} catch (SystemException e) {
	logger.error("Error getting wikinodes: " + e.getMessage());
	throw new PortletException("Error getting wikinodes: " + e.getMessage());
} catch (PortalException e) {
	logger.error("Error getting wikinodes: " + e.getMessage());
	throw new PortletException("Error getting wikinodes: " + e.getMessage());
}

WikiIndex wikiIndex= WikiIndexLocalServiceUtil.getWikiIndex(wnode.getNodeId());
wikiIndex.setAuto(true);


// Edit mode URL

PortletURL pu= PortletURLUtil.getCurrent(renderRequest, renderResponse);	

PortletURL cancelURL = renderResponse.createRenderURL();


PortletURL editPageURL = renderResponse.createRenderURL();
editPageURL.setParameter("redirect", pu.toString());
editPageURL.setParameter("nodeId", String.valueOf(wnode.getNodeId()));
editPageURL.setParameter("editmode", "1");

String editmode=ParamUtil.getString(request, "editmode",null);
String redirectUrl=ParamUtil.getString(request, "redirect",null);

//editPageURL.setParameter("jspPage", "/html/wikinavigator/view.jsp");


request.setAttribute("no.uninett.fas.wpage",null);
Integer wpageLevel = new Integer(0);
request.setAttribute("no.uninett.fas.wpage.level", wpageLevel);
	

// Are you good enough to get the edit button?

boolean isSiteOwnerOrAdmin = false;

try{

    ThemeDisplay td = (ThemeDisplay) request.getAttribute(WebKeys.THEME_DISPLAY); 

    User uzer = td.getRealUser();
    long siteId = td.getScopeGroupId();

    if( PortalUtil.isGroupOwner( uzer, siteId ) ){
        isSiteOwnerOrAdmin = true;
    }else if( PortalUtil.isOmniadmin( uzer.getUserId() )){
        isSiteOwnerOrAdmin = true;
    }

}catch(Exception e){
    logger.error("Error getting wikinodes: " + e.getMessage());
}

%>

<!-- removing the edit function for now -->

	<div class="page-actions top-actions">

        <c:if test="<%= isSiteOwnerOrAdmin %>">

            <liferay-ui:icon
                        id="editme"
                        image="edit"
                        label="<%= true %>"
                        url="#"
            />

        </c:if>

	</div>
	 
	<portlet:actionURL name="updateWikiIndex" var="updateurl"></portlet:actionURL>

			<aui:form  action="<%= updateurl %>">
			<jsp:include page="treenode.jsp"/>							
			<div id="<portlet:namespace/>inputsplace" style="display:bock"></div>
			<div id="<portlet:namespace/>updatebuttons" style="display:none">
		 		<aui:button  name="Save" value="<%= LanguageUtil.get(locale,\"save\") %>" onclick="javascript:wikiIndexSubmit()"></aui:button>
		 		<aui:button  name="Cancel" value="<%= LanguageUtil.get(locale,\"cancel\") %>" onclick="javascript:cancelWikiEditing()"></aui:button>			 		
		 	</div>			 	
			</aui:form>				


<script type="text/javascript" charset="utf-8">


/* remove functionality of editing names etc */
$j(document).ready(function(){

	$('#<portlet:namespace/>editme').click(function(){
    /*
     * startEditMode1($('.wiki_navigator',$('#<portlet:namespace/>portlet')));
     */
	    startEditMode2($('.wiki_navigator'));
    });

	sortIndexTable($j('ul.wiki_navigator'));
});

function sortIndexTable(indextable){
	$j('ul',indextable).each(function(){
		
		//$j('li',this)
		$j(this).children('li').sortElements(function(a, b){
		    return $j(a).attr('index') > $(b).attr('index') ? 1 : -1;
		});		
		sortIndexTable(this);
	});
}


function startEditMode2(ul){
	$('#<portlet:namespace/>editme').replaceWith('<span>'+$('#<portlet:namespace/>editme').text()+'</span>')
	$(ul).wrap('<div class="in_edit_mode"/>');
	$('#<portlet:namespace/>updatebuttons').show();
	$('li',ul).each(function(){
		//alert($(this).text()+$('a',this).size());
		var a=$(this).children('a').first();
		$(this).data('link',$(a).html());
		//$(a).replaceWith('<span class="editmodenode" >'+$(a).text()+'</span>');
		//var $(this).children('span').first().click(function(){
			editNode(a);
		//});
	});
		/*
	$('ul',ul).each(function(){
		startEditMode(ul);
	});*/
}
// obj skal være span (som er satt istedet for opprinnelig a)
function editNode(obj){
	$(obj).unbind('click');
	
	var img='<img class="wiki_index_draggable" src="<%=themeDisplay.getPathThemeImages() %>/draggable_wiki_index.png"></img>';
	
	var tit=obj.text();
	obj.before(img);
	obj.hide();	
	var inputobj=$('<input name="'+obj.parent().attr('name')+'" value="'+tit+'"/>').change(function(){
		$("#<portlet:namespace/>fm").data("ready","1");		
	});	
	obj.after(inputobj);
	obj.parent().parent().sortable({     //parent.parent = ul elementet
		   stop: function(event, ui) {   // kalles ved endring i sortering	
			   $("#<portlet:namespace/>fm").data("ready","1");
		   	   var container_id='<portlet:namespace/>_'+$j(ui.item).parent().parent().attr('name');
		   	   if ($j("#"+container_id).size()>0){
		   			$j("#"+container_id).empty();
		   	   }else{
		   			$('#<portlet:namespace/>inputsplace').append('<div id="'+container_id+'"/>');
		   	   }
		   	   $(ui.item).parent().children().each(function(){
		   		   var name='o'+$(this).attr('name');
		   		   var index=$(this).index();
		   		   var txt=$j('input',$j(this)).val();
		   			$j("#"+container_id).append('<input type="hidden" id="'+name+'" name="'+name+'" value="'+index+'" ></input>');
			   		
		   	   });
		   		
		   }
	});	
}

function wikiIndexSubmit(){
	if ($("#<portlet:namespace/>fm").data('ready')=="1"){
		$("#<portlet:namespace/>fm").submit();
	}else{
		//alert("Ingen forandringer utført !");
	}
}

function cancelWikiEditing(){
	location="<%=cancelURL%>";
}

</script>


