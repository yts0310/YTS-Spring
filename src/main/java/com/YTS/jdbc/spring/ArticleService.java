package com.YTS.jdbc.spring;

public class ArticleService {
	MemberDao memberDao;
	public void setMemberDao(MemberDao memberDao) {
		this.memberDao = memberDao;
		
	}
	public void addArticle() {
		memberDao.getMember();
	}

}
