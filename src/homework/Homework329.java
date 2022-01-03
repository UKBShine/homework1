package homework;
import java.util.Scanner;
public class Homework329 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		double x1=input.nextDouble(),
			y1=input.nextDouble(),
			x2=input.nextDouble(),
			y2=input.nextDouble(),
			r1=input.nextDouble(),
			r2=input.nextDouble();
		if((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2)<=r1*r1)
				System.out.println("inside");
		else if((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2)>=r1*r1&&(x1-x2)*(x1-x2)+(y1-y2)*(y1-y2)<(r2+r1)*(r2+r1))
				System.out.println("overlaps");
		else
			System.out.println("no");
	}

}
