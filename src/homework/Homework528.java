package homework;
import java.util.Scanner;
public class Homework528 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int year,month=1,day=1;
		year=input.nextInt();
		while(month<=12)
		{
			if(month<=2)
				month+=12;
			year-=1;
			int q=1,j=year/100,k=year%100,h;
			h=(q+26*(month+1)/10+k+k/4+j/4+5*j)%7;
			System.out.print(h+" ");
			if(month>12)
				month-=12;
			month++;
		}

}
}
