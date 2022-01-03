package finalwork;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;
import java.nio.charset.Charset;
public class Finalwork {
	
//==============�Զ���ģ��=====================
	
	//==========ģ��ѡ��===========
	public static void PickPart() {
		System.out.println("����\"study\"����ѧϰ������\"answer\"�������!");
		Scanner input=new Scanner(System.in);
		String Part=input.next();
		if(Part.equals("answer")) {
			
			answer();
		}
		else if(Part.equals("study")) {
			study();
		}
		else {
			System.out.println("��������!");
			PickPart();
		}
	}
	
	//==========����ģ��============
	
	public static void answer() {
		String result="";
		Scanner input=new Scanner(System.in);
		String CorrectAnswer="A",yourAnswer;              // ��ȷ��
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
			System.out.println("��ϲ��!�ش���ȷ!");
		else
			System.out.println("�ش����!");
		PickPart();
	}
	
	//==========ѧϰģ��============
	public static void study() {
		System.out.println("******************ѧϰ��*****************\n");
		int randomStudy=(int)(Math.random()*5);
		switch(randomStudy) {
			case 0:System.out.println("1917�꣬ʮ�¸�����������������硣��ʮ�¸�����Ӱ���£��й�������ȡ��¶��㡢ë��Ϊ������Ƚ�֪ʶ���ӣ���ʼ��ѧϰ�������˼����Ļ��\n���ǣ����˼�������й��Ƚ�֪ʶ���ӵ��У��𲽴���������");break;
			case 1:System.out.println("1918��4�£�ë��ͬ�̺�ɭ��������ں��Ϸ�������ˡ�����ѧ�ᡱ��1919��7�£��������֯�ˡ������й�ѧ�ᡱ�����ã��ܶ����͹�¡�������֯�ˡ������硱��\n��ʱ�����������˼���巽����ͻ����������Ⱥͳ¶��㡣");break;
			case 2:System.out.println("1920��4�£����������ɴ���ά��˹�����������Ⱥ���������ȡ��¶�����ˣ���ʼ���������������֮����ȫ�����ؽ����˹�������С��Ļ����ϣ�\n��1921��7����Ѯ�����Ϻ��������й���������һ��ȫ�������ᡣ��ϯ���Ĵ����У�ë�󶫡�����⡢�����䡢��̶����������˶����������\n���Ź��⡢���ʾ����¹������ܷ�ʮ���ˣ�\n���г¶���ָ�ɵĴ������ɮ�Լ��������ʵĴ������ֺ���¶�˹����");break;
			case 3:System.out.println("1922��1�µ�1923��2�£��й������˶������˵�һ�θ߳���ͬʱ���������Թ�����Ա�͹�������Ϊ���ĵĹ��������͸�������ĸ���ͳһս�ߣ�\n����һ�п������ϵ�������Ѹ�ٵ�������1925����1927��Ĵ�����߳���ʤ���ؾ����˱���ս���������ϴݻ��˱�������ķ���ͳ�Ρ�");break;
			case 4:System.out.println("�й����������쵼�й���������Ϊ����������������Ĺ����У������˹��������ı���ս�������ظ���ս��������ս����ȫ�����ս�����ĸ��׶Σ���侭��\n��1927���1934����������ʧ�ܵ�ʹ�࿼�龭��������װ�����͸��귽�桢������ʽ������������ϣ�������1949��ȡ���˸�����ʤ����");break;
		}
		System.out.println("\n******************ѧϰ��*****************\n");
		PickPart();
	}
	
	//==========��¼ģ��============
	public static void LogIn(ArrayList Account,ArrayList Passward,int notSign) {
		Scanner input=new Scanner(System.in);
		int AccountNum = 0;                         // ��¼������˺����б��е��±�
		int AccountJudgeFlag=0;                     // �ж�������˺��Ƿ����б���  (δע��)
		if(notSign==1) {
			System.out.println("�������˺�!");
			String AccountJudge=input.next();              //�˿�������˺�
			System.out.println("����������!");	
			String PasswardJudge=input.next();			   //�˿����������
			for(String temp:(ArrayList<String>)Account) {
				if(AccountJudge.equals(temp)) {
					AccountJudgeFlag=1;
					AccountNum=Account.indexOf(temp);
					break;
				}
			}
			if(AccountJudgeFlag==1) {
				if(PasswardJudge.equals(Passward.get(AccountNum))){
					System.out.println("���ڽ���ϵͳ,���Ե�!");
					PickPart();
				}
				else {
					System.out.println("�˺���������!");
					System.out.println("������\"log\"��¼������\"sign\"ע��!");
					SecFun(Account,Passward,notSign);
				}
				
			}
			else {
				System.out.println("�˺���������!");
				System.out.println("������\"log\"��¼������\"sign\"ע��!");
				SecFun(Account,Passward,notSign);
			}
		}
		else {
			System.out.println("����ע��!");
			MainFun(Account,Passward);
		}
	}
	
	
	//===========ע��ģ��==========
	public static void SignUp(ArrayList Account,ArrayList Passward,int notSign)  {

		
		Scanner input=new Scanner(System.in);
		int AccountNum = 0,PasswardNum;
		int AccountJudgeFlag=0;
		notSign=1;
		System.out.println("������ע���˺�!");
		String account=input.next(); 
		System.out.println("������ע������!");
		String passward=input.next(); 

		Account.add(account);
		Passward.add(passward);
		System.out.println("������\"log\"��¼������\"sign\"ע��!");
		SecFun(Account,Passward,notSign);
		
	}
	//===========�׽���============
	public static void MainFun(ArrayList Account,ArrayList Passward) {
		
		int notSign=0;                                //�ж��Ƿ�ע��(δע�᲻�ܵ�¼)
		Scanner input=new Scanner(System.in);
		System.out.println("������\"log\"��¼������\"sign\"ע��!");
		

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
			System.out.println("��������!");
			System.out.println("������\"log\"��¼������\"sign\"ע��!");
			SecFun(Account,Passward,notSign);
		}
	}
// =====================�Զ��庯��End==================
	
	//===========������=========
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		ArrayList<String> Account =new ArrayList<String>();
		ArrayList<String> Passward =new ArrayList<String>();

		MainFun(Account,Passward);

	}

}