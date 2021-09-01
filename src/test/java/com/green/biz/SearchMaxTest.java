package com.green.biz;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SearchMaxTest {

	@Test
	public void test() {
		
		int[] testArr1 = {1, 3, 4, 2};
		int[] testArr2 = {-12, -1, -3, -4, -2};
		
		assertEquals(4, CalcUtil.searchMax(testArr1));
		assertEquals(-1, CalcUtil.searchMax(testArr2));
	}

}
