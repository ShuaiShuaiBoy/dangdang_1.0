package com.baizhi.cjs.util;

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MyBatisUtil {
	private final static ThreadLocal<SqlSession> tol = new ThreadLocal<SqlSession>();
	private static SqlSessionFactory factory;
	
	static{
		SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
		Reader reader = null;
		try {
			reader = Resources.getResourceAsReader("mybatis-config.xml");
		} catch (IOException e) {
			e.printStackTrace();
			throw new RuntimeException("文件未找到");
		}
		factory = builder.build(reader);
	}
	
	//获取连接
	public static SqlSession openSqlSession(){
		SqlSession session = tol.get();
		if(session == null){
			session = factory.openSession();
			tol.set(session);
		}
		return session;
	}
	//关闭连接，删除线程绑定
	public static void close(SqlSession session){
		session.close();
		tol.remove();
	}
	//关闭连接，删除线程绑定
	public static void close(){
		SqlSession session = openSqlSession();
		session.close();
		tol.remove();
	}
	//提交数据
	public static void commit(){
		SqlSession session = openSqlSession();
		session.commit();
	}
	//获取对象
	public static Object getMapper(Class clazz){
		SqlSession session = openSqlSession();
		return session.getMapper(clazz);
	}
}
