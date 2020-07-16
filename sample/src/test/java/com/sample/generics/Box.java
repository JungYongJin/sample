package com.sample.generics;

public class Box<T extends Number> {

	private T value;
	
	public void set(T value) {
		this.value = value;
	}
	
	public T get() {
		return this.value;
	}
}
