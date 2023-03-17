package assignment2;

public class Ex2 {

	public void mth1() {
		mth2();
		System.out.println("caller");
	}
	public void mth2() {
		try {
			int l=4/0;
//			System.exit(0);
			return;
		}
		catch(Exception e) {
			System.out.println("catch-mth2");
		}
		finally {
			System.out.println("finally-mth2");
		}
	}
	
	public static void main(String p[]) {
		Ex2 e = new Ex2();
		e.mth1();
		
	}

}
