package finalwork;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;
import java.nio.charset.Charset;
public class Finalwork {
	
//==============自定义模块=====================
	
	//==========模块选择===========
	public static void PickPart() {
		System.out.println("输入\"study\"进入学习或输入\"answer\"进入答题!");
		Scanner input=new Scanner(System.in);
		String Part=input.next();
		if(Part.equals("answer")) {
			
			answer();
		}
		else if(Part.equals("study")) {
			study();
		}
		else {
			System.out.println("输入有误!");
			PickPart();
		}
	}
	
	//==========答题模块============
	
	public static void answer() {
		String result="";
		Scanner input=new Scanner(System.in);
		String CorrectAnswer="A",yourAnswer;              // 正确答案
		try {
			InputStreamReader ipr = new InputStreamReader(new FileInputStream("ss/answer.txt"),Charset.forName("UTF-8"));
			BufferedReader br= new 	BufferedReader(ipr);
			String s;
			while((s=br.readLine())!= null)
				result+=s;
			br.close();
		}
		catch(Exception e) {
			e.printStackTrace();
			}
		System.out.println(result);
		yourAnswer=input.next();
		if(yourAnswer.equals("A"))
			System.out.println("恭喜您!回答正确!");
		else
			System.out.println("回答错误!");
		PickPart();
	}
	
	//==========学习模块============
	public static void study() {
		System.out.println("******************学习区*****************\n");
		int randomStudy=(int)(Math.random()*5);
		switch(randomStudy) {
			case 0:System.out.println("1917年，十月革命的曙光照亮了世界。在十月革命的影响下，中国以李大钊、陈独秀、毛泽东为代表的先进知识分子，开始了学习宣传马克思主义的活动。\n于是，马克思主义在中国先进知识分子当中，逐步传播开来。");break;
			case 1:System.out.println("1918年4月，毛泽东同蔡和森、何叔衡在湖南发起成立了“新民学会”。1919年7月，李大钊组织了“少年中国学会”。不久，周恩来和郭隆真等人组织了“觉悟社”。\n当时，在宣传马克思主义方面最突出的是李大钊和陈独秀。");break;
			case 2:System.out.println("1920年4月，共产国际派代表维金斯基等来华，先后会见了李大钊、陈独秀等人，开始酝酿成立共产党。之后，在全国各地建立了共产主义小组的基础上，\n于1921年7月下旬，在上海举行了中国共产党第一次全国代表大会。出席大会的代表有：毛泽东、何叔衡、董必武、陈潭秋、王尽美、邓恩铭、李达、李汉俊\n、张国焘、刘仁静、陈公博、周佛海十二人，\n还有陈独秀指派的代表包惠僧以及共产国际的代表马林和尼柯尔斯基。");break;
			case 3:System.out.println("1922年1月到1923年2月，中国工人运动出现了第一次高潮。同时，建立了以共产党员和国民党左派为核心的国共两党和各界人民的革命统一战线，\n联合一切可以联合的力量，迅速地掀起了1925年至1927年的大革命高潮，胜利地举行了北伐战争，基本上摧毁了北洋军阀的反动统治。");break;
			case 4:System.out.println("中国共产党在领导中国各族人民为新民主主义而斗争的过程中，经历了国共合作的北伐战争、土地革命战争、抗日战争和全国解放战争这四个阶段，其间经受\n了1927年和1934年两次严重失败的痛苦考验经过长期武装斗争和各年方面、各种形式斗争的密切配合，终于在1949年取得了革命的胜利。");break;
		}
		System.out.println("\n******************学习区*****************\n");
		PickPart();
	}
	
	//==========登录模块============
	public static void LogIn(ArrayList Account,ArrayList Passward,int notSign) {
		Scanner input=new Scanner(System.in);
		int AccountNum = 0;                         // 记录输入的账号在列表中的下标
		int AccountJudgeFlag=0;                     // 判断输入的账号是否在列表中  (未注册)
		if(notSign==1) {
			System.out.println("请输入账号!");
			String AccountJudge=input.next();              //此刻输入的账号
			System.out.println("请输入密码!");	
			String PasswardJudge=input.next();			   //此刻输入的密码
			for(String temp:(ArrayList<String>)Account) {
				if(AccountJudge.equals(temp)) {
					AccountJudgeFlag=1;
					AccountNum=Account.indexOf(temp);
					break;
				}
			}
			if(AccountJudgeFlag==1) {
				if(PasswardJudge.equals(Passward.get(AccountNum))){
					System.out.println("正在进入系统,请稍等!");
					PickPart();
				}
				else {
					System.out.println("账号密码有误!");
					System.out.println("请输入\"log\"登录或输入\"sign\"注册!");
					SecFun(Account,Passward,notSign);
				}
				
			}
			else {
				System.out.println("账号密码有误!");
				System.out.println("请输入\"log\"登录或输入\"sign\"注册!");
				SecFun(Account,Passward,notSign);
			}
		}
		else {
			System.out.println("请先注册!");
			MainFun(Account,Passward);
		}
	}
	
	
	//===========注册模块==========
	public static void SignUp(ArrayList Account,ArrayList Passward,int notSign)  {

		
		Scanner input=new Scanner(System.in);
		int AccountNum = 0,PasswardNum;
		int AccountJudgeFlag=0;
		notSign=1;
		System.out.println("请输入注册账号!");
		String account=input.next(); 
		System.out.println("请输入注册密码!");
		String passward=input.next(); 

		Account.add(account);
		Passward.add(passward);
		System.out.println("请输入\"log\"登录或输入\"sign\"注册!");
		SecFun(Account,Passward,notSign);
		
	}
	//===========首界面============
	public static void MainFun(ArrayList Account,ArrayList Passward) {
		
		int notSign=0;                                //判断是否注册(未注册不能登录)
		Scanner input=new Scanner(System.in);
		System.out.println("请输入\"log\"登录或输入\"sign\"注册!");
		

		SecFun(Account,Passward,notSign);
		
	}
	public static void SecFun(ArrayList Account,ArrayList Passward,int notSign) {
		Scanner input=new Scanner(System.in);
		String inWord=input.next();
		if(inWord.equals("log")) {
			LogIn(Account,Passward,notSign);
		}
		else if(inWord.equals("sign")) {
			SignUp(Account,Passward,notSign);
			notSign=1;
		}
		else {
			System.out.println("输入有误!");
			System.out.println("请输入\"log\"登录或输入\"sign\"注册!");
			SecFun(Account,Passward,notSign);
		}
	}
// =====================自定义函数End==================
	
	//===========主函数=========
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		ArrayList<String> Account =new ArrayList<String>();
		ArrayList<String> Passward =new ArrayList<String>();

		MainFun(Account,Passward);

	}

}