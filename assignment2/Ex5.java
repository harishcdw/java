package assignment2;

/***
 * 
 * @author harishm
 *
 */
class MyException extends Exception{
	int age;
	MyException(int age){
		this.age=age;
	}
	public String toString() {
		return "Your are under age";
	}
}



public class Ex5 {
	/***
	 * 
	 * @param age
	 * @throws MyException
	 */
	static void validate(int age) throws MyException{
		if(age<18) {
			throw new MyException(age);
		}
		else {
			System.out.println("Your are eligible for the process");
		}
	}
	/***
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			validate(23);
			validate(8);
		}
		catch(Exception e) {
			
		}
		

	}

}
