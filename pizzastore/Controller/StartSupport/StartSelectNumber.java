package StartSupport;


import java.util.Scanner;

import StartObject.Starting;
import Story.Manual;
import UI.Numbers;

	
public class StartSelectNumber extends StartingSub implements Numbers {
	
	MemberDAO dao = new MemberDAO();
	MemberDTO dto;
	
	Scanner sc = new Scanner(System.in);
	
	protected String id;
	protected String pw;
	protected int money;
	
	Manual manual = new Manual();
	int i = 0;
	@Override
	public MemberDTO numberOf1() {

		if (number == 1) {

			System.out.println(" [1] �α���  [2] ȸ������");
			System.out.print(" ���ڸ� �Է��ϼ��� >> ");
			int number1 = sc.nextInt();
			System.out.println(
					"==========================================================================================================");
			while (true) {

				if (number1 == 1) {

					// System.out.println("�α���");
					System.out.print(" ID�� �Է��ϼ��� >> ");
					String id = sc.next();
					System.out.print(" PW�� �Է��ϼ��� >> ");
					String pw = sc.next();
					
					dto = new MemberDTO(id, pw);
					dao.login(dto);
					accountSet(dto);
					break;
				}
				

				if (number1 == 2) {
					System.out.println("====ȸ������====");
					System.out.print(" ID�� �Է��ϼ��� >> ");
					String id = sc.next();
					System.out.print(" PW�� �Է��ϼ��� >> ");
					String pw = sc.next();
					System.out.print(" NickName�� �Է��ϼ��� >> ");
					String name = sc.next();

					dto = new MemberDTO(id, pw, name, money);
					dao = new MemberDAO();
					int cnt = dao.insert(dto);
					i++;
					if (cnt > 0) {
						System.out.println("ȸ������ ����");
						 numberOf1();
						 break;
					} else {
						System.out.println("���̵� �ߺ��Ǿ� ȸ�����Կ� �����Ͽ����ϴ�.");
						System.out.println("�ٽ� ȸ������ �ϼ���.");
					}
				}
				
			}
			
		}
		
		return dto;
		
	}
			
			
			// firstview()���� �Ҵ���� number�� �� �� �� �ʱ�ȭ�Ǵ� part
			/* number �Ҵ� �� accountSet()�� ���� 
			 * �Ҵ� ���� number�� accountSet()���� ���� �ٸ� �α��� �޴��� �����
			 * �ش� method���� ���� �ٸ� slot�� �ְ� �׿� ���� method ���� */

//		}


	@Override
	public void numberOf2(MemberDTO dto) {

		if (number == 2) {
			if(i == 0) {
				System.out.println("[ranking viewer slot]");
				/* ���� ���� firstview���� �Ҵ�� �� number�� 2�Ͻ� ��ŷ���� ���� ����
				 * �� part������ ��ŷ�� ������ �� mainGame ������ ���ƿ��� method ������ �Ǿ�� ��
				 * ���� �ʿ��� method�� �Ʒ� ��ϰ� ����
				 * ranking reader board method add
				 * Main Game load method add */								
				MemberDAO dao = new MemberDAO();
			int cnt = dao.rank(dto);
			
			
			}
			}
			}
		
			
		
	@Override
	public void numberOf3() {

		if(number == 3) {
			
			System.out.println("[game closed]");
			// number�� 3�Ͻ� ���� ����, Assembly�� �ִ� method���� �۵����� �ʴ� ������ ����
			
		}

	}

	public void accountSet(MemberDTO dto) {

		switch (number) {

		case 1:
			System.out.println();
			// id, pw method part
			// �����ؾ� �ϴ� method ����� �Ʒ��� ����
			// id, pw method add add
			// Main game load method add

			
//			System.out.print("���̵� �Է� : ");
			id = dto.getId();
//			System.out.print("��й�ȣ �Է� : ");
			pw = dto.getPw();
			
			
			
			if(id.equals("a") && pw.equals("a")) {
				
				System.out.println();
				manual.tutorial();
				manual.manual();
				// master id, test �������� ���̵�, ��й�ȣ�� master �Է½� ���丮 ����
				
			}
			
			break;

		case 2:
			System.out.println();
			System.out.println("[account add slot]");
			// ȸ������ part�̸�, case 1�� ���� ����
			// account method add
			// Main game load method
			
			break;

		}
			
		number = 0;

	}



}




