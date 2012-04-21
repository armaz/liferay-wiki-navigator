<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>

<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui" %>
<%@ taglib uri="http://liferay.com/tld/portlet" prefix="liferay-portlet" %>
<%@ taglib uri="http://liferay.com/tld/security" prefix="liferay-security" %>
<%@ taglib uri="http://liferay.com/tld/theme" prefix="liferay-theme" %>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>
<%@ taglib uri="http://liferay.com/tld/util" prefix="liferay-util" %>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>



<%@page import="com.liferay.portal.security.permission.PermissionCheckerFactoryUtil"%>
<%@page import="com.liferay.portal.security.permission.PermissionChecker"%>
<%@page import="com.liferay.portal.security.permission.ActionKeys"%>
<%@page import="com.sun.xml.internal.ws.client.RequestContext"%>
<%@ page import="java.util.List"%>
<%@ page import="java.util.ArrayList"%>
<%@ page import="com.liferay.portlet.wiki.model.WikiPage"%>
<%@ page import="com.liferay.portlet.wiki.service.WikiPageLocalServiceUtil"%>
<%@ page import="com.liferay.portlet.wiki.service.WikiNodeLocalServiceUtil"%>

<%@ page import="com.liferay.portlet.wiki.model.WikiNode"%>
<%@ page import="com.liferay.portal.kernel.exception.PortalException"%>
<%@ page import="com.liferay.portal.kernel.exception.SystemException"%>
<%@ page import="com.liferay.portal.kernel.log.Log"%>
<%@ page import="com.liferay.portal.kernel.log.LogFactoryUtil"%>
<%@ page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@ page import="com.liferay.portal.model.Group"%>
<%@ page import="com.liferay.portal.service.GroupLocalServiceUtil"%>
<%@ page import="com.liferay.portal.util.PortalUtil"%>
<%@
page import="com.liferay.portal.kernel.bean.BeanParamUtil" %>
<%@
page import="com.liferay.portal.kernel.util.StringPool" %>
<%@
page import="com.liferay.portal.kernel.util.UnicodeFormatter" %>

<%@
page import="java.util.HashMap" %><%@
page import="java.util.HashSet" %><%@
page import="java.util.Iterator" %><%@
page import="java.util.LinkedHashMap" %><%@
page import="java.util.LinkedHashSet" %><%@
page import="java.util.List" %><%@
page import="java.util.Locale" %><%@
page import="java.util.Map" %>


<%@ page import="javax.persistence.Access"%>
<%@ page import="javax.portlet.ActionRequest"%>
<%@ page import="javax.portlet.ActionResponse"%>
<%@ page import="javax.portlet.PortletException"%>
<%@ page import="javax.portlet.PortletURL"%>

<%@ page import="no.uninett.fas.agora.wikinavigator.*"%>
<%@ page import="no.uninett.fas.agora.wikinavigator.model.*"%>


<portlet:defineObjects />
<liferay-theme:defineObjects />

