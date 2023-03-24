package assignment4;

public class SingleTon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Phone call1=Phone.MakeACall();
		Phone call2=Phone.MakeACall();
	}
}

class Phone{
	private Phone() {
		System.out.println("Connecting....");
	}
	private static Phone call;
	synchronized public static Phone MakeACall() {
		if(call==null) {
			call=new Phone();
		}
		return call;
	}
}
