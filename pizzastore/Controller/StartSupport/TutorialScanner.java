package StartSupport;

import java.util.Scanner;

public class TutorialScanner extends StartingSub {


	Scanner sc = new Scanner(System.in);
	
	public void firstView() {
		System.out.println(
				  "           __                                \r\n"
				+ "  _____   /\\_\\    ____     ____       __     \r\n"
				+ " /\\ '__`\\ \\/\\ \\  /\\_ ,`\\  /\\_ ,`\\   /'__`\\   \r\n"
				+ " \\ \\ \\L\\ \\ \\ \\ \\ \\/_/  /_ \\/_/  /_ /\\ \\L\\.\\_ \r\n"
				+ "  \\ \\ ,__/  \\ \\_\\  /\\____\\  /\\____\\\\ \\__/.\\_\\\r\n"
				+ "   \\ \\ \\/    \\/_/  \\/____/  \\/____/ \\/__/\\/_/\r\n"
				+ "    \\ \\_\\  ����                             ����\r\n"
				+ "     \\/_/      �� ���ӽ� �������� ���ڰ��� �� ");
		System.out.println("           ����                             ����");
		System.out.println("");
		System.out.println(" [1] ����  [2] ��ŷ��ȸ  [3] ����");
		System.out.print(" ���ڸ� �Է��ϼ��� >> ");
		number = sc.nextInt(); 
		// number�� �� �Ҵ�, number�� ���� ���� �ٸ� �޴� ����
		System.out.println();
		
	}

}
