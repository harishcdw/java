package assignment3;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CharacterThread {

	public CharacterThread(String str) {
		ExecutorService es = Executors.newFixedThreadPool(1);
		es.execute(() -> {
			for (int i = 0; i < str.length(); i++) {
			
				try {
					Thread.sleep(500);
					if (Character.isAlphabetic(str.charAt(i))) {
						System.out.println(str.charAt(i));

					} else {
						throw new MyException();
					}
					
				} catch (Exception e) {
					
					System.err.println(e);
				}
			}
		});
	}

	public static void main(String[] args) {
		new CharacterThread("hari123chennai");
	}

}

class MyException extends Exception{
	public MyException() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Not an alphabetic character";
	}
}