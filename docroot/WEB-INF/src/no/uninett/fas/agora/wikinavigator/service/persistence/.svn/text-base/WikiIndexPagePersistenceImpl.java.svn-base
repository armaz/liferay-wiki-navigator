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

import com.liferay.portal.NoSuchModelException;
import com.liferay.portal.kernel.bean.BeanReference;
import com.liferay.portal.kernel.cache.CacheRegistryUtil;
import com.liferay.portal.kernel.dao.orm.EntityCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.InstanceFactory;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.BatchSessionUtil;
import com.liferay.portal.service.persistence.ResourcePersistence;
import com.liferay.portal.service.persistence.UserPersistence;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import no.uninett.fas.agora.wikinavigator.NoSuchWikiIndexPageException;
import no.uninett.fas.agora.wikinavigator.model.WikiIndexPage;
import no.uninett.fas.agora.wikinavigator.model.impl.WikiIndexPageImpl;
import no.uninett.fas.agora.wikinavigator.model.impl.WikiIndexPageModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the wiki index page service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author armaz
 * @see WikiIndexPagePersistence
 * @see WikiIndexPageUtil
 * @generated
 */
public class WikiIndexPagePersistenceImpl extends BasePersistenceImpl<WikiIndexPage>
	implements WikiIndexPagePersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link WikiIndexPageUtil} to access the wiki index page persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = WikiIndexPageImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_PNODE = new FinderPath(WikiIndexPageModelImpl.ENTITY_CACHE_ENABLED,
			WikiIndexPageModelImpl.FINDER_CACHE_ENABLED,
			WikiIndexPageImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByPNode",
			new String[] {
				Long.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PNODE = new FinderPath(WikiIndexPageModelImpl.ENTITY_CACHE_ENABLED,
			WikiIndexPageModelImpl.FINDER_CACHE_ENABLED,
			WikiIndexPageImpl.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByPNode", new String[] { Long.class.getName() },
			WikiIndexPageModelImpl.PARENTID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_PNODE = new FinderPath(WikiIndexPageModelImpl.ENTITY_CACHE_ENABLED,
			WikiIndexPageModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByPNode",
			new String[] { Long.class.getName() });
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(WikiIndexPageModelImpl.ENTITY_CACHE_ENABLED,
			WikiIndexPageModelImpl.FINDER_CACHE_ENABLED,
			WikiIndexPageImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(WikiIndexPageModelImpl.ENTITY_CACHE_ENABLED,
			WikiIndexPageModelImpl.FINDER_CACHE_ENABLED,
			WikiIndexPageImpl.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(WikiIndexPageModelImpl.ENTITY_CACHE_ENABLED,
			WikiIndexPageModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	/**
	 * Caches the wiki index page in the entity cache if it is enabled.
	 *
	 * @param wikiIndexPage the wiki index page
	 */
	public void cacheResult(WikiIndexPage wikiIndexPage) {
		EntityCacheUtil.putResult(WikiIndexPageModelImpl.ENTITY_CACHE_ENABLED,
			WikiIndexPageImpl.class, wikiIndexPage.getPrimaryKey(),
			wikiIndexPage);

		wikiIndexPage.resetOriginalValues();
	}

	/**
	 * Caches the wiki index pages in the entity cache if it is enabled.
	 *
	 * @param wikiIndexPages the wiki index pages
	 */
	public void cacheResult(List<WikiIndexPage> wikiIndexPages) {
		for (WikiIndexPage wikiIndexPage : wikiIndexPages) {
			if (EntityCacheUtil.getResult(
						WikiIndexPageModelImpl.ENTITY_CACHE_ENABLED,
						WikiIndexPageImpl.class, wikiIndexPage.getPrimaryKey()) == null) {
				cacheResult(wikiIndexPage);
			}
			else {
				wikiIndexPage.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all wiki index pages.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(WikiIndexPageImpl.class.getName());
		}

		EntityCacheUtil.clearCache(WikiIndexPageImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the wiki index page.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(WikiIndexPage wikiIndexPage) {
		EntityCacheUtil.removeResult(WikiIndexPageModelImpl.ENTITY_CACHE_ENABLED,
			WikiIndexPageImpl.class, wikiIndexPage.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<WikiIndexPage> wikiIndexPages) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (WikiIndexPage wikiIndexPage : wikiIndexPages) {
			EntityCacheUtil.removeResult(WikiIndexPageModelImpl.ENTITY_CACHE_ENABLED,
				WikiIndexPageImpl.class, wikiIndexPage.getPrimaryKey());
		}
	}

	/**
	 * Creates a new wiki index page with the primary key. Does not add the wiki index page to the database.
	 *
	 * @param wikiPageId the primary key for the new wiki index page
	 * @return the new wiki index page
	 */
	public WikiIndexPage create(long wikiPageId) {
		WikiIndexPage wikiIndexPage = new WikiIndexPageImpl();

		wikiIndexPage.setNew(true);
		wikiIndexPage.setPrimaryKey(wikiPageId);

		return wikiIndexPage;
	}

	/**
	 * Removes the wiki index page with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param wikiPageId the primary key of the wiki index page
	 * @return the wiki index page that was removed
	 * @throws no.uninett.fas.agora.wikinavigator.NoSuchWikiIndexPageException if a wiki index page with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public WikiIndexPage remove(long wikiPageId)
		throws NoSuchWikiIndexPageException, SystemException {
		return remove(Long.valueOf(wikiPageId));
	}

	/**
	 * Removes the wiki index page with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the wiki index page
	 * @return the wiki index page that was removed
	 * @throws no.uninett.fas.agora.wikinavigator.NoSuchWikiIndexPageException if a wiki index page with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public WikiIndexPage remove(Serializable primaryKey)
		throws NoSuchWikiIndexPageException, SystemException {
		Session session = null;

		try {
			session = openSession();

			WikiIndexPage wikiIndexPage = (WikiIndexPage)session.get(WikiIndexPageImpl.class,
					primaryKey);

			if (wikiIndexPage == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchWikiIndexPageException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(wikiIndexPage);
		}
		catch (NoSuchWikiIndexPageException nsee) {
			throw nsee;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	@Override
	protected WikiIndexPage removeImpl(WikiIndexPage wikiIndexPage)
		throws SystemException {
		wikiIndexPage = toUnwrappedModel(wikiIndexPage);

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.delete(session, wikiIndexPage);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		clearCache(wikiIndexPage);

		return wikiIndexPage;
	}

	@Override
	public WikiIndexPage updateImpl(
		no.uninett.fas.agora.wikinavigator.model.WikiIndexPage wikiIndexPage,
		boolean merge) throws SystemException {
		wikiIndexPage = toUnwrappedModel(wikiIndexPage);

		boolean isNew = wikiIndexPage.isNew();

		WikiIndexPageModelImpl wikiIndexPageModelImpl = (WikiIndexPageModelImpl)wikiIndexPage;

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.update(session, wikiIndexPage, merge);

			wikiIndexPage.setNew(false);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !WikiIndexPageModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((wikiIndexPageModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PNODE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						Long.valueOf(wikiIndexPageModelImpl.getOriginalParentId())
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_PNODE, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PNODE,
					args);

				args = new Object[] {
						Long.valueOf(wikiIndexPageModelImpl.getParentId())
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_PNODE, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PNODE,
					args);
			}
		}

		EntityCacheUtil.putResult(WikiIndexPageModelImpl.ENTITY_CACHE_ENABLED,
			WikiIndexPageImpl.class, wikiIndexPage.getPrimaryKey(),
			wikiIndexPage);

		return wikiIndexPage;
	}

	protected WikiIndexPage toUnwrappedModel(WikiIndexPage wikiIndexPage) {
		if (wikiIndexPage instanceof WikiIndexPageImpl) {
			return wikiIndexPage;
		}

		WikiIndexPageImpl wikiIndexPageImpl = new WikiIndexPageImpl();

		wikiIndexPageImpl.setNew(wikiIndexPage.isNew());
		wikiIndexPageImpl.setPrimaryKey(wikiIndexPage.getPrimaryKey());

		wikiIndexPageImpl.setWikiPageId(wikiIndexPage.getWikiPageId());
		wikiIndexPageImpl.setTitle(wikiIndexPage.getTitle());
		wikiIndexPageImpl.setOrder(wikiIndexPage.getOrder());
		wikiIndexPageImpl.setParentId(wikiIndexPage.getParentId());

		return wikiIndexPageImpl;
	}

	/**
	 * Returns the wiki index page with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the wiki index page
	 * @return the wiki index page
	 * @throws com.liferay.portal.NoSuchModelException if a wiki index page with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public WikiIndexPage findByPrimaryKey(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return findByPrimaryKey(((Long)primaryKey).longValue());
	}

	/**
	 * Returns the wiki index page with the primary key or throws a {@link no.uninett.fas.agora.wikinavigator.NoSuchWikiIndexPageException} if it could not be found.
	 *
	 * @param wikiPageId the primary key of the wiki index page
	 * @return the wiki index page
	 * @throws no.uninett.fas.agora.wikinavigator.NoSuchWikiIndexPageException if a wiki index page with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public WikiIndexPage findByPrimaryKey(long wikiPageId)
		throws NoSuchWikiIndexPageException, SystemException {
		WikiIndexPage wikiIndexPage = fetchByPrimaryKey(wikiPageId);

		if (wikiIndexPage == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + wikiPageId);
			}

			throw new NoSuchWikiIndexPageException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				wikiPageId);
		}

		return wikiIndexPage;
	}

	/**
	 * Returns the wiki index page with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the wiki index page
	 * @return the wiki index page, or <code>null</code> if a wiki index page with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public WikiIndexPage fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		return fetchByPrimaryKey(((Long)primaryKey).longValue());
	}

	/**
	 * Returns the wiki index page with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param wikiPageId the primary key of the wiki index page
	 * @return the wiki index page, or <code>null</code> if a wiki index page with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public WikiIndexPage fetchByPrimaryKey(long wikiPageId)
		throws SystemException {
		WikiIndexPage wikiIndexPage = (WikiIndexPage)EntityCacheUtil.getResult(WikiIndexPageModelImpl.ENTITY_CACHE_ENABLED,
				WikiIndexPageImpl.class, wikiPageId);

		if (wikiIndexPage == _nullWikiIndexPage) {
			return null;
		}

		if (wikiIndexPage == null) {
			Session session = null;

			boolean hasException = false;

			try {
				session = openSession();

				wikiIndexPage = (WikiIndexPage)session.get(WikiIndexPageImpl.class,
						Long.valueOf(wikiPageId));
			}
			catch (Exception e) {
				hasException = true;

				throw processException(e);
			}
			finally {
				if (wikiIndexPage != null) {
					cacheResult(wikiIndexPage);
				}
				else if (!hasException) {
					EntityCacheUtil.putResult(WikiIndexPageModelImpl.ENTITY_CACHE_ENABLED,
						WikiIndexPageImpl.class, wikiPageId, _nullWikiIndexPage);
				}

				closeSession(session);
			}
		}

		return wikiIndexPage;
	}

	/**
	 * Returns all the wiki index pages where parentId = &#63;.
	 *
	 * @param parentId the parent ID
	 * @return the matching wiki index pages
	 * @throws SystemException if a system exception occurred
	 */
	public List<WikiIndexPage> findByPNode(long parentId)
		throws SystemException {
		return findByPNode(parentId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	public List<WikiIndexPage> findByPNode(long parentId, int start, int end)
		throws SystemException {
		return findByPNode(parentId, start, end, null);
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
	public List<WikiIndexPage> findByPNode(long parentId, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PNODE;
			finderArgs = new Object[] { parentId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_PNODE;
			finderArgs = new Object[] { parentId, start, end, orderByComparator };
		}

		List<WikiIndexPage> list = (List<WikiIndexPage>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (WikiIndexPage wikiIndexPage : list) {
				if ((parentId != wikiIndexPage.getParentId())) {
					list = null;

					break;
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(3 +
						(orderByComparator.getOrderByFields().length * 3));
			}
			else {
				query = new StringBundler(3);
			}

			query.append(_SQL_SELECT_WIKIINDEXPAGE_WHERE);

			query.append(_FINDER_COLUMN_PNODE_PARENTID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}

			else {
				query.append(WikiIndexPageModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(parentId);

				list = (List<WikiIndexPage>)QueryUtil.list(q, getDialect(),
						start, end);
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (list == null) {
					FinderCacheUtil.removeResult(finderPath, finderArgs);
				}
				else {
					cacheResult(list);

					FinderCacheUtil.putResult(finderPath, finderArgs, list);
				}

				closeSession(session);
			}
		}

		return list;
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
	public WikiIndexPage findByPNode_First(long parentId,
		OrderByComparator orderByComparator)
		throws NoSuchWikiIndexPageException, SystemException {
		WikiIndexPage wikiIndexPage = fetchByPNode_First(parentId,
				orderByComparator);

		if (wikiIndexPage != null) {
			return wikiIndexPage;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("parentId=");
		msg.append(parentId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchWikiIndexPageException(msg.toString());
	}

	/**
	 * Returns the first wiki index page in the ordered set where parentId = &#63;.
	 *
	 * @param parentId the parent ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching wiki index page, or <code>null</code> if a matching wiki index page could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public WikiIndexPage fetchByPNode_First(long parentId,
		OrderByComparator orderByComparator) throws SystemException {
		List<WikiIndexPage> list = findByPNode(parentId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	public WikiIndexPage findByPNode_Last(long parentId,
		OrderByComparator orderByComparator)
		throws NoSuchWikiIndexPageException, SystemException {
		WikiIndexPage wikiIndexPage = fetchByPNode_Last(parentId,
				orderByComparator);

		if (wikiIndexPage != null) {
			return wikiIndexPage;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("parentId=");
		msg.append(parentId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchWikiIndexPageException(msg.toString());
	}

	/**
	 * Returns the last wiki index page in the ordered set where parentId = &#63;.
	 *
	 * @param parentId the parent ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching wiki index page, or <code>null</code> if a matching wiki index page could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public WikiIndexPage fetchByPNode_Last(long parentId,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByPNode(parentId);

		List<WikiIndexPage> list = findByPNode(parentId, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	public WikiIndexPage[] findByPNode_PrevAndNext(long wikiPageId,
		long parentId, OrderByComparator orderByComparator)
		throws NoSuchWikiIndexPageException, SystemException {
		WikiIndexPage wikiIndexPage = findByPrimaryKey(wikiPageId);

		Session session = null;

		try {
			session = openSession();

			WikiIndexPage[] array = new WikiIndexPageImpl[3];

			array[0] = getByPNode_PrevAndNext(session, wikiIndexPage, parentId,
					orderByComparator, true);

			array[1] = wikiIndexPage;

			array[2] = getByPNode_PrevAndNext(session, wikiIndexPage, parentId,
					orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected WikiIndexPage getByPNode_PrevAndNext(Session session,
		WikiIndexPage wikiIndexPage, long parentId,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_WIKIINDEXPAGE_WHERE);

		query.append(_FINDER_COLUMN_PNODE_PARENTID_2);

		if (orderByComparator != null) {
			String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				query.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						query.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN);
					}
					else {
						query.append(WHERE_LESSER_THAN);
					}
				}
			}

			query.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						query.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC);
					}
					else {
						query.append(ORDER_BY_DESC);
					}
				}
			}
		}

		else {
			query.append(WikiIndexPageModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(parentId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(wikiIndexPage);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<WikiIndexPage> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Returns all the wiki index pages.
	 *
	 * @return the wiki index pages
	 * @throws SystemException if a system exception occurred
	 */
	public List<WikiIndexPage> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	public List<WikiIndexPage> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
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
	public List<WikiIndexPage> findAll(int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		FinderPath finderPath = null;
		Object[] finderArgs = new Object[] { start, end, orderByComparator };

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL;
			finderArgs = FINDER_ARGS_EMPTY;
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_ALL;
			finderArgs = new Object[] { start, end, orderByComparator };
		}

		List<WikiIndexPage> list = (List<WikiIndexPage>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_WIKIINDEXPAGE);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_WIKIINDEXPAGE.concat(WikiIndexPageModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (orderByComparator == null) {
					list = (List<WikiIndexPage>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);
				}
				else {
					list = (List<WikiIndexPage>)QueryUtil.list(q, getDialect(),
							start, end);
				}
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (list == null) {
					FinderCacheUtil.removeResult(finderPath, finderArgs);
				}
				else {
					cacheResult(list);

					FinderCacheUtil.putResult(finderPath, finderArgs, list);
				}

				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Removes all the wiki index pages where parentId = &#63; from the database.
	 *
	 * @param parentId the parent ID
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByPNode(long parentId) throws SystemException {
		for (WikiIndexPage wikiIndexPage : findByPNode(parentId)) {
			remove(wikiIndexPage);
		}
	}

	/**
	 * Removes all the wiki index pages from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	public void removeAll() throws SystemException {
		for (WikiIndexPage wikiIndexPage : findAll()) {
			remove(wikiIndexPage);
		}
	}

	/**
	 * Returns the number of wiki index pages where parentId = &#63;.
	 *
	 * @param parentId the parent ID
	 * @return the number of matching wiki index pages
	 * @throws SystemException if a system exception occurred
	 */
	public int countByPNode(long parentId) throws SystemException {
		Object[] finderArgs = new Object[] { parentId };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_PNODE,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_WIKIINDEXPAGE_WHERE);

			query.append(_FINDER_COLUMN_PNODE_PARENTID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(parentId);

				count = (Long)q.uniqueResult();
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (count == null) {
					count = Long.valueOf(0);
				}

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_PNODE,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Returns the number of wiki index pages.
	 *
	 * @return the number of wiki index pages
	 * @throws SystemException if a system exception occurred
	 */
	public int countAll() throws SystemException {
		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_WIKIINDEXPAGE);

				count = (Long)q.uniqueResult();
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (count == null) {
					count = Long.valueOf(0);
				}

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_ALL,
					FINDER_ARGS_EMPTY, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Initializes the wiki index page persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.no.uninett.fas.agora.wikinavigator.model.WikiIndexPage")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<WikiIndexPage>> listenersList = new ArrayList<ModelListener<WikiIndexPage>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<WikiIndexPage>)InstanceFactory.newInstance(
							listenerClassName));
				}

				listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
			}
			catch (Exception e) {
				_log.error(e);
			}
		}
	}

	public void destroy() {
		EntityCacheUtil.removeCache(WikiIndexPageImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@BeanReference(type = WikiIndexPersistence.class)
	protected WikiIndexPersistence wikiIndexPersistence;
	@BeanReference(type = WikiIndexPagePersistence.class)
	protected WikiIndexPagePersistence wikiIndexPagePersistence;
	@BeanReference(type = ResourcePersistence.class)
	protected ResourcePersistence resourcePersistence;
	@BeanReference(type = UserPersistence.class)
	protected UserPersistence userPersistence;
	private static final String _SQL_SELECT_WIKIINDEXPAGE = "SELECT wikiIndexPage FROM WikiIndexPage wikiIndexPage";
	private static final String _SQL_SELECT_WIKIINDEXPAGE_WHERE = "SELECT wikiIndexPage FROM WikiIndexPage wikiIndexPage WHERE ";
	private static final String _SQL_COUNT_WIKIINDEXPAGE = "SELECT COUNT(wikiIndexPage) FROM WikiIndexPage wikiIndexPage";
	private static final String _SQL_COUNT_WIKIINDEXPAGE_WHERE = "SELECT COUNT(wikiIndexPage) FROM WikiIndexPage wikiIndexPage WHERE ";
	private static final String _FINDER_COLUMN_PNODE_PARENTID_2 = "wikiIndexPage.parentId = ?";
	private static final String _ORDER_BY_ENTITY_ALIAS = "wikiIndexPage.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No WikiIndexPage exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No WikiIndexPage exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(WikiIndexPagePersistenceImpl.class);
	private static WikiIndexPage _nullWikiIndexPage = new WikiIndexPageImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<WikiIndexPage> toCacheModel() {
				return _nullWikiIndexPageCacheModel;
			}
		};

	private static CacheModel<WikiIndexPage> _nullWikiIndexPageCacheModel = new CacheModel<WikiIndexPage>() {
			public WikiIndexPage toEntityModel() {
				return _nullWikiIndexPage;
			}
		};
}