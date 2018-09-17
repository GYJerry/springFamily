package cn.simplemind.demo;

import java.io.Serializable;

public class Result<T> implements Serializable {
	private boolean success;
	private int code;
	private T data;
	private String error;
	
	public Result(boolean success, int code, T data, String error) {
		super();
		this.success = success;
		this.code = code;
		this.data = data;
		this.error = error;
	}

	public Result(T data) {
		this(true, 0, data, null);
	}
	
	public Result(int code, String error) {
		this(false, code, null, error);
	}

	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}
}
