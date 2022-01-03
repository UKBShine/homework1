package homework;
import java.util.Scanner;
public class Homework39 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number,sum=0,a;
		Scanner input = new Scanner(System.in);
		number =input.nextInt();
		a=number;
		int i=9;
		while(number>0)
		{
			sum+=number%10*i--;
			//System.out.println(sum);
			number/=10;
		}
		sum%=11;
		if(sum==10)
			{
				while(i>0)
				{
					System.out.print("0");
					i--;
				}
				System.out.println(a+"X");
			}
		else
			{
				while(i>0)
				{
					System.out.print("0");
					i--;
				}
				System.out.println(a*10+sum);
			}
	}


}
