package homework;
import java.util.Random;
public class Homework532 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random R= new Random();
		int a,b;
		a=R.nextInt(9)+1;
		b=R.nextInt(9)+1;
		while(a==b)
		{
			b=(int)Math.random()*9+1;
		}
		System.out.println(a*10+b);
	}

}
