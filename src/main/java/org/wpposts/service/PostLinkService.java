package org.wpposts.service;



import org.wpposts.dto.LinkInsertResult;
import org.wpposts.dto.PostLinkPage;
import org.wpposts.entity.PostLink;

import java.util.List;

/**
 * Created by ruixj on 17-5-14.
 */

public interface PostLinkService {
    PostLinkPage getPostLinkList( int pageStart,  int pageCount);
    LinkInsertResult insertPostLink(PostLink postlink);
}
