package homework;

public class Homework526 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double e=1;
		int i=10000;
		int j=1;
		double now=1.0;
		while(j<=i)
		{
			now/=j;
			e+=now;
			j++;
		}
		System.out.print(e);
		
	}

}
