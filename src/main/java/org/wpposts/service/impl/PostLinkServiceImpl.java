package org.wpposts.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.wpposts.dao.PostlinksDao;
import org.wpposts.dto.PostLinkPage;
import org.wpposts.entity.PostLink;
import org.wpposts.service.PostLinkService;

import java.util.List;

/**
 * Created by ruixj on 17-5-14.
 */
@Service
public class PostLinkServiceImpl implements PostLinkService {
    @Autowired
    private PostlinksDao postlinksDao;

    public PostLinkPage getPostLinkList(int pageStart, int pageCount) {
        List<PostLink> postLinks;

        postLinks = postlinksDao.queryAll(pageStart,pageCount);
        PostLinkPage postLinkPage = new PostLinkPage("OK",postLinks);
        return postLinkPage;
    }
}
