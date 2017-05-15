package org.wpposts.dao;

import org.apache.ibatis.annotations.Param;
import org.wpposts.entity.PostLink;

import java.util.List;

/**
 * Created by ruixj on 17-5-14.
 */
public interface PostlinksDao {
    List<PostLink> queryAll(@Param("offset")int offset, @Param("limit")int limit);
}
