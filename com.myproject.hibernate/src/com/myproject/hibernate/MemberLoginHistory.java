package com.myproject.hibernate;

import java.util.Date;

public class MemberLoginHistory {
	
	private int user_fid;
	private Date login_dt;
	private Member member;
	
	public int getUser_fid() {
		return user_fid;
	}
	public void setUser_fid(int user_fid) {
		this.user_fid = user_fid;
	}
	public Date getLogin_dt() {
		return login_dt;
	}
	public void setLogin_dt(Date login_dt) {
		this.login_dt = login_dt;
	}
	public Member getMember() {
		return member;
	}
	public void setMember(Member member) {
		this.member = member;
	}
	
	@Override
	public String toString() {
		return "MemberLoginHistory [user_fid=" + user_fid + ", login_dt="
				+ login_dt + ", member=" + member + "]";
	}
}
