package com.junhee.java.bbs;

import java.text.SimpleDateFormat;

public class Bbs {

	public String author;
	public String title;
	public String content;
	public String date;
	
	public void initDate() {
		// 시스템 날짜 띄우는 방법 외워두기 
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd HH:mm:ss");		
		date = sdf.format(System.currentTimeMillis());
	}

}
