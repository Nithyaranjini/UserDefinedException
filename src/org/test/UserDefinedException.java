package org.test;

public class UserDefinedException {
	public static void main(String[] args) {
		try {
			throw new MyException("TO create user defined exception");
		}
		catch (MyException e) {
			System.out.println(e);
		}
		
	}

}
