package homework;

public class LinearEquation {
	private double a,b,c,d,e,f;
	public LinearEquation(double a,double b,double c,double d,double e,double f) {
		this.a=a;
		this.b=b;
		this.c=c;
		this.d=d;
		this.e=e;
		this.f=f;
	}
	public double getA() {
		return this.a;
	}
	public double getB() {
		return this.b;
	}
	public double getC() {
		return this.c;
	}
	public double getD() {
		return this.d;
	}
	public double getE() {
		return this.e;
	}
	public double getF() {
		return this.f;
	}
	public boolean isSolvalbe() {
		if(this.a*this.d-this.b*this.c!=0)
				return true;
		else
			return false;
	}
	public double getX() {
		return (this.e*this.d-this.b*this.f)/(this.a*this.d-this.b*this.c);
	}
	public double getY() {
		return (this.a*this.f-this.e*this.c)/(this.a*this.d-this.b*this.c);
	}
}
