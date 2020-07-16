package com.sample.chap03;

import java.util.Comparator;

import org.apache.commons.math3.stat.descriptive.SynchronizedDescriptiveStatistics;
import org.junit.Ignore;
import org.junit.Test;

import com.AppleTest;
import com.Color;

import modernjavainaction.chap03.Apple;

public class ComparatorTest {

	@Test
	@Ignore
	public void test() {
		Comparator<AppleTest> comparator = new Comparator<AppleTest>() {
			@Override
			public int compare(AppleTest o1, AppleTest o2) {
				// TODO Auto-generated method stub
				return o1.getWeight() - o2.getWeight();
			}
		};
		
		Comparator<AppleTest> comparator2 = (AppleTest a, AppleTest b) -> a.getWeight() - b.getWeight();
		
		AppleTest t1 = new AppleTest(80, Color.GREEN);
		AppleTest t2 = new AppleTest(155, Color.GREEN);
		System.out.println(comparator.compare(t1, t2));
	}
	
	@Test
	public void test_01() {
		Runnable r1 = () -> System.out.println("Hello World 1"); //람다사용
		r1.run();
		
		Runnable r2 = new Runnable() {
			public void run() {
				System.out.println("Hello World 2");
			}
		};
		r2.run();
	}
}
