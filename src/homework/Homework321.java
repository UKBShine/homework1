package homework;
import java.util.Scanner;
public class Homework321 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int year,month,day;
		year=input.nextInt();
		month=input.nextInt();
		day=input.nextInt();
		int q=day,j=year/100,k=year%100,h;
		if(month==1||month==2)
			month+=12;
			year-=1;
		h=(q+26*(month+1)/10+k+k/4+j/4+5*j)%7;
		System.out.println(h);
	}
}
