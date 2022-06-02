package AnswerLogic;

public class AwCheck extends AnswerMatching {

	public void Level1() {
		if (level == 1) { // level�� StartingSub stack�� ����Ǿ� ����

			if (0 <= nowLevel && nowLevel <= 2) { // ���� array Random �Ҵ�Ǵ� ���� ���� nowLevel�� �� �Ҵ�
				if (ans.answer.size() == 1) { // �迭�� ũ������
					for (int i = 0; i < ans.answer.size(); i++) {
						// �����߰��� ���� ��ŭ ���ؼ� �Ʒ� ��� ��ġ�ϸ� money �߰�
						// �߰��� ���� ���� �������� if�� ���� ó��
						if (ans.answer.get(i).equals("�ҽ�")) {
							money += 3000;
							awReactionCheck = 1;
						}
					}
				}
			}
		} // 0~2 end

		if (3 <= nowLevel && nowLevel <= 6) { // ���� array Random �Ҵ�Ǵ� ���� ���� nowLevel�� �� �Ҵ�
			if (ans.answer.size() == 1) { // �迭�� ũ������
				for (int i = 0; i < ans.answer.size(); i++) {
					// �����߰��� ���� ��ŭ ���ؼ� �Ʒ� ��� ��ġ�ϸ� money �߰�
					// �߰��� ���� ���� �������� if�� ���� ó��
					if (ans.answer.get(i).equals("ġ��")) {
						money += 4000;
						awReactionCheck = 1;
					}
				}
			}
		} // 3~6 end

		if (7 <= nowLevel && nowLevel <= 14) { // ���� array Random �Ҵ�Ǵ� ���� ���� nowLevel�� �� �Ҵ�
			if (ans.answer.size() == 2) { // �迭�� ũ������
				int cnt = 0; // ��������� �� ��ŭ ī��Ʈ �ʱ�ȭ
				for (int i = 0; i < ans.answer.size(); i++) {
					// �����߰��� ���� ��ŭ ���ؼ� �Ʒ� ��� ��ġ�ϸ� money �߰�
					// �߰��� ���� ���� �������� if-else�� &&�� ���� ó��
					switch (ans.answer.get(i)) {
					case "�ҽ�":
						cnt++;
						break;
					case "ġ��":
						cnt++;
						break;
					}
					if (cnt == ans.answer.size()) { // ��������� �� ��ŭ ī��Ʈ
						money += 7000; // ���̸� ���⿡ ���ϱ�
						awReactionCheck = 1;
					}
				}
			}
		} // 7~14 end

	}

	public void Level2() {
		if (level == 2) { // level�� StartingSub stack�� ����Ǿ� ����

			if (15 <= nowLevel && nowLevel <= 16) { // ���� array Random �Ҵ�Ǵ� ���� ���� nowLevel�� �� �Ҵ�
				if (ans.answer.size() == 1) { // �迭�� ũ������
					for (int i = 0; i < ans.answer.size(); i++) {
						// �����߰��� ���� ��ŭ ���ؼ� �Ʒ� ��� ��ġ�ϸ� money �߰�
						// �߰��� ���� ���� �������� if�� ���� ó��
						if (ans.answer.get(i).equals("���۷δ�")) {
							money += 6000;
							awReactionCheck = 1;
						}
					}
				}
			} // 15~16 end

			if (17 <= nowLevel && nowLevel <= 20) { // ���� array Random �Ҵ�Ǵ� ���� ���� nowLevel�� �� �Ҵ�
				if (ans.answer.size() == 2) { // �迭�� ũ������
					int cnt = 0; // ��������� �� ��ŭ ī��Ʈ �ʱ�ȭ
					for (int i = 0; i < ans.answer.size(); i++) {
						// �����߰��� ���� ��ŭ ���ؼ� �Ʒ� ��� ��ġ�ϸ� money �߰�
						// �߰��� ���� ���� �������� if-else�� &&�� ���� ó��
						switch (ans.answer.get(i)) {
						case "�ҽ�":
							cnt++;
							break;
						case "���۷δ�":
							cnt++;
							break;
						}
						if (cnt == ans.answer.size()) { // ��������� �� ��ŭ ī��Ʈ
							money += 9000; // ���̸� ���⿡ ���ϱ�
							awReactionCheck = 1;
						}
					}
				}
			} // 17~20 end

			if (21 <= nowLevel && nowLevel <= 24) { // ���� array Random �Ҵ�Ǵ� ���� ���� nowLevel�� �� �Ҵ�
				if (ans.answer.size() == 3) { // �迭�� ũ������
					int cnt = 0; // ��������� �� ��ŭ ī��Ʈ �ʱ�ȭ
					for (int i = 0; i < ans.answer.size(); i++) {
						// �����߰��� ���� ��ŭ ���ؼ� �Ʒ� ��� ��ġ�ϸ� money �߰�
						// �߰��� ���� ���� �������� if-else�� &&�� ���� ó��
						switch (ans.answer.get(i)) {
						case "�ҽ�":
							cnt++;
							break;
						case "ġ��":
							cnt++;
							break;
						case "���۷δ�":
							cnt++;
							break;
						}
						if (cnt == ans.answer.size()) { // ��������� �� ��ŭ ī��Ʈ
							money += 13000; // ���̸� ���⿡ ���ϱ�
							awReactionCheck = 1;
						}
					}
				}
			} // 17~20 end

		}
	}

	public void Level3() {
		if (level == 3) { // level�� StartingSub stack�� ����Ǿ� ����

			if (25 <= nowLevel && nowLevel <= 26) { // ���� array Random �Ҵ�Ǵ� ���� ���� nowLevel�� �� �Ҵ�
				if (ans.answer.size() == 1) { // �迭�� ũ������
					for (int i = 0; i < ans.answer.size(); i++) {
						// �����߰��� ���� ��ŭ ���ؼ� �Ʒ� ��� ��ġ�ϸ� money �߰�
						// �߰��� ���� ���� �������� if�� ���� ó��
						if (ans.answer.get(i).equals("�Ǹ�")) {
							money += 6000;
							awReactionCheck = 1;
						}
					}
				}
			} // 25~26 end

			if (nowLevel == 27) { // ���� array Random �Ҵ�Ǵ� ���� ���� nowLevel�� �� �Ҵ�
				if (ans.answer.size() == 2) { // �迭�� ũ������
					int cnt = 0; // ��������� �� ��ŭ ī��Ʈ �ʱ�ȭ
					for (int i = 0; i < ans.answer.size(); i++) {
						// �����߰��� ���� ��ŭ ���ؼ� �Ʒ� ��� ��ġ�ϸ� money �߰�
						// �߰��� ���� ���� �������� if-else�� &&�� ���� ó��
						switch (ans.answer.get(i)) {
						case "�ҽ�":
							cnt++;
							break;
						case "�Ǹ�":
							cnt++;
							break;
						}
						if (cnt == ans.answer.size()) { // ��������� �� ��ŭ ī��Ʈ
							money += 9000; // ���̸� ���⿡ ���ϱ�
							awReactionCheck = 1;
						}
					}
				}
			} // 27 end

			if (28 <= nowLevel && nowLevel <= 30) { // ���� array Random �Ҵ�Ǵ� ���� ���� nowLevel�� �� �Ҵ�
				if (ans.answer.size() == 3) { // �迭�� ũ������
					int cnt = 0; // ��������� �� ��ŭ ī��Ʈ �ʱ�ȭ
					for (int i = 0; i < ans.answer.size(); i++) {
						// �����߰��� ���� ��ŭ ���ؼ� �Ʒ� ��� ��ġ�ϸ� money �߰�
						// �߰��� ���� ���� �������� if-else�� &&�� ���� ó��
						switch (ans.answer.get(i)) {
						case "�ҽ�":
							cnt++;
							break;
						case "ġ��":
							cnt++;
							break;
						case "�Ǹ�":
							cnt++;
							break;
						}
						if (cnt == ans.answer.size()) { // ��������� �� ��ŭ ī��Ʈ
							money += 13000; // ���̸� ���⿡ ���ϱ�
							awReactionCheck = 1;
						}
					}
				}
			} // 28~30 end

			if (nowLevel == 31) { // ���� array Random �Ҵ�Ǵ� ���� ���� nowLevel�� �� �Ҵ�
				if (ans.answer.size() == 3) { // �迭�� ũ������
					int cnt = 0; // ��������� �� ��ŭ ī��Ʈ �ʱ�ȭ
					for (int i = 0; i < ans.answer.size(); i++) {
						// �����߰��� ���� ��ŭ ���ؼ� �Ʒ� ��� ��ġ�ϸ� money �߰�
						// �߰��� ���� ���� �������� if-else�� &&�� ���� ó��
						switch (ans.answer.get(i)) {
						case "�ҽ�":
							cnt++;
							break;
						case "���۷δ�":
							cnt++;
							break;
						case "�Ǹ�":
							cnt++;
							break;
						}
						if (cnt == ans.answer.size()) { // ��������� �� ��ŭ ī��Ʈ
							money += 15000; // ���̸� ���⿡ ���ϱ�
							awReactionCheck = 1;
						}
					}
				}
			} // 31 end

			if (32 <= nowLevel && nowLevel <= 34) { // ���� array Random �Ҵ�Ǵ� ���� ���� nowLevel�� �� �Ҵ�
				if (ans.answer.size() == 4) { // �迭�� ũ������
					int cnt = 0; // ��������� �� ��ŭ ī��Ʈ �ʱ�ȭ
					for (int i = 0; i < ans.answer.size(); i++) {
						// �����߰��� ���� ��ŭ ���ؼ� �Ʒ� ��� ��ġ�ϸ� money �߰�
						// �߰��� ���� ���� �������� if-else�� &&�� ���� ó��
						switch (ans.answer.get(i)) {
						case "�ҽ�":
							cnt++;
							break;
						case "ġ��":
							cnt++;
							break;
						case "���۷δ�":
							cnt++;
							break;
						case "�Ǹ�":
							cnt++;
							break;
						}
						if (cnt == ans.answer.size()) { // ��������� �� ��ŭ ī��Ʈ
							money += 19000; // ���̸� ���⿡ ���ϱ�
							awReactionCheck = 1;
						}
					}
				}
			} // 32~34 end

		}
	}

	public void Level4() {
		if (level == 4) { // level�� StartingSub stack�� ����Ǿ� ����

			if (nowLevel == 35) { // ���� array Random �Ҵ�Ǵ� ���� ���� nowLevel�� �� �Ҵ�
				if (ans.answer.size() == 1) { // �迭�� ũ������
					for (int i = 0; i < ans.answer.size(); i++) {
						// �����߰��� ���� ��ŭ ���ؼ� �Ʒ� ��� ��ġ�ϸ� money �߰�
						// �߰��� ���� ���� �������� if�� ���� ó��
						if (ans.answer.get(i).equals("�ҽ���")) {
							money += 6500;
							awReactionCheck = 1;
					}
				}
			} // 35 end

			if (nowLevel == 36) { // ���� array Random �Ҵ�Ǵ� ���� ���� nowLevel�� �� �Ҵ�
				if (ans.answer.size() == 2) { // �迭�� ũ������
					int cnt = 0; // ��������� �� ��ŭ ī��Ʈ �ʱ�ȭ
					for (int i = 0; i < ans.answer.size(); i++) {
						// �����߰��� ���� ��ŭ ���ؼ� �Ʒ� ��� ��ġ�ϸ� money �߰�
						// �߰��� ���� ���� �������� if-else�� &&�� ���� ó��
						switch (ans.answer.get(i)) {
						case "�ҽ�":
							cnt++;
							break;
						case "�ҽ���":
							cnt++;
							break;
						}
						if (cnt == ans.answer.size()) { // ��������� �� ��ŭ ī��Ʈ
							money += 9500; // ���̸� ���⿡ ���ϱ�
							awReactionCheck = 1;
						}
					}
				}
			} // 36 end

			if (37 <= nowLevel && nowLevel <= 38) { // ���� array Random �Ҵ�Ǵ� ���� ���� nowLevel�� �� �Ҵ�
				if (ans.answer.size() == 3) { // �迭�� ũ������
					int cnt = 0; // ��������� �� ��ŭ ī��Ʈ �ʱ�ȭ
					for (int i = 0; i < ans.answer.size(); i++) {
						// �����߰��� ���� ��ŭ ���ؼ� �Ʒ� ��� ��ġ�ϸ� money �߰�
						// �߰��� ���� ���� �������� if-else�� &&�� ���� ó��
						switch (ans.answer.get(i)) {
						case "�ҽ�":
							cnt++;
							break;
						case "ġ��":
							cnt++;
							break;
						case "�ҽ���":
							cnt++;
							break;
						}
						if (cnt == ans.answer.size()) { // ��������� �� ��ŭ ī��Ʈ
							money += 13500; // ���̸� ���⿡ ���ϱ�
							awReactionCheck = 1;
						}
					}
				}
			} // 37~38 end

			if (nowLevel == 39) { // ���� array Random �Ҵ�Ǵ� ���� ���� nowLevel�� �� �Ҵ�
				if (ans.answer.size() == 2) { // �迭�� ũ������
					int cnt = 0; // ��������� �� ��ŭ ī��Ʈ �ʱ�ȭ
					for (int i = 0; i < ans.answer.size(); i++) {
						// �����߰��� ���� ��ŭ ���ؼ� �Ʒ� ��� ��ġ�ϸ� money �߰�
						// �߰��� ���� ���� �������� if-else�� &&�� ���� ó��
						switch (ans.answer.get(i)) {
						case "���۷δ�":
							cnt++;
							break;
						case "�ҽ���":
							cnt++;
							break;
						}
						if (cnt == ans.answer.size()) { // ��������� �� ��ŭ ī��Ʈ
							money += 12500; // ���̸� ���⿡ ���ϱ�
							awReactionCheck = 1;
						}
					}
				}
			} // 39 end

			if (nowLevel == 40) { // ���� array Random �Ҵ�Ǵ� ���� ���� nowLevel�� �� �Ҵ�
				if (ans.answer.size() == 3) { // �迭�� ũ������
					int cnt = 0; // ��������� �� ��ŭ ī��Ʈ �ʱ�ȭ
					for (int i = 0; i < ans.answer.size(); i++) {
						// �����߰��� ���� ��ŭ ���ؼ� �Ʒ� ��� ��ġ�ϸ� money �߰�
						// �߰��� ���� ���� �������� if-else�� &&�� ���� ó��
						switch (ans.answer.get(i)) {
						case "�ҽ�":
							cnt++;
							break;
						case "���۷δ�":
							cnt++;
							break;
						case "�ҽ���":
							cnt++;
							break;
						}
						if (cnt == ans.answer.size()) { // ��������� �� ��ŭ ī��Ʈ
							money += 15500; // ���̸� ���⿡ ���ϱ�
							awReactionCheck = 1;
						}
					}
				}
			} // 40 end

			if (nowLevel == 41) { // ���� array Random �Ҵ�Ǵ� ���� ���� nowLevel�� �� �Ҵ�
				if (ans.answer.size() == 3) { // �迭�� ũ������
					int cnt = 0; // ��������� �� ��ŭ ī��Ʈ �ʱ�ȭ
					for (int i = 0; i < ans.answer.size(); i++) {
						// �����߰��� ���� ��ŭ ���ؼ� �Ʒ� ��� ��ġ�ϸ� money �߰�
						// �߰��� ���� ���� �������� if-else�� &&�� ���� ó��
						switch (ans.answer.get(i)) {
						case "�ҽ�":
							cnt++;
							break;
						case "�Ǹ�":
							cnt++;
							break;
						case "�ҽ���":
							cnt++;
							break;
						}
						if (cnt == ans.answer.size()) { // ��������� �� ��ŭ ī��Ʈ
							money += 15500; // ���̸� ���⿡ ���ϱ�
							awReactionCheck = 1;
						}
					}
				}
			} // 41 end

			if (42 <= nowLevel && nowLevel <= 43) { // ���� array Random �Ҵ�Ǵ� ���� ���� nowLevel�� �� �Ҵ�
				if (ans.answer.size() == 4) { // �迭�� ũ������
					int cnt = 0; // ��������� �� ��ŭ ī��Ʈ �ʱ�ȭ
					for (int i = 0; i < ans.answer.size(); i++) {
						// �����߰��� ���� ��ŭ ���ؼ� �Ʒ� ��� ��ġ�ϸ� money �߰�
						// �߰��� ���� ���� �������� if-else�� &&�� ���� ó��
						switch (ans.answer.get(i)) {
						case "�ҽ�":
							cnt++;
							break;
						case "ġ��":
							cnt++;
							break;
						case "�Ǹ�":
							cnt++;
							break;
						case "�ҽ���":
							cnt++;
							break;
						}
						if (cnt == ans.answer.size()) { // ��������� �� ��ŭ ī��Ʈ
							money += 19500; // ���̸� ���⿡ ���ϱ�
							awReactionCheck = 1;
						}
					}
				}
			} // 42~43 end

			if (44 <= nowLevel && nowLevel <= 46) { // ���� array Random �Ҵ�Ǵ� ���� ���� nowLevel�� �� �Ҵ�
				if (ans.answer.size() == 4) { // �迭�� ũ������
					int cnt = 0; // ��������� �� ��ŭ ī��Ʈ �ʱ�ȭ
					for (int i = 0; i < ans.answer.size(); i++) {
						// �����߰��� ���� ��ŭ ���ؼ� �Ʒ� ��� ��ġ�ϸ� money �߰�
						// �߰��� ���� ���� �������� if-else�� &&�� ���� ó��
						switch (ans.answer.get(i)) {
						case "�ҽ�":
							cnt++;
							break;
						case "ġ��":
							cnt++;
							break;
						case "���۷δ�":
							cnt++;
							break;
						case "�ҽ���":
							cnt++;
							break;
						}
						if (cnt == ans.answer.size()) { // ��������� �� ��ŭ ī��Ʈ
							money += 19500; // ���̸� ���⿡ ���ϱ�
							awReactionCheck = 1;
						}
					}
				}
			} // 44~46 end

			}
		}
	}

	public void Level5() {
		if (level == 5) { // level�� StartingSub stack�� ����Ǿ� ����

			if (nowLevel == 47) { // ���� array Random �Ҵ�Ǵ� ���� ���� nowLevel�� �� �Ҵ�
				if (ans.answer.size() == 1) { // �迭�� ũ������
					for (int i = 0; i < ans.answer.size(); i++) {
						// �����߰��� ���� ��ŭ ���ؼ� �Ʒ� ��� ��ġ�ϸ� money �߰�
						// �߰��� ���� ���� �������� if�� ���� ó��
						if (ans.answer.get(i).equals("����")) {
							money += 7500;
							awReactionCheck = 1;
						}
					}
				}
			} // 47 end

			if (nowLevel == 48) { // ���� array Random �Ҵ�Ǵ� ���� ���� nowLevel�� �� �Ҵ�
				if (ans.answer.size() == 2) { // �迭�� ũ������
					int cnt = 0; // ��������� �� ��ŭ ī��Ʈ �ʱ�ȭ
					for (int i = 0; i < ans.answer.size(); i++) {
						// �����߰��� ���� ��ŭ ���ؼ� �Ʒ� ��� ��ġ�ϸ� money �߰�
						// �߰��� ���� ���� �������� if-else�� &&�� ���� ó��
						switch (ans.answer.get(i)) {
						case "�ҽ�":
							cnt++;
							break;
						case "����":
							cnt++;
							break;
						}
						if (cnt == ans.answer.size()) { // ��������� �� ��ŭ ī��Ʈ
							money += 10500; // ���̸� ���⿡ ���ϱ�
							awReactionCheck = 1;
						}
					}
				}
			} // 48 end

			if (49 <= nowLevel && nowLevel <= 50) { // ���� array Random �Ҵ�Ǵ� ���� ���� nowLevel�� �� �Ҵ�
				if (ans.answer.size() == 3) { // �迭�� ũ������
					int cnt = 0; // ��������� �� ��ŭ ī��Ʈ �ʱ�ȭ
					for (int i = 0; i < ans.answer.size(); i++) {
						// �����߰��� ���� ��ŭ ���ؼ� �Ʒ� ��� ��ġ�ϸ� money �߰�
						// �߰��� ���� ���� �������� if-else�� &&�� ���� ó��
						switch (ans.answer.get(i)) {
						case "�ҽ�":
							cnt++;
							break;
						case "ġ��":
							cnt++;
							break;
						case "����":
							cnt++;
							break;
						}
						if (cnt == ans.answer.size()) { // ��������� �� ��ŭ ī��Ʈ
							money += 14500; // ���̸� ���⿡ ���ϱ�
							awReactionCheck = 1;
						}
					}
				}
			} // 49~50 end

			if (nowLevel == 51) { // ���� array Random �Ҵ�Ǵ� ���� ���� nowLevel�� �� �Ҵ�
				if (ans.answer.size() == 3) { // �迭�� ũ������
					int cnt = 0; // ��������� �� ��ŭ ī��Ʈ �ʱ�ȭ
					for (int i = 0; i < ans.answer.size(); i++) {
						// �����߰��� ���� ��ŭ ���ؼ� �Ʒ� ��� ��ġ�ϸ� money �߰�
						// �߰��� ���� ���� �������� if-else�� &&�� ���� ó��
						switch (ans.answer.get(i)) {
						case "�ҽ�":
							cnt++;
							break;
						case "���۷δ�":
							cnt++;
							break;
						case "����":
							cnt++;
							break;
						}
						if (cnt == ans.answer.size()) { // ��������� �� ��ŭ ī��Ʈ
							money += 16500; // ���̸� ���⿡ ���ϱ�
							awReactionCheck = 1;
						}
					}
				}
			} // 51 end

			if (nowLevel == 52) { // ���� array Random �Ҵ�Ǵ� ���� ���� nowLevel�� �� �Ҵ�
				if (ans.answer.size() == 3) { // �迭�� ũ������
					int cnt = 0; // ��������� �� ��ŭ ī��Ʈ �ʱ�ȭ
					for (int i = 0; i < ans.answer.size(); i++) {
						// �����߰��� ���� ��ŭ ���ؼ� �Ʒ� ��� ��ġ�ϸ� money �߰�
						// �߰��� ���� ���� �������� if-else�� &&�� ���� ó��
						switch (ans.answer.get(i)) {
						case "�ҽ�":
							cnt++;
							break;
						case "�Ǹ�":
							cnt++;
							break;
						case "����":
							cnt++;
							break;
						}
						if (cnt == ans.answer.size()) { // ��������� �� ��ŭ ī��Ʈ
							money += 16500; // ���̸� ���⿡ ���ϱ�
							awReactionCheck = 1;
						}
					}
				}
			} // 52 end

			if (nowLevel == 53) { // ���� array Random �Ҵ�Ǵ� ���� ���� nowLevel�� �� �Ҵ�
				if (ans.answer.size() == 3) { // �迭�� ũ������
					int cnt = 0; // ��������� �� ��ŭ ī��Ʈ �ʱ�ȭ
					for (int i = 0; i < ans.answer.size(); i++) {
						// �����߰��� ���� ��ŭ ���ؼ� �Ʒ� ��� ��ġ�ϸ� money �߰�
						// �߰��� ���� ���� �������� if-else�� &&�� ���� ó��
						switch (ans.answer.get(i)) {
						case "�ҽ�":
							cnt++;
							break;
						case "�ҽ���":
							cnt++;
							break;
						case "����":
							cnt++;
							break;
						}
						if (cnt == ans.answer.size()) { // ��������� �� ��ŭ ī��Ʈ
							money += 17000; // ���̸� ���⿡ ���ϱ�
							awReactionCheck = 1;
						}
					}
				}
			} // 53 end

			if (54 <= nowLevel && nowLevel <= 56) { // ���� array Random �Ҵ�Ǵ� ���� ���� nowLevel�� �� �Ҵ�
				if (ans.answer.size() == 4) { // �迭�� ũ������
					int cnt = 0; // ��������� �� ��ŭ ī��Ʈ �ʱ�ȭ
					for (int i = 0; i < ans.answer.size(); i++) {
						// �����߰��� ���� ��ŭ ���ؼ� �Ʒ� ��� ��ġ�ϸ� money �߰�
						// �߰��� ���� ���� �������� if-else�� &&�� ���� ó��
						switch (ans.answer.get(i)) {
						case "�ҽ�":
							cnt++;
							break;
						case "ġ��":
							cnt++;
							break;
						case "���۷δ�":
							cnt++;
							break;
						case "����":
							cnt++;
							break;
						}
						if (cnt == ans.answer.size()) { // ��������� �� ��ŭ ī��Ʈ
							money += 20500; // ���̸� ���⿡ ���ϱ�
							awReactionCheck = 1;
						}
					}
				}
			} // 54~56 end

			if (57 <= nowLevel && nowLevel <= 58) { // ���� array Random �Ҵ�Ǵ� ���� ���� nowLevel�� �� �Ҵ�
				if (ans.answer.size() == 4) { // �迭�� ũ������
					int cnt = 0; // ��������� �� ��ŭ ī��Ʈ �ʱ�ȭ
					for (int i = 0; i < ans.answer.size(); i++) {
						// �����߰��� ���� ��ŭ ���ؼ� �Ʒ� ��� ��ġ�ϸ� money �߰�
						// �߰��� ���� ���� �������� if-else�� &&�� ���� ó��
						switch (ans.answer.get(i)) {
						case "�ҽ�":
							cnt++;
							break;
						case "ġ��":
							cnt++;
							break;
						case "�Ǹ�":
							cnt++;
							break;
						case "����":
							cnt++;
							break;
						}
						if (cnt == ans.answer.size()) { // ��������� �� ��ŭ ī��Ʈ
							money += 20500; // ���̸� ���⿡ ���ϱ�
							awReactionCheck = 1;
						}
					}
				}
			} // 57~58 end

			if (59 <= nowLevel && nowLevel <= 60) { // ���� array Random �Ҵ�Ǵ� ���� ���� nowLevel�� �� �Ҵ�
				if (ans.answer.size() == 4) { // �迭�� ũ������
					int cnt = 0; // ��������� �� ��ŭ ī��Ʈ �ʱ�ȭ
					for (int i = 0; i < ans.answer.size(); i++) {
						// �����߰��� ���� ��ŭ ���ؼ� �Ʒ� ��� ��ġ�ϸ� money �߰�
						// �߰��� ���� ���� �������� if-else�� &&�� ���� ó��
						switch (ans.answer.get(i)) {
						case "�ҽ�":
							cnt++;
							break;
						case "ġ��":
							cnt++;
							break;
						case "�ҽ���":
							cnt++;
							break;
						case "����":
							cnt++;
							break;
						}
						if (cnt == ans.answer.size()) { // ��������� �� ��ŭ ī��Ʈ
							money += 21000; // ���̸� ���⿡ ���ϱ�
							awReactionCheck = 1;
						}
					}
				}
			} // 59~60 end

			if (nowLevel == 61) { // ���� array Random �Ҵ�Ǵ� ���� ���� nowLevel�� �� �Ҵ�
				if (ans.answer.size() == 6) { // �迭�� ũ������
					int cnt = 0; // ��������� �� ��ŭ ī��Ʈ �ʱ�ȭ
					for (int i = 0; i < ans.answer.size(); i++) {
						// �����߰��� ���� ��ŭ ���ؼ� �Ʒ� ��� ��ġ�ϸ� money �߰�
						// �߰��� ���� ���� �������� if-else�� &&�� ���� ó��
						switch (ans.answer.get(i)) {
						case "�ҽ�":
							cnt++;
							break;
						case "ġ��":
							cnt++;
							break;
						case "���۷δ�":
							cnt++;
							break;
						case "�Ǹ�":
							cnt++;
							break;
						case "�ҽ���":
							cnt++;
							break;
						case "����":
							cnt++;
							break;
						}
						if (cnt == ans.answer.size()) { // ��������� �� ��ŭ ī��Ʈ
							money += 33000; // ���̸� ���⿡ ���ϱ�
							awReactionCheck = 1;
						}
					}
				}
			} // 61 end

		} // level == 5 end
	}

	public void levels() {
		//awReactionCheck = 0;
		Level1();
		Level2();
		Level3();
		Level4();
		Level5();
	}

}
