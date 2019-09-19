package com.javatestdemo;

import static org.junit.Assert.*;
import org.junit.Test;

public class MySum_Test {
	
	MySum Obj1 = new MySum();
	
	@Test
	public void mySimpleTest_1() {
		assertEquals(Obj1.sumofnumbers(1), 1);
		assertEquals(Obj1.sumofnumbers(2), 3);
		assertEquals(Obj1.sumofnumbers(3), 6);
		assertEquals(Obj1.sumofnumbers(4), 10);
		assertEquals(Obj1.sumofnumbers(5), 15);
	}
	
	@Test
	public void mySimpleTest_2() {
		assertEquals(Obj1.sumofnumbers(6), 21);
		assertEquals(Obj1.sumofnumbers(7), 28);
		assertEquals(Obj1.sumofnumbers(8), 36);
		assertEquals(Obj1.sumofnumbers(9), 45);
		assertEquals(Obj1.sumofnumbers(10), 55);
	}
}