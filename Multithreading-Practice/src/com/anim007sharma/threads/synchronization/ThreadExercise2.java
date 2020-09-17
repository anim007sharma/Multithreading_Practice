package com.anim007sharma.threads.synchronization;

public class ThreadExercise2 extends Thread{
	StringBuffer str;
	ThreadExercise2(StringBuffer str){
		this.str=str;
	}
	@Override
	public void run() {
		synchronized(str) {
		for(int i=0; i<100; i++) {
			System.out.print(str);
		}
		System.out.println();
		char temp = str.charAt(0);
		++temp;
		str.setCharAt(0, temp);}
	}
	public static void main(String[] args) {
		StringBuffer str = new StringBuffer("A");
		new ThreadExercise2(str).start();
		new ThreadExercise2(str).start();
		new ThreadExercise2(str).start();
	}

}
