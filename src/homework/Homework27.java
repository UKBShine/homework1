package homework;

public class Homework27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long totalMillisenconds = System.currentTimeMillis();
		
		long totalSeconds= totalMillisenconds/1000;
		
		long currentSecond = totalSeconds %60;
		
		long totalMinutes = totalSeconds /60;
		
		long currentMinute = totalMinutes %60;
		
		long totalHours = totalMinutes/60;
		
		long currentHour = totalHours%24;
		
		System.out.println("Current time is "+currentHour+":"+currentMinute+":"+currentSecond+" GMT");
		
	}

}
