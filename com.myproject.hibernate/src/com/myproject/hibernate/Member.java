package com.myproject.hibernate;

import java.util.ArrayList;
import java.util.List;

public class Member {

	private int user_pid;
	private String user_id;
	private String user_pwd;
	private String user_nm;
	private MemberDetail memberDetail;
	private List<MemberLoginHistory> loginHistorys = new ArrayList<MemberLoginHistory>();

	public int getUser_pid() {
		return user_pid;
	}
	public void setUser_pid(int user_pid) {
		this.user_pid = user_pid;
	}
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public String getUser_pwd() {
		return user_pwd;
	}
	public void setUser_pwd(String user_pwd) {
		this.user_pwd = user_pwd;
	}
	public String getUser_nm() {
		return user_nm;
	}
	public void setUser_nm(String user_nm) {
		this.user_nm = user_nm;
	}
	public MemberDetail getMemberDetail() {
		return memberDetail;
	}
	public void setMemberDetail(MemberDetail memberDetail) {
		this.memberDetail = memberDetail;
	}
	
	public List<MemberLoginHistory> getLoginHistorys() {
		return loginHistorys;
	}
	public void setLoginHistorys(List<MemberLoginHistory> loginHistorys) {
		this.loginHistorys = loginHistorys;
	}

	public void addMemberLoginHistory(MemberLoginHistory loginHistory){
		if(getLoginHistorys() == null) {
			setLoginHistorys(new ArrayList<MemberLoginHistory>());
        }
		getLoginHistorys().add(loginHistory);
		loginHistory.setMember(this);
	}
	
	public void delMemberLoginHistory(MemberLoginHistory loginHistory){
		getLoginHistorys().remove(loginHistory);
	}
	
	public void clearMemberLoginHistory(){
		getLoginHistorys().clear();
	}
}
