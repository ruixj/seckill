package org.wpposts.service;



import org.wpposts.entity.PostLink;

import java.util.List;

/**
 * Created by ruixj on 17-5-14.
 */
public interface PostLinkService {
    List<PostLink> getPostLinkList( int pageStart,  int pageCount);
}
