package 十一章例题;

public class 十一点五 {
	public static void main(String[] args) {
		displayObject(new 十一点二(1,"red",false));
		displayObject(new 十一点三(1,1,"black",true));
	}
	public static void displayObject(十一点一 object) {
		System.out.println("Created on "+object.getDateCreated()+". Color is "+object.getColor());
	}
}
