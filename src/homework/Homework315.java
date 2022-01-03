package homework;
import java.util.Scanner;
public class Homework315 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int number= input.nextInt();
		int answer,bai,shi,ge,a1,a2,a3,a4,a5;
		answer=(int)Math.random()*900+100;
		bai=number/100;
		ge=number%10;
		shi=number/10%10;
		a1=bai*100+ge*10+shi;
		a2=ge*100+bai*10+shi;
		a3=ge*100+shi*10+bai;
		a4=shi*100+ge*10+shi;
		a5=shi*100+shi*10+ge;
		if(answer==number)
			System.out.println("10000");
		else if(answer==a1||answer==a2||answer==a3||answer==a4||answer==a5)
			System.out.println("3000");
		else if(bai==answer/100||bai==answer%10||bai==answer/10%10||ge==answer/100||ge==answer%10||ge==answer/10%10||shi==answer/100||shi==answer%10||shi==answer/10%10)
			System.out.println("1000");
		else
			System.out.println("0");
		System.out.println(answer);
		
	}

}
