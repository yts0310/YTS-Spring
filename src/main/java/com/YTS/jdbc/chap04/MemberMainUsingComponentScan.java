package com.YTS.jdbc.chap04;

import com.YTS.jdbc.chap3.RegisterRequest;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MemberMainUsingComponentScan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConfigurableApplicationContext ctx = new ClassPathXmlApplicationContext(
				"chap04.xml");
		MemberRegisterService regService = ctx.getBean("memberRegisterService",
				MemberRegisterService.class);
		
		// registerRequest 초기화
		RegisterRequest req = new RegisterRequest();
		req.setEmail("jacob@irafe.com");
		req.setPassword("xxxx");
		req.setName("Jacob");

		// 회원 등록
		regService.regist(req);
ctx.close();

	}

}
