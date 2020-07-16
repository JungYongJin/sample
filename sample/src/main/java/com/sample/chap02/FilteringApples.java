package com.sample.chap02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

import com.sample.chap01.Color;


public class FilteringApples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8);
		List<Integer> intList = filter(list, (a) -> a > 2);
		//System.out.println(intList);
		
		List<Apple> inventory = Arrays.asList(
				new Apple(80, "GREEN"),
		        new Apple(20, "GREEN"),
		        new Apple(321, "GREEN"),
		        new Apple(60, "GREEN"),
		        new Apple(50, "GREEN"),
		        new Apple(58, "GREEN"),
		        new Apple(57, "GREEN"),
		        new Apple(68, "GREEN"),
		        new Apple(90, "GREEN"),
		        new Apple(70, "GREEN"),
		        new Apple(82, "GREEN"),
		        new Apple(120, "red")
				);
		List<Apple> greenList = filter(inventory, a -> Color.GREEN.name().equals(a.getColor()));
		//System.out.println(greenList);
		
		
		greenList.sort(new Comparator<Apple>() {
			public int compare(Apple a, Apple b) {
				return a.getWeight() - b.getWeight();
			}
		});
		
		 System.out.println(greenList);
		
		 List<Apple> greenList2 = filter(inventory, a -> Color.GREEN.name().equals(a.getColor()));
			//System.out.println(greenList);
		 greenList2.sort(new AppleComparator());
		 System.out.println(greenList);
		 
		 List<Apple> greenList3 = filter(inventory, a -> Color.GREEN.name().equals(a.getColor()));
		 greenList3.sort((a, b) -> a.getWeight() - b.getWeight());
		 System.out.println(greenList3);
		 
	}
	
	
	public static <T> List<T> filter(List<T> list, Predicate<T> p){
		List<T> result = new ArrayList<>();
		for(T t : list) {
			if(p.test(t)) {
				result.add(t);
			}
		}
		return result;
	}
	
	public static <T> List<T> filters(List<T> list, Predicate<T> p){
		List<T> result = new ArrayList<>();
		for(T t : list) {
			if(p.test(t)) {
				result.add(t);
			}
		}
		return result;
	}
}
