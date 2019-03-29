package com.YTS.jdbc.spring;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ArticleMain {
	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = new ClassPathXmlApplicationContext("chap02.xml");
		ArticleService articleService = ctx.getBean("articleService", com.YTS.jdbc.spring.ArticleService.class);
		MemberService memberService = ctx.getBean("memberService", com.YTS.jdbc.spring.MemberService.class);
		articleService.addArticle();
		memberService.registerMember();
		ctx.close();
	}
}
