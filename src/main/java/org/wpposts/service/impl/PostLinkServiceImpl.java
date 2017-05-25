package org.wpposts.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.wpposts.dao.PostlinksDao;
import org.wpposts.dto.LinkInsertResult;
import org.wpposts.dto.PostLinkPage;
import org.wpposts.entity.PostLink;
import org.wpposts.service.PostLinkService;

import java.util.List;

/**
 * Created by ruixj on 17-5-14.
 */
@Service
public class PostLinkServiceImpl implements PostLinkService {
	private Logger logger = LoggerFactory.getLogger(this.getClass());
    @Autowired
    private PostlinksDao postlinksDao;

    public PostLinkPage getPostLinkList(int pageStart, int pageCount) {
        List<PostLink> postLinks;

        postLinks = postlinksDao.queryAll(pageStart,pageCount);
        PostLinkPage postLinkPage = new PostLinkPage("OK",postLinks);
        return postLinkPage;
    }
    
    public LinkInsertResult insertPostLink(PostLink postlink)
    {
    	LinkInsertResult liResult = null;
    	logger.error("input parame {},{}", postlink.getTitle(),postlink.getLinkName());
    	
    	System.out.println(String.format("title: %s, linkname: %s",  postlink.getTitle(),postlink.getLinkName()));
    	int ret = postlinksDao.insertPostLink(postlink);
    	if(ret == 1)
    	{
    		liResult = new LinkInsertResult("OK","Successfully inserted.");
    	}
    	else
    	{
    		liResult = new LinkInsertResult("Error","some error happened.");
    	}
		return liResult;
		
    }
}
