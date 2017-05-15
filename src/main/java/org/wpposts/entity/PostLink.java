package org.wpposts.entity;

import java.util.Date;

/**
 * Created by ruixj on 17-5-14.
 */
public class PostLink {
    private long   linkId;
    private String linkName;
    private Date createTime;

    public PostLink(long linkId, String linkName, Date createTime) {
        this.linkId = linkId;
        this.linkName = linkName;
        this.createTime = createTime;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public long getLinkId() {
        return linkId;
    }

    public void setLinkId(long linkId) {
        this.linkId = linkId;
    }

    public String getLinkName() {
        return linkName;
    }

    public void setLinkName(String linkName) {
        this.linkName = linkName;
    }

    @Override
    public String toString() {
        return "PostLink{" +
                "linkId=" + linkId +
                ", linkName='" + linkName + '\'' +
                ", createTime=" + createTime +
                '}';
    }
}
