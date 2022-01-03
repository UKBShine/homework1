package homework;

public class Homework533 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=6;
		while(i<=10000)
		{
			int sum=0,x=1;
			while(x<=i/2)
			{
				if(i%x==0)
					sum+=x;
				x++;
			}
			if(sum==i)
				System.out.println(sum+" ");
			i++;
		}
	}

}
