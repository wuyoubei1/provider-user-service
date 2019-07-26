package com.xs.www.common;

import java.util.List;

public class Wrapper<T,Y> {
	
	private T instance;
	
	private List<Y> list;
	
	private String code;
	
	private String msg;

	public T getInstance() {
		return instance;
	}

	public void setInstance(T instance) {
		this.instance = instance;
	}

	public List<Y> getList() {
		return list;
	}

	public void setList(List<Y> list) {
		this.list = list;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
	
	
	
	
}
