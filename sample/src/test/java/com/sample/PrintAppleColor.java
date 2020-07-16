package com.sample;

import com.sample.chap01.Apple;

public class PrintAppleColor implements PrintFormatter {

	@Override
	public String accept(Apple a) {
		//TODO Auto-generated method stub
		return "사과 COLOR : " + a.getColor() + " 입니다.";
	}
}
