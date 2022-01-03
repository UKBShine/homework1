package unit9;

public class TV {
	int channel1 = 1;
	int volumeLeve1 = 1;
	boolean on = false;
	public TV() {
		
	}
	
	public void turnOn() {
		on = true;
	}
	public void turnOff() {
		on = false;
	}
	public void setChannel1(int newChannel1) {
		if(on&&newChannel1>=1&&newChannel1<=120)
			channel1=newChannel1;
	}
	public void setVolume(int newVolumeLeve1)
	{
		if(on&&newVolumeLeve1>=1&&newVolumeLeve1<=7)
			volumeLeve1=newVolumeLeve1;
	}
	public void channelUp() {
		if(on&&channel1<120)
				channel1++;
	}
	public void channelDown() {
		if(on&&channel1>1)
				channel1--;
	}
	public void volumeUp() {
		if(on&&volumeLeve1<7)
				volumeLeve1++;
	}
	public void volumeDown() {
		if(on&&volumeLeve1>1)
				volumeLeve1--;
	}
}
