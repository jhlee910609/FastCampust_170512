package com.junhee.java.bbs;

public class Bbs {

	public String author;
	public String title;
	public String content;
	public long date;
	
	public void initDate() {
		date = System.currentTimeMillis();
	}

}
