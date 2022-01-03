package homework;

public class Homework519 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=1;
		while(i<9)
		{
			int j=8-i;
			while(j>0)
			{
				System.out.print("   ");
				j--;
			}
			int number=1;
			while(number<Math.pow(2,(i-1)))
			{
				if(number*2>10)
					System.out.print(number+" ");
				else
					System.out.print(number+"  ");
				number*=2;
			}
			number/=2;
			while(number>1)
			{
				if(number/2>10)
					System.out.print(number+" ");
				else
					System.out.print(number+"  ");
			}

			
			i++;
			System.out.println("");
		}
	}

}
