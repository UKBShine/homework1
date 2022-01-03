package homework;
import java.util.Scanner;
public class Homework328 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		double x1=input.nextDouble(),
			x2=input.nextDouble(),
			y1=input.nextDouble(),
			y2=input.nextDouble(),
			lenth1=input.nextDouble(),
			lenth2=input.nextDouble(),
			high1=input.nextDouble(),
			high2=input.nextDouble();
		if(x2-lenth2/2>x1-lenth1/2&&x2+lenth2/2<x2+lenth2/2&&y2+high2/2<y1+high1/2&&y2-high2/2>y1-high1/2)
			System.out.println("inside");
		else if(Math.abs(x1-x2)<(lenth1+lenth2)&&Math.abs(y1-y2)<(high1+high2))
			System.out.println("overrlaps");
		else
			System.out.println("no");
	}

}
