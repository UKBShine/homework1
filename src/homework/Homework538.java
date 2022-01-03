package homework;
import java.util.Scanner;
public class Homework538 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		int ten=input.nextInt();
		int two=1,sum=0;;
		while(ten>0)
		{	
			sum+=ten%8*two;
			ten/=8;
			two*=10;
		}
		System.out.print(sum);
	}

}
