package com.srk;

public class SwitchStatement {

	public static void main(String[] args) {
		
		String weekdayName = "";
		weekdayName = "SUN";
		
		// values of any data type, string, int, double, char, class objects etc.
		switch(weekdayName) {
			case "MON":
				System.out.println("Monday activities");
				break;
			case "TUE":
				System.out.println("Tuesday activities");
				break;
			case "WED":
				System.out.println("Wednesday activities");
				break;
			case "THU":
				System.out.println("Thursday activities");
				break;
			case "FRI":
				System.out.println("Friday activities");
				break;
			case "SAT":
				System.out.println("Saturday activities");
				break;
			case "SUN":
				System.out.println("Sunday activities");
				break;
			default:
				break;
		
		}

	}

}
