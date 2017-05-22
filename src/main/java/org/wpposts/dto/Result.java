package org.wpposts.dto;

public class Result {

	private String code;
	private String error;
	
	public Result( String code, String error) {
		super();
		this.code = code;
		this.error = error;
	}
 
	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getError() {
		return error;
	}
	public void setError(String error) {
		this.error = error;
	}
    
}
