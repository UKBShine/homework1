package ʮһ������;

public class ʮһ���� {
	public static void main(String[] args) {
		displayObject(new ʮһ���(1,"red",false));
		displayObject(new ʮһ����(1,1,"black",true));
	}
	public static void displayObject(ʮһ��һ object) {
		System.out.println("Created on "+object.getDateCreated()+". Color is "+object.getColor());
	}
}
