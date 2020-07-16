package com.sample;

import java.util.Arrays;
import java.util.List;

import com.sample.chap01.Apple;

public class PrintApple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Apple> inventory = Arrays.asList(
				new Apple(80, "GREEN"),
		        new Apple(155, "GREEN"),
		        new Apple(120, "red")
				);
		
		perttyPrintApple(inventory, new PrintAppleColor()::accept);
		perttyPrintApple(inventory, a -> "사과 COLOR : " + a.getColor() + " 입니다.");
		
		perttyPrintApple(inventory, new PrintAppleWeight()::accept);
		perttyPrintApple(inventory, a -> "사과 무게는 : " + a.getWeight() + " 입니다.");
		
		//익명함수 이름이 없는 클래스 블록과 인스턴스 생성이 한번에 이루어진다 
		perttyPrintApple(inventory, new PrintFormatter() {
			@Override
			public String accept(Apple a) {
				// TODO Auto-generated method stub
				return "사과 무게는 : " + a.getWeight() + " 입니다.(익명함수 입니다.)";
			}
		});
		
	}
	
	public static void perttyPrintApple(List<Apple> inventory, PrintFormatter p) {
		for(Apple apple : inventory) {
			String str = p.accept(apple);
			System.out.println(str);
		}
	}

}
