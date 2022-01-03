package 十一章例题;

public class 十一点四 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		十一点二 circle = new 十一点二(1);
		System.out.println("A circle "+circle.toString());
		System.out.println("The color is "+circle.getColor());
		System.out.println("The area is "+circle.getArea());
		System.out.println("The diameter is "+circle.getDiameter());
		
		十一点三 rectangle = new 十一点三(2,4);
		System.out.println("\nA rectangle "+rectangle.toString());
		System.out.println("The area is "+rectangle.getArea());
		System.out.println("The perimmeter is "+rectangle.getPerimeter());
	}

}
