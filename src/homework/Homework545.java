package homework;
import java.util.Scanner;
public class Homework545 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float[] arr1=new float[50];
		int i=0; 
		Scanner input =new Scanner(System.in);
		double mean=0,stanDev=0;
		while(i<10)
		{
			arr1[i]=input.nextFloat();
			mean+=arr1[i];
			i++;
		}
		mean/=10;
		i=0;
		while(i<10)
		{
			i++;
			stanDev+=(arr1[i]-mean)*(arr1[i]-mean);
		}
		stanDev/=10;
		stanDev=Math.pow(stanDev, 0.5);
		System.out.println(mean+" "+stanDev);
	}

}
