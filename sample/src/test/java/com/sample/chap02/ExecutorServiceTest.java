package com.sample.chap02;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import org.junit.Test;

public class ExecutorServiceTest {

	@Test
	public void test() {
		ExecutorService executorService = Executors.newCachedThreadPool();
		Future<String> threadName =  executorService.submit(new Callable<String>() {
				public String call() throws Exception{
					return Thread.currentThread().getName();
				}
		});
		
		System.out.println(threadName);
		
	}
}
