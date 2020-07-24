package com.epam.tdd_task;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.epam.tdd_task.tdd_task.RemoveA;

class RemoveATest {
	
	RemoveA removeA;
	
	@BeforeEach
	void setUp() {
		removeA=new RemoveA();
	}
	
	@Test
	void test1() {
		assertEquals("BCD",removeA.remove("ABCD"));
	}

	@Test
	void testBothA() {
		assertEquals("CD",removeA.remove("AACD"));
	}
	
	@Test
	void test2() {
		assertEquals("BCD",removeA.remove("BACD"));
	}
	 
	@Test
	void testNoA() {
		assertEquals("BBAA",removeA.remove("BBAA"));
	}
	
	@Test
	void testBothSideA() {
		assertEquals("BAA",removeA.remove("AABAA"));
	}
	
	@Test
	void testEmpty() {
		assertEquals("",removeA.remove(""));
	}
}
