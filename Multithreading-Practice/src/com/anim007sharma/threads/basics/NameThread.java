package com.anim007sharma.threads.basics;

public class NameThread {

	public static void main(String[] args) {
		NameRunnable r = new NameRunnable();
		Thread t = new Thread(r);
		t.setName("Ankesh");
		t.start();
		System.out.println("Running "+Thread.currentThread().getName());
	}

}
