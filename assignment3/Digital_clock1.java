package assignment3;

import java.text.DateFormat;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Digital_clock1 {

	public static void main(String[] args) {
		ExecutorService es = Executors.newFixedThreadPool(3);
	
		es.execute(()->{
			try {
				while(true) {
					String s=DateFormat.getTimeInstance().format(new java.util.Date());
					System.out.println(s);
					Thread.sleep(1000);
				}
			}
			catch(Exception e) {
				
			}
		});
		
		es.shutdown();
	}
}
