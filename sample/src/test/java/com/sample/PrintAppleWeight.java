package com.sample;

import com.sample.chap01.Apple;

public class PrintAppleWeight implements PrintFormatter{

	@Override
	public String accept(Apple a) {
		// TODO Auto-generated method stub
		return "사과 무게는 : " + a.getWeight() + " 입니다.";
	}

}
