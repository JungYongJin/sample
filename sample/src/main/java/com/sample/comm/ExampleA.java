package com.sample.comm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class ExampleA {

	public static void main(String...strings) {
		List<Integer> list = Arrays.asList(1,2,3,4,5,6);
		forEach(list, (i) -> System.out.println(i));
		List<Integer> l = map(Arrays.asList("lambdas","in","action"), (s) -> s.length());
		System.out.println(l.get(1));
	}
	
	public static <T> void forEach(List<T> list, Consumer<T> c) {
		for(T t : list) {
			c.accept(t);
		}
	}
	
	public static <T,R> List<R> map(List<T> list, Function<T, R> f){
		List<R> result = new ArrayList<>();
		for(T t : list) {
			result.add(f.apply(t));
		}
		return result;
	}
}
