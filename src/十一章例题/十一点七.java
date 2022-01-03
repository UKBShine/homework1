package 十一章例题;

public class 十一点七 {
	public static void main(String[] args) {
		Object object1= new 十一点二(1);
		Object object2= new 十一点三(1,1);
		displayObject(object1);
		displayObject(object2);
	}
	
	public static void displayObject(Object object) {
		if(object instanceof 十一点二) {
			System.out.println("The circle area is "+(((十一点二) object).getArea()));
			System.out.println("The circle diameter is "+((十一点二)object).getDiameter());
		}
		else if(object instanceof 十一点三) {
			System.out.println("The rectangle area is "+(((十一点三) object).getArea()));
		}
	}
}
