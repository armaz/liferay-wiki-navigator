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
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.BatchSessionUtil;
import com.liferay.portal.service.persistence.ResourcePersistence;
import com.liferay.portal.service.persistence.UserPersistence;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import no.uninett.fas.agora.wikinavigator.NoSuchWikiIndexException;
import no.uninett.fas.agora.wikinavigator.model.WikiIndex;
import no.uninett.fas.agora.wikinavigator.model.impl.WikiIndexImpl;
import no.uninett.fas.agora.wikinavigator.model.impl.WikiIndexModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the wiki index service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author armaz
 * @see WikiIndexPersistence
 * @see WikiIndexUtil
 * @generated
 */
public class WikiIndexPersistenceImpl extends BasePersistenceImpl<WikiIndex>
	implements WikiIndexPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link WikiIndexUtil} to access the wiki index persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = WikiIndexImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(WikiIndexModelImpl.ENTITY_CACHE_ENABLED,
			WikiIndexModelImpl.FINDER_CACHE_ENABLED, WikiIndexImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(WikiIndexModelImpl.ENTITY_CACHE_ENABLED,
			WikiIndexModelImpl.FINDER_CACHE_ENABLED, WikiIndexImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(WikiIndexModelImpl.ENTITY_CACHE_ENABLED,
			WikiIndexModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	/**
	 * Caches the wiki index in the entity cache if it is enabled.
	 *
	 * @param wikiIndex the wiki index
	 */
	public void cacheResult(WikiIndex wikiIndex) {
		EntityCacheUtil.putResult(WikiIndexModelImpl.ENTITY_CACHE_ENABLED,
			WikiIndexImpl.class, wikiIndex.getPrimaryKey(), wikiIndex);

		wikiIndex.resetOriginalValues();
	}

	/**
	 * Caches the wiki indexs in the entity cache if it is enabled.
	 *
	 * @param wikiIndexs the wiki indexs
	 */
	public void cacheResult(List<WikiIndex> wikiIndexs) {
		for (WikiIndex wikiIndex : wikiIndexs) {
			if (EntityCacheUtil.getResult(
						WikiIndexModelImpl.ENTITY_CACHE_ENABLED,
						WikiIndexImpl.class, wikiIndex.getPrimaryKey()) == null) {
				cacheResult(wikiIndex);
			}
			else {
				wikiIndex.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all wiki indexs.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(WikiIndexImpl.class.getName());
		}

		EntityCacheUtil.clearCache(WikiIndexImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the wiki index.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(WikiIndex wikiIndex) {
		EntityCacheUtil.removeResult(WikiIndexModelImpl.ENTITY_CACHE_ENABLED,
			WikiIndexImpl.class, wikiIndex.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<WikiIndex> wikiIndexs) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (WikiIndex wikiIndex : wikiIndexs) {
			EntityCacheUtil.removeResult(WikiIndexModelImpl.ENTITY_CACHE_ENABLED,
				WikiIndexImpl.class, wikiIndex.getPrimaryKey());
		}
	}

	/**
	 * Creates a new wiki index with the primary key. Does not add the wiki index to the database.
	 *
	 * @param nodeId the primary key for the new wiki index
	 * @return the new wiki index
	 */
	public WikiIndex create(long nodeId) {
		WikiIndex wikiIndex = new WikiIndexImpl();

		wikiIndex.setNew(true);
		wikiIndex.setPrimaryKey(nodeId);

		return wikiIndex;
	}

	/**
	 * Removes the wiki index with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param nodeId the primary key of the wiki index
	 * @return the wiki index that was removed
	 * @throws no.uninett.fas.agora.wikinavigator.NoSuchWikiIndexException if a wiki index with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public WikiIndex remove(long nodeId)
		throws NoSuchWikiIndexException, SystemException {
		return remove(Long.valueOf(nodeId));
	}

	/**
	 * Removes the wiki index with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the wiki index
	 * @return the wiki index that was removed
	 * @throws no.uninett.fas.agora.wikinavigator.NoSuchWikiIndexException if a wiki index with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public WikiIndex remove(Serializable primaryKey)
		throws NoSuchWikiIndexException, SystemException {
		Session session = null;

		try {
			session = openSession();

			WikiIndex wikiIndex = (WikiIndex)session.get(WikiIndexImpl.class,
					primaryKey);

			if (wikiIndex == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchWikiIndexException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(wikiIndex);
		}
		catch (NoSuchWikiIndexException nsee) {
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
	protected WikiIndex removeImpl(WikiIndex wikiIndex)
		throws SystemException {
		wikiIndex = toUnwrappedModel(wikiIndex);

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.delete(session, wikiIndex);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		clearCache(wikiIndex);

		return wikiIndex;
	}

	@Override
	public WikiIndex updateImpl(
		no.uninett.fas.agora.wikinavigator.model.WikiIndex wikiIndex,
		boolean merge) throws SystemException {
		wikiIndex = toUnwrappedModel(wikiIndex);

		boolean isNew = wikiIndex.isNew();

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.update(session, wikiIndex, merge);

			wikiIndex.setNew(false);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		EntityCacheUtil.putResult(WikiIndexModelImpl.ENTITY_CACHE_ENABLED,
			WikiIndexImpl.class, wikiIndex.getPrimaryKey(), wikiIndex);

		return wikiIndex;
	}

	protected WikiIndex toUnwrappedModel(WikiIndex wikiIndex) {
		if (wikiIndex instanceof WikiIndexImpl) {
			return wikiIndex;
		}

		WikiIndexImpl wikiIndexImpl = new WikiIndexImpl();

		wikiIndexImpl.setNew(wikiIndex.isNew());
		wikiIndexImpl.setPrimaryKey(wikiIndex.getPrimaryKey());

		wikiIndexImpl.setNodeId(wikiIndex.getNodeId());
		wikiIndexImpl.setContent(wikiIndex.getContent());
		wikiIndexImpl.setCompanyId(wikiIndex.getCompanyId());
		wikiIndexImpl.setGroupId(wikiIndex.getGroupId());
		wikiIndexImpl.setAuto(wikiIndex.isAuto());

		return wikiIndexImpl;
	}

	/**
	 * Returns the wiki index with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the wiki index
	 * @return the wiki index
	 * @throws com.liferay.portal.NoSuchModelException if a wiki index with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public WikiIndex findByPrimaryKey(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return findByPrimaryKey(((Long)primaryKey).longValue());
	}

	/**
	 * Returns the wiki index with the primary key or throws a {@link no.uninett.fas.agora.wikinavigator.NoSuchWikiIndexException} if it could not be found.
	 *
	 * @param nodeId the primary key of the wiki index
	 * @return the wiki index
	 * @throws no.uninett.fas.agora.wikinavigator.NoSuchWikiIndexException if a wiki index with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public WikiIndex findByPrimaryKey(long nodeId)
		throws NoSuchWikiIndexException, SystemException {
		WikiIndex wikiIndex = fetchByPrimaryKey(nodeId);

		if (wikiIndex == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + nodeId);
			}

			throw new NoSuchWikiIndexException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				nodeId);
		}

		return wikiIndex;
	}

	/**
	 * Returns the wiki index with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the wiki index
	 * @return the wiki index, or <code>null</code> if a wiki index with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public WikiIndex fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		return fetchByPrimaryKey(((Long)primaryKey).longValue());
	}

	/**
	 * Returns the wiki index with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param nodeId the primary key of the wiki index
	 * @return the wiki index, or <code>null</code> if a wiki index with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public WikiIndex fetchByPrimaryKey(long nodeId) throws SystemException {
		WikiIndex wikiIndex = (WikiIndex)EntityCacheUtil.getResult(WikiIndexModelImpl.ENTITY_CACHE_ENABLED,
				WikiIndexImpl.class, nodeId);

		if (wikiIndex == _nullWikiIndex) {
			return null;
		}

		if (wikiIndex == null) {
			Session session = null;

			boolean hasException = false;

			try {
				session = openSession();

				wikiIndex = (WikiIndex)session.get(WikiIndexImpl.class,
						Long.valueOf(nodeId));
			}
			catch (Exception e) {
				hasException = true;

				throw processException(e);
			}
			finally {
				if (wikiIndex != null) {
					cacheResult(wikiIndex);
				}
				else if (!hasException) {
					EntityCacheUtil.putResult(WikiIndexModelImpl.ENTITY_CACHE_ENABLED,
						WikiIndexImpl.class, nodeId, _nullWikiIndex);
				}

				closeSession(session);
			}
		}

		return wikiIndex;
	}

	/**
	 * Returns all the wiki indexs.
	 *
	 * @return the wiki indexs
	 * @throws SystemException if a system exception occurred
	 */
	public List<WikiIndex> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	public List<WikiIndex> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
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
	public List<WikiIndex> findAll(int start, int end,
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

		List<WikiIndex> list = (List<WikiIndex>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_WIKIINDEX);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_WIKIINDEX;
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (orderByComparator == null) {
					list = (List<WikiIndex>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);
				}
				else {
					list = (List<WikiIndex>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the wiki indexs from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	public void removeAll() throws SystemException {
		for (WikiIndex wikiIndex : findAll()) {
			remove(wikiIndex);
		}
	}

	/**
	 * Returns the number of wiki indexs.
	 *
	 * @return the number of wiki indexs
	 * @throws SystemException if a system exception occurred
	 */
	public int countAll() throws SystemException {
		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_WIKIINDEX);

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
	 * Initializes the wiki index persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.no.uninett.fas.agora.wikinavigator.model.WikiIndex")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<WikiIndex>> listenersList = new ArrayList<ModelListener<WikiIndex>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<WikiIndex>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(WikiIndexImpl.class.getName());
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
	private static final String _SQL_SELECT_WIKIINDEX = "SELECT wikiIndex FROM WikiIndex wikiIndex";
	private static final String _SQL_COUNT_WIKIINDEX = "SELECT COUNT(wikiIndex) FROM WikiIndex wikiIndex";
	private static final String _ORDER_BY_ENTITY_ALIAS = "wikiIndex.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No WikiIndex exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(WikiIndexPersistenceImpl.class);
	private static WikiIndex _nullWikiIndex = new WikiIndexImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<WikiIndex> toCacheModel() {
				return _nullWikiIndexCacheModel;
			}
		};

	private static CacheModel<WikiIndex> _nullWikiIndexCacheModel = new CacheModel<WikiIndex>() {
			public WikiIndex toEntityModel() {
				return _nullWikiIndex;
			}
		};
}