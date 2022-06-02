package QuestionLogic;

import java.util.Random;

import StartSupport.StartingSub;
import Story.Day1_Question;

public class RandomQuestion extends StartingSub {


	int rdQuest;

	public int rdQuestNum() {

		Day1_Question questionList = new Day1_Question();
		Random rd = new Random();
		
//		dayCnt++;
//		if (dayCnt < 31 && dayCnt % 5 == 0) {
//			level += 1;
//		}
		
		// ��¥�� ���� ������ ���� ��¥++�� ���� �����Ҷ� �Ǽ� ó���� ������ 0 > ����1 ... ������ ������
		if (day == 0) {
			level = 1;
		}else if (day== 1) {
			level = 2;
		}else if (day== 2) {
			level = 3;
		}else if (day== 3) {
			level = 4;
		}else if (day== 4) {
			level = 5;
		}

		/*
		 * ���۰� ���ÿ� �켱 level +1�� �̷������, �߰������� �ٸ� ������ ���ؼ� Ư�� �������� level�� �������� ������ ����
		 */

		if (level == 1) {
			rdQuest = rd.nextInt(15); // ����List�� �ִ� index 0~14������ �ҷ�����(level 1 ����)
			questionList.orderList.get(rdQuest); // �Ҵ� ���� random ����List�� get

		} else if (level == 2) {
			rdQuest = rd.nextInt(25); // ����List�� �ִ� index 0~24������ �ҷ�����(level 1+2 ����)
			questionList.orderList.get(rdQuest); // �Ҵ� ���� random ����List�� get

		} else if (level == 3) {
			rdQuest = rd.nextInt(20) + 15; // ����List�� �ִ� index 15~34������ �ҷ�����(level 2+3 ����)
			questionList.orderList.get(rdQuest); // �Ҵ� ���� random ����List�� get

		} else if (level == 4) {
			rdQuest = rd.nextInt(22) + 25; // ����List�� �ִ� index 25~46������ �ҷ�����(level 3+4 ����)
			questionList.orderList.get(rdQuest); // �Ҵ� ���� random ����List�� get

		} else if (level == 5) {
			rdQuest = rd.nextInt(27) + 35; // ����List�� �ִ� index 35~61������ �ҷ�����(level 4+5 ����)
			questionList.orderList.get(rdQuest); // �Ҵ� ���� random ����List�� get
		}

		nowLevel = rdQuest; // �� �Ҵ� ���� random ��ȣ�� nowLevel�� �߰� �Ҵ�
							// �Ŀ� ���������� money�� �󸶳� �߰����� �����ϱ� ������

		return nowLevel;

	}

}
