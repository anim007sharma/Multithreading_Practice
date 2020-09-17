package com.anim007sharma.threads.basics;

public class ManyNames {

	public static void main(String[] args) {
		Runnable r = ()->{
			for(int i=1; i<=3; i++)
				System.out.println("Run by "+Thread.currentThread().getName()+", i is "+i);
		};
		Thread one = new Thread(r);
		Thread two = new Thread(r);
		Thread three = new Thread(r);
		one.setName("Ankesh");
		two.setName("Kumar");
		three.setName("Sharma");
		one.start();
		two.start();
		three.start();
	}

}
