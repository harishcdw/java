package assignment3;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Synchornized {

	public static void main(String[] args) {
		ExecutorService es = Executors.newFixedThreadPool(2);
		es.execute(() -> {
			synchronized (ThreadAccess.class) {
				ThreadAccess.openParam();
				
			}
		});
		es.execute(() -> {
			synchronized (ThreadAccess.class) {
				ThreadAccess.message();
			}

		});
		
		es.execute(() -> {
			synchronized (ThreadAccess.class) {
				ThreadAccess.closeParam();
			}

		});
		es.shutdown();
	}
}

class ThreadAccess {

	public static void openParam() {
		System.out.print("[-------");
	}

	public static void message() {
		System.out.print("Message1");
	}

	public static void closeParam() {
		System.out.println("------]");

	}

}