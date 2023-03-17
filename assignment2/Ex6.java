package assignment2;

class Baseclass{
	static int[] arr= {1,2,3,4,5};
	int val;
	public Baseclass(){
		 val=arr[6];
		 
	}
}




public class Ex6 extends Baseclass{
	public Ex6(){
		try {
			super();
		}
		catch(Exception e){
			System.out.println(e);
		}
	}
	 
	public static void main(String[] args) {
		System.out.println("Exception handling");
	}

}


