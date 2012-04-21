<%--
/**
* Copyright (c) 2000-2010 Liferay, Inc. All rights reserved.
*
* This library is free software; you can redistribute it and/or modify it under
* the terms of the GNU Lesser General Public License as published by the Free
* Software Foundation; either version 2.1 of the License, or (at your option)
* any later version.
*
* This library is distributed in the hope that it will be useful, but WITHOUT
* ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
* FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
* details.
*/
--%>

<%@page import="no.uninett.fas.agora.wikinavigator.model.WikiIndex"%>
<%@page import="no.uninett.fas.agora.wikinavigator.service.WikiIndexLocalServiceUtil"%>
<%@ page import="com.liferay.taglib.theme.IncludeTag"%>
<%@ page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@ page import="java.io.IOException"%>
<%@ page import="java.io.OutputStream" %>

<%@ page import="java.text.MessageFormat"%>
<%@ page import="java.util.List"%>

<%@ page import="javax.persistence.Access"%>
<%@ page import="javax.portlet.ActionRequest"%>
<%@ page import="javax.portlet.ActionResponse"%>
<%@ page import="javax.portlet.PortletException"%>
<%@ page import="javax.portlet.PortletURL"%>
<%@ page import="javax.portlet.ProcessAction"%>
<%@ page import="javax.portlet.RenderRequest"%>
<%@ page import="javax.portlet.RenderResponse"%>
<%@ page import="javax.portlet.ResourceRequest"%>
<%@ page import="javax.portlet.ResourceResponse"%>

<%@ page import="com.liferay.portal.kernel.exception.PortalException"%>
<%@ page import="com.liferay.portal.kernel.exception.SystemException"%>
<%@ page import="com.liferay.portal.kernel.json.JSONArray"%>
<%@ page import="com.liferay.portal.kernel.json.JSONFactoryUtil"%>
<%@ page import="com.liferay.portal.kernel.json.JSONObject"%>
<%@ page import="com.liferay.portal.kernel.log.Log"%>
<%@ page import="com.liferay.portal.kernel.log.LogFactoryUtil"%>
<%@ page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@ page import="com.liferay.portal.model.Group"%>
<%@ page import="com.liferay.portal.service.GroupLocalServiceUtil"%>
<%@ page import="com.liferay.portal.util.PortalUtil" %>
<%@ page import="com.liferay.portlet.wiki.model.WikiNode" %>
<%@ page import="com.liferay.portlet.wiki.model.WikiPage" %>
<%@ page import="com.liferay.portlet.wiki.service.WikiNodeLocalServiceUtil"%>
<%@ page import="com.liferay.portlet.wiki.service.WikiPageLocalServiceUtil"%>

<%@
page import="com.liferay.portlet.PortletURLUtil" %>
<%@
page import="javax.portlet.PortletURL" %>

<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>


<portlet:defineObjects />

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

if (wikiIndex.isAuto()){ 
	request.setAttribute("no.uninett.fas.wpage",null);
	Integer wpageLevel = new Integer(0);
	request.setAttribute("no.uninett.fas.wpage.level", wpageLevel);

%>

    <jsp:include page="treenode.jsp"/>

<%
}else{
	PortletURL pu= PortletURLUtil.getCurrent(renderRequest, renderResponse);
	
	PortletURL editPageURL = renderResponse.createRenderURL();

	editPageURL.setParameter("jspPage", "/html/wikinavigator/index-html-editor.jsp");
	editPageURL.setParameter("redirect", pu.toString());
	editPageURL.setParameter("nodeId", String.valueOf(wnode.getNodeId()));
	
%>
<a href="<%=editPageURL.toString() %>">Editer</a>
	<%= wikiIndex.getContent() %>
	
<% 
}
%>


