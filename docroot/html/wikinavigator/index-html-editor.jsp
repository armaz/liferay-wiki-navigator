
<%@page import="no.uninett.fas.agora.wikinavigator.service.WikiIndexLocalServiceUtil"%>
<%@include file="init.jsp" %>
<portlet:defineObjects />

<%--
/**
 * Copyright (c) 2000-2012 Liferay, Inc. All rights reserved.
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

<%
//WikiPage wikiPage = (WikiPage)request.getAttribute("edit_page.jsp-wikiPage");



String nodeIdString=ParamUtil.getString(request, "nodeId");

long nodeId=Long.valueOf(nodeIdString).longValue();
WikiIndex wikiIndex= WikiIndexLocalServiceUtil.getWikiIndex(nodeId);
String content = wikiIndex.getContent();

String tilbakeurl=ParamUtil.getString(request, "tilbakeurl");



%>

<liferay-ui:header
	backLabel=""
	backURL="<%= tilbakeurl %>"
	localizeTitle="<%= false %>"
	title=""
/>

<portlet:actionURL name="updateWikiIndex" var="updateWikiIndexURL" ></portlet:actionURL>


<aui:form
name="fm" action="<%= updateWikiIndexURL.toString() %>" method="POST" >




<liferay-ui:input-editor editorImpl="<%= EDITOR_WYSIWYG_IMPL_KEY %>" width="100%" />

<aui:input name="content" type="hidden" />
<aui:input name="nodeId" type="hidden" value="<%=nodeIdString %>"/>

<aui:button name="save" value="Lagre" onClick="javascript:wikiindexer_savePage()"></aui:button>
</aui:form>

<script>
	function <portlet:namespace />initEditor() {
		return "<%= UnicodeFormatter.toString(content) %>";
	}

	function wikiindexer_savePage() {

		if (window.<portlet:namespace />editor) {
			document.<portlet:namespace />fm.<portlet:namespace />content.value = window.<portlet:namespace />editor.getHTML();
		}

		submitForm(document.<portlet:namespace />fm);
	}	
</script>

<%!
public static final String EDITOR_WYSIWYG_IMPL_KEY = "editor.wysiwyg.portal-web.docroot.html.portlet.wiki.edit.html.jsp";
%>