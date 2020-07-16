package com.sample.chap02;

import java.util.List;
import java.util.function.Predicate;

public interface FilteringAppleService {

	public <T> List<T> filter(List<T> list, Predicate<T> p);
}
