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

package no.uninett.fas.agora.wikinavigator.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import no.uninett.fas.agora.wikinavigator.model.WikiIndexPage;

import java.io.Serializable;

/**
 * The cache model class for representing WikiIndexPage in entity cache.
 *
 * @author armaz
 * @see WikiIndexPage
 * @generated
 */
public class WikiIndexPageCacheModel implements CacheModel<WikiIndexPage>,
	Serializable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(9);

		sb.append("{wikiPageId=");
		sb.append(wikiPageId);
		sb.append(", title=");
		sb.append(title);
		sb.append(", order=");
		sb.append(order);
		sb.append(", parentId=");
		sb.append(parentId);
		sb.append("}");

		return sb.toString();
	}

	public WikiIndexPage toEntityModel() {
		WikiIndexPageImpl wikiIndexPageImpl = new WikiIndexPageImpl();

		wikiIndexPageImpl.setWikiPageId(wikiPageId);

		if (title == null) {
			wikiIndexPageImpl.setTitle(StringPool.BLANK);
		}
		else {
			wikiIndexPageImpl.setTitle(title);
		}

		wikiIndexPageImpl.setOrder(order);
		wikiIndexPageImpl.setParentId(parentId);

		wikiIndexPageImpl.resetOriginalValues();

		return wikiIndexPageImpl;
	}

	public long wikiPageId;
	public String title;
	public int order;
	public long parentId;
}