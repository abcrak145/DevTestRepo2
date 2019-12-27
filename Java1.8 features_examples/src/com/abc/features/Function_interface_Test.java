package com.abc.features;
//Write a function to find length of given input string. 
import java.util.function.Function;

public class Function_interface_Test {
/*	Functions are exactly same as predicates except that functions can return any type of result
			but function should(can)return only one value and that value can be any type as per our requirement.
					To implement functions oracle people introduced  Function interface in 1.8version.
					Function interface present in java.util.function package. Functional interface contains only one method i.e., apply() */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Function<String,Integer> function=string->string.length();
		Function<String,String> function1=string1->string1.substring(1,4);
		String a = "slokam";
		Function<String,Integer> function2=string1->string1.indexOf(a);
		
		
		
		System.out.println(function.apply("durga"));
		System.out.println(function.apply("abcrak 145 "));
		System.out.println(function.apply(" abcrak 145 ").getClass().getName());
		String s1 = "abcrak";
		System.out.println(function1.apply(s1));
		System.out.println(function1.apply("cbark"));

	}

}
