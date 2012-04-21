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

import com.liferay.portal.service.persistence.BasePersistence;

import no.uninett.fas.agora.wikinavigator.model.WikiIndex;

/**
 * The persistence interface for the wiki index service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author armaz
 * @see WikiIndexPersistenceImpl
 * @see WikiIndexUtil
 * @generated
 */
public interface WikiIndexPersistence extends BasePersistence<WikiIndex> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link WikiIndexUtil} to access the wiki index persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the wiki index in the entity cache if it is enabled.
	*
	* @param wikiIndex the wiki index
	*/
	public void cacheResult(
		no.uninett.fas.agora.wikinavigator.model.WikiIndex wikiIndex);

	/**
	* Caches the wiki indexs in the entity cache if it is enabled.
	*
	* @param wikiIndexs the wiki indexs
	*/
	public void cacheResult(
		java.util.List<no.uninett.fas.agora.wikinavigator.model.WikiIndex> wikiIndexs);

	/**
	* Creates a new wiki index with the primary key. Does not add the wiki index to the database.
	*
	* @param nodeId the primary key for the new wiki index
	* @return the new wiki index
	*/
	public no.uninett.fas.agora.wikinavigator.model.WikiIndex create(
		long nodeId);

	/**
	* Removes the wiki index with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param nodeId the primary key of the wiki index
	* @return the wiki index that was removed
	* @throws no.uninett.fas.agora.wikinavigator.NoSuchWikiIndexException if a wiki index with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public no.uninett.fas.agora.wikinavigator.model.WikiIndex remove(
		long nodeId)
		throws com.liferay.portal.kernel.exception.SystemException,
			no.uninett.fas.agora.wikinavigator.NoSuchWikiIndexException;

	public no.uninett.fas.agora.wikinavigator.model.WikiIndex updateImpl(
		no.uninett.fas.agora.wikinavigator.model.WikiIndex wikiIndex,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the wiki index with the primary key or throws a {@link no.uninett.fas.agora.wikinavigator.NoSuchWikiIndexException} if it could not be found.
	*
	* @param nodeId the primary key of the wiki index
	* @return the wiki index
	* @throws no.uninett.fas.agora.wikinavigator.NoSuchWikiIndexException if a wiki index with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public no.uninett.fas.agora.wikinavigator.model.WikiIndex findByPrimaryKey(
		long nodeId)
		throws com.liferay.portal.kernel.exception.SystemException,
			no.uninett.fas.agora.wikinavigator.NoSuchWikiIndexException;

	/**
	* Returns the wiki index with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param nodeId the primary key of the wiki index
	* @return the wiki index, or <code>null</code> if a wiki index with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public no.uninett.fas.agora.wikinavigator.model.WikiIndex fetchByPrimaryKey(
		long nodeId) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the wiki indexs.
	*
	* @return the wiki indexs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<no.uninett.fas.agora.wikinavigator.model.WikiIndex> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<no.uninett.fas.agora.wikinavigator.model.WikiIndex> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<no.uninett.fas.agora.wikinavigator.model.WikiIndex> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the wiki indexs from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of wiki indexs.
	*
	* @return the number of wiki indexs
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}