package com;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class TestStringService {
	
	StringService strservice = new StringService();
	
	@Test
	public void test1() {
		assertEquals(strservice.str1,strservice.str2);
	}	
	@Test
	public void test2() {
		assertNull(strservice.str3);
	}	
	@Test
	public void test3() {
		assertNotNull(strservice.str1);
	}	
	@Test
	public void test4() {
		assertTrue(strservice.val1<strservice.val2);
	}
	@Test
	public void test5() {
		assertArrayEquals(strservice.expectedArray,strservice.resultArray);
	}
}