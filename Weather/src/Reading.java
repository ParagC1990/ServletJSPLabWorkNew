import java.util.ArrayList;

public class Reading {
	String day;
	int hour;
	int temperature;
	int windSpeed;
	ArrayList<String> list;
	ArrayList<String> time;
	
	
	String tempRating;
	public Reading(String str) {
		super();
		String[] elements = str.split(", ");
		day = elements[0];
		hour = Integer.valueOf(elements[1]);
		temperature = Integer.valueOf(elements[2]);
		windSpeed = Integer.valueOf(elements[3]);
		
		list = new ArrayList<>();
		list.add("cold");
		list.add("mild");
		list.add("warm");
		list.add("hot");
		
		time = new ArrayList<>();
		time.add("morning");
		time.add("afternoon");
		time.add("evening");
		
		}
	
	public String rateTemperature(){
		if(temperature < 55)
			return list.get(0);
		else if(temperature < 65)
			return list.get(1);
		else if(temperature < 80)
			return list.get(2);
		
			return list.get(3);
	}
	
	public String getTime(){
		if(hour == 9)
			return day + " " + time.get(0);
		else if(hour == 15)
			return day + " " + time.get(1);
		return day + " " + time.get(2);
	}
	
}
