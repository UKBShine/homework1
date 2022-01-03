package homework;

public class Homework527 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int year=101,i=0;
		while(year<=2100)
		{
			if(year%4==0&&year%100!=0||year%400==0)
			{	
				i++;
				if(i%10==0)
					System.out.println(year);
				else
					System.out.print(year+" ");
			}
			
			year++;
		}

		}
	}

