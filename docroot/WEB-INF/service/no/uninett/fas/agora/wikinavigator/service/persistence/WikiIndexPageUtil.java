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

package no.uninett.fas.agora.wikinavigator.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import no.uninett.fas.agora.wikinavigator.model.WikiIndexPage;

import java.util.List;

/**
 * The persistence utility for the wiki index page service. This utility wraps {@link WikiIndexPagePersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author armaz
 * @see WikiIndexPagePersistence
 * @see WikiIndexPagePersistenceImpl
 * @generated
 */
public class WikiIndexPageUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
	 */
	public static void clearCache(WikiIndexPage wikiIndexPage) {
		getPersistence().clearCache(wikiIndexPage);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public long countWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<WikiIndexPage> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<WikiIndexPage> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<WikiIndexPage> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean)
	 */
	public static WikiIndexPage update(WikiIndexPage wikiIndexPage,
		boolean merge) throws SystemException {
		return getPersistence().update(wikiIndexPage, merge);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean, ServiceContext)
	 */
	public static WikiIndexPage update(WikiIndexPage wikiIndexPage,
		boolean merge, ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(wikiIndexPage, merge, serviceContext);
	}

	/**
	* Caches the wiki index page in the entity cache if it is enabled.
	*
	* @param wikiIndexPage the wiki index page
	*/
	public static void cacheResult(
		no.uninett.fas.agora.wikinavigator.model.WikiIndexPage wikiIndexPage) {
		getPersistence().cacheResult(wikiIndexPage);
	}

	/**
	* Caches the wiki index pages in the entity cache if it is enabled.
	*
	* @param wikiIndexPages the wiki index pages
	*/
	public static void cacheResult(
		java.util.List<no.uninett.fas.agora.wikinavigator.model.WikiIndexPage> wikiIndexPages) {
		getPersistence().cacheResult(wikiIndexPages);
	}

	/**
	* Creates a new wiki index page with the primary key. Does not add the wiki index page to the database.
	*
	* @param wikiPageId the primary key for the new wiki index page
	* @return the new wiki index page
	*/
	public static no.uninett.fas.agora.wikinavigator.model.WikiIndexPage create(
		long wikiPageId) {
		return getPersistence().create(wikiPageId);
	}

	/**
	* Removes the wiki index page with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param wikiPageId the primary key of the wiki index page
	* @return the wiki index page that was removed
	* @throws no.uninett.fas.agora.wikinavigator.NoSuchWikiIndexPageException if a wiki index page with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static no.uninett.fas.agora.wikinavigator.model.WikiIndexPage remove(
		long wikiPageId)
		throws com.liferay.portal.kernel.exception.SystemException,
			no.uninett.fas.agora.wikinavigator.NoSuchWikiIndexPageException {
		return getPersistence().remove(wikiPageId);
	}

	public static no.uninett.fas.agora.wikinavigator.model.WikiIndexPage updateImpl(
		no.uninett.fas.agora.wikinavigator.model.WikiIndexPage wikiIndexPage,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(wikiIndexPage, merge);
	}

	/**
	* Returns the wiki index page with the primary key or throws a {@link no.uninett.fas.agora.wikinavigator.NoSuchWikiIndexPageException} if it could not be found.
	*
	* @param wikiPageId the primary key of the wiki index page
	* @return the wiki index page
	* @throws no.uninett.fas.agora.wikinavigator.NoSuchWikiIndexPageException if a wiki index page with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static no.uninett.fas.agora.wikinavigator.model.WikiIndexPage findByPrimaryKey(
		long wikiPageId)
		throws com.liferay.portal.kernel.exception.SystemException,
			no.uninett.fas.agora.wikinavigator.NoSuchWikiIndexPageException {
		return getPersistence().findByPrimaryKey(wikiPageId);
	}

	/**
	* Returns the wiki index page with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param wikiPageId the primary key of the wiki index page
	* @return the wiki index page, or <code>null</code> if a wiki index page with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static no.uninett.fas.agora.wikinavigator.model.WikiIndexPage fetchByPrimaryKey(
		long wikiPageId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(wikiPageId);
	}

	/**
	* Returns all the wiki index pages where parentId = &#63;.
	*
	* @param parentId the parent ID
	* @return the matching wiki index pages
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<no.uninett.fas.agora.wikinavigator.model.WikiIndexPage> findByPNode(
		long parentId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByPNode(parentId);
	}

	/**
	* Returns a range of all the wiki index pages where parentId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param parentId the parent ID
	* @param start the lower bound of the range of wiki index pages
	* @param end the upper bound of the range of wiki index pages (not inclusive)
	* @return the range of matching wiki index pages
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<no.uninett.fas.agora.wikinavigator.model.WikiIndexPage> findByPNode(
		long parentId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByPNode(parentId, start, end);
	}

	/**
	* Returns an ordered range of all the wiki index pages where parentId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param parentId the parent ID
	* @param start the lower bound of the range of wiki index pages
	* @param end the upper bound of the range of wiki index pages (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching wiki index pages
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<no.uninett.fas.agora.wikinavigator.model.WikiIndexPage> findByPNode(
		long parentId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByPNode(parentId, start, end, orderByComparator);
	}

	/**
	* Returns the first wiki index page in the ordered set where parentId = &#63;.
	*
	* @param parentId the parent ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching wiki index page
	* @throws no.uninett.fas.agora.wikinavigator.NoSuchWikiIndexPageException if a matching wiki index page could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static no.uninett.fas.agora.wikinavigator.model.WikiIndexPage findByPNode_First(
		long parentId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			no.uninett.fas.agora.wikinavigator.NoSuchWikiIndexPageException {
		return getPersistence().findByPNode_First(parentId, orderByComparator);
	}

	/**
	* Returns the first wiki index page in the ordered set where parentId = &#63;.
	*
	* @param parentId the parent ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching wiki index page, or <code>null</code> if a matching wiki index page could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static no.uninett.fas.agora.wikinavigator.model.WikiIndexPage fetchByPNode_First(
		long parentId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPNode_First(parentId, orderByComparator);
	}

	/**
	* Returns the last wiki index page in the ordered set where parentId = &#63;.
	*
	* @param parentId the parent ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching wiki index page
	* @throws no.uninett.fas.agora.wikinavigator.NoSuchWikiIndexPageException if a matching wiki index page could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static no.uninett.fas.agora.wikinavigator.model.WikiIndexPage findByPNode_Last(
		long parentId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			no.uninett.fas.agora.wikinavigator.NoSuchWikiIndexPageException {
		return getPersistence().findByPNode_Last(parentId, orderByComparator);
	}

	/**
	* Returns the last wiki index page in the ordered set where parentId = &#63;.
	*
	* @param parentId the parent ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching wiki index page, or <code>null</code> if a matching wiki index page could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static no.uninett.fas.agora.wikinavigator.model.WikiIndexPage fetchByPNode_Last(
		long parentId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPNode_Last(parentId, orderByComparator);
	}

	/**
	* Returns the wiki index pages before and after the current wiki index page in the ordered set where parentId = &#63;.
	*
	* @param wikiPageId the primary key of the current wiki index page
	* @param parentId the parent ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next wiki index page
	* @throws no.uninett.fas.agora.wikinavigator.NoSuchWikiIndexPageException if a wiki index page with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static no.uninett.fas.agora.wikinavigator.model.WikiIndexPage[] findByPNode_PrevAndNext(
		long wikiPageId, long parentId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			no.uninett.fas.agora.wikinavigator.NoSuchWikiIndexPageException {
		return getPersistence()
				   .findByPNode_PrevAndNext(wikiPageId, parentId,
			orderByComparator);
	}

	/**
	* Returns all the wiki index pages.
	*
	* @return the wiki index pages
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<no.uninett.fas.agora.wikinavigator.model.WikiIndexPage> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
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
	public static java.util.List<no.uninett.fas.agora.wikinavigator.model.WikiIndexPage> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the wiki index pages.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of wiki index pages
	* @param end the upper bound of the range of wiki index pages (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of wiki index pages
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<no.uninett.fas.agora.wikinavigator.model.WikiIndexPage> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the wiki index pages where parentId = &#63; from the database.
	*
	* @param parentId the parent ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByPNode(long parentId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByPNode(parentId);
	}

	/**
	* Removes all the wiki index pages from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of wiki index pages where parentId = &#63;.
	*
	* @param parentId the parent ID
	* @return the number of matching wiki index pages
	* @throws SystemException if a system exception occurred
	*/
	public static int countByPNode(long parentId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByPNode(parentId);
	}

	/**
	* Returns the number of wiki index pages.
	*
	* @return the number of wiki index pages
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static WikiIndexPagePersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (WikiIndexPagePersistence)PortletBeanLocatorUtil.locate(no.uninett.fas.agora.wikinavigator.service.ClpSerializer.getServletContextName(),
					WikiIndexPagePersistence.class.getName());

			ReferenceRegistry.registerReference(WikiIndexPageUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated
	 */
	public void setPersistence(WikiIndexPagePersistence persistence) {
	}

	private static WikiIndexPagePersistence _persistence;
}