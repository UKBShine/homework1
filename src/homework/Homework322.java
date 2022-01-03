package homework;
import java.util.Scanner;
public class Homework322 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		int x=input.nextInt(),
		y=input.nextInt();
		if(Math.sqrt(x*x+y*y)<10)
			System.out.println("point is in the circle");
		else
			System.out.println("point is not in the circle");
	}

}
