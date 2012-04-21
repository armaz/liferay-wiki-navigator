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
import com.liferay.portal.model.impl.BaseModelImpl;

import no.uninett.fas.agora.wikinavigator.service.WikiIndexLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Proxy;

/**
 * @author armaz
 */
public class WikiIndexClp extends BaseModelImpl<WikiIndex> implements WikiIndex {
	public WikiIndexClp() {
	}

	public Class<?> getModelClass() {
		return WikiIndex.class;
	}

	public String getModelClassName() {
		return WikiIndex.class.getName();
	}

	public long getPrimaryKey() {
		return _nodeId;
	}

	public void setPrimaryKey(long primaryKey) {
		setNodeId(primaryKey);
	}

	public Serializable getPrimaryKeyObj() {
		return new Long(_nodeId);
	}

	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	public long getNodeId() {
		return _nodeId;
	}

	public void setNodeId(long nodeId) {
		_nodeId = nodeId;
	}

	public String getContent() {
		return _content;
	}

	public void setContent(String content) {
		_content = content;
	}

	public long getCompanyId() {
		return _companyId;
	}

	public void setCompanyId(long companyId) {
		_companyId = companyId;
	}

	public long getGroupId() {
		return _groupId;
	}

	public void setGroupId(long groupId) {
		_groupId = groupId;
	}

	public boolean getAuto() {
		return _auto;
	}

	public boolean isAuto() {
		return _auto;
	}

	public void setAuto(boolean auto) {
		_auto = auto;
	}

	public void persist() throws SystemException {
		if (this.isNew()) {
			WikiIndexLocalServiceUtil.addWikiIndex(this);
		}
		else {
			WikiIndexLocalServiceUtil.updateWikiIndex(this);
		}
	}

	@Override
	public WikiIndex toEscapedModel() {
		return (WikiIndex)Proxy.newProxyInstance(WikiIndex.class.getClassLoader(),
			new Class[] { WikiIndex.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		WikiIndexClp clone = new WikiIndexClp();

		clone.setNodeId(getNodeId());
		clone.setContent(getContent());
		clone.setCompanyId(getCompanyId());
		clone.setGroupId(getGroupId());
		clone.setAuto(getAuto());

		return clone;
	}

	public int compareTo(WikiIndex wikiIndex) {
		long primaryKey = wikiIndex.getPrimaryKey();

		if (getPrimaryKey() < primaryKey) {
			return -1;
		}
		else if (getPrimaryKey() > primaryKey) {
			return 1;
		}
		else {
			return 0;
		}
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}

		WikiIndexClp wikiIndex = null;

		try {
			wikiIndex = (WikiIndexClp)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		long primaryKey = wikiIndex.getPrimaryKey();

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
		StringBundler sb = new StringBundler(11);

		sb.append("{nodeId=");
		sb.append(getNodeId());
		sb.append(", content=");
		sb.append(getContent());
		sb.append(", companyId=");
		sb.append(getCompanyId());
		sb.append(", groupId=");
		sb.append(getGroupId());
		sb.append(", auto=");
		sb.append(getAuto());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(19);

		sb.append("<model><model-name>");
		sb.append("no.uninett.fas.agora.wikinavigator.model.WikiIndex");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>nodeId</column-name><column-value><![CDATA[");
		sb.append(getNodeId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>content</column-name><column-value><![CDATA[");
		sb.append(getContent());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>companyId</column-name><column-value><![CDATA[");
		sb.append(getCompanyId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>groupId</column-name><column-value><![CDATA[");
		sb.append(getGroupId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>auto</column-name><column-value><![CDATA[");
		sb.append(getAuto());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _nodeId;
	private String _content;
	private long _companyId;
	private long _groupId;
	private boolean _auto;
}