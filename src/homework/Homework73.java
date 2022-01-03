package homework;
import java.util.Scanner;
public class Homework73 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		int [] arr1 = new int[100];
		int i=0,j=1,number;
		while(i<10)
		{
			number=input.nextInt();
			arr1[number]++;
			i++;
		}
		while(j<100)
		{
			if(arr1[j]!=0)
			{
				System.out.println(j+" occurs "+arr1[j]+" times");
			}
			j++;
		}
		
	}

}
