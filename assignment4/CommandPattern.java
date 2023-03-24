package assignment4;

public class CommandPattern {

	public static void main(String[] args) {
		Temperature temp=new Temperature();
		Time time = new Time();
		WaterLevel lvl = new WaterLevel();
		
		
		MachineRemote mr = new MachineRemote();
		
		mr.setCommand(1,new Sports(temp,time,lvl));
		mr.setCommand(2,new QuickWash(temp,time,lvl));
		mr.setCommand(3,new EconomyMode(temp,time,lvl));
		mr.setCommand(4,new SmartRinse(temp,time,lvl));
		
		mr.executeCommand(1);

	}

}


class MachineRemote{
	Command c[] = new Command[5];
	public MachineRemote() {
		for(int i=0;i<c.length;i++) {
			c[i]=new Command() {
				public void execute() {
					System.out.println();
				}
			};
		}
	}
	
	public void executeCommand(int slot) {
		c[slot].execute();
	}
	public void setCommand(int slot,Command cc) {
		c[slot]=cc;
	}
	
	
}





abstract class Command{
	Temperature temp;Time time; WaterLevel lvl;
	public abstract void execute();
}

class Sports extends Command{
	public Sports(Temperature temp,Time time, WaterLevel lvl) {
		this.temp = temp;
		this.time=time;
		this.lvl=lvl;
	}
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		System.out.println("Sports mode Initiated");
		temp.lowTemp();
		time.long1();
		lvl.full();
		System.out.println("Sports mode started");	
	}
}

class QuickWash extends Command{
	public QuickWash(Temperature temp,Time time, WaterLevel lvl) {
		this.temp = temp;
		this.time=time;
		this.lvl=lvl;
	}
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		System.out.println("QuickWash mode Initiated");
		temp.highTemp();
		time.quick();
		lvl.low();
		System.out.println("QuickWash mode started");	
	}
}

class EconomyMode extends Command{
	public EconomyMode(Temperature temp,Time time, WaterLevel lvl) {
		this.temp = temp;
		this.time=time;
		this.lvl=lvl;
	}
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		System.out.println("Economy Mode Initiated");
		temp.moderateTemp();
		time.moderate();
		lvl.moderate();
		System.out.println("Economy Mode started");	
	}
}


class SmartRinse extends Command{
	public SmartRinse(Temperature temp,Time time, WaterLevel lvl) {
		this.temp = temp;
		this.time=time;
		this.lvl=lvl;
	}
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		System.out.println("SmartRinse Mode Initiated");
		temp.highTemp();
		time.moderate();
		lvl.moderate();
		System.out.println("SmartRinse Mode started");	
	}
}


class Temperature{
	public void highTemp() {
		System.out.println("Hot water");
	}
	public void moderateTemp() {
		System.out.println("Normal Water");
	}
	public void lowTemp() {
		System.out.println("Cold Water");
	}
}

class Time{
	public void quick() {
		System.out.println("30 mins");
	}
	public void moderate() {
		System.out.println("60 mins");
	}
	public void long1() {
		System.out.println("90 mins");
	}
	
}

class WaterLevel{
	public void low() {
		System.out.println("1/4 level");
	}
	public void moderate() {
		System.out.println("1/2 level");
	}
	public void full() {
		System.out.println("full level");
	}
}