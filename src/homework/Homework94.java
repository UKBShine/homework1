package homework;
import java.util.Random;
public class Homework94 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random R1= new Random(1000);
		int i=0;
		while(i<50)
		{
			System.out.println(R1.nextInt(100));
			i++;
		}
	}

}
