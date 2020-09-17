package com.anim007sharma.threads.basics;

public class NameRunnable1 implements Runnable{

	@Override
	public void run() {
		for(int i=1; i<=3; i++) {
			System.out.println("Run by "+Thread.currentThread().getName());
			try {
				Thread.sleep(1000);
			}
			catch(InterruptedException ex){
				
			}
		}
		
	}
	
}
