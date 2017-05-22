package org.wpposts.dto;

import java.util.List;

import org.wpposts.entity.PostLink;

public class ResultData {
    private List<PostLink> plLst;
    
    private int count= 0 ;
    
    
	public ResultData(List<PostLink> plLst) {
		super();
		this.plLst = plLst;
		this.count = plLst.size();
	}

	public List<PostLink> getPlLst() {
		return plLst;
	}

	public void setPlLst(List<PostLink> plLst) {
		this.plLst = plLst;
		this.count = plLst.size();
	}

	public int getCount() {
		return count;
	}

 
}
