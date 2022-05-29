package com.bluesky.helloworld;

public class HelloWorld {

	public static void main(String[] args) {
		
		if (args[0] != null) {
			System.out.println("Hello World - " + args[0]);
		} else {
			System.out.println("Hello World");
		}
	}
}
