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

package no.uninett.fas.agora.wikinavigator.service;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableLocalService;

/**
 * The utility for the wiki index page local service. This utility wraps {@link no.uninett.fas.agora.wikinavigator.service.impl.WikiIndexPageLocalServiceImpl} and is the primary access point for service operations in application layer code running on the local server.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author armaz
 * @see WikiIndexPageLocalService
 * @see no.uninett.fas.agora.wikinavigator.service.base.WikiIndexPageLocalServiceBaseImpl
 * @see no.uninett.fas.agora.wikinavigator.service.impl.WikiIndexPageLocalServiceImpl
 * @generated
 */
public class WikiIndexPageLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link no.uninett.fas.agora.wikinavigator.service.impl.WikiIndexPageLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the wiki index page to the database. Also notifies the appropriate model listeners.
	*
	* @param wikiIndexPage the wiki index page
	* @return the wiki index page that was added
	* @throws SystemException if a system exception occurred
	*/
	public static no.uninett.fas.agora.wikinavigator.model.WikiIndexPage addWikiIndexPage(
		no.uninett.fas.agora.wikinavigator.model.WikiIndexPage wikiIndexPage)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addWikiIndexPage(wikiIndexPage);
	}

	/**
	* Creates a new wiki index page with the primary key. Does not add the wiki index page to the database.
	*
	* @param wikiPageId the primary key for the new wiki index page
	* @return the new wiki index page
	*/
	public static no.uninett.fas.agora.wikinavigator.model.WikiIndexPage createWikiIndexPage(
		long wikiPageId) {
		return getService().createWikiIndexPage(wikiPageId);
	}

	/**
	* Deletes the wiki index page with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param wikiPageId the primary key of the wiki index page
	* @return the wiki index page that was removed
	* @throws PortalException if a wiki index page with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static no.uninett.fas.agora.wikinavigator.model.WikiIndexPage deleteWikiIndexPage(
		long wikiPageId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteWikiIndexPage(wikiPageId);
	}

	/**
	* Deletes the wiki index page from the database. Also notifies the appropriate model listeners.
	*
	* @param wikiIndexPage the wiki index page
	* @return the wiki index page that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static no.uninett.fas.agora.wikinavigator.model.WikiIndexPage deleteWikiIndexPage(
		no.uninett.fas.agora.wikinavigator.model.WikiIndexPage wikiIndexPage)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteWikiIndexPage(wikiIndexPage);
	}

	public static com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return getService().dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .dynamicQuery(dynamicQuery, start, end, orderByComparator);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQueryCount(dynamicQuery);
	}

	public static no.uninett.fas.agora.wikinavigator.model.WikiIndexPage fetchWikiIndexPage(
		long wikiPageId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchWikiIndexPage(wikiPageId);
	}

	/**
	* Returns the wiki index page with the primary key.
	*
	* @param wikiPageId the primary key of the wiki index page
	* @return the wiki index page
	* @throws PortalException if a wiki index page with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static no.uninett.fas.agora.wikinavigator.model.WikiIndexPage getWikiIndexPage(
		long wikiPageId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getWikiIndexPage(wikiPageId);
	}

	public static com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the wiki index pages.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of wiki index pages
	* @param end the upper bound of the range of wiki index pages (not inclusive)
	* @return the range of wiki index pages
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<no.uninett.fas.agora.wikinavigator.model.WikiIndexPage> getWikiIndexPages(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getWikiIndexPages(start, end);
	}

	/**
	* Returns the number of wiki index pages.
	*
	* @return the number of wiki index pages
	* @throws SystemException if a system exception occurred
	*/
	public static int getWikiIndexPagesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getWikiIndexPagesCount();
	}

	/**
	* Updates the wiki index page in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param wikiIndexPage the wiki index page
	* @return the wiki index page that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static no.uninett.fas.agora.wikinavigator.model.WikiIndexPage updateWikiIndexPage(
		no.uninett.fas.agora.wikinavigator.model.WikiIndexPage wikiIndexPage)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateWikiIndexPage(wikiIndexPage);
	}

	/**
	* Updates the wiki index page in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param wikiIndexPage the wiki index page
	* @param merge whether to merge the wiki index page with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the wiki index page that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static no.uninett.fas.agora.wikinavigator.model.WikiIndexPage updateWikiIndexPage(
		no.uninett.fas.agora.wikinavigator.model.WikiIndexPage wikiIndexPage,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateWikiIndexPage(wikiIndexPage, merge);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public static java.lang.String getBeanIdentifier() {
		return getService().getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public static void setBeanIdentifier(java.lang.String beanIdentifier) {
		getService().setBeanIdentifier(beanIdentifier);
	}

	public static java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return getService().invokeMethod(name, parameterTypes, arguments);
	}

	public static java.util.List<no.uninett.fas.agora.wikinavigator.model.WikiIndexPage> getChildWikiIndexPages(
		long wikiPageId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getChildWikiIndexPages(wikiPageId);
	}

	public static java.util.List<no.uninett.fas.agora.wikinavigator.model.WikiIndexPage> getWikiIndexPages(
		java.util.List<com.liferay.portlet.wiki.model.WikiPage> pages) {
		return getService().getWikiIndexPages(pages);
	}

	public static void refreshWikiIndexPages(long pageId) {
		getService().refreshWikiIndexPages(pageId);
	}

	public static void clearService() {
		_service = null;
	}

	public static WikiIndexPageLocalService getService() {
		if (_service == null) {
			InvokableLocalService invokableLocalService = (InvokableLocalService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					WikiIndexPageLocalService.class.getName());

			if (invokableLocalService instanceof WikiIndexPageLocalService) {
				_service = (WikiIndexPageLocalService)invokableLocalService;
			}
			else {
				_service = new WikiIndexPageLocalServiceClp(invokableLocalService);
			}

			ReferenceRegistry.registerReference(WikiIndexPageLocalServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated
	 */
	public void setService(WikiIndexPageLocalService service) {
	}

	private static WikiIndexPageLocalService _service;
}