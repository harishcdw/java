package assignment3;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Synchornized {

	public static void main(String[] args) {
		ThreadAccess t1 = new ThreadAccess();
		ExecutorService es = Executors.newFixedThreadPool(2);
		es.execute(() -> {
			synchronized (t1) {
				t1.openParam();
				
			}
		});
		es.execute(() -> {
			try {
				Thread.sleep(100);
			} catch (Exception e) {
				e.printStackTrace();
			}
			synchronized (t1) {
				t1.message();
			}

		});
		
		es.execute(() -> {
			try {
				Thread.sleep(200);
			} catch (Exception e) {
				e.printStackTrace();
			}
			synchronized (t1) {
				t1.closeParam();
			}

		});
		es.shutdown();
	}
}

class ThreadAccess {

	public void openParam() {
		System.out.println("[-------");
	}

	public void message() {
		System.out.println("Message1");
	}

	public void closeParam() {
		System.out.println("------]");

	}

}