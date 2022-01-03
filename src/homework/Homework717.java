package homework;
import java.util.Scanner;
public class Homework717 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		int[] score= new int[5];
		String[] name=new String[5];
		int i=0,j=0;
		while(i<5)
		{
			name[i]=input.next();
			i++;
		}
		while(j<5)
		{
			score[j]=input.nextInt();
			j++;
		}
		int p=0,q;
		while(p<5)
		{
			int k=p;
			q=0;
			while(q<5)
			{
				if(score[q]<score[k])
				{
					k=q;
				}
					
				q++;
			}
			System.out.print(name[k]+" ");
			score[k]=9999;
			p++;
		}
	}

}
