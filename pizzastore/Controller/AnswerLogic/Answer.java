package AnswerLogic;

import java.util.ArrayList;
import java.util.Scanner;

import QuestionLogic.RandomQuestion;
import StartSupport.StartingSub;
import Story.Day1_Question;

public class Answer extends StartingSub {

	public static ArrayList<String> answer = new ArrayList<String>();
	Scanner sc = new Scanner(System.in);
	RandomQuestion rdQuest = new RandomQuestion();
	Day1_Question day1quest = new Day1_Question();

	char sub = '"';
	int answerSelect;
	int a; // while ���ߴ� �뵵�� �� �Ҵ��ϴ� int

	public void answerScanner() {
		System.out.println("�ڡ١� �ֹ� �ڡ١�");
		System.out.println("�մ� : " + sub + Day1_Question.orderList.get(nowLevel) + sub);
		System.out.println();
		System.out.println("<<< ���ڸ� ������! >>>");
		System.out.println("[��Tip��] �߰��� ������ ���ٸ� " + sub + "�ϼ�" + sub + "�̶�� �Է��ϼ���.");

		System.out.println();
		System.out.print("������ ��� ���� ������? : ");
		answer.add(sc.next()); // ������ �߰��� ������ answer array�� �Ҵ�

		while (a != 1) {

			System.out.print("�߰��� ������? : ");
			answer.add(sc.next());
			// �ݺ������� �߰� �Ҵ��ϰ� "�ϼ�"�� ������ a�� +1, while ����

			for (int i = 0; i < answer.size(); i++) {

				if (answer.get(i).equals("�ϼ�")) {
					answer.remove("�ϼ�"); // �Ϸ��� ������ �迭�� ������
					a += 1;

				}
			}
		}

		a = 0;

	}

}
