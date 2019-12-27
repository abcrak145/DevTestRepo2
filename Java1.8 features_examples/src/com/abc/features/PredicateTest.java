package com.abc.features;

import java.util.function.IntPredicate;
import java.util.function.Predicate;

public class PredicateTest {
	/*public boolean test(Integer i) {
		if (i > 10)
			return true;
		else
			return false;

	}*/
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Write a predicate to check whether the given integer is greater than 10 or not
		/*In this case first 5 will be auto boxing into Integer type(wrapper) and next it pass to I again convert into int type (auto unboxing).
		so, performance wise it is not useful so better to go for "IntPredicate functional interface"*/
		//Predicate<Integer> predicate=I->(I>10);
		IntPredicate predicate=i->(i>10);
		System.out.println(predicate.test(5));
		System.out.println(predicate.test(20));
		
		int[] x={0,20,50,65,83,35,60,85};
		IntPredicate intPredicate=(i)->(i%2==0);
		for(int i:x){
			if(intPredicate.test(i))
			System.out.println(i);
		}
		
		
		
		
	}

}
