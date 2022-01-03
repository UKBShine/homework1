package homework;

public class Homework324 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int flower=(int)Math.random()*4+1;
		int number=(int)Math.random()*13+1;
		String flowername = null,numbername = null;
		if(flower==1)
			flowername="Clubs";
		else if(flower==2)
			flowername="Diamonds";
		else if(flower==3)
			flowername="Hearts";
		else if(flower==4)
			flowername="Spades";
		
		
		if(number==1)
			numbername="Ace";
		else if(number==2)
			numbername="2";
		else if(number==3)
			numbername="3";
		else if(number==4)
			numbername="4";
		else if(number==5)
			numbername="5";
		else if(number==6)
			numbername="6";
		else if(number==7)
			numbername="7";
		else if(number==8)
			numbername="8";
		else if(number==9)
			numbername="9";
		else if(number==10)
			numbername="10";
		else if(number==11)
			numbername="Jack";
		else if(number==12)
			numbername="Queen";
		else if(number==13)
			numbername="King";
		System.out.println("The card you picked is "+numbername+" of "+flowername);
	
	}

}
