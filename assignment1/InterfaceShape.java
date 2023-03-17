package assignment1;


interface CalcArea{
	public double Areacircle(double r);
	public double AreaSquare(double a);
	public double AreaTriangle(double a,double b,double c);	
	
}

interface CalcVolume{
	public double VolCircle(double r);
	public double VolSquare(double a);
	
}

class Shapes implements CalcArea,CalcVolume{
	public double Areacircle(double r) {
		return 3.14*r*r;
	}
	public double AreaSquare(double a) {
		return a*a;
	}
	public double AreaTriangle(double a,double b,double c) {
		return (a+b+c)/2;
	}
	public double VolCircle(double r) {
		return (4*3.14*r*r*r)/3;
	}
	public double VolSquare(double a) {
		return a*a*a;
	}
	
}




public class InterfaceShape {
	public static void main(String[] args) {
		
		Shapes s1 = new Shapes();
		System.out.println(s1.Areacircle(5));
		System.out.println(s1.AreaSquare(5));
		System.out.println(s1.AreaTriangle(5,5,5));
		System.out.println(s1.VolCircle(5));
		System.out.println(s1.VolSquare(5));
	}
}
