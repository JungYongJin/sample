package com.sample.generics;

import java.util.ArrayList;
import java.util.List;

public class MainTest01 {

	// before
	public static void main(String[] args) {
		
		//비 구체화 타입(non-reifiable type) : 타입 소거자에 의해 컴파일 타임에 타입 정보가 사라지는 것(런타임에 구체화하지 않는 것)
		List<String> list = new ArrayList<>();
		list.add("HI");
		
		//자신의 타입 정보를 런타임 시에 알고 지키게 하는 것 (런타임에 구체화하는 것)
		Object[] array = new Long[10];
		array[0] = 1L;
	}
	
	// after
	/*public static void main(String... var0) {
	  ArrayList var1 = new ArrayList();
	  var1.add("Hi");
	  Long[] var2 = new Long[10];
	  var2[0] = Long.valueOf(1L);
	}*/

}
