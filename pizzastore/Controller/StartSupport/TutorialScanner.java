package StartSupport;

import java.util.Scanner;

public class TutorialScanner extends StartingSub {


	Scanner sc = new Scanner(System.in);
	
	public void firstView() {
		System.out.println();
		// System.out.println("==========================================================================================================");
		System.out.println("�� ���ӽ� �������� ���ڰ��� ��");
		System.out.println("==========================================================================================================");
		System.out.println(" [1] ����  [2] ��ŷ��ȸ  [3] ����");
		System.out.print(" ���ڸ� �Է��ϼ��� >> ");
		number = sc.nextInt(); 
		// number�� �� �Ҵ�, number�� ���� ���� �ٸ� �޴� ����
		System.out.println("==========================================================================================================");
		
	}

}
