package com.abc.features;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.print.attribute.IntegerSyntax;

//To collect only even numbers from the array list
public class Streams_Programs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Approach-1:-Without Streams
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i <= 10; i++)
			list.add(i);
		System.out.println("The list of integers are : " + list + " ");

		List<Integer> list2 = new ArrayList<>();
		System.out.println("The even numbers are : ");
		for (Integer listInteger : list) {
			if (listInteger % 2 == 0) {
				list2.add(listInteger);

			}

		}
		System.out.print(list2);

		// Approach-2:-With Streams
		//a Collector which collects all the input elements into a List, in encounter order
		List<Integer> list3 = list.stream().filter(l -> l % 2 == 0).collect(Collectors.toList());
		System.out.println(list3);
	
	
	//Using map() method
		List<String> listString = new ArrayList<String>();
		listString.add("abc");
		listString.add("rak");
		listString.add("sai");
		listString.add("sreelu");
		listString.add("jai");
		listString.add("Hi");
		System.out.println(listString);
	
/*	Processing by count()method 
 * this method returns number of elements present in the stream. 
	 
	public long count() */
		long count = listString.stream().count();
		System.out.println(count);
		long count1 = listString.stream().filter(s -> s.length() == 3).count();
		System.out.println("the number of 3 length strings are " + count1);

/*processing by collect() method 
 *  This method collects the elements from the stream and 
 *  adding to the specified to the collection indicated (specified)by argument. 
*/
//Ex: Program for map() and collect() Method 
		List<String> list4 = listString.stream().map(s -> s.toUpperCase()).collect(Collectors.toList());
		System.out.println("The converted Upper case Strings are : " + list4);

/*Processing by sorted()method if we sort the elements present inside stream then we should go for sorted() method. 
	*/
/*the sorting can either default natural sorting order or customized sorting order specified by comparator.
sorted()- default natural sorting order 
sorted(Comparator c)-customized sorting order. 
	*/
		List<Integer> l = new ArrayList<Integer>();
		l.add(5);
		l.add(8);
		l.add(3);
		l.add(1);
		l.add(0);
		l.add(2);
		l.add(6);
		l.add(4);
		l.add(7);
		l.add(9);
		l.add(10);
		System.out.println("The original list is: " + l);
	/*Stream<Integer> s=l.stream().sorted();
	List<Integer>l1=s.collect(Collectors.toList());*/
	//Default natural sorting order
		List<Integer> l1 = l.stream().sorted().collect(Collectors.toList());
		System.out.println("The sorted list is :" + l1);
	//customized sorting order is
		List<Integer> l2 = l.stream().sorted((s1, s2) -> s2.compareTo(s1)).collect(Collectors.toList());
		System.out.println("The customized sorting order is : " + l2);
	//Processing by min() and max() methods 
/*	min(Comparator c) returns minimum value according to specified comparator. 
	 
	max(Comparator c) returns maximum value according to specified comparator 
	*/
		Integer minValue = l.stream().min((s1, s2) -> s1.compareTo(s2)).get();
		System.out.println("The min value is: " + minValue);
		Integer maxValue = l.stream().max((s1, s2) -> s1.compareTo(s2)).get();
		System.out.println("The max value is: " + maxValue);
		/*
		 * forEach() method
		 * 
		 * this method will not return anything. this method will take lambda
		 * expression as argument and apply that lambda expression for each
		 * element present in the stream. Ex: l.stream().forEach(s->sop(s));
		 * l3.stream().forEach(System.out:: println);
		 */
		l.stream().forEach(i -> System.out.println(i));
		l.stream().forEach(System.out::println);
  //  toArray() method we can use toArray() method to copy elements present in the stream into specified array 
		Integer[] intArray = l.stream().toArray(Integer[]::new);
		for (Integer i : intArray)
			System.out.print(i + " ");
		/*
		 * Stream.of()method
		 * we can also apply a stream for group of values and for arrays.
		 */
		Stream<Integer> s = Stream.of(99, 999, 9999, 9999);
		s.forEach(System.out::print);
		Double[] d = { 2.0, 3.0, 5.0, 4.5, 3.5, 7.4 };
		Stream<Double> s1 = Stream.of(d);
		s1.forEach(System.out::print);

	}
	
	
	
	
	
	

}
