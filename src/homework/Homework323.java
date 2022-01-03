package homework;
import java.util.Scanner;
public class Homework323 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		double x=input.nextDouble(),
		y=input.nextDouble();
		if(x<5&&x>-5&&y>-2.5&&y<2.5)
		{
			System.out.println("Point is in the rectangle");
		}
		else
			System.out.println("Point is not in the rectangle");
	}

}
