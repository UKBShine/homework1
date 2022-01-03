package homework;

public class Homework517 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=1;
		while(i<8)
		{
			int copyi=i;
			int j=7-i,copyj=j;
			while(copyj>0)
			{
				System.out.print("  ");
				copyj--;
			}
			while(copyi>0)
			{
				System.out.print(copyi+" ");
				copyi--;
			}
			copyi=2;
			while(copyi<=i)
			{

				System.out.print(copyi+" ");
				copyi++;
			}
			i++;
			System.out.println("");
		}
	}

}
