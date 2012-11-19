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
public class WikiIndexPageSoap implements Serializable {
	public static WikiIndexPageSoap toSoapModel(WikiIndexPage model) {
		WikiIndexPageSoap soapModel = new WikiIndexPageSoap();

		soapModel.setWikiPageId(model.getWikiPageId());
		soapModel.setTitle(model.getTitle());
		soapModel.setOrder(model.getOrder());
		soapModel.setParentId(model.getParentId());

		return soapModel;
	}

	public static WikiIndexPageSoap[] toSoapModels(WikiIndexPage[] models) {
		WikiIndexPageSoap[] soapModels = new WikiIndexPageSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static WikiIndexPageSoap[][] toSoapModels(WikiIndexPage[][] models) {
		WikiIndexPageSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new WikiIndexPageSoap[models.length][models[0].length];
		}
		else {
			soapModels = new WikiIndexPageSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static WikiIndexPageSoap[] toSoapModels(List<WikiIndexPage> models) {
		List<WikiIndexPageSoap> soapModels = new ArrayList<WikiIndexPageSoap>(models.size());

		for (WikiIndexPage model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new WikiIndexPageSoap[soapModels.size()]);
	}

	public WikiIndexPageSoap() {
	}

	public long getPrimaryKey() {
		return _wikiPageId;
	}

	public void setPrimaryKey(long pk) {
		setWikiPageId(pk);
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

	private long _wikiPageId;
	private String _title;
	private int _order;
	private long _parentId;
}