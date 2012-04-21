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

import no.uninett.fas.agora.wikinavigator.model.WikiIndex;

import java.io.Serializable;

/**
 * The cache model class for representing WikiIndex in entity cache.
 *
 * @author armaz
 * @see WikiIndex
 * @generated
 */
public class WikiIndexCacheModel implements CacheModel<WikiIndex>, Serializable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(11);

		sb.append("{nodeId=");
		sb.append(nodeId);
		sb.append(", content=");
		sb.append(content);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append(", auto=");
		sb.append(auto);
		sb.append("}");

		return sb.toString();
	}

	public WikiIndex toEntityModel() {
		WikiIndexImpl wikiIndexImpl = new WikiIndexImpl();

		wikiIndexImpl.setNodeId(nodeId);

		if (content == null) {
			wikiIndexImpl.setContent(StringPool.BLANK);
		}
		else {
			wikiIndexImpl.setContent(content);
		}

		wikiIndexImpl.setCompanyId(companyId);
		wikiIndexImpl.setGroupId(groupId);
		wikiIndexImpl.setAuto(auto);

		wikiIndexImpl.resetOriginalValues();

		return wikiIndexImpl;
	}

	public long nodeId;
	public String content;
	public long companyId;
	public long groupId;
	public boolean auto;
}