//������
import java.util.*;
import java.io.*;

public class main {
	
	static Scanner choice_login = new Scanner(System.in);
	static Scanner user_name = new Scanner(System.in);
	static Scanner user_password = new Scanner(System.in);
	static Scanner user_password_again = new Scanner(System.in);
	static Scanner home_Choice = new Scanner(System.in);

	
	public static String user;
	public static String password;
	public static String password_again;
	public static String users[][];		//�洢�û����û��������롢����
	static int MAXSIZE = 10;		//����û���
	static int jifen;			//����
	static int ifLogin = 0; 	//�Ƿ��Ѿ����룬�Ѿ�����Ϊ1������Ϊ0��
	
	
	//main
	public static void main(String[] args) throws FileNotFoundException {
		 
		if(ifLogin == 0) {
			LoginFun();
		}
		else {
			Home();
		}
		
	}
	
	//����ע�����
	public static void LoginFun() throws FileNotFoundException {
		System.out.print("��ѡ��\n"
				+ "�����롿���� ��ע�᡿\n");
		String	Choice_login = choice_login.nextLine();
		if(Choice_login.equals("����")) {
			users = new String[MAXSIZE][3];
			
			System.out.print("�û���:\n");
			user = user_name.nextLine();
			System.out.print("����:\n");
			password = user_password.nextLine();
			
			
//			choice_login.close();
//			user_name.close();
//			user_password.close();
			
			if(IfPassCorrect(user, password)) {
				ifLogin = 1;
				Home();
			}
			else {
				System.out.print("�û������������������\n");
				LoginFun();
			}

	        
		}
		//ע��
		else if (Choice_login.equals("ע��")) {			
			
			System.out.print("\n�û���:\n");
			user = user_name.nextLine();
			System.out.print("����:\n");
			password = user_password.nextLine();
			System.out.print("ȷ������:\n");
			password_again = user_password_again.nextLine();
			
//			user_name.close();
//			user_password.close();
//			user_password_again.close();
			if (password.equals(password_again)) {
				System.out.print("\nע��ɹ���\n");
				
				ifLogin = 1;
				Home();
			}
			else {
				System.out.print("ȷ���������������\n");
				LoginFun();
			}
		}
		else if (Choice_login.equals("exit")) {
			System.exit(0);
			
		}
		else {
			System.out.print("��������������\n");
			LoginFun();
		}
		
			
	}
	
	//���˵�
	public static void Home() throws FileNotFoundException {
		System.out.print("��ֵ��ļ�ǿ�쵼����ʵ���л�����ΰ���˵ĸ�����֤��\n"
				+ "�������İ������̣�һ�ҡ�СС�촬��֮�����ܹ���Խ������̲����Ϊ�캽�й�������Զ�ġ�ΡΡ���֡�\n"
				+ "��ѡ��\n"
				+ "�����⡿ ��������Ϣ�� ���˳���¼��\n");

		String	Home_Choice = home_Choice.nextLine();
		
		if (Home_Choice.equals("����")) {
			giveQuestion();
		}
		else if(Home_Choice.equals("������Ϣ")) {
			System.out.print("�û����� " + user +"\n"
					+ "���֣� " + jifen + "\n"
					+ "���룺 " + password +"\n");	
			Personal_information();
		}
		else if (Home_Choice.equals("�˳���¼")) {
			ifLogin = 0;
			LoginFun();
		}
		else {
			System.out.print("��������������\n");
			Home();
		}

	}
	
	//�ʴ���
	public static void giveQuestion() throws FileNotFoundException {
		
		String StringQuestion[][];
		{
			StringQuestion = new String[30][2];
			StringQuestion[0][0] = "19����ĩ20���ͳ����������۹�����ͣ�     ��ʱ����\r\n"
					+ "A.�޲��׼�����          \r\n"
					+ "B.�ʲ��׼�����\r\n"
					+ "C.��������\r\n"
					+ "D.�������\r\n"
					+ "";
			StringQuestion[0][1] ="A";
			
			StringQuestion[1][0] ="��     �����й����������˼�������壬�����й����Ƚ����ӿ�ʼ���޲��׼����������Ϊ�۲�������˵Ĺ��ߣ��й������Ӵ����˿�ѧ��ָ��˼�롣\r\n"
					+ "A.�¶���\r\n"
					+ "B.�����\r\n"
					+ "C.ʮ�¸���\r\n"
					+ "D.���˼\r\n"
					+ "";
			StringQuestion[1][1] ="C";
			
			StringQuestion[2][0] ="�й�����������֮��Ϊ�й�����ı�Ҹ���Ϊ�л����壨     ����������ǧ�����ķܶ����̣��гɹ��ı����飬Ҳ��ʧ�ܵĲ�ʹ��ѵ��\r\n"
					+ "A.ı���\r\n"
					+ "B.ı����\r\n"
					+ "C.ı��չ\r\n"
					+ "D.ı����\r\n"
					+ "";
			StringQuestion[2][1] ="B";
			
			StringQuestion[3][0] ="�й�����������֮��Ϊ�й�����ı�Ҹ���Ϊ�л����壨     ����������ǧ�����ķܶ����̣��гɹ��ı����飬Ҳ��ʧ�ܵĲ�ʹ��ѵ��\r\n"
					+ "A.ı���\r\n"
					+ "B.ı����\r\n"
					+ "C.ı��չ\r\n"
					+ "D.ı����\r\n"
					+ "";
			StringQuestion[3][1] ="B";
			
			StringQuestion[4][0] ="�й��������쵼������и����ͽ���ĳɹ�ʵ����ë��˼���γɺͷ�չ�ģ�  ��������\r\n"
					+ "A.ʵ��\r\n"
					+ "B.ʱ��\r\n"
					+ "C.����\r\n"
					+ "D.��ʵ\r\n"
					+ "";
			StringQuestion[4][1] ="A";
			
			StringQuestion[5][0] ="��     ��ʱ�ڣ�ë�������˼��������Ϊָ��������ʵ�ʵ����о����ڡ��й������׼��ķ�����������ũ���˶����챨�桷�������У��������й������׼��ڸ����еĵ�λ�����ã��������������������Ļ���˼�롣\r\n"
					+ "A.��һ�ι��ڸ���ս��\r\n"
					+ "B.���ظ���ս��\r\n"
					+ "C.����ս��\r\n"
					+ "D.���ս��\r\n"
					+ "";
			StringQuestion[5][1] ="A";
			
			StringQuestion[6][0] ="��     ������һ�д�ʵ�ʳ�����������ϵʵ�ʣ������ʵ���м�������ͷ�չ����\r\n"
					+ "A.��������\r\n"
					+ "B.ͳһս��\r\n"
					+ "C.Ⱥ��·��\r\n"
					+ "D.ʵ������\r\n"
					+ "";
			StringQuestion[6][1] ="D";
			
			StringQuestion[7][0] ="�й���ɫ������彨���·�ĳ���̽����ʼ�ڣ�     ��\r\n"
					+ "A.ë��      \r\n"
					+ "B.��Сƽ      \r\n"
					+ "C.������      \r\n"
					+ "D.������\r\n"
					+ "";
			StringQuestion[7][1] ="A";
			
			StringQuestion[8][0] ="ë�����������������Ϊ��������Լ���·����˼�����Ҫ�����ǣ�        ��\r\n"
					+ "A.�����ڹ���ʱ�ڵ���·�ߡ�    \r\n"
					+ "B.��Ϊ����һ��ΰ������������Ҷ��ܶ���\r\n"
					+ "C.����ʮ���ϵ��              \r\n"
					+ "D.�����ǵ���һЩ��ʷ���顷\r\n"
					+ "";
			StringQuestion[8][1] ="C";
			
			StringQuestion[9][0] ="ë���ڡ���ʮ���ϵ��һ���У�����й�������彨��Ļ��������ָ��˼���ǣ�       ��\r\n"
					+ "A.�ȷ��Ա����ַ�ð�������ۺ�ƽ�����Ȳ�ǰ��  \r\n"
					+ "B.����һ�л������أ�����һ��ΰ�������������\r\n"
					+ "C.���˼�롢ʵ������\r\n"
					+ "D.���µ�������ϵ���汣���ͷ�չ������\r\n"
					+ "";
			StringQuestion[9][1] ="B";
			
			StringQuestion[10][0] ="���й��������ر�����������ƶȽ������ҹ��ƶ����ܷ����䲼��һϵ�з��ɣ������˴����Ĺ����ƶȣ��Ӹ����ϱ�֤�ˣ�  ����Ȩ����\r\n"
					+ "A�й�����\r\n"
					+ "B�й�����\r\n"
					+ "C��ũ����\r\n"
					+ "D���񵱼�����\r\n"
					+ "";
			StringQuestion[10][1] ="D";
			
			StringQuestion[11][0] ="һ���߰��꣬���ǵ��ٿ������ش���ʷ����ģ�    ���������˸ĸ￪����ʷ��ʱ�ڡ�\r\n"
					+ "A.ʮһ�����ȫ��    \r\n"
					+ "B.ʮһ������ȫ��    \r\n"
					+ "C.ʮһ������ȫ��   \r\n"
					+ "D.ʮһ������ȫ��\r\n"
					+ "";
			StringQuestion[11][1] ="B";
			
			StringQuestion[12][0] ="�� ���ǵ�ִ���˹��ĵ�һҪ��\r\n"
					+ "A. ����Ϊ����ִ��Ϊ�� \r\n"
					+ "B.���Ⱥ��·��\r\n"
					+ "C.��չ \r\n"
					+ "D.ȫ�潨��С�����\r\n"
					+ "";
			StringQuestion[12][1] ="C";
			
			StringQuestion[13][0] ="�������ۡ�·�ߡ����졢���롢���ߺ͸�����������ְѣ�       ����Ϊ������͹���\r\n"
					+ "A������ĸ������� \r\n"
					+ "B������ĵ�ǰ����\r\n"
					+ "C������ĳ�Զ���� \r\n"
					+ "D���������������\r\n"
					+ "";
			StringQuestion[13][1] ="A";
			
			StringQuestion[14][0] ="����ѧ�����ǵ�һ�����������۶����ɣ�    ���������\r\n"
					+ "A������ɽ    \r\n"
					+ "B��ë�� \r\n"
					+ "C����Сƽ      \r\n"
					+ "D��������\r\n"
					+ "";
			StringQuestion[14][1] ="C";
			
			StringQuestion[15][0] ="�Ѷ��⿪��ȷ��Ϊ�ҹ��Ļ������ߣ�����(      )\r\n"
					+ "A������ʮһ������ȫ�� \r\n"
					+ "B������ʮ���� \r\n"
					+ "C������ʮ��������ȫ�� \r\n"
					+ "D������ʮ����\r\n"
					+ "";
			StringQuestion[15][1] ="C";
			
			StringQuestion[16][0] ="������������ͳ���ƽ�����      �������岼�֡�Э���ƽ�����      ����ս�Բ��֣���ʮ���塱�滮ʤ����ɣ���ʮ���塱�滮˳��ʵʩ�����͹�����ҵȫ�濪���¾��档\r\n"
					+ "A.��λһ�塡�ĸ�ȫ��\r\n"
					+ "B.��λһ�塡���ȫ��\r\n"
					+ "C.���ȫ�桡��λһ��\r\n"
					+ "D.�ĸ�ȫ�桡��λһ��\r\n"
					+ "";
			StringQuestion[16][1] ="A";
			
			StringQuestion[17][0] ="�й���ɫ������������ʱ�����ҹ������Ҫì���Ѿ�ת��Ϊ�������������ģ�    ����Ҫ�Ͳ�ƽ�ⲻ��ֵķ�չ֮���ì�ܡ�\r\n";
			StringQuestion[17][1] ="��������";
			
			StringQuestion[18][0] ="ȷ������    �����ҹ����б�׼��ũ��ƶ���˿�ʵ����ƶ��ƶ����ȫ��ժñ���������������ƶ������������ƶ������ƶ��\r\n";
			StringQuestion[18][1] ="2020";
			
			StringQuestion[19][0] ="�ƶ��γ�ȫ�濪���¸�֣�Ҫ�ԣ�    ������Ϊ�ص㣬������������߳�ȥ���أ���ѭ���̹�������ԭ�򣬼�ǿ�����������ź������γ�½����������������˫�򻥼õĿ��Ÿ�֡�\r\n";
			StringQuestion[19][1] ="һ��һ·";
			
			StringQuestion[20][0] ="��̬�����ĺ����Ǽ��������Ȼ��     ����\r\n";
			StringQuestion[20][1] ="��г����";
			
			StringQuestion[21][0] ="���裨        �����л�����ΰ���˵Ļ������̡�\r\n";
			StringQuestion[21][1] ="����ǿ��";
			
			StringQuestion[22][0] ="(      )��һ�����ҡ�һ�����巢չ�и�����������������־õ�������\r\n";
			StringQuestion[22][1] ="�Ļ�����";
			
			StringQuestion[23][0] ="��      �����ϰ��ս���±���ĵ�һ�����Ǽ���Ҫ��������Ҳ��������ķ�չ������\r\n";
			StringQuestion[23][1] ="ƽ��";
			
			StringQuestion[24][0] ="ȫ�潨��С����ᣬҪ��������Ⱦ���ι���ս�������ˮ��ɽ���ǣ�  ��\r\n";
			StringQuestion[24][1] ="��ɽ��ɽ";
			
			StringQuestion[25][0] ="û�У�    ����û�е����й��ķ�չ������\r\n";
			StringQuestion[25][1] ="�ĸ￪��";
			
			StringQuestion[26][0] ="����ʱ���������ǣ�    ����\r\n";
			StringQuestion[26][1] ="��ƽ�뷢չ";
			
			StringQuestion[27][0] ="���й��ڻ��ҵ�����������������Ĺ�����(    )��\r\n";
			StringQuestion[27][1] ="���ɱ�";
			
			StringQuestion[28][0] ="�й���������ʮ�Ŵ�ȫ�������ᣬ����ȫ�潨��С������ʤ�׶Ρ��й���ɫ����������_____�Ĺؼ�ʱ���ٿ���һ��ʮ����Ҫ�Ĵ�ᡣ\r\n";
			StringQuestion[28][1] ="��ʱ��";
			
			StringQuestion[29][0] ="ʵ�֡�����һ���ꡱ�ܶ�Ŀ�ꡢʵ���л�����ΰ���˵��й��Σ����������������ˮƽ������ᶨ���ưѣ�      ����Ϊ��ִ���˹��ĵ�һҪ��\r\n";
			StringQuestion[29][1] ="��չ";
		}
		
		int x = (int) (30*Math.random());
		Scanner in = new Scanner(System.in);
		System.out.print(StringQuestion[x][0]);
		String  Answer = in.nextLine();
		
		
		if(Answer.equals(StringQuestion[x][1])) {
			System.out.print("��ȷ�� " + StringQuestion[x][1]
					+ " �ش���ȷ\n\n");
			jifen++;
			giveQuestion();
		}
		else if(Answer.equals("exit")) {
			Home();
			in.close();
		}
		else {
			System.out.print("��ȷ��: " + StringQuestion[x][1]
					+ "  �ش����\n\n");
			giveQuestion();
		}
	}
	
	
	//������Ϣ
	public static void Personal_information() throws FileNotFoundException {
		
		System.out.print("���롰exit��������ҳ��\n");
		@SuppressWarnings("unused")
		String	Home_Choice = home_Choice.nextLine();
		if(Home_Choice.equals("exit")) {
			Home();
		}
		else if(Home_Choice.equals("����")){
			giveQuestion();
		}
		else {
			System.out.print("��������������\n");
			Personal_information();
		}
	}
	
	//�ж��û��������Ƿ���ȷ
	public static boolean IfPassCorrect(String name, String password) throws FileNotFoundException {
		boolean flag = false;
		//��ʼ�û�123��123
//		if(name.equals("123") & password.equals("123")) {
//			flag = true ;
//		}
		
		File file = new File("src//usersLibrary.txt");
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(file);
		try {
			int i = 0;
			String str = scanner.nextLine();
			while(str != null ){
				users[i][0] = str;
				users[i][1] = scanner.nextLine();
				users[i][2] = scanner.nextLine();
				
				if (users[i][0].equals(name) && users[i][1].equals(password)) {
					flag = true;
					jifen = Integer.parseInt(users[i][2]);
				}
				
				str = scanner.nextLine();
				i++;
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		scanner.close();
		return flag;
	}
}
