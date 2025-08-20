package com.nt.springdatajpademo.dto;

public class CourseTitleUrlDto {
	
	private final String title;
	private final String url;
	
	
	public CourseTitleUrlDto(String title, String url) {
		super();
		this.title = title;
		this.url = url;
	}
	public String getTitle() {
		return title;
	}
	public String getUrl() {
		return url;
	}
	@Override
	public String toString() {
		return "CourseTitleUrlDto [title=" + title + ", url=" + url + "]";
	}
	

}
