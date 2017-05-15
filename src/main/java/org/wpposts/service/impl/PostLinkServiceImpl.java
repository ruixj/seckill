package org.wpposts.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.wpposts.dao.PostlinksDao;
import org.wpposts.entity.PostLink;
import org.wpposts.service.PostLinkService;

import java.util.List;

/**
 * Created by ruixj on 17-5-14.
 */
public class PostLinkServiceImpl implements PostLinkService {
    @Autowired
    private PostlinksDao postlinksDao;

    public List<PostLink> getPostLinkList(int pageStart, int pageCount) {
        List<PostLink> postLinks;

        postLinks = postlinksDao.queryAll(pageStart,pageCount);

        return postLinks;
    }
}
