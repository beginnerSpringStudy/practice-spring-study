package com.study.myhome.user;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.ContextHierarchy;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextHierarchy({ @ContextConfiguration("/egovframework/spring/com/context-datasource.xml"),
		@ContextConfiguration("/egovframework/spring/com/context-mybatis.xml"),
		@ContextConfiguration("/egovframework/spring/com/context-properties.xml"),
		@ContextConfiguration("/egovframework/spring/com/context-common.xml"),
		@ContextConfiguration("/egovframework/spring/com/context-idgen.xml"),
		@ContextConfiguration("/egovframework/spring/com/context-transaction.xml"),
		@ContextConfiguration("/egovframework/spring/com/tiles-layout.xml"),
		@ContextConfiguration("/egovframework/spring/com/context-aspect.xml"), })
@ComponentScan(basePackages = { "egovframework", "com.study" })
@WebAppConfiguration("file:src/main/webapp/WEB-INF/config/*.xml")
public class TestCase {

	@Test
	public void 테스트() {

	}
}
