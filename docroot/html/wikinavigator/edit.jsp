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

<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>

<portlet:defineObjects />
<%@page import="no.uninett.fas.agora.wikinavigator.service.WikiIndexLocalServiceUtil"%>
<%@include file="init.jsp" %>

<portlet:actionURL name="autoUpdate" var="autoUpdateURL" ></portlet:actionURL>

<aui:form action="autoUpdateURL" >
	<aui:input name="auto" type="checkbox"></aui:input>
</aui:form>
