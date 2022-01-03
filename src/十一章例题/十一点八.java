package 十一章例题;
import java.util.ArrayList;

import unit9.Circle;
public class 十一点八 {
	public static void main(String[] args) {
		ArrayList<String> cityList = new ArrayList<>();
		cityList.add("London");
		cityList.add("Denver");
		cityList.add("Paris");
		cityList.add("Miami");
		cityList.add("Seoul");
		cityList.add("Tokyo");
		System.out.println("List size? "+cityList.size());
		System.out.println("Is Miami in the list? "+cityList.contains("Miami"));
		System.out.println("The location of Denver in the list? "+cityList.indexOf("Denver"));
		System.out.println("Is thee list empty? "+cityList.isEmpty());
		cityList.add(2,"Xian");
		cityList.remove("Miami");
		cityList.remove(1);
		System.out.println(cityList.toString());
		for(int i = cityList.size()-1;i>0;i--){
			System.out.print(cityList.get(i)+" ");
	}
		System.out.println();
		ArrayList<十一点二> list =new ArrayList<>();
		list.add(new 十一点二(2));
		list.add(new 十一点二(2));
		System.out.println("The area of the circle?" +list.get(0).getArea());
}
}