package 十一章例题;

public class 十一点六 {
	public static void main(String[] arg) {
		m(new GraduateStudent());
		m(new Student());
		m(new Person());
		m(new Object());
	}
	public static void m(Object x) {
		System.out.println(x.toString());
	}

}
class GraduateStudent extends Student{
}
class Student extends Person{
@Override
public String toString() {
	return "Student";
}
}
class Person extends Object{
@Override
public String toString() {
	return "Person";
}
}