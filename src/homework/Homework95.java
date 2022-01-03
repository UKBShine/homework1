package homework;
import java.util.GregorianCalendar;
public class Homework95 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GregorianCalendar G=new GregorianCalendar();
		System.out.println(G.get(GregorianCalendar.YEAR)+"-"+G.get(GregorianCalendar.MONTH)+"-"+G.get(GregorianCalendar.DAY_OF_MONTH));
		G.setTimeInMillis(1234567898765L);
		System.out.print(G.get(GregorianCalendar.YEAR)+"-"+G.get(GregorianCalendar.MONTH)+"-"+G.get(GregorianCalendar.DAY_OF_MONTH));
	}

}
