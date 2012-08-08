package com.myproject.hibernate;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

public class MainController extends MultiActionController{

	private MainDao mainDao;
	
	public void setMainDao(MainDao mainDao) {
		this.mainDao = mainDao;
	}

	public ModelAndView main(HttpServletRequest request, HttpServletResponse response) 
	throws Exception {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("main");
		return mav;
	}
	
	public ModelAndView addmember(HttpServletRequest request, HttpServletResponse response) 
	throws Exception {
//		Member member = new Member();
//		member.setUser_id("aqaq");
//		member.setUser_pwd("222222");
//		member.setUser_nm("김동현");
//		
//		MemberDetail memberDetail = new MemberDetail();
//		memberDetail.setRegist_no("8205071056817");
//		memberDetail.setMember(member);
//		
//		member.setMemberDetail(memberDetail);
//		
//		mainDao.addMember(member);
		
		MemberLoginHistory memberLoginHistory = new MemberLoginHistory();
		memberLoginHistory.setUser_fid(1);
		mainDao.addMemberLoginHistory(memberLoginHistory);
		
		ModelAndView mav = new ModelAndView();
		mav.setViewName("main");
		return mav;
	}

}
