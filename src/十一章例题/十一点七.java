package ʮһ������;

public class ʮһ���� {
	public static void main(String[] args) {
		Object object1= new ʮһ���(1);
		Object object2= new ʮһ����(1,1);
		displayObject(object1);
		displayObject(object2);
	}
	
	public static void displayObject(Object object) {
		if(object instanceof ʮһ���) {
			System.out.println("The circle area is "+(((ʮһ���) object).getArea()));
			System.out.println("The circle diameter is "+((ʮһ���)object).getDiameter());
		}
		else if(object instanceof ʮһ����) {
			System.out.println("The rectangle area is "+(((ʮһ����) object).getArea()));
		}
	}
}
