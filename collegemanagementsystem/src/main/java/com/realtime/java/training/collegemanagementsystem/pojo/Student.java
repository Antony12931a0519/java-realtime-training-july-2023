package com.realtime.java.training.collegemanagementsystem.pojo;

import java.util.List;

public class Student {

	private String name;
	private String age;
	private List<Long> ids ;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public List<Long> getIds() {
		return ids;
	}
	public void setIds(List<Long> ids) {
		this.ids = ids;
	}
	

}
