package 十一章例题;

public class 十一点二  extends 十一点一{
	private double radius;
	public 十一点二() {
	}
	public 十一点二(double radius) {
		this.radius=radius;
	}
	public 十一点二(double radius,String color,boolean filled) {
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
