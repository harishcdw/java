package assignment6;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Application {
	public static void main(String[] args) {
		Travel travel = new Travel();
		try (Scanner inp = new Scanner(System.in)) {
			System.out.println("Enter the speed of the Vehicle in km/hour : ");
			travel.setSpeed( inp.nextInt());
			
			System.out.println("Enter the distance to travel by the Vehicle in km : ");
			travel.setDistance( inp.nextInt());
		}
		DestinationTime dt = new DestinationTime();
		dt.destination(travel);
	}
}


class DestinationTime{
	
	CurrDateTime currDateTime = new CurrDateTime();
	dayOfTheDate dayOfTheDateObj= new dayOfTheDate();
	int day=dayOfTheDateObj.dayofweek( currDateTime.getDate(), currDateTime.getMonth(), currDateTime.getYear());
	int desDate=currDateTime.getDate(),desMonth=currDateTime.getMonth(),desYear=currDateTime.getYear();
	
	int desHour=0;
	float desMin=0;
	public boolean isLeapYear(int year){
		if(year%400==0)
			return false;
		else if (year%100==0)
			return false;
		else if (year%4==0) {
			return true;
		}
		return false;	
	}
	public void destination(Travel travel)
	{
		float speed=travel.getSpeed();
		float distance=travel.getDistance();
		float remTimeToTravel=distance/speed;
		int Mon31[]= {1,3,5,7,8,10,12};
		List<Integer> l1 = new ArrayList<>();
		for (int i : Mon31){
		    l1.add(i);
		}
		boolean flag1=true;
		while(remTimeToTravel>0) {
			if(WorkingDay.isWorkingday(desDate,desMonth,desYear,day)) 
			{
				float todayremTime=8;
				/**
				 * For the first time, flag1 will be false, which means the travel for the first day will be the remaining time of that day.
				 * For example if the travel starts by 9 pm, the remaining available time for that day to travel is 3 hrs) 
				 * but for the next upcoming days it can take the entire day(8 hrs)
				 * So in this manner the travel time of each working day is calculated and reduced from the total time.
				 */
				if(flag1){
					todayremTime=24-currDateTime.getHour()-(currDateTime.getMin()/(float)60);
					flag1=false;
				}
			
				if(remTimeToTravel>=todayRemTime) {		
					remTimeToTravel-=todayRemTime;
				}
				else{	
					desHour=(int)remTimeToTravel;
					desMin=remTimeToTravel-desHour;
					remTimeToTravel=0;	
				}
			 }
			 
			 desDate+=1;
			 day+=1;
			 if(day%7==0){
				 day=0;
			 }
			 
			 if(desMonth==2) {	
					if(isLeapYear(desYear)) {
						if(desDate>=30) {
							desDate=1;
							desMonth+=1;
						}
					}
					else {
						 if(desDate>=29){
							desDate=1;
							desMonth+=1;
						}
					}
				}
				else if(l1.contains(desMonth)) {
					if(desDate>=32) {
						desDate=1;
						desMonth+=1;
					}
				}
				else { 
					if(desDate>=31) {
						desDate=1;
						desMonth+=1;
					}
				}
				if(desMonth>=13) {
					desMonth=1;
					desYear+=1;
				}
		}
		System.out.println("<--------------------------------------------->");
		System.out.println("The vehicle will reach the destination by");
		System.out.print(desDate+"/"+desMonth+"/"+desYear);
		int val=(int)Math.ceil(desMin*60);
		System.out.println(" "+desHour+":"+val+" A.M");	
		System.out.println("<--------------------------------------------->");
	}
}

/**
 * getter setter for speed and distance
 */
class Travel{
	float speed;
	float distance;
	
	public void setSpeed(float speed) {
		this.speed=speed;
	}
	public void setDistance(float distance) {
		this.distance=distance;
	}
		
	public float getSpeed() {
		return speed;
	}
	
	public float getDistance() {
		return distance;
	}	
}

/**
 * function to get date and time
 */
class CurrDateTime{
	
	 LocalDateTime now = LocalDateTime.now();
     DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");  
     String dateTime = now.format(format); 

	public int getDate() {
		String date = dateTime.substring(0,2);
		return Integer.parseInt(date);
	}
		
	public int getMonth() {
		String month = dateTime.substring(3,5);
		return Integer.parseInt(month);
	}
	
	public int getYear() {
		String year = dateTime.substring(6,10);
		return Integer.parseInt(year);
	}
	
	public int getHour() {
		String hour = dateTime.substring(11,13);
		return Integer.parseInt(hour);
	}
	
	public int getMin() {
		String min = dateTime.substring(14,16);
		return Integer.parseInt(min);
	}
	
	public int getSec() {
		String sec= dateTime.substring(17,19);
		return Integer.parseInt(sec);
	}
}

/**
 * getting day of the given data
 */
class dayOfTheDate{
	int dayofweek(int date, int month, int year)
    {
        int t[] = { 0, 3, 2, 5, 0, 3, 5, 1, 4, 6, 2, 4 };
        if (month < 3) {
            year--;
        }
        return (year + year / 4 - year / 100 + year / 400 + t[month - 1] + date)% 7;
    }
}

/**
 * checking for working day
 */
class WorkingDay{
	public static boolean isWorkingday(int date,int month,int year,int day) {
		if(date==1&&month==1) {
			return false;
		}
		else if(date==26&&month==1) {
			return false;
		}
		else if(date==15&&month==8) {
			return false;
		}
		else if(day==0) {
			return false;
		} 
		else if(day==6 && date/7==1) {
			return false;
		}
		return true;	
	}
}
	
	
	
	
	
	
