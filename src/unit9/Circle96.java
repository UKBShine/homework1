package unit9;

public class Circle96 {
	double radius;
	static int numberOfObjects = 0;
	Circle96(){
		radius=1;
		numberOfObjects++;
	}
	Circle96(double newRadius)
	{
		radius=newRadius;
		numberOfObjects++;
	}
	static int getNumberOfObjects() {
		return numberOfObjects;
	}
	double getArea() {
		return radius*radius*Math.PI;
	}
}
