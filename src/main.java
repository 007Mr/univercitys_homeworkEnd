//主函数
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
	public static String users[][];		//存储用户的用户名，密码、积分
	static int MAXSIZE = 10;		//最大用户数
	static int jifen;			//积分
	static int ifLogin = 0; 	//是否已经登入，已经登入为1，否则为0；
	
	
	//main
	public static void main(String[] args) throws FileNotFoundException {
		 
		if(ifLogin == 0) {
			LoginFun();
		}
		else {
			Home();
		}
		
	}
	
	//登入注册界面
	public static void LoginFun() throws FileNotFoundException {
		System.out.print("请选择\n"
				+ "【登入】或者 【注册】\n");
		String	Choice_login = choice_login.nextLine();
		if(Choice_login.equals("登入")) {
			users = new String[MAXSIZE][3];
			
			System.out.print("用户名:\n");
			user = user_name.nextLine();
			System.out.print("密码:\n");
			password = user_password.nextLine();
			
			
//			choice_login.close();
//			user_name.close();
//			user_password.close();
			
			if(IfPassCorrect(user, password)) {
				ifLogin = 1;
				Home();
			}
			else {
				System.out.print("用户名或密码错误，请重试\n");
				LoginFun();
			}

	        
		}
		//注册
		else if (Choice_login.equals("注册")) {			
			
			System.out.print("\n用户名:\n");
			user = user_name.nextLine();
			System.out.print("密码:\n");
			password = user_password.nextLine();
			System.out.print("确认密码:\n");
			password_again = user_password_again.nextLine();
			
//			user_name.close();
//			user_password.close();
//			user_password_again.close();
			if (password.equals(password_again)) {
				System.out.print("\n注册成功！\n");
				
				ifLogin = 1;
				Home();
			}
			else {
				System.out.print("确认密码错误，请重试\n");
				LoginFun();
			}
		}
		else if (Choice_login.equals("exit")) {
			System.exit(0);
			
		}
		else {
			System.out.print("输入有误，请重试\n");
			LoginFun();
		}
		
			
	}
	
	//主菜单
	public static void Home() throws FileNotFoundException {
		System.out.print("坚持党的坚强领导，是实现中华民族伟大复兴的根本保证。\n"
				+ "回望党的百年历程，一艘“小小红船”之所以能够穿越激流险滩、成为领航中国行稳致远的“巍巍巨轮。\n"
				+ "请选择\n"
				+ "【答题】 【个人信息】 【退出登录】\n");

		String	Home_Choice = home_Choice.nextLine();
		
		if (Home_Choice.equals("答题")) {
			giveQuestion();
		}
		else if(Home_Choice.equals("个人信息")) {
			System.out.print("用户名： " + user +"\n"
					+ "积分： " + jifen + "\n"
					+ "密码： " + password +"\n");	
			Personal_information();
		}
		else if (Home_Choice.equals("退出登录")) {
			ifLogin = 0;
			LoginFun();
		}
		else {
			System.out.print("输入有误，请重试\n");
			Home();
		}

	}
	
	//问答题
	public static void giveQuestion() throws FileNotFoundException {
		
		String StringQuestion[][];
		{
			StringQuestion = new String[30][2];
			StringQuestion[0][0] = "19世纪末20世纪初，世界进入帝国主义和（     ）时代。\r\n"
					+ "A.无产阶级革命          \r\n"
					+ "B.资产阶级革命\r\n"
					+ "C.民主革命\r\n"
					+ "D.社会主义\r\n"
					+ "";
			StringQuestion[0][1] ="A";
			
			StringQuestion[1][0] ="（     ）给中国送来了马克思列宁主义，帮助中国的先进分子开始用无产阶级的世界观作为观察国家命运的工具，中国革命从此有了科学的指导思想。\r\n"
					+ "A.陈独秀\r\n"
					+ "B.李大钊\r\n"
					+ "C.十月革命\r\n"
					+ "D.马克思\r\n"
					+ "";
			StringQuestion[1][1] ="C";
			
			StringQuestion[2][0] ="中国共产党成立之后，为中国人民谋幸福，为中华民族（     ），经历了千辛万苦的奋斗历程，有成功的宝贵经验，也有失败的惨痛教训。\r\n"
					+ "A.谋解放\r\n"
					+ "B.谋复兴\r\n"
					+ "C.谋发展\r\n"
					+ "D.谋利益\r\n"
					+ "";
			StringQuestion[2][1] ="B";
			
			StringQuestion[3][0] ="中国共产党成立之后，为中国人民谋幸福，为中华民族（     ），经历了千辛万苦的奋斗历程，有成功的宝贵经验，也有失败的惨痛教训。\r\n"
					+ "A.谋解放\r\n"
					+ "B.谋复兴\r\n"
					+ "C.谋发展\r\n"
					+ "D.谋利益\r\n"
					+ "";
			StringQuestion[3][1] ="B";
			
			StringQuestion[4][0] ="中国共产党领导人民进行革命和建设的成功实践是毛泽东思想形成和发展的（  ）基础。\r\n"
					+ "A.实践\r\n"
					+ "B.时代\r\n"
					+ "C.理论\r\n"
					+ "D.现实\r\n"
					+ "";
			StringQuestion[4][1] ="A";
			
			StringQuestion[5][0] ="（     ）时期，毛泽东以马克思列宁主义为指导，深入实际调查研究，在《中国社会各阶级的分析》《湖南农民运动考察报告》等著作中，分析了中国社会各阶级在革命中的地位和作用，提出了新民主主义革命的基本思想。\r\n"
					+ "A.第一次国内革命战争\r\n"
					+ "B.土地革命战争\r\n"
					+ "C.抗日战争\r\n"
					+ "D.解放战争\r\n"
					+ "";
			StringQuestion[5][1] ="A";
			
			StringQuestion[6][0] ="（     ）就是一切从实际出发，理论联系实际，坚持在实践中检验真理和发展真理。\r\n"
					+ "A.独立自主\r\n"
					+ "B.统一战线\r\n"
					+ "C.群众路线\r\n"
					+ "D.实事求是\r\n"
					+ "";
			StringQuestion[6][1] ="D";
			
			StringQuestion[7][0] ="中国特色社会主义建设道路的初步探索，始于（     ）\r\n"
					+ "A.毛泽东      \r\n"
					+ "B.邓小平      \r\n"
					+ "C.江泽民      \r\n"
					+ "D.胡锦涛\r\n"
					+ "";
			StringQuestion[7][1] ="A";
			
			StringQuestion[8][0] ="毛泽东提出“以苏联经验为借鉴，走自己的路”的思想的主要著作是（        ）\r\n"
					+ "A.《党在过渡时期的总路线》    \r\n"
					+ "B.《为建设一个伟大的社会主义国家而奋斗》\r\n"
					+ "C.《论十大关系》              \r\n"
					+ "D.《我们党的一些历史经验》\r\n"
					+ "";
			StringQuestion[8][1] ="C";
			
			StringQuestion[9][0] ="毛泽东在《论十大关系》一文中，提出中国社会主义建设的基本方针和指导思想是（       ）\r\n"
					+ "A.既反对保守又反冒进，在综合平衡中稳步前进  \r\n"
					+ "B.调动一切积极因素，建设一个伟大的社会主义国家\r\n"
					+ "C.解放思想、实事求是\r\n"
					+ "D.在新的生产关系下面保护和发展生产力\r\n"
					+ "";
			StringQuestion[9][1] ="B";
			
			StringQuestion[10][0] ="新中国成立后特别是社会主义制度建立后，我国制定了宪法，颁布了一系列法律，建立了大量的规章制度，从根本上保证了（  ）的权利。\r\n"
					+ "A中国公民\r\n"
					+ "B中国政府\r\n"
					+ "C工农联盟\r\n"
					+ "D人民当家作主\r\n"
					+ "";
			StringQuestion[10][1] ="D";
			
			StringQuestion[11][0] ="一九七八年，我们党召开具有重大历史意义的（    ），开启了改革开放历史新时期。\r\n"
					+ "A.十一届二中全会    \r\n"
					+ "B.十一届三中全会    \r\n"
					+ "C.十一届四中全会   \r\n"
					+ "D.十一届五中全会\r\n"
					+ "";
			StringQuestion[11][1] ="B";
			
			StringQuestion[12][0] ="（ ）是党执政兴国的第一要务\r\n"
					+ "A. 以人为本、执政为民 \r\n"
					+ "B.坚持群众路线\r\n"
					+ "C.发展 \r\n"
					+ "D.全面建成小康社会\r\n"
					+ "";
			StringQuestion[12][1] ="C";
			
			StringQuestion[13][0] ="党的理论、路线、纲领、方针、政策和各项工作，必须坚持把（       ）作为出发点和归宿\r\n"
					+ "A．人民的根本利益 \r\n"
					+ "B．人民的当前利益\r\n"
					+ "C．人民的长远利益 \r\n"
					+ "D．人民的整体利益\r\n"
					+ "";
			StringQuestion[13][1] ="A";
			
			StringQuestion[14][0] ="“科学技术是第一生产力”的论断是由（    ）提出来的\r\n"
					+ "A．孙中山    \r\n"
					+ "B．毛泽东 \r\n"
					+ "C．邓小平      \r\n"
					+ "D．江泽民\r\n"
					+ "";
			StringQuestion[14][1] ="C";
			
			StringQuestion[15][0] ="把对外开放确定为我国的基本国策，是在(      )\r\n"
					+ "A．党的十一届六中全会 \r\n"
					+ "B．党的十二大 \r\n"
					+ "C．党的十二届三中全会 \r\n"
					+ "D．党的十三大\r\n"
					+ "";
			StringQuestion[15][1] ="C";
			
			StringQuestion[16][0] ="五年来，我们统筹推进“（      ）”总体布局、协调推进“（      ）”战略布局，“十二五”规划胜利完成，“十三五”规划顺利实施，党和国家事业全面开创新局面。\r\n"
					+ "A.五位一体　四个全面\r\n"
					+ "B.四位一体　五个全面\r\n"
					+ "C.五个全面　四位一体\r\n"
					+ "D.四个全面　五位一体\r\n"
					+ "";
			StringQuestion[16][1] ="A";
			
			StringQuestion[17][0] ="中国特色社会主义进入新时代，我国社会主要矛盾已经转化为人民日益增长的（    ）需要和不平衡不充分的发展之间的矛盾。\r\n";
			StringQuestion[17][1] ="美好生活";
			
			StringQuestion[18][0] ="确保到（    ）年我国现行标准下农村贫困人口实现脱贫，贫困县全部摘帽，解决区域性整体贫困，做到脱真贫，真脱贫。\r\n";
			StringQuestion[18][1] ="2020";
			
			StringQuestion[19][0] ="推动形成全面开放新格局，要以（    ）建设为重点，坚持引进来和走出去并重，遵循共商共建共享原则，加强创新能力开放合作，形成陆海内外联动、东西双向互济的开放格局。\r\n";
			StringQuestion[19][1] ="一带一路";
			
			StringQuestion[20][0] ="生态文明的核心是坚持人与自然（     ）。\r\n";
			StringQuestion[20][1] ="和谐共生";
			
			StringQuestion[21][0] ="建设（        ）是中华民族伟大复兴的基础工程。\r\n";
			StringQuestion[21][1] ="教育强国";
			
			StringQuestion[22][0] ="(      )是一个国家、一个民族发展中更基本、更深沉、更持久的力量。\r\n";
			StringQuestion[22][1] ="文化自信";
			
			StringQuestion[23][0] ="（      ）是老百姓解决温饱后的第一需求，是极重要的民生，也是最基本的发展环境。\r\n";
			StringQuestion[23][1] ="平安";
			
			StringQuestion[24][0] ="全面建成小康社会，要坚决打好污染防治攻坚战。坚持绿水青山就是（  ）\r\n";
			StringQuestion[24][1] ="金山银山";
			
			StringQuestion[25][0] ="没有（    ）就没有当代中国的发展进步。\r\n";
			StringQuestion[25][1] ="改革开放";
			
			StringQuestion[26][0] ="当今时代的主题是（    ）。\r\n";
			StringQuestion[26][1] ="和平与发展";
			
			StringQuestion[27][0] ="与中国在黄岩岛问题上有领土争议的国家是(    )。\r\n";
			StringQuestion[27][1] ="菲律宾";
			
			StringQuestion[28][0] ="中国共产党第十九次全国代表大会，是在全面建成小康社会决胜阶段、中国特色社会主义进入_____的关键时期召开的一次十分重要的大会。\r\n";
			StringQuestion[28][1] ="新时代";
			
			StringQuestion[29][0] ="实现“两个一百年”奋斗目标、实现中华民族伟大复兴的中国梦，不断提高人民生活水平，必须坚定不移把（      ）作为党执政兴国的第一要务。\r\n";
			StringQuestion[29][1] ="发展";
		}
		
		int x = (int) (30*Math.random());
		Scanner in = new Scanner(System.in);
		System.out.print(StringQuestion[x][0]);
		String  Answer = in.nextLine();
		
		
		if(Answer.equals(StringQuestion[x][1])) {
			System.out.print("正确答案 " + StringQuestion[x][1]
					+ " 回答正确\n\n");
			jifen++;
			giveQuestion();
		}
		else if(Answer.equals("exit")) {
			Home();
			in.close();
		}
		else {
			System.out.print("正确答案: " + StringQuestion[x][1]
					+ "  回答错误\n\n");
			giveQuestion();
		}
	}
	
	
	//个人信息
	public static void Personal_information() throws FileNotFoundException {
		
		System.out.print("输入“exit”返回主页面\n");
		@SuppressWarnings("unused")
		String	Home_Choice = home_Choice.nextLine();
		if(Home_Choice.equals("exit")) {
			Home();
		}
		else if(Home_Choice.equals("答题")){
			giveQuestion();
		}
		else {
			System.out.print("输入有误，请重试\n");
			Personal_information();
		}
	}
	
	//判断用户、密码是否正确
	public static boolean IfPassCorrect(String name, String password) throws FileNotFoundException {
		boolean flag = false;
		//初始用户123，123
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
