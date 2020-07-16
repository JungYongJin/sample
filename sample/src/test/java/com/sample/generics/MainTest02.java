package com.sample.generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainTest02 {

	// before
	//언바운드 와일드카드 타입(Unbounded wildcard type)
	//List<?>와 같은 타입을 언바운드 와일드카드 타입이라고 한다. 우선 Unbounded라는 단어를 알면 이해하는 데 도움이 된다.
	//1. Object 클래스에서 제공되는 기능을 사용하여 구현할 수 있는 메서드를 작성하는 경우
	//2. 타입 파라미터에 의존적이지 않은 일반 클래스의 메소드를 사용하는 경우, 예를 들면 List.clear, List.size, Class<?>
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list = Arrays.asList("1","2","3","4");
		printList(list);
	}
	
	private static void printList(List<?> list) {
		for(Object elem : list) {
			System.out.println(elem + " ");
		}
	}
}
