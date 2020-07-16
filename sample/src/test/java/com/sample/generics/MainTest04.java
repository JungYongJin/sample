package com.sample.generics;

public class MainTest04 {

	//재귀적 타입 바운드(Recursive type bound)
	//재귀적 타입 바운드는 타입 매개변수가 자신을 포함하는 수식에 의해 한정될 수 있다. 
	//타입의 자연율을 정의하는 Comparable 인터페이스와 가장 많이 사용된다.
	public static void main(String[] args) {
		Box<Integer> box = new Box<>();
		box.set(124);
	}
}
