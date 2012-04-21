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
import com.liferay.portal.kernel.util.ClassLoaderProxy;
import com.liferay.portal.kernel.util.MethodCache;
import com.liferay.portal.kernel.util.ReferenceRegistry;

/**
 * The utility for the wiki index local service. This utility wraps {@link no.uninett.fas.agora.wikinavigator.service.impl.WikiIndexLocalServiceImpl} and is the primary access point for service operations in application layer code running on the local server.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author armaz
 * @see WikiIndexLocalService
 * @see no.uninett.fas.agora.wikinavigator.service.base.WikiIndexLocalServiceBaseImpl
 * @see no.uninett.fas.agora.wikinavigator.service.impl.WikiIndexLocalServiceImpl
 * @generated
 */
public class WikiIndexLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link no.uninett.fas.agora.wikinavigator.service.impl.WikiIndexLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the wiki index to the database. Also notifies the appropriate model listeners.
	*
	* @param wikiIndex the wiki index
	* @return the wiki index that was added
	* @throws SystemException if a system exception occurred
	*/
	public static no.uninett.fas.agora.wikinavigator.model.WikiIndex addWikiIndex(
		no.uninett.fas.agora.wikinavigator.model.WikiIndex wikiIndex)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addWikiIndex(wikiIndex);
	}

	/**
	* Creates a new wiki index with the primary key. Does not add the wiki index to the database.
	*
	* @param nodeId the primary key for the new wiki index
	* @return the new wiki index
	*/
	public static no.uninett.fas.agora.wikinavigator.model.WikiIndex createWikiIndex(
		long nodeId) {
		return getService().createWikiIndex(nodeId);
	}

	/**
	* Deletes the wiki index with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param nodeId the primary key of the wiki index
	* @throws PortalException if a wiki index with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static void deleteWikiIndex(long nodeId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		getService().deleteWikiIndex(nodeId);
	}

	/**
	* Deletes the wiki index from the database. Also notifies the appropriate model listeners.
	*
	* @param wikiIndex the wiki index
	* @throws SystemException if a system exception occurred
	*/
	public static void deleteWikiIndex(
		no.uninett.fas.agora.wikinavigator.model.WikiIndex wikiIndex)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().deleteWikiIndex(wikiIndex);
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

	public static no.uninett.fas.agora.wikinavigator.model.WikiIndex fetchWikiIndex(
		long nodeId) throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchWikiIndex(nodeId);
	}

	/**
	* Returns the wiki index with the primary key.
	*
	* @param nodeId the primary key of the wiki index
	* @return the wiki index
	* @throws PortalException if a wiki index with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static no.uninett.fas.agora.wikinavigator.model.WikiIndex getWikiIndex(
		long nodeId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getWikiIndex(nodeId);
	}

	public static com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPersistedModel(primaryKeyObj);
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
	public static java.util.List<no.uninett.fas.agora.wikinavigator.model.WikiIndex> getWikiIndexs(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getWikiIndexs(start, end);
	}

	/**
	* Returns the number of wiki indexs.
	*
	* @return the number of wiki indexs
	* @throws SystemException if a system exception occurred
	*/
	public static int getWikiIndexsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getWikiIndexsCount();
	}

	/**
	* Updates the wiki index in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param wikiIndex the wiki index
	* @return the wiki index that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static no.uninett.fas.agora.wikinavigator.model.WikiIndex updateWikiIndex(
		no.uninett.fas.agora.wikinavigator.model.WikiIndex wikiIndex)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateWikiIndex(wikiIndex);
	}

	/**
	* Updates the wiki index in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param wikiIndex the wiki index
	* @param merge whether to merge the wiki index with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the wiki index that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static no.uninett.fas.agora.wikinavigator.model.WikiIndex updateWikiIndex(
		no.uninett.fas.agora.wikinavigator.model.WikiIndex wikiIndex,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateWikiIndex(wikiIndex, merge);
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

	public static void clearService() {
		_service = null;
	}

	public static WikiIndexLocalService getService() {
		if (_service == null) {
			Object object = PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					WikiIndexLocalService.class.getName());
			ClassLoader portletClassLoader = (ClassLoader)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					"portletClassLoader");

			ClassLoaderProxy classLoaderProxy = new ClassLoaderProxy(object,
					WikiIndexLocalService.class.getName(), portletClassLoader);

			_service = new WikiIndexLocalServiceClp(classLoaderProxy);

			ClpSerializer.setClassLoader(portletClassLoader);

			ReferenceRegistry.registerReference(WikiIndexLocalServiceUtil.class,
				"_service");
			MethodCache.remove(WikiIndexLocalService.class);
		}

		return _service;
	}

	public void setService(WikiIndexLocalService service) {
		MethodCache.remove(WikiIndexLocalService.class);

		_service = service;

		ReferenceRegistry.registerReference(WikiIndexLocalServiceUtil.class,
			"_service");
		MethodCache.remove(WikiIndexLocalService.class);
	}

	private static WikiIndexLocalService _service;
}