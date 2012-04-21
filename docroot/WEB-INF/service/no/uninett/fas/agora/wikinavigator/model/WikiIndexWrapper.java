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

/**
 * <p>
 * This class is a wrapper for {@link WikiIndex}.
 * </p>
 *
 * @author    armaz
 * @see       WikiIndex
 * @generated
 */
public class WikiIndexWrapper implements WikiIndex, ModelWrapper<WikiIndex> {
	public WikiIndexWrapper(WikiIndex wikiIndex) {
		_wikiIndex = wikiIndex;
	}

	public Class<?> getModelClass() {
		return WikiIndex.class;
	}

	public String getModelClassName() {
		return WikiIndex.class.getName();
	}

	/**
	* Returns the primary key of this wiki index.
	*
	* @return the primary key of this wiki index
	*/
	public long getPrimaryKey() {
		return _wikiIndex.getPrimaryKey();
	}

	/**
	* Sets the primary key of this wiki index.
	*
	* @param primaryKey the primary key of this wiki index
	*/
	public void setPrimaryKey(long primaryKey) {
		_wikiIndex.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the node ID of this wiki index.
	*
	* @return the node ID of this wiki index
	*/
	public long getNodeId() {
		return _wikiIndex.getNodeId();
	}

	/**
	* Sets the node ID of this wiki index.
	*
	* @param nodeId the node ID of this wiki index
	*/
	public void setNodeId(long nodeId) {
		_wikiIndex.setNodeId(nodeId);
	}

	/**
	* Returns the content of this wiki index.
	*
	* @return the content of this wiki index
	*/
	public java.lang.String getContent() {
		return _wikiIndex.getContent();
	}

	/**
	* Sets the content of this wiki index.
	*
	* @param content the content of this wiki index
	*/
	public void setContent(java.lang.String content) {
		_wikiIndex.setContent(content);
	}

	/**
	* Returns the company ID of this wiki index.
	*
	* @return the company ID of this wiki index
	*/
	public long getCompanyId() {
		return _wikiIndex.getCompanyId();
	}

	/**
	* Sets the company ID of this wiki index.
	*
	* @param companyId the company ID of this wiki index
	*/
	public void setCompanyId(long companyId) {
		_wikiIndex.setCompanyId(companyId);
	}

	/**
	* Returns the group ID of this wiki index.
	*
	* @return the group ID of this wiki index
	*/
	public long getGroupId() {
		return _wikiIndex.getGroupId();
	}

	/**
	* Sets the group ID of this wiki index.
	*
	* @param groupId the group ID of this wiki index
	*/
	public void setGroupId(long groupId) {
		_wikiIndex.setGroupId(groupId);
	}

	/**
	* Returns the auto of this wiki index.
	*
	* @return the auto of this wiki index
	*/
	public boolean getAuto() {
		return _wikiIndex.getAuto();
	}

	/**
	* Returns <code>true</code> if this wiki index is auto.
	*
	* @return <code>true</code> if this wiki index is auto; <code>false</code> otherwise
	*/
	public boolean isAuto() {
		return _wikiIndex.isAuto();
	}

	/**
	* Sets whether this wiki index is auto.
	*
	* @param auto the auto of this wiki index
	*/
	public void setAuto(boolean auto) {
		_wikiIndex.setAuto(auto);
	}

	public boolean isNew() {
		return _wikiIndex.isNew();
	}

	public void setNew(boolean n) {
		_wikiIndex.setNew(n);
	}

	public boolean isCachedModel() {
		return _wikiIndex.isCachedModel();
	}

	public void setCachedModel(boolean cachedModel) {
		_wikiIndex.setCachedModel(cachedModel);
	}

	public boolean isEscapedModel() {
		return _wikiIndex.isEscapedModel();
	}

	public java.io.Serializable getPrimaryKeyObj() {
		return _wikiIndex.getPrimaryKeyObj();
	}

	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_wikiIndex.setPrimaryKeyObj(primaryKeyObj);
	}

	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _wikiIndex.getExpandoBridge();
	}

	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_wikiIndex.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new WikiIndexWrapper((WikiIndex)_wikiIndex.clone());
	}

	public int compareTo(
		no.uninett.fas.agora.wikinavigator.model.WikiIndex wikiIndex) {
		return _wikiIndex.compareTo(wikiIndex);
	}

	@Override
	public int hashCode() {
		return _wikiIndex.hashCode();
	}

	public com.liferay.portal.model.CacheModel<no.uninett.fas.agora.wikinavigator.model.WikiIndex> toCacheModel() {
		return _wikiIndex.toCacheModel();
	}

	public no.uninett.fas.agora.wikinavigator.model.WikiIndex toEscapedModel() {
		return new WikiIndexWrapper(_wikiIndex.toEscapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _wikiIndex.toString();
	}

	public java.lang.String toXmlString() {
		return _wikiIndex.toXmlString();
	}

	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_wikiIndex.persist();
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedModel}
	 */
	public WikiIndex getWrappedWikiIndex() {
		return _wikiIndex;
	}

	public WikiIndex getWrappedModel() {
		return _wikiIndex;
	}

	public void resetOriginalValues() {
		_wikiIndex.resetOriginalValues();
	}

	private WikiIndex _wikiIndex;
}