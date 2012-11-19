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

import com.liferay.portal.service.ServiceWrapper;

/**
 * <p>
 * This class is a wrapper for {@link WikiIndexPageLocalService}.
 * </p>
 *
 * @author    armaz
 * @see       WikiIndexPageLocalService
 * @generated
 */
public class WikiIndexPageLocalServiceWrapper
	implements WikiIndexPageLocalService,
		ServiceWrapper<WikiIndexPageLocalService> {
	public WikiIndexPageLocalServiceWrapper(
		WikiIndexPageLocalService wikiIndexPageLocalService) {
		_wikiIndexPageLocalService = wikiIndexPageLocalService;
	}

	/**
	* Adds the wiki index page to the database. Also notifies the appropriate model listeners.
	*
	* @param wikiIndexPage the wiki index page
	* @return the wiki index page that was added
	* @throws SystemException if a system exception occurred
	*/
	public no.uninett.fas.agora.wikinavigator.model.WikiIndexPage addWikiIndexPage(
		no.uninett.fas.agora.wikinavigator.model.WikiIndexPage wikiIndexPage)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _wikiIndexPageLocalService.addWikiIndexPage(wikiIndexPage);
	}

	/**
	* Creates a new wiki index page with the primary key. Does not add the wiki index page to the database.
	*
	* @param wikiPageId the primary key for the new wiki index page
	* @return the new wiki index page
	*/
	public no.uninett.fas.agora.wikinavigator.model.WikiIndexPage createWikiIndexPage(
		long wikiPageId) {
		return _wikiIndexPageLocalService.createWikiIndexPage(wikiPageId);
	}

	/**
	* Deletes the wiki index page with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param wikiPageId the primary key of the wiki index page
	* @return the wiki index page that was removed
	* @throws PortalException if a wiki index page with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public no.uninett.fas.agora.wikinavigator.model.WikiIndexPage deleteWikiIndexPage(
		long wikiPageId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _wikiIndexPageLocalService.deleteWikiIndexPage(wikiPageId);
	}

	/**
	* Deletes the wiki index page from the database. Also notifies the appropriate model listeners.
	*
	* @param wikiIndexPage the wiki index page
	* @return the wiki index page that was removed
	* @throws SystemException if a system exception occurred
	*/
	public no.uninett.fas.agora.wikinavigator.model.WikiIndexPage deleteWikiIndexPage(
		no.uninett.fas.agora.wikinavigator.model.WikiIndexPage wikiIndexPage)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _wikiIndexPageLocalService.deleteWikiIndexPage(wikiIndexPage);
	}

	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _wikiIndexPageLocalService.dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _wikiIndexPageLocalService.dynamicQuery(dynamicQuery);
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
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return _wikiIndexPageLocalService.dynamicQuery(dynamicQuery, start, end);
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
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _wikiIndexPageLocalService.dynamicQuery(dynamicQuery, start,
			end, orderByComparator);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _wikiIndexPageLocalService.dynamicQueryCount(dynamicQuery);
	}

	public no.uninett.fas.agora.wikinavigator.model.WikiIndexPage fetchWikiIndexPage(
		long wikiPageId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _wikiIndexPageLocalService.fetchWikiIndexPage(wikiPageId);
	}

	/**
	* Returns the wiki index page with the primary key.
	*
	* @param wikiPageId the primary key of the wiki index page
	* @return the wiki index page
	* @throws PortalException if a wiki index page with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public no.uninett.fas.agora.wikinavigator.model.WikiIndexPage getWikiIndexPage(
		long wikiPageId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _wikiIndexPageLocalService.getWikiIndexPage(wikiPageId);
	}

	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _wikiIndexPageLocalService.getPersistedModel(primaryKeyObj);
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
	public java.util.List<no.uninett.fas.agora.wikinavigator.model.WikiIndexPage> getWikiIndexPages(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _wikiIndexPageLocalService.getWikiIndexPages(start, end);
	}

	/**
	* Returns the number of wiki index pages.
	*
	* @return the number of wiki index pages
	* @throws SystemException if a system exception occurred
	*/
	public int getWikiIndexPagesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _wikiIndexPageLocalService.getWikiIndexPagesCount();
	}

	/**
	* Updates the wiki index page in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param wikiIndexPage the wiki index page
	* @return the wiki index page that was updated
	* @throws SystemException if a system exception occurred
	*/
	public no.uninett.fas.agora.wikinavigator.model.WikiIndexPage updateWikiIndexPage(
		no.uninett.fas.agora.wikinavigator.model.WikiIndexPage wikiIndexPage)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _wikiIndexPageLocalService.updateWikiIndexPage(wikiIndexPage);
	}

	/**
	* Updates the wiki index page in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param wikiIndexPage the wiki index page
	* @param merge whether to merge the wiki index page with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the wiki index page that was updated
	* @throws SystemException if a system exception occurred
	*/
	public no.uninett.fas.agora.wikinavigator.model.WikiIndexPage updateWikiIndexPage(
		no.uninett.fas.agora.wikinavigator.model.WikiIndexPage wikiIndexPage,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _wikiIndexPageLocalService.updateWikiIndexPage(wikiIndexPage,
			merge);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public java.lang.String getBeanIdentifier() {
		return _wikiIndexPageLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_wikiIndexPageLocalService.setBeanIdentifier(beanIdentifier);
	}

	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _wikiIndexPageLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	public java.util.List<no.uninett.fas.agora.wikinavigator.model.WikiIndexPage> getChildWikiIndexPages(
		long wikiPageId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _wikiIndexPageLocalService.getChildWikiIndexPages(wikiPageId);
	}

	public java.util.List<no.uninett.fas.agora.wikinavigator.model.WikiIndexPage> getWikiIndexPages(
		java.util.List<com.liferay.portlet.wiki.model.WikiPage> pages) {
		return _wikiIndexPageLocalService.getWikiIndexPages(pages);
	}

	public void refreshWikiIndexPages(long pageId) {
		_wikiIndexPageLocalService.refreshWikiIndexPages(pageId);
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedService}
	 */
	public WikiIndexPageLocalService getWrappedWikiIndexPageLocalService() {
		return _wikiIndexPageLocalService;
	}

	/**
	 * @deprecated Renamed to {@link #setWrappedService}
	 */
	public void setWrappedWikiIndexPageLocalService(
		WikiIndexPageLocalService wikiIndexPageLocalService) {
		_wikiIndexPageLocalService = wikiIndexPageLocalService;
	}

	public WikiIndexPageLocalService getWrappedService() {
		return _wikiIndexPageLocalService;
	}

	public void setWrappedService(
		WikiIndexPageLocalService wikiIndexPageLocalService) {
		_wikiIndexPageLocalService = wikiIndexPageLocalService;
	}

	private WikiIndexPageLocalService _wikiIndexPageLocalService;
}