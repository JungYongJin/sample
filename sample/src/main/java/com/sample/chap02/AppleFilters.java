package com.sample.chap02;

public class AppleFilters implements ApplePredicate{

	@Override
	public boolean test(Apple o) {
		// TODO Auto-generated method stub
		
		return o.getWeight() > 150;
	}

}
