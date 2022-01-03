package homework;

public class Homework57 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int now=10000;
		double firstFourYears,tenth=now;
		int i=10;
		firstFourYears=now+now*(1+0.05)+now*(1+0.05)*(1+0.05)+now*(1+0.05)*(1+0.05)*(1+0.05);
		while(i>0)
		{
			tenth*=1.05;
			i--;
		}
		System.out.println(firstFourYears+" "+tenth);
	}
	
}
