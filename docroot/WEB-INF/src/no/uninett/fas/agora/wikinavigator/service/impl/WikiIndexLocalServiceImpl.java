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

package no.uninett.fas.agora.wikinavigator.service.impl;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portlet.wiki.model.WikiNode;
import com.liferay.portlet.wiki.service.WikiNodeLocalServiceUtil;

import no.uninett.fas.agora.wikinavigator.model.WikiIndex;
import no.uninett.fas.agora.wikinavigator.service.WikiIndexLocalServiceUtil;
import no.uninett.fas.agora.wikinavigator.service.base.WikiIndexLocalServiceBaseImpl;

/**
 * The implementation of the wiki index local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link no.uninett.fas.agora.wikinavigator.service.WikiIndexLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author armaz
 * @see no.uninett.fas.agora.wikinavigator.service.base.WikiIndexLocalServiceBaseImpl
 * @see no.uninett.fas.agora.wikinavigator.service.WikiIndexLocalServiceUtil
 */
public class WikiIndexLocalServiceImpl extends WikiIndexLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link no.uninett.fas.agora.wikinavigator.service.WikiIndexLocalServiceUtil} to access the wiki index local service.
	 */
	
	@Override
	public WikiIndex getWikiIndex(long nodeId){
		WikiIndex wikiindex=null;
		try {
			wikiindex = super.getWikiIndex(nodeId);
			
		} catch (PortalException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (wikiindex==null) { // It means it does not eksist yet. Make an empty one first and return that				
			wikiindex=WikiIndexLocalServiceUtil.createWikiIndex(nodeId);
			wikiindex.setContent("<p>Ingen innhold</p>");
			wikiindex.setAuto(false);
			try {
				wikiIndexPersistence.update(wikiindex, false);
			} catch (SystemException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
			return wikiindex;
		
	}
	
	
}