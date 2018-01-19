package com.baizhi.cjs.util.test;

import java.util.UUID;

import org.junit.Test;

public class UUIDTest {

	@Test
	public void test1() {
		UUID uuid = UUID.randomUUID();
		System.out.println(uuid.toString());
	}

}
