package Story;

import java.util.Scanner;

import StartSupport.MemberDAO;
import StartSupport.MemberDTO;
import StartSupport.StartSelectNumber;
import StartSupport.StartingSub;

public class Manual extends StartingSub {

	char talkSub;
	String enter;
	MemberDAO dao = new MemberDAO();
	

	public void tutorial() {

		Scanner sc = new Scanner(System.in);
		
		
		talkSub = '"';
		// String name = dao.nickname(dto);
		
		// Scanner�� name�� ������ DB�� ������ ������ �� �Ҵ�
		
		System.out.println("������ �����غ����?");
		System.out.print(talkSub+"��"+talkSub+"��� �Է� >> ");
		enter = sc.next();

		System.out.println();
		// System.out.println(
		// 		"==========================================================================================================");
		System.out.println("[��Story��]");
		System.out.println(
				"==========================================================================================================");

		System.out.println("���ӽ� ������ : (�Ѽ� ǫ)");
		System.out.println(name + " : " + talkSub + "?.? ������, ���� �� ��������?" + talkSub);
		System.out.println("���ӽ� ������ : " + talkSub + "�ڷγ��� ���� �� ���ڰ��԰� ���ϰھ�...�Ф�" + talkSub);
		System.out.println(name + " : " + talkSub + "��.. ���� ��簡 �� �ǵ��� ���͵帱�Կ�!" + talkSub);
		System.out.println("���ӽ� ������ : " + talkSub + "��! �׷���, " + name + "! �� ���ڰ����� ������ �ʷ� ���ߴ�!" + talkSub);
		System.out.println(name + " : " + talkSub + "�� ��¥��? ���ƿ�!! bb" + talkSub);
		System.out.println(
				"==========================================================================================================");
		System.out.println();

	}

//      ��� �Է��� �ʿ��� �� �Ʒ� ���� �� "���" �κи� �Է�
//	    System.out.println("[���ӽ� ����] " + talkSub + "���" + talkSub);
//		System.out.println("[" + name + "] " + talkSub + "���" + talkSub);

	public String manual() {

		Scanner sc = new Scanner(System.in);

		//System.out.println(
		//		"==========================================================================================================");
		System.out.println("[�ڰ��ӹ����]");
		System.out.println(
				"==========================================================================================================");
		System.out.println("�մ��� �ֹ��� �޾� �ʿ��� ���ΰ� ��Ḧ Ÿ�����Ͽ� ���ڸ� ���弼��.");
		System.out.println("Day�� ���� ������ �߰��Ǿ� �� �پ��� ���ڸ� ���� �� �־��.");
		System.out.println("������ Day1���� Day5���� ����Ǹ�, ��ȸ�� 3��! �� 3�� Ʋ���� ������ ����˴ϴ�.");
		System.out.println(
				"==========================================================================================================");

		System.out.println();
		//System.out.println("��� �����Ϸ��� " + talkSub + "�ƹ� Ű��" + talkSub + " �Է����ּ���.");
		System.out.println("�ֹ��� �ްڽ��ϱ�?");
		System.out.print(talkSub+"��"+talkSub+"��� �Է� >> ");
		enter = sc.next();
		System.out.println();

		return enter;
	}

}
