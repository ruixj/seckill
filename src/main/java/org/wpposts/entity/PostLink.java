package org.wpposts.entity;

import java.util.Date;

/**
 * Created by ruixj on 17-5-14.
 */
public class PostLink {
    private long   linkId;
    private String title;
    public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	private String linkName;
    
    private Date createTime;

 

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
		return "PostLink [linkId=" + linkId + ", title=" + title
				+ ", linkName=" + linkName + ", createTime=" + createTime + "]";
	}

 
}
