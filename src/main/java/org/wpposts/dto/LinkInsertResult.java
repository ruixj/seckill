package org.wpposts.dto;

public class LinkInsertResult {
	private Result result;
    
    
	public LinkInsertResult(String success, String error) {
		super();
		this.result = new Result(success,error);
		 
	}

	public Result getResult() {
		return result;
	}


	public void setResult(Result result) {
		this.result = result;
	}
	
	
}
