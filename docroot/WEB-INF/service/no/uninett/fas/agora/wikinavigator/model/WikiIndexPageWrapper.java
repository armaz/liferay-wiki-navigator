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

package no.uninett.fas.agora.wikinavigator.model;

import com.liferay.portal.model.ModelWrapper;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link WikiIndexPage}.
 * </p>
 *
 * @author    armaz
 * @see       WikiIndexPage
 * @generated
 */
public class WikiIndexPageWrapper implements WikiIndexPage,
	ModelWrapper<WikiIndexPage> {
	public WikiIndexPageWrapper(WikiIndexPage wikiIndexPage) {
		_wikiIndexPage = wikiIndexPage;
	}

	public Class<?> getModelClass() {
		return WikiIndexPage.class;
	}

	public String getModelClassName() {
		return WikiIndexPage.class.getName();
	}

	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("wikiPageId", getWikiPageId());
		attributes.put("title", getTitle());
		attributes.put("order", getOrder());
		attributes.put("parentId", getParentId());

		return attributes;
	}

	public void setModelAttributes(Map<String, Object> attributes) {
		Long wikiPageId = (Long)attributes.get("wikiPageId");

		if (wikiPageId != null) {
			setWikiPageId(wikiPageId);
		}

		String title = (String)attributes.get("title");

		if (title != null) {
			setTitle(title);
		}

		Integer order = (Integer)attributes.get("order");

		if (order != null) {
			setOrder(order);
		}

		Long parentId = (Long)attributes.get("parentId");

		if (parentId != null) {
			setParentId(parentId);
		}
	}

	/**
	* Returns the primary key of this wiki index page.
	*
	* @return the primary key of this wiki index page
	*/
	public long getPrimaryKey() {
		return _wikiIndexPage.getPrimaryKey();
	}

	/**
	* Sets the primary key of this wiki index page.
	*
	* @param primaryKey the primary key of this wiki index page
	*/
	public void setPrimaryKey(long primaryKey) {
		_wikiIndexPage.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the wiki page ID of this wiki index page.
	*
	* @return the wiki page ID of this wiki index page
	*/
	public long getWikiPageId() {
		return _wikiIndexPage.getWikiPageId();
	}

	/**
	* Sets the wiki page ID of this wiki index page.
	*
	* @param wikiPageId the wiki page ID of this wiki index page
	*/
	public void setWikiPageId(long wikiPageId) {
		_wikiIndexPage.setWikiPageId(wikiPageId);
	}

	/**
	* Returns the title of this wiki index page.
	*
	* @return the title of this wiki index page
	*/
	public java.lang.String getTitle() {
		return _wikiIndexPage.getTitle();
	}

	/**
	* Sets the title of this wiki index page.
	*
	* @param title the title of this wiki index page
	*/
	public void setTitle(java.lang.String title) {
		_wikiIndexPage.setTitle(title);
	}

	/**
	* Returns the order of this wiki index page.
	*
	* @return the order of this wiki index page
	*/
	public int getOrder() {
		return _wikiIndexPage.getOrder();
	}

	/**
	* Sets the order of this wiki index page.
	*
	* @param order the order of this wiki index page
	*/
	public void setOrder(int order) {
		_wikiIndexPage.setOrder(order);
	}

	/**
	* Returns the parent ID of this wiki index page.
	*
	* @return the parent ID of this wiki index page
	*/
	public long getParentId() {
		return _wikiIndexPage.getParentId();
	}

	/**
	* Sets the parent ID of this wiki index page.
	*
	* @param parentId the parent ID of this wiki index page
	*/
	public void setParentId(long parentId) {
		_wikiIndexPage.setParentId(parentId);
	}

	public boolean isNew() {
		return _wikiIndexPage.isNew();
	}

	public void setNew(boolean n) {
		_wikiIndexPage.setNew(n);
	}

	public boolean isCachedModel() {
		return _wikiIndexPage.isCachedModel();
	}

	public void setCachedModel(boolean cachedModel) {
		_wikiIndexPage.setCachedModel(cachedModel);
	}

	public boolean isEscapedModel() {
		return _wikiIndexPage.isEscapedModel();
	}

	public java.io.Serializable getPrimaryKeyObj() {
		return _wikiIndexPage.getPrimaryKeyObj();
	}

	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_wikiIndexPage.setPrimaryKeyObj(primaryKeyObj);
	}

	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _wikiIndexPage.getExpandoBridge();
	}

	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_wikiIndexPage.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new WikiIndexPageWrapper((WikiIndexPage)_wikiIndexPage.clone());
	}

	public int compareTo(WikiIndexPage wikiIndexPage) {
		return _wikiIndexPage.compareTo(wikiIndexPage);
	}

	@Override
	public int hashCode() {
		return _wikiIndexPage.hashCode();
	}

	public com.liferay.portal.model.CacheModel<WikiIndexPage> toCacheModel() {
		return _wikiIndexPage.toCacheModel();
	}

	public WikiIndexPage toEscapedModel() {
		return new WikiIndexPageWrapper(_wikiIndexPage.toEscapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _wikiIndexPage.toString();
	}

	public java.lang.String toXmlString() {
		return _wikiIndexPage.toXmlString();
	}

	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_wikiIndexPage.persist();
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedModel}
	 */
	public WikiIndexPage getWrappedWikiIndexPage() {
		return _wikiIndexPage;
	}

	public WikiIndexPage getWrappedModel() {
		return _wikiIndexPage;
	}

	public void resetOriginalValues() {
		_wikiIndexPage.resetOriginalValues();
	}

	private WikiIndexPage _wikiIndexPage;
}