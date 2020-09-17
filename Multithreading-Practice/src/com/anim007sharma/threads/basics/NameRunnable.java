package com.anim007sharma.threads.basics;

public class NameRunnable implements Runnable {

	@Override
	public void run() {
		System.out.println("Name Runnable runnig");
		System.out.println("Run by "+Thread.currentThread().getName());

	}

}
