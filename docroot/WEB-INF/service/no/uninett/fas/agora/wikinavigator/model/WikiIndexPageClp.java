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

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import no.uninett.fas.agora.wikinavigator.service.WikiIndexPageLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Proxy;

import java.util.HashMap;
import java.util.Map;

/**
 * @author armaz
 */
public class WikiIndexPageClp extends BaseModelImpl<WikiIndexPage>
	implements WikiIndexPage {
	public WikiIndexPageClp() {
	}

	public Class<?> getModelClass() {
		return WikiIndexPage.class;
	}

	public String getModelClassName() {
		return WikiIndexPage.class.getName();
	}

	public long getPrimaryKey() {
		return _wikiPageId;
	}

	public void setPrimaryKey(long primaryKey) {
		setWikiPageId(primaryKey);
	}

	public Serializable getPrimaryKeyObj() {
		return new Long(_wikiPageId);
	}

	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("wikiPageId", getWikiPageId());
		attributes.put("title", getTitle());
		attributes.put("order", getOrder());
		attributes.put("parentId", getParentId());

		return attributes;
	}

	@Override
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

	public long getWikiPageId() {
		return _wikiPageId;
	}

	public void setWikiPageId(long wikiPageId) {
		_wikiPageId = wikiPageId;
	}

	public String getTitle() {
		return _title;
	}

	public void setTitle(String title) {
		_title = title;
	}

	public int getOrder() {
		return _order;
	}

	public void setOrder(int order) {
		_order = order;
	}

	public long getParentId() {
		return _parentId;
	}

	public void setParentId(long parentId) {
		_parentId = parentId;
	}

	public BaseModel<?> getWikiIndexPageRemoteModel() {
		return _wikiIndexPageRemoteModel;
	}

	public void setWikiIndexPageRemoteModel(
		BaseModel<?> wikiIndexPageRemoteModel) {
		_wikiIndexPageRemoteModel = wikiIndexPageRemoteModel;
	}

	public void persist() throws SystemException {
		if (this.isNew()) {
			WikiIndexPageLocalServiceUtil.addWikiIndexPage(this);
		}
		else {
			WikiIndexPageLocalServiceUtil.updateWikiIndexPage(this);
		}
	}

	@Override
	public WikiIndexPage toEscapedModel() {
		return (WikiIndexPage)Proxy.newProxyInstance(WikiIndexPage.class.getClassLoader(),
			new Class[] { WikiIndexPage.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		WikiIndexPageClp clone = new WikiIndexPageClp();

		clone.setWikiPageId(getWikiPageId());
		clone.setTitle(getTitle());
		clone.setOrder(getOrder());
		clone.setParentId(getParentId());

		return clone;
	}

	public int compareTo(WikiIndexPage wikiIndexPage) {
		int value = 0;

		if (getOrder() < wikiIndexPage.getOrder()) {
			value = -1;
		}
		else if (getOrder() > wikiIndexPage.getOrder()) {
			value = 1;
		}
		else {
			value = 0;
		}

		if (value != 0) {
			return value;
		}

		return 0;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}

		WikiIndexPageClp wikiIndexPage = null;

		try {
			wikiIndexPage = (WikiIndexPageClp)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		long primaryKey = wikiIndexPage.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(9);

		sb.append("{wikiPageId=");
		sb.append(getWikiPageId());
		sb.append(", title=");
		sb.append(getTitle());
		sb.append(", order=");
		sb.append(getOrder());
		sb.append(", parentId=");
		sb.append(getParentId());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(16);

		sb.append("<model><model-name>");
		sb.append("no.uninett.fas.agora.wikinavigator.model.WikiIndexPage");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>wikiPageId</column-name><column-value><![CDATA[");
		sb.append(getWikiPageId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>title</column-name><column-value><![CDATA[");
		sb.append(getTitle());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>order</column-name><column-value><![CDATA[");
		sb.append(getOrder());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>parentId</column-name><column-value><![CDATA[");
		sb.append(getParentId());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _wikiPageId;
	private String _title;
	private int _order;
	private long _parentId;
	private BaseModel<?> _wikiIndexPageRemoteModel;
}