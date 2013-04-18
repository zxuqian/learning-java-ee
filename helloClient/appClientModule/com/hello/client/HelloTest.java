package com.hello.client;

import javax.ejb.EJB;

import hello.ejb.interfaces.Hello;

/**
 * Test EJB
 * @author xuqian
 *
 */
public class HelloTest {
	
	@EJB
	private static Hello hello;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		System.out.println(hello.sayHello("David"));

	}

}
