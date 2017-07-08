package com.example;
/**
 * 报考信息
 * @author Still2Almost
 *
 */
public class SingInfo {
	//报名人员的id
	private String id;
	//考试地点
	private String location;
	//考试科目
	private String subject;
	//邮寄地址
	private String postAddreess;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getPostAddreess() {
		return postAddreess;
	}
	public void setPostAddreess(String postAddreess) {
		this.postAddreess = postAddreess;
	}
	
}
