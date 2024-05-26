package com.rk;

public class Calculator {
	
		public Integer add(Integer a,Integer b) {
			Integer c=a+b;
			System.out.println(c);
			return c;
		}
		
		public Double mul(Double i, Double j) {
			Double c=i*j;
			System.out.println(c);
			return c;
		}
		
		public Integer div(Integer s, Integer t)  {
			try {
				Thread.sleep(1005);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			Integer c=s/t;
			System.out.println(c);
			return c;
		}

	

}
