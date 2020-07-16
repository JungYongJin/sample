package com.sample.chap01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

import org.apache.commons.lang3.StringUtils;

import modernjavainaction.chap01.FilteringApples.Apple;

public class FlteringApples {

	public static void main(String... args) {
		List<Apple> inventory = Arrays.asList(
				new Apple(80, "GREEN"),
		        new Apple(155, "GREEN"),
		        new Apple(120, "red")
				);
		
		List<Apple> greenApples = filterGreenApples(inventory);
		System.out.println(greenApples);
		
		List<Apple> greenApples1 = filterApples(inventory, FlteringApples::isGreenApple);
		System.out.println(greenApples1);
		
		List<Apple> greenApples2 = filterApples(inventory, (Apple a) -> "GREEN".equalsIgnoreCase(a.getColor()));
		System.out.println(greenApples2);
		
		List<Apple> greenApples3 = filterApples(inventory, a -> "GREEN".equalsIgnoreCase(a.getColor()));
		System.out.println(greenApples3);
		
		
		List<Apple> heavyApples = filterHeavyApples(inventory);
		System.out.println(heavyApples);
		
		List<Apple> heavyApples1 = filterApples(inventory, FlteringApples::isHeavyApple);
		System.out.println(heavyApples1);
		
		List<Apple> heavyApples2 = filterApples(inventory, (Apple a) -> a.getWeight() > 150);
		System.out.println(heavyApples2);
		
		List<Apple> heavyApples3 = filterApples(inventory, a -> a.getWeight() > 150);
		System.out.println(heavyApples3);
		
		
	}
	
	public static List<Apple> filterGreenApples(List<Apple> inventory){
		List<Apple> result = new ArrayList<>();
		String color = Color.GREEN.name();
		for(Apple apple : inventory) {
			if(StringUtils.isEmpty(apple.getColor())) {
				if(color.equals(apple.getColor())) {
					result.add(apple);
				}
			}
		}
		return result;
	}
	
	public static List<Apple> filterHeavyApples(List<Apple> inventory){
		List<Apple> result = new ArrayList<>();
		
		for(Apple apple : inventory) {
			if(apple.getWeight() > 150) {
				result.add(apple);
			}
		}
		return result;
	}
	
	public static boolean isGreenApple(Apple apple) {
		return "GREEN".equalsIgnoreCase(apple.getColor());
	}
	
	public static boolean isHeavyApple(Apple apple) {
		return apple.getWeight() > 150;
	}
	
	public static List<Apple> filterApples(List<Apple> inventory, Predicate<Apple> p){
		List<Apple> result = new ArrayList<>();
		for(Apple apple : inventory) {
			if(p.test(apple)) {
				result.add(apple);
			}
		}
		return result;
	}
}
