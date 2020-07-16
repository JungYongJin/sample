package com.sample.chap02;

import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.AppleTest;
import com.Color;


public class FilteringApplesTest {

	List<AppleTest> inventory;
	FilteringAppleService filteringAppleService;
	
	@Before
	public void beFore() {
		inventory = Arrays.asList(
				new AppleTest(80, Color.GREEN),
		        new AppleTest(155, Color.GREEN),
		        new AppleTest(120, Color.RED) 
				);
		
		filteringAppleService = new FilteringAppleServiceImpl();
	}
	
	@Test
	public void test1() {
		
		List<AppleTest> greenList = filteringAppleService.filter(inventory, a -> Color.GREEN.equals(a.getColor()) && a.getWeight() > 150);
		System.out.println(greenList);
	}
	
	
	
}
