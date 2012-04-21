package no.uninett.fas.agora.wikinavigator;

import java.io.IOException;
import java.io.OutputStream;
import java.text.MessageFormat;
import java.util.List;

import javax.persistence.Access;
import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletException;
import javax.portlet.PortletURL;
import javax.portlet.ProcessAction;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.omg.CORBA.Request;

import no.uninett.fas.agora.wikinavigator.model.WikiIndex;
import no.uninett.fas.agora.wikinavigator.service.WikiIndexLocalServiceUtil;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.json.JSONArray;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.servlet.SessionMessages;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.model.Group;
import com.liferay.portal.service.GroupLocalServiceUtil;
import com.liferay.portal.util.PortalUtil;
import com.liferay.portlet.wiki.model.WikiNode;
import com.liferay.portlet.wiki.model.WikiPage;
import com.liferay.portlet.wiki.service.WikiNodeLocalServiceUtil;
import com.liferay.portlet.wiki.service.WikiPageLocalServiceUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;

/**
 * Portlet implementation class WikiNavigator
 * 
 * PS! This IS NOT USED. The current implementation doesn't use action-url and render-parameters.
 * Instead it uses links of type /c/wiki/find_page?pageResourcePrimKey=xxx
 * 
 */
public class WikiNavigator extends MVCPortlet {
 
	private static Log logger = LogFactoryUtil.getLog("no.uninett.fas.WikiNavigator");  

	
	
	@ProcessAction(name="clicked")
	public void clicked(ActionRequest req, ActionResponse resp) throws PortletException, IOException{
    	String  title= req.getParameter("wikiTitle");
    	logger.debug("got action clicked : nodeid="+title);
    	resp.setRenderParameter("title", title);
    	//super.processAction(req, resp);
    }
	
	@ProcessAction(name="updateWikiIndex")
	public void updateWikiIndex(ActionRequest req, ActionResponse resp) throws PortletException, IOException{
    	String  newcontent= req.getParameter("content");
    	long  nodeId= ParamUtil.getLong(req, "nodeId");
    	logger.debug("got action updateWikiIndex : nodeid="+nodeId);
    	System.out.println("got action updateWikiIndex : nodeid="+nodeId);

    	try {
			WikiIndex wikiIndex=WikiIndexLocalServiceUtil.getWikiIndex(nodeId);
			wikiIndex.setContent(newcontent);
			WikiIndexLocalServiceUtil.updateWikiIndex(wikiIndex);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		} 
    	//super.processAction(req, resp);
    }
	
	@ProcessAction(name="autoUpdate")
	public void autoUpdate(ActionRequest req, ActionResponse resp) throws PortletException, IOException{
    	String  title= req.getParameter("wikiTitle");
    	logger.debug("got action clicked : nodeid="+title);
    	resp.setRenderParameter("title", title);
    	//super.processAction(req, resp);
    }	

}
