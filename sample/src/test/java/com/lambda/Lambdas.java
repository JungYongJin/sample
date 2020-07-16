package com.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.function.Predicate;

import org.junit.Test;

import com.AppleTest;
import com.Color;

public class Lambdas {

	@Test
	public void test(){
		Runnable r = () -> System.out.println("Hello!");
		r.run();
		try {
		//
		List<AppleTest> inventory = Arrays.asList(
				new AppleTest(15, Color.GREEN),
				new AppleTest(154, Color.GREEN),
				new AppleTest(153, Color.GREEN),
				new AppleTest(152, Color.GREEN),
				new AppleTest(151, Color.GREEN),
				new AppleTest(150, Color.GREEN),
				new AppleTest(80, Color.GREEN),
				new AppleTest(155, Color.GREEN),
				new AppleTest(120, Color.RED)
				);
		List<AppleTest> greenApples = filter(inventory, a -> Color.GREEN == a.getColor());
		System.out.println(greenApples);
		
		greenApples.sort((a, b) -> a.getWeight() - b.getWeight());
		System.out.println(greenApples);
		
		Callable<String> callablbeStr = () -> "CallAble";
		System.out.println(callablbeStr.call());
		
		Callable<AppleTest> callablbeApple = () -> new AppleTest(15, Color.GREEN);
		System.out.println(callablbeApple.call().getWeight());
		
		}catch( Exception  e) {
			e.printStackTrace();
		}
	}
	
	
	public static <T> List<T> filter(List<T> inventory, Predicate<T> p){
		List<T> result = new ArrayList<>();
		
		for(T t : inventory) {
			if(p.test(t)) {
				result.add(t);
			}
		}
		return result;
	}
}
