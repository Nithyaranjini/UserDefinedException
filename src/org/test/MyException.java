package org.test;
public class MyException extends Throwable{
		
		String s1;
		MyException(String s2){
			this.s1=s2;
		}
		
	public String toString() {
		return("My Task="+s1);
	}}
		


