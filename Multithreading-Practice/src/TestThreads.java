
public class TestThreads implements Runnable{
	public static void main(String[] args) {
		TestThreads r = new TestThreads();
		Thread t = new Thread(r);
		t.start();
	}

	@Override
	public void run() {
		for(int i=0; i<6; i++)
			System.out.println("Runnable Running "+i);
	}
}
