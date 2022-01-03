package unit9;
public class Circle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle circle1=new Circle();
		System.out.println("The area of circle of raidus "+circle1.radius+" is "+circle1.getArea());
		
		Circle circle2=new Circle(25);
		System.out.println("The area of circle of raidus "+circle2.radius+" is "+circle2.getArea());
		
		Circle circle3=new Circle(125);
		System.out.println("The area of circle of radius "+circle3.radius+" is "+circle3.getArea());
		
		circle2.setRadius(100);
		System.out.println("The area of circle of radius "+circle2.radius+" is "+circle2.getArea());
		
	}


double radius;
Circle(){
	radius=1;
}
Circle(double newRadius)
{
	radius = newRadius;
}
public Circle(int newRadius) {
	// TODO Auto-generated constructor stub
}
double getArea() {
	return radius*radius*Math.PI;
}
double getPerimeter() {
	return radius*2*Math.PI;
}
void setRadius(double newRadius)
{
	radius=newRadius;
}
}