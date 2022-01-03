package homework;
import java.util.Scanner;
public class Homework75 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		int[] arr1=new int[100];
		int i=0,number,x=0;
		while(i<10)
		{
			int j=0,flag=1;
			number=input.nextInt();
			while(j<10)
			{
				if(number==arr1[j])
					flag=-1;
				j++;
			}
			if(flag==1)
			{
				arr1[x]=number;
				x++;
			}
			i++;
		}
		int p=0;
		while(p<x)
		{
			System.out.print(arr1[p]+" ");
			p++;
		}
	}

}
