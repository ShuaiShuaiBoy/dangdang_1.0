package com.baizhi.cjs.util.test;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import com.baizhi.cjs.util.MyBatisUtil;

public class MyBatisUtilTest {

	@Test
	public void test1() {
		SqlSession session = MyBatisUtil.openSqlSession();
		System.out.println(session);
		MyBatisUtil.close();
	}

}
