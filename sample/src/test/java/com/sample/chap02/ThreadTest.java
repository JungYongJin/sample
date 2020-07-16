package com.sample.chap02;

import org.junit.Test;

public class ThreadTest {

	@Test
	public void test() {
		Thread t = new Thread(new Runnable() { public void run() {
				int sum=0;
				for(int i=1 ; i <= 10 ; i++ ) {
					sum = sum + i ;
					System.out.println(i + "더하기 결과: " + sum);
				}
				
				System.out.println("-------------------------------------");
				System.out.println("1~10 합계: " + sum);
			}
		});
		
		Thread t2 = new Thread(()->System.out.println("Hello world"));
		t.start();
		t2.start();
		
		long multiply=1;
		for(long i=1 ; i <= 10 ; i++ ) {
			multiply = multiply * i ;
			System.out.println(i + "곱하기 결과: " + multiply);
		}
		
		System.out.println("-------------------------------------");
		System.out.println("1~10 곱하기: " + multiply);
	}
}
