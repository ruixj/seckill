package org.wpposts.dto;

import java.util.List;

import org.wpposts.entity.PostLink;

public class PostLinkPage {
	private Result result;
    private ResultData data;
 

	public PostLinkPage(String success, String error) {
		super();
		this.result = new Result(success,error);
		data = null;
	}

	
	public PostLinkPage(String success, List<PostLink> plLst) {
		super();
		this.result = new Result(success,"");
		this.data = new ResultData(plLst);
 
	}

	public Result getResult() {
		return result;
	}


	public void setResult(Result result) {
		this.result = result;
	}


	public ResultData getResultData() {
		return data;
	}


	public void setResultData(ResultData resultData) {
		this.data = resultData;
	}




}
