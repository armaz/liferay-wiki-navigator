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

import no.uninett.fas.agora.wikinavigator.model.WikiIndex;

import java.util.List;

/**
 * The persistence utility for the wiki index service. This utility wraps {@link WikiIndexPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author armaz
 * @see WikiIndexPersistence
 * @see WikiIndexPersistenceImpl
 * @generated
 */
public class WikiIndexUtil {
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
	public static void clearCache(WikiIndex wikiIndex) {
		getPersistence().clearCache(wikiIndex);
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
	public static List<WikiIndex> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<WikiIndex> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<WikiIndex> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean)
	 */
	public static WikiIndex update(WikiIndex wikiIndex, boolean merge)
		throws SystemException {
		return getPersistence().update(wikiIndex, merge);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean, ServiceContext)
	 */
	public static WikiIndex update(WikiIndex wikiIndex, boolean merge,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(wikiIndex, merge, serviceContext);
	}

	/**
	* Caches the wiki index in the entity cache if it is enabled.
	*
	* @param wikiIndex the wiki index
	*/
	public static void cacheResult(
		no.uninett.fas.agora.wikinavigator.model.WikiIndex wikiIndex) {
		getPersistence().cacheResult(wikiIndex);
	}

	/**
	* Caches the wiki indexs in the entity cache if it is enabled.
	*
	* @param wikiIndexs the wiki indexs
	*/
	public static void cacheResult(
		java.util.List<no.uninett.fas.agora.wikinavigator.model.WikiIndex> wikiIndexs) {
		getPersistence().cacheResult(wikiIndexs);
	}

	/**
	* Creates a new wiki index with the primary key. Does not add the wiki index to the database.
	*
	* @param nodeId the primary key for the new wiki index
	* @return the new wiki index
	*/
	public static no.uninett.fas.agora.wikinavigator.model.WikiIndex create(
		long nodeId) {
		return getPersistence().create(nodeId);
	}

	/**
	* Removes the wiki index with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param nodeId the primary key of the wiki index
	* @return the wiki index that was removed
	* @throws no.uninett.fas.agora.wikinavigator.NoSuchWikiIndexException if a wiki index with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static no.uninett.fas.agora.wikinavigator.model.WikiIndex remove(
		long nodeId)
		throws com.liferay.portal.kernel.exception.SystemException,
			no.uninett.fas.agora.wikinavigator.NoSuchWikiIndexException {
		return getPersistence().remove(nodeId);
	}

	public static no.uninett.fas.agora.wikinavigator.model.WikiIndex updateImpl(
		no.uninett.fas.agora.wikinavigator.model.WikiIndex wikiIndex,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(wikiIndex, merge);
	}

	/**
	* Returns the wiki index with the primary key or throws a {@link no.uninett.fas.agora.wikinavigator.NoSuchWikiIndexException} if it could not be found.
	*
	* @param nodeId the primary key of the wiki index
	* @return the wiki index
	* @throws no.uninett.fas.agora.wikinavigator.NoSuchWikiIndexException if a wiki index with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static no.uninett.fas.agora.wikinavigator.model.WikiIndex findByPrimaryKey(
		long nodeId)
		throws com.liferay.portal.kernel.exception.SystemException,
			no.uninett.fas.agora.wikinavigator.NoSuchWikiIndexException {
		return getPersistence().findByPrimaryKey(nodeId);
	}

	/**
	* Returns the wiki index with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param nodeId the primary key of the wiki index
	* @return the wiki index, or <code>null</code> if a wiki index with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static no.uninett.fas.agora.wikinavigator.model.WikiIndex fetchByPrimaryKey(
		long nodeId) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(nodeId);
	}

	/**
	* Returns all the wiki indexs.
	*
	* @return the wiki indexs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<no.uninett.fas.agora.wikinavigator.model.WikiIndex> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the wiki indexs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of wiki indexs
	* @param end the upper bound of the range of wiki indexs (not inclusive)
	* @return the range of wiki indexs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<no.uninett.fas.agora.wikinavigator.model.WikiIndex> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the wiki indexs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of wiki indexs
	* @param end the upper bound of the range of wiki indexs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of wiki indexs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<no.uninett.fas.agora.wikinavigator.model.WikiIndex> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the wiki indexs from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of wiki indexs.
	*
	* @return the number of wiki indexs
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static WikiIndexPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (WikiIndexPersistence)PortletBeanLocatorUtil.locate(no.uninett.fas.agora.wikinavigator.service.ClpSerializer.getServletContextName(),
					WikiIndexPersistence.class.getName());

			ReferenceRegistry.registerReference(WikiIndexUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	public void setPersistence(WikiIndexPersistence persistence) {
		_persistence = persistence;

		ReferenceRegistry.registerReference(WikiIndexUtil.class, "_persistence");
	}

	private static WikiIndexPersistence _persistence;
}