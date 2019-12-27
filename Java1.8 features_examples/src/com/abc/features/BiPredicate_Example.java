package com.abc.features;

import java.util.function.BiPredicate;
//To check the sum of two integer values is even or not using BiPredicate
public class BiPredicate_Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BiPredicate<Integer, Integer> biPredicate=(a,b)->(a+b) % 2==0;
		System.out.println(biPredicate.test(10, 20));
		System.out.println(biPredicate.test(15, 20));

	}

}
