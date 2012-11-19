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

import no.uninett.fas.agora.wikinavigator.model.WikiIndexPage;

/**
 * The persistence interface for the wiki index page service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author armaz
 * @see WikiIndexPagePersistenceImpl
 * @see WikiIndexPageUtil
 * @generated
 */
public interface WikiIndexPagePersistence extends BasePersistence<WikiIndexPage> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link WikiIndexPageUtil} to access the wiki index page persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the wiki index page in the entity cache if it is enabled.
	*
	* @param wikiIndexPage the wiki index page
	*/
	public void cacheResult(
		no.uninett.fas.agora.wikinavigator.model.WikiIndexPage wikiIndexPage);

	/**
	* Caches the wiki index pages in the entity cache if it is enabled.
	*
	* @param wikiIndexPages the wiki index pages
	*/
	public void cacheResult(
		java.util.List<no.uninett.fas.agora.wikinavigator.model.WikiIndexPage> wikiIndexPages);

	/**
	* Creates a new wiki index page with the primary key. Does not add the wiki index page to the database.
	*
	* @param wikiPageId the primary key for the new wiki index page
	* @return the new wiki index page
	*/
	public no.uninett.fas.agora.wikinavigator.model.WikiIndexPage create(
		long wikiPageId);

	/**
	* Removes the wiki index page with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param wikiPageId the primary key of the wiki index page
	* @return the wiki index page that was removed
	* @throws no.uninett.fas.agora.wikinavigator.NoSuchWikiIndexPageException if a wiki index page with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public no.uninett.fas.agora.wikinavigator.model.WikiIndexPage remove(
		long wikiPageId)
		throws com.liferay.portal.kernel.exception.SystemException,
			no.uninett.fas.agora.wikinavigator.NoSuchWikiIndexPageException;

	public no.uninett.fas.agora.wikinavigator.model.WikiIndexPage updateImpl(
		no.uninett.fas.agora.wikinavigator.model.WikiIndexPage wikiIndexPage,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the wiki index page with the primary key or throws a {@link no.uninett.fas.agora.wikinavigator.NoSuchWikiIndexPageException} if it could not be found.
	*
	* @param wikiPageId the primary key of the wiki index page
	* @return the wiki index page
	* @throws no.uninett.fas.agora.wikinavigator.NoSuchWikiIndexPageException if a wiki index page with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public no.uninett.fas.agora.wikinavigator.model.WikiIndexPage findByPrimaryKey(
		long wikiPageId)
		throws com.liferay.portal.kernel.exception.SystemException,
			no.uninett.fas.agora.wikinavigator.NoSuchWikiIndexPageException;

	/**
	* Returns the wiki index page with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param wikiPageId the primary key of the wiki index page
	* @return the wiki index page, or <code>null</code> if a wiki index page with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public no.uninett.fas.agora.wikinavigator.model.WikiIndexPage fetchByPrimaryKey(
		long wikiPageId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the wiki index pages where parentId = &#63;.
	*
	* @param parentId the parent ID
	* @return the matching wiki index pages
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<no.uninett.fas.agora.wikinavigator.model.WikiIndexPage> findByPNode(
		long parentId)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<no.uninett.fas.agora.wikinavigator.model.WikiIndexPage> findByPNode(
		long parentId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<no.uninett.fas.agora.wikinavigator.model.WikiIndexPage> findByPNode(
		long parentId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first wiki index page in the ordered set where parentId = &#63;.
	*
	* @param parentId the parent ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching wiki index page
	* @throws no.uninett.fas.agora.wikinavigator.NoSuchWikiIndexPageException if a matching wiki index page could not be found
	* @throws SystemException if a system exception occurred
	*/
	public no.uninett.fas.agora.wikinavigator.model.WikiIndexPage findByPNode_First(
		long parentId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			no.uninett.fas.agora.wikinavigator.NoSuchWikiIndexPageException;

	/**
	* Returns the first wiki index page in the ordered set where parentId = &#63;.
	*
	* @param parentId the parent ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching wiki index page, or <code>null</code> if a matching wiki index page could not be found
	* @throws SystemException if a system exception occurred
	*/
	public no.uninett.fas.agora.wikinavigator.model.WikiIndexPage fetchByPNode_First(
		long parentId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last wiki index page in the ordered set where parentId = &#63;.
	*
	* @param parentId the parent ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching wiki index page
	* @throws no.uninett.fas.agora.wikinavigator.NoSuchWikiIndexPageException if a matching wiki index page could not be found
	* @throws SystemException if a system exception occurred
	*/
	public no.uninett.fas.agora.wikinavigator.model.WikiIndexPage findByPNode_Last(
		long parentId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			no.uninett.fas.agora.wikinavigator.NoSuchWikiIndexPageException;

	/**
	* Returns the last wiki index page in the ordered set where parentId = &#63;.
	*
	* @param parentId the parent ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching wiki index page, or <code>null</code> if a matching wiki index page could not be found
	* @throws SystemException if a system exception occurred
	*/
	public no.uninett.fas.agora.wikinavigator.model.WikiIndexPage fetchByPNode_Last(
		long parentId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public no.uninett.fas.agora.wikinavigator.model.WikiIndexPage[] findByPNode_PrevAndNext(
		long wikiPageId, long parentId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			no.uninett.fas.agora.wikinavigator.NoSuchWikiIndexPageException;

	/**
	* Returns all the wiki index pages.
	*
	* @return the wiki index pages
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<no.uninett.fas.agora.wikinavigator.model.WikiIndexPage> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<no.uninett.fas.agora.wikinavigator.model.WikiIndexPage> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<no.uninett.fas.agora.wikinavigator.model.WikiIndexPage> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the wiki index pages where parentId = &#63; from the database.
	*
	* @param parentId the parent ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByPNode(long parentId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the wiki index pages from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of wiki index pages where parentId = &#63;.
	*
	* @param parentId the parent ID
	* @return the number of matching wiki index pages
	* @throws SystemException if a system exception occurred
	*/
	public int countByPNode(long parentId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of wiki index pages.
	*
	* @return the number of wiki index pages
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}