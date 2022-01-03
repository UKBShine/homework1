package homework;

public class Homework525 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double pi=0;
		int i=10000;
		int j=1;
		while(j<=i)
		{
			pi+=Math.pow(-1,j+1)/(2*j-1);
			j++;
		}
		pi*=4;
		System.out.print(pi);
		
	}

}
