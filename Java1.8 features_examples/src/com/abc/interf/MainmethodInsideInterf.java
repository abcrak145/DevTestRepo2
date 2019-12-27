package com.abc.interf;

public interface MainmethodInsideInterf {
	/*public static void main(String[] args) {
		System.out.println("This main() is present in inside Interface");
		MainmethodInsideInterf.m1();
	}*/
	public static void m1(){
		System.out.println("This is static m1() method");
	}
	//Default methods also known as defender methods or virtual extension methods. 
	default void m2(){
		System.out.println("This is default method");
	}
	default int myHashCode(){
		System.out.println(10);
		return 10;
	}

}
