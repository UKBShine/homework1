package ʮһ������;

public class ʮһ���  extends ʮһ��һ{
	private double radius;
	public ʮһ���() {
	}
	public ʮһ���(double radius) {
		this.radius=radius;
	}
	public ʮһ���(double radius,String color,boolean filled) {
		this.radius=radius;
		setColor(color);
		setFilled(filled);
	}
	public void setRadius(double radius) {
		this.radius=radius;
	}
	public double getArea() {
		return radius*radius*Math.PI;
	}
	public double getDiameter() {
		return 2*radius;
	}
	public double getPerimeter() {
		return 2*radius*Math.PI;
	}
	public void printCircle() {
		System.out.println("The circle is created "+getDateCreated()+" and the radius is "+radius);
	}
	
}
