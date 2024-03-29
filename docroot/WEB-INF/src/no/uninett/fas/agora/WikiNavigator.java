package no.uninett.fas.agora;

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

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.json.JSONArray;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
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

}
