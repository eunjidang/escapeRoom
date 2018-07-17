package com.bit.vo;

public class ResVo {
	private String resCode;
	private int resPeople;
	private int totalPrice;
	private int payType;
	
	public ResVo(String resCode, int resPeople, int totalPrice, int payType) {
		super();
		this.resCode = resCode;
		this.resPeople = resPeople;
		this.totalPrice = totalPrice;
		this.payType = payType;
	}
	public ResVo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getResCode() {
		return resCode;
	}
	public void setResCode(String resCode) {
		this.resCode = resCode;
	}
	public int getResPeople() {
		return resPeople;
	}
	public void setResPeople(int resPeople) {
		this.resPeople = resPeople;
	}
	public int getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(int totalPrice) {
		this.totalPrice = totalPrice;
	}
	public int getPayType() {
		return payType;
	}
	public void setPayType(int payType) {
		this.payType = payType;
	}	
}
