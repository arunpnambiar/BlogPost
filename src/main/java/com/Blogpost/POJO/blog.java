package com.Blogpost.POJO;

public class blog {
	
	private int blogId;
	private int userid;
	private String blogName;
	private String blogDescription;
	
	
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public int getBlogId() {
		return blogId;
	}
	public void setBlogId(int blogId) {
		this.blogId = blogId;
	}
	public String getBlogName() {
		return blogName;
	}
	public void setBlogName(String blogName) {
		this.blogName = blogName;
	}
	public String getBlogDescription() {
		return blogDescription;
	}
	public void setBlogDescription(String blogDescription) {
		this.blogDescription = blogDescription;
	}
	@Override
	public String toString() {
		return "blog [blogId=" + blogId + ", blogName=" + blogName + ", blogDescription=" + blogDescription + "]";
	}

}
