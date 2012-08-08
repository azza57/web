package com.myproject.hibernate;

import java.util.Date;

public class MemberDetail {
	private int user_fid;
	private String regist_no;
	private String business_no;
	private Date reg_dt;
	private Member member;
	
	public int getUser_fid() {
		return user_fid;
	}
	public void setUser_fid(int user_fid) {
		this.user_fid = user_fid;
	}
	public String getRegist_no() {
		return regist_no;
	}
	public void setRegist_no(String regist_no) {
		this.regist_no = regist_no;
	}
	public String getBusiness_no() {
		return business_no;
	}
	public void setBusiness_no(String business_no) {
		this.business_no = business_no;
	}
	public Date getReg_dt() {
		return reg_dt;
	}
	public void setReg_dt(Date reg_dt) {
		this.reg_dt = reg_dt;
	}
	public Member getMember() {
		return member;
	}
	public void setMember(Member member) {
		this.member = member;
	}
	
	@Override
	public String toString() {
		return "MemberDetail [user_fid=" + user_fid + ", regist_no="
				+ regist_no + ", business_no=" + business_no + ", reg_dt="
				+ reg_dt + ", member=" + member + "]";
	}
}
