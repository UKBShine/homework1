package homework;
import java.util.Scanner;
public class Homework327 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		double x=input.nextDouble(),
		y=input.nextDouble();
		if(x>0&&y>0&&y<(-1/2)*x+100)
			System.out.println("The point is in the triangle");
		else
			System.out.println("The point is not in the triangle");
	}
}
