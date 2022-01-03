package homework;
import java.util.Scanner;
public class Homework537 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		int ten=input.nextInt();
		int two;
		while(ten>0)
		{	
			System.out.print(ten%2);
			ten/=2;
		}
	}

}
