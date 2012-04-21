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

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services.
 *
 * @author    armaz
 * @generated
 */
public class WikiIndexSoap implements Serializable {
	public static WikiIndexSoap toSoapModel(WikiIndex model) {
		WikiIndexSoap soapModel = new WikiIndexSoap();

		soapModel.setNodeId(model.getNodeId());
		soapModel.setContent(model.getContent());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setAuto(model.getAuto());

		return soapModel;
	}

	public static WikiIndexSoap[] toSoapModels(WikiIndex[] models) {
		WikiIndexSoap[] soapModels = new WikiIndexSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static WikiIndexSoap[][] toSoapModels(WikiIndex[][] models) {
		WikiIndexSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new WikiIndexSoap[models.length][models[0].length];
		}
		else {
			soapModels = new WikiIndexSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static WikiIndexSoap[] toSoapModels(List<WikiIndex> models) {
		List<WikiIndexSoap> soapModels = new ArrayList<WikiIndexSoap>(models.size());

		for (WikiIndex model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new WikiIndexSoap[soapModels.size()]);
	}

	public WikiIndexSoap() {
	}

	public long getPrimaryKey() {
		return _nodeId;
	}

	public void setPrimaryKey(long pk) {
		setNodeId(pk);
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

	private long _nodeId;
	private String _content;
	private long _companyId;
	private long _groupId;
	private boolean _auto;
}