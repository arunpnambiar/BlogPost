package com.Blogpost.POJO;

public class blog {
	
	private int blogId;
	private String blogName;
	private String blogDescription;
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
