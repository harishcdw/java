package assignment4;

public class Builder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		House hs=new House.BuildHouse().
				ConstructHall(new Hall()).
				ConstructBedroom(new Bedroom()).
				ConstructKitchen(new Kitchen.BuildKitchen().constructOven(new Oven()).
				build()).build();
		
		System.out.println(hs);

	}

}


class House{
	Hall hall;
	Kitchen kit;
	Bedroom br;
	Toilet tl;
	public House(Hall hall, Kitchen kit, Bedroom br,Toilet tl) {
		this.hall=hall;
		this.kit=kit;
		this.br=br;
		this.tl=tl;
	}
	
	static class BuildHouse{
		Hall hall; Kitchen kit; Bedroom br;Toilet tl;
		
		public BuildHouse ConstructHall(Hall hall) {
			this.hall=hall;
			return this;
		}
		
		public BuildHouse ConstructKitchen(Kitchen kit) {
			this.kit=kit;
			return this;
		}
		public BuildHouse ConstructBedroom(Bedroom br) {
			this.br=br;
			return this;
		}
		public BuildHouse ConstructToilet(Toilet tl) {
			this.tl=tl;
			return this;
		}
		
		public House build() {
			return new House(hall,kit,br,tl);
		}
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "House [Hall="+hall+",Kitchen="+kit+",Bedroom="+br+",Toilet="+tl;
	}
}


class Kitchen{
	ExhausterFan efan;Stove s;Oven o;
	public Kitchen(ExhausterFan efan,Stove s,Oven o) {
		this.efan=efan;
		this.s=s;
		this.o=o;
	}
	static class BuildKitchen{
		ExhausterFan efan;Stove s;Oven o;
		public BuildKitchen constructEfan(ExhausterFan efan) {
			this.efan=efan;
			return this;
		}
		public BuildKitchen constructOven(Oven o){
			this.o=o;
			return this;
			
		}
		public BuildKitchen constructStove(Stove s) {
			this.s=s;
			return this;
		}
		public Kitchen build() {
			return new Kitchen(efan,s,o);
		}
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Kitchen [ExhausterFan="+efan+",Oven="+o+",Stove="+s;
	}
	
}


class Hall{
	
}

class Bedroom{
	
}
class Toilet{
	
}

class ExhausterFan{
	
}
class Stove{
	
}
class Oven{
	
}