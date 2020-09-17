package com.anim007sharma.threads.basics;

public class ManyNames1 {

	public static void main(String[] args) {
		NameRunnable1 nr = new NameRunnable1();
		Thread one = new Thread(nr);
		one.setName("First");
		Thread two = new Thread(nr);
		two.setName("Second");
		Thread three = new Thread(nr);
		three.setName("Thrid");
		one.start();
		two.start();
		three.start();
	}

}
