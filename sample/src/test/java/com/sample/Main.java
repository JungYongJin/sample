package com.sample;

import java.math.BigDecimal;

public class Main {

	public static void main(String...args ) {
		 BigDecimal  a = new BigDecimal("214");
		 System.out.println(a.intValue());
		 System.out.println(a.floatValue());
		 System.out.println(a.longValue());
		 System.out.println(a.plus());
		 
		 
		 BigDecimal b = new BigDecimal("-2");

		 System.out.println("max : " + a.max(b));
		 System.out.println("min : " + a.min(b));
		 System.out.println("abs : " + b.abs());
		
		 
		 BigDecimal c = new BigDecimal("214");
		 int d = 123;
		 BigDecimal e = new BigDecimal("214.123");

		 System.out.println(c.intValue());
		 System.out.println(new BigDecimal(d));
		 System.out.println(e.intValue());
		 System.out.println(e.longValue());
		 
		 
		 
		 
		 
			      /*val b = BigDecimal(1.0)
			      val c = BigDecimal(1.1)
			      val d = BigDecimal("1")
			      val e = BigDecimal("1.0")
			      val f = BigDecimal("1.1")
			      val g = BigDecimal(10000000001)
			      val h = BigDecimal(10000000001.1)
			      val i = BigDecimal("10000000001")
			      val j = BigDecimal("10000000001.1")
			      val k = BigDecimal("10000000000000000000000")
			      val l = BigDecimal("10000000000000000000001")
			      val m = BigDecimal("10000000000000000000001.1")
			      val n = BigDecimal(BigInteger("10000000000000000000000"))
			      val o = BigDecimal(BigInteger("10000000000000000000001"))*/
	}
	
}
