
public class TestThreadsLambda {

	public static void main(String[] args) {
		Runnable r = ()->{
			for(int i=0; i<6; i++)
				System.out.println("Runnable Running "+i);
		};
		Thread t = new Thread(r);
		t.start();
	}

}
