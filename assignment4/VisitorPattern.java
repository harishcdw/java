package assignment4;

public class VisitorPattern {

	public static void main(String[] args) {
		VehicleVisitor vv = new Fuel();
		Vehicle f = new TwoWheeler();
		System.out.println(f.getName());
		System.out.println(f.visit(vv));
		
	}
}




interface VehicleVisitor {
	String visit(TwoWheeler honda);
	String visit(FourWheeler suzuki);
	String visit(Electric electric);
}

class Fuel implements VehicleVisitor {
	
	public String visit(TwoWheeler honda) {
		return "Petrol fuel";
	}
	
	public String visit(FourWheeler suzuki) {
		return "Diesel Fuel";
	}

	public String visit(Electric electric) {
		return "Electric Charge";
	}
	
}




interface Vehicle {
	
	String getName();
	String visit(VehicleVisitor visitor);
	
}

class TwoWheeler implements Vehicle {
	@Override
	public String getName() {
		return "honda";
	}

	@Override
	public String visit(VehicleVisitor visitor) {
		return visitor.visit(this);
	}
}

class FourWheeler implements Vehicle {
	@Override
	public String getName() {
		return "suzuki";
	}

	@Override
	public String visit(VehicleVisitor visitor) {
		return visitor.visit(this);
	}
}

class Electric implements Vehicle {
	@Override
	public String getName() {
		return "electric";
	}

	@Override
	public String visit(VehicleVisitor visitor) {
		return visitor.visit(this);
	}
}





	

	

