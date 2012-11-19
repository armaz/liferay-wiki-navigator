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

import java.util.ArrayList;
import java.util.List;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portlet.wiki.model.WikiPage;
import com.liferay.portlet.wiki.service.WikiPageLocalServiceUtil;

import no.uninett.fas.agora.wikinavigator.model.WikiIndexPage;
import no.uninett.fas.agora.wikinavigator.service.WikiIndexPageLocalServiceUtil;
import no.uninett.fas.agora.wikinavigator.service.base.WikiIndexPageLocalServiceBaseImpl;
import no.uninett.fas.agora.wikinavigator.service.persistence.WikiIndexPagePersistence;

/**
 * The implementation of the wiki index page local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link no.uninett.fas.agora.wikinavigator.service.WikiIndexPageLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author armaz
 * @see no.uninett.fas.agora.wikinavigator.service.base.WikiIndexPageLocalServiceBaseImpl
 * @see no.uninett.fas.agora.wikinavigator.service.WikiIndexPageLocalServiceUtil
 */
public class WikiIndexPageLocalServiceImpl
	extends WikiIndexPageLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link no.uninett.fas.agora.wikinavigator.service.WikiIndexPageLocalServiceUtil} to access the wiki index page local service.
	 */
	
	public WikiIndexPage getWikiIndexPage(long wikiPageId) throws PortalException, SystemException{
		WikiIndexPage wip=null;
		WikiPage wp=WikiPageLocalServiceUtil.getWikiPage(wikiPageId);
		
		try {
			wip=super.getWikiIndexPage(wikiPageId);
		} catch (PortalException e) {			
			System.out.println("Fant ingen WikiIndexPage, lager en istedet ....");
			System.out.println("     page : "+wp.getTitle());
		}
		if (wip==null){
			wip=super.createWikiIndexPage(wikiPageId);
			wip.setOrder(Integer.MAX_VALUE);
			WikiPage parent=wp.getParentPage();
			if (parent!=null){
				wip.setParentId(parent.getPageId());
			}else{
				wip.setParentId(0);
			}
			wip.setTitle(wp.getTitle());
			wikiIndexPagePersistence.update(wip, false);
		}
		return wip;		
	}
	
	
	public List<WikiIndexPage> getChildWikiIndexPages(long wikiPageId) throws SystemException{
		List<WikiIndexPage> list=wikiIndexPagePersistence.findByPNode(wikiPageId);
		return list;
	}
	
	
	public List <WikiIndexPage> getWikiIndexPages(List<WikiPage> pages) {		
		List<WikiIndexPage> list=new ArrayList<WikiIndexPage>(pages.size());
		for (WikiPage wikiPage : pages) {
			WikiIndexPage wip=null;
			try {
				wip = getWikiIndexPage(wikiPage.getPageId());
			} catch (PortalException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SystemException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			list.add(wip);
		}
		return list;	
	}

	
	public void refreshWikiIndexPages(long pageId){
		System.out.println("Gor pageID"+pageId);
		WikiIndexPage wip=null;
		try {
			wip=getWikiIndexPage(pageId);
		} catch (Exception e) {			
			e.printStackTrace();
			return;
	    } 
		
		try {
			List <WikiPage> list= WikiPageLocalServiceUtil.getWikiPage(pageId).getChildPages();
			for (WikiPage wikiPage : list) {
				refreshWikiIndexPages(wikiPage.getPageId());				
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
	}
	

}