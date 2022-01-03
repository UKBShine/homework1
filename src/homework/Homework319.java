package homework;
import java.util.Scanner;
public class Homework319 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		int a=input.nextInt(),
			b=input.nextInt(),
			c=input.nextInt();
			if(a+b>c&&a+c>b&&b+c>a)
			{
				System.out.println(a+b+c);
			}
			else
				System.out.println("输入不合法");
			}

	
}

