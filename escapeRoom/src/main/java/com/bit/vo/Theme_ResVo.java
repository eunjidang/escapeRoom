package com.bit.vo;

import java.util.Date;

public class Theme_ResVo {
	private String theme_resCode;
	private String tcode;
	private Date bookDate;
	private int bookTime;
	private String resCode;
	private String erId;
	
	public Theme_ResVo(String theme_resCode, String tcode, Date bookDate, int bookTime, String resCode, String erId) {
		super();
		this.theme_resCode = theme_resCode;
		this.tcode = tcode;
		this.bookDate = bookDate;
		this.bookTime = bookTime;
		this.resCode = resCode;
		this.erId = erId;
	}
	public Theme_ResVo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getTheme_resCode() {
		return theme_resCode;
	}
	public void setTheme_resCode(String theme_resCode) {
		this.theme_resCode = theme_resCode;
	}
	public String getTcode() {
		return tcode;
	}
	public void setTcode(String tcode) {
		this.tcode = tcode;
	}
	public Date getBookDate() {
		return bookDate;
	}
	public void setBookDate(Date bookDate) {
		this.bookDate = bookDate;
	}
	public int getBookTime() {
		return bookTime;
	}
	public void setBookTime(int bookTime) {
		this.bookTime = bookTime;
	}
	public String getResCode() {
		return resCode;
	}
	public void setResCode(String resCode) {
		this.resCode = resCode;
	}
	public String getErId() {
		return erId;
	}
	public void setErId(String erId) {
		this.erId = erId;
	}
}
