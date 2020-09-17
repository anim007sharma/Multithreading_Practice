package com.anim007sharma.threads.synchronization;

public class AccountSafe implements Runnable{
	private Account acc = new Account();
	public static void main(String[] args) {
		AccountSafe r = new AccountSafe();
		Thread one = new Thread(r);
		Thread two = new Thread(r);
		one.setName("Lucy");
		two.setName("Fred");
		one.start();
		two.start();
	}

	@Override
	public void run() {
		for(int i=0; i<5; i++) {
			makeWithdrawal(10);
			if(acc.getBalance()<0)
				System.out.println("Account is overdrawn");
		}	
	}

	private synchronized void makeWithdrawal(int amount) {
		if(acc.getBalance()>=amount) {
			System.out.println(Thread.currentThread().getName()+" is going to withdraw!");
			try {
				Thread.sleep(500);
			}
			catch(InterruptedException ex) {}
			acc.withdraw(amount);
			System.out.println(Thread.currentThread().getName()+" has completed the withdrawn");
		}
		else {
			System.out.println("Not enoungh in account for "+Thread.currentThread().getName()+ " to withdraw");
					}
		
	}

}
