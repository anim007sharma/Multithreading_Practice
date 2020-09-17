package com.anim007sharma.threads.basics;

public class ThreadExercise1 extends Thread{
	@Override
	public void run() {
		for(int i=0; i<100; i++) {
			if(i%10==0)
				System.out.println("Hell Yeah!");
			try {
				Thread.sleep(1000);
			}
			catch(InterruptedException ex) {}
		}
	}
	public static void main(String[] args) {
		ThreadExercise1 t = new ThreadExercise1();
		t.start();
	}
}
