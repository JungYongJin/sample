package com.sample.generics;

public class MainTest03 {

	//바운드 타입 매개변수(Bounded type parameter)
	//바운드 타입은 특정 타입으로 제한한다는 의미이다. 특정 타입의 서브타입으로만 제한을 시키겠다는 것으로 해석하면 된다. 
	//클래스나 인터페이스 설계 시 가장 흔하게 사용할 정도로 제네릭에서 사용이 쉬운 개념이라고 볼 수 있다.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box<Integer> box = new Box<>();
		box.set(124);
		System.out.println(box.get());
		
	}
}
