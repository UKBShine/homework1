package homework;
import java.util.Date;
public class StopWatch {
	private Date startTime,endTime;
	public StopWatch() {
		this.startTime=new Date();
	}
	public void start() {
		this.startTime = new Date();
	}
	public void stop() {
		this.endTime = new Date();
	}
	public int getElapsedTime() {
		if(endTime.getHours()<startTime.getHours())
			return endTime.getSeconds()-startTime.getSeconds()+60*(endTime.getMinutes()+24-startTime.getMinutes())+3600*(endTime.getHours()-startTime.getHours());
		else
			return endTime.getSeconds()-startTime.getSeconds()+60*(endTime.getMinutes()-startTime.getMinutes())+3600*(endTime.getHours()-startTime.getHours());
	}
}
