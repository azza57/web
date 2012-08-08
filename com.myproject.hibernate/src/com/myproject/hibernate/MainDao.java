package com.myproject.hibernate;

import org.hibernate.SessionFactory;


public class MainDao {
	
	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public void addMember(Member member){
		sessionFactory.getCurrentSession().saveOrUpdate(member);
	}

	public void addMemberLoginHistory(MemberLoginHistory memberLoginHistory) {
		sessionFactory.getCurrentSession().save(memberLoginHistory);
	}
	
}
