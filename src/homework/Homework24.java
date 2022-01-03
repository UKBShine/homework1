package homework;
import java.util.Scanner;
public class Homework24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final double PI =3.14159;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number for radius");
		double r = input.nextDouble();
		double area = r*r*PI;
		System.out.println("The area for the cirtle of radius "+r+" is "+area);
	}

}
