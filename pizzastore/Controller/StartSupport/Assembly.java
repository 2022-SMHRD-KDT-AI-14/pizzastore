package StartSupport;

import java.sql.DriverManager;
import java.util.Scanner;

import AnswerLogic.Answer;
import AnswerLogic.AnswerMatching;
import AnswerLogic.AwCheck;
import GuestReactionLogic.AwReactionCheck;
import GuestReactionLogic.RandomReaction;
import Image.pizzaImage;
import QuestionLogic.RandomQuestion;
import Reaction.GuestReaction;
import Story.Day1_Question;
import Story.Manual;
import UI.Tutorial;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Assembly extends StartingSub implements Tutorial {

	MemberDTO dto;
	Connection conn;
	PreparedStatement psmt;
	ResultSet rs;

	// �� é�ͺ� ���������� method�� �����ϴ� class �Դϴ�.

	int cnt;
	String enter;

	@Override
	public void manual() {
		TutorialScanner tutosc = new TutorialScanner();
		StartSelectNumber startnum = new StartSelectNumber();
		RandomQuestion rdQuest = new RandomQuestion();
		Answer ans = new Answer();
		Manual manual = new Manual();
		Day1_Question dayList = new Day1_Question();
		AnswerMatching ansMat = new AnswerMatching();
		AwCheck ach = new AwCheck();
		Scanner sc = new Scanner(System.in);

		manual.tutorial();
		manual.manual();

		/*
		 * �����ϴ� �κе��� ���� ���ǻ� �޴��� UI�� ������ �� Starting���� �Ҵ���� ���� tutorial�� manual �����
		 * accountSet method �� switch�� case 1�� ������
		 */

	}

	@Override
	public MemberDTO tutorial() {
		TutorialScanner tutosc = new TutorialScanner();
		StartSelectNumber startnum = new StartSelectNumber();
		RandomQuestion rdQuest = new RandomQuestion();
		Answer ans = new Answer();
		Manual manual = new Manual();
		Day1_Question dayList = new Day1_Question();
		AnswerMatching ansMat = new AnswerMatching();
		AwCheck ach = new AwCheck();

		// view���� ó������ �������� tutorial part

		tutosc.firstView();
		// ù ���� �޴��� ��ĳ�ʷ� number�� ���� �Ҵ�

		// �α��� �޼���
		// id, pw
		
		dto = startnum.numberOf1();	
	
		startnum.numberOf2(dto);
		startnum.numberOf3();
		/*
		 * ��ĵ ���� number�� ���� �ٸ��� �����Ǵ� start ���� ��� startSelectNumber.class �ȿ� �ִ� method
		 * �̸����� �������� start �κи� �Ҵ�ǰ� �ش� number�� method�� �ο� ���� chapter�� ������ ����
		 */

		dayList.day1Quest();
		manual();
		return dto;

	}

	public void Game(MemberDTO dto) {

		
		TutorialScanner tutosc = new TutorialScanner();
		StartSelectNumber startnum = new StartSelectNumber();
		RandomQuestion rdQuest = new RandomQuestion();
		Answer ans = new Answer();
		Manual manual = new Manual();
		Day1_Question dayList = new Day1_Question();
		AnswerMatching ansMat = new AnswerMatching();
		AwCheck ach = new AwCheck();
		Scanner sc = new Scanner(System.in);
		GameEnding end = new GameEnding();

		RandomReaction rdReaction = new RandomReaction();
		AwReactionCheck arc = new AwReactionCheck();
		pizzaImage pizzaimage = new pizzaImage();

		level += 1;

		while (cnt != 25 && life != 3) {

			switch (cnt) {
			case 0:
				pizzaimage.toppingImg1();
				break;
			case 5:
				pizzaimage.toppingImg2();
				break;
			case 10:
				pizzaimage.toppingImg3();
				break;
			case 15:
				pizzaimage.toppingImg4();
				break;
			case 20:
				pizzaimage.toppingImg5();
				break;
			}

			if (cnt == 0 || cnt == 5 || cnt == 10 || cnt == 15 || cnt == 20) {
				System.out.println("[ Day " + (day + 1) + " �� ����! ]");
			} // ���ӽ��۽� day ǥ��

			// �� ���� ����
			awReactionCheck = 0;
			rdQuest.rdQuestNum(); // ���� ���� List method
			ans.answerScanner(); // ������ ���� ���� ���ϴ� method
			ach.levels(); // ���� ��Ī �ý���

			// ���� ���
			System.out.println("�ڡ١� ��θ���θ� �� �ֹ��Ͻ� ���� ���Խ��ϴ�! �ڡ١�");
			System.out.print("�մ� : ");

			rdReaction.rdReactionNum(); // ���� ���� List method
			arc.reactionCheck(); // ���� ��� �żҵ�

			cnt++;
			char talkSub = '"';
			String enter = "";

			if (cnt % 5 == 0 && life != 3) { // 5������ ī��Ʈ
				day++;

				System.out.println();
				System.out.println("===============================================================");
				System.out.println("���ӽ� ������ : " + talkSub + "����ߴ�. ����� �ð��̴�!" + talkSub);
				System.out.println(name + " : " + talkSub + "����~ Į������!!!" + talkSub);
				System.out.println("===============================================================");
				System.out.println();

				System.out.println("[ Day " + day + " �Ǹ� ���� ]");
				System.out.println("�� ��ü ���� : " + money + "�� ��");

				System.out.println();
				System.out.println("===============================================================");

				if (day < 5) {
					System.out.print("�������� �����? " + talkSub + "��" + talkSub + "��� �Է� >> ");
					enter = sc.next();
				}

			}

			ans.answer.clear();
			System.out.println();
			System.out.println("Cnt view Test : " + cnt);
			System.out.println();

		}

		if (life == 3) {

			end.ending();

		}

		
		MemberDAO dao = new MemberDAO();
		System.out.println();
		System.out.println("test money value : " + money);
		
		dao.updateMoney(money,dto.getId());
		// money�� �� ��������� Ȯ���ϴ� �뵵�� print

	}

}
