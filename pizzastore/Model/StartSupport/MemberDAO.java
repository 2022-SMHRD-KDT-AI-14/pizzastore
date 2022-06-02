package StartSupport;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import Story.Day1_Question;

public class MemberDAO extends StartingSub {
	int cnt;
	MemberDTO dto = new MemberDTO(null, null);
	Connection conn;
	PreparedStatement psmt;
	ResultSet rs; // Query�� ������� �޾ƿ��� ��ü

	public void select() {

		// ���� ó�� �ϴ� ����
		// 1) ����ڰ�(Ȥ�� �����ڰ�) �߻���ų �� �ִ�
		// ���� ��Ȳ �߻� ��
		// �� �̿��� �ڵ���� �����Ѱ� �����ϱ� ���ؼ�
		// 2) compile���� �߻��ϴ� ����

		// 1. �����ε�
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("����̹� �ε� ����");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		// 2. DB ����
		String url = "jdbc:oracle:thin:@project-db-stu.ddns.net:1524:xe";
		String db_id = "campus_e_0516_5";
		String db_pw = "smhrd5";

		try {
			conn = DriverManager.getConnection(url, db_id, db_pw);

			if (conn != null) {
				System.out.println("DB ���� ����");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// 3. SQL�� ����
		String sql = "select * from member";
		try {
			psmt = conn.prepareStatement(sql);
			rs = psmt.executeQuery();

			System.out.print("ID" + "\t");
			System.out.print("PW" + "\t");
			System.out.println("NAME");

			while (rs.next()) {
				String id = rs.getString(1);
				String pw = rs.getString(2);
				String name = rs.getString(3);
				System.out.print(id + "\t");
				System.out.print(pw + "\t");
				System.out.println(name);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			// 4. ��������
			try {
				if (rs != null) {
					rs.close();
				}
				if (psmt != null) {
					psmt.close();
				}
				if (conn != null) {
					conn.close();
				}

			} catch (SQLException e) {
				e.printStackTrace();
			}

		}

		System.out.println("Hello World");
	}

	public void selectName(String id) {
		// 1. �����ε�

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("����̺� ���� ����");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		// 2. DB ����

		String url = "jdbc:oracle:thin:@project-db-stu.ddns.net:1524:xe";
		String db_id = "campus_e_0516_5";
		String db_pw = "smhrd5";

		try {
			conn = DriverManager.getConnection(url, db_id, db_pw);
			if (conn != null) {
				System.out.println("DB ���� ����");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		// 3. SQL�� ����
		String sql = "select NAME from member where id = ?";

		try {
			psmt = conn.prepareStatement(sql);
			// ?�� �ݵ�� excute���� ������ �Ǿ���Ѵ�
			psmt.setString(1, id);
			rs = psmt.executeQuery();

			if (rs.next()) {
				String name = rs.getString(1);
				System.out.println(id + "�� �ش��ϴ� �̸���" + name + "�Դϴ�");
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null) {
					rs.close();
				}
				if (psmt != null) {
					rs.close();
				}
				if (conn != null) {
					rs.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		// 4. ��������

		System.out.println("�赿��");

	}

	public void login(MemberDTO dto) {
		// 1. �����ε�

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
//			System.out.println("����̺� ���� ����");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		// 2. DB ����

		String url = "jdbc:oracle:thin:@project-db-stu.ddns.net:1524:xe";
		String db_id = "campus_e_0516_5";
		String db_pw = "smhrd5";

		try {
			conn = DriverManager.getConnection(url, db_id, db_pw);
			if (conn != null) {
//				System.out.println("DB ���� ����");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		// 3. SQL�� ����

		// member ���̺��� PW Column SELECT
		// ID�� ���� id�� ��
		// ����� pw�� ���ؼ�
		// ��ġ�ϸ� "�α��� ����"
		// ��ġ���� ������ "�α��� ����"
		String sql = "select PW from member where id = ?and pw = ?";

		try {
			psmt = conn.prepareStatement(sql);
			// ?�� �ݵ�� excute���� ������ �Ǿ���Ѵ�
			psmt.setString(1, dto.getId());
			psmt.setString(2, dto.getPw());
			rs = psmt.executeQuery();

			if (rs.next()) {

				
				System.out.println("�α��� ����");
				
				Assembly assem = new Assembly();
				Day1_Question dayList = new Day1_Question();
				dayList.day1Quest();
				assem.manual();
				assem.Game(dto);
				
				
			} else {
				System.out.println("�α��� ����");
				StartSelectNumber ssn = new StartSelectNumber();
				ssn.numberOf1();
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null) {
					rs.close();
				}
				if (psmt != null) {
					rs.close();
				}
				if (conn != null) {
					rs.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		// 4. ��������

//		System.out.println("�����");

	}

	public int insert(MemberDTO dto) {
		// 1. ���� �ε�
		// 1-1. ojdbc6.jar ���� �߰�!!
		// ���� �ε��� Class File ã��!!
		int cnt = 0;
		Connection conn = null;
		PreparedStatement psmt = null;

		try {
			// ������(compile) ���Ŀ� �� �� �ִ� �����鿡 ���ؼ���
			// ����ó���� ����� �Ѵ�
			Class.forName("oracle.jdbc.driver.OracleDriver");
//			System.out.println("����̹� �ε� ����");

			// 2. DB ����
			// 1) url 2) db_id 3) db_pw
			String url = "jdbc:oracle:thin:@project-db-stu.ddns.net:1524:xe";
			String db_id = "campus_e_0516_5";
			String db_pw = "smhrd5";

			conn = DriverManager.getConnection(url, db_id, db_pw);
			// !conn.isClosed()
			if (conn != null) {
//				System.out.println("���� ����");
			}

			// 3. SQL�� ����
			String id = dto.getId();
			String pw = dto.getPw();
			String name = dto.getName();
			int money1 = dto.getMoney();

			String sql = "insert into member values(?, ?, ?, ?)";
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, id);
			psmt.setString(2, pw);
			psmt.setString(3, name);
			psmt.setInt(4, money1);

			// sql���� �����ϱ� ���� ?�� ä����
			cnt = psmt.executeUpdate();

		} catch (ClassNotFoundException e) {

			System.out.println("����̹� �ε� ����");
		} catch (SQLException e) {

			e.printStackTrace();
			System.out.println("ȸ������ ����");
		} finally {
			// 4. ���� ���� : �������� �ݴ´�!!
			// pmst �ݱ�!

			try {
				if (psmt != null) {
					psmt.close();
				}
				if (conn != null) {
					conn.close();
				}

			} catch (SQLException e) {
//				e.printStackTrace();
			}

		}
		return cnt;
	}

	public void updateMoney(int money1, String id) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		String url = "jdbc:oracle:thin:@project-db-stu.ddns.net:1524:xe";
		String db_id = "campus_e_0516_5";
		String db_pw = "smhrd5";
		try {
			conn = DriverManager.getConnection(url, db_id, db_pw);
			String sql = "update member set money = ? where id = ?";
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, money1);
			psmt.setString(2, id);
			psmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close();
		}
	}

	private void close() {
		// TODO Auto-generated method stub

	}

//	public int getMoney(String id) {
//
//		try {
//			Class.forName("oracle.jdbc.driver.OracleDriver");
//		} catch (ClassNotFoundException e) {
//			e.printStackTrace();
//		}				
//	String url = "jdbc:oracle:thin:@project-db-stu.ddns.net:1524:xe";
//	String db_id = "campus_e_0516_5";
//	String db_pw = "smhrd5";
//	try {
//		conn = DriverManager.getConnection(url, db_id, db_pw);			
//		String sql = "select id, money from member where id = ?";
//		psmt = conn.prepareStatement(sql);
//		psmt.setInt(1, money);
//		rs= psmt.executeQuery();
//		if(rs.next()) {
//			String get_id = rs.getString("ID");
//			int get_money = rs.getInt("money");
//			
//			if(get_id .equals(id)) {
//				money = get_money;
//			}
//		}
//
//	} catch(Exception e) {
//		e.printStackTrace();
//	} finally {
//		close();
//	}
//	return money;
//}
	public int rank(MemberDTO dto) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace(); // ex) sc.nextInt
		}
		String url = "jdbc:oracle:thin:@project-db-stu.ddns.net:1524:xe"; // db �ּ�
		String db_id = "campus_e_0516_5"; // db_id
		String db_pw = "smhrd5"; // db_pw
		try {
			conn = DriverManager.getConnection(url, db_id, db_pw);
			if (conn != null) {
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}


		String sql = "select rownum, ID, nickname, Money from (select ID, nickname, Money from member group by ID, nickname, money order by Money desc) where rownum<11";


		try {
			psmt = conn.prepareStatement(sql);
			rs = psmt.executeQuery();
//			System.out.printf("rank");
			System.out.printf("%-10s", "[Rank]");
			System.out.printf("%10s", "[ID]");
			System.out.printf("%25s", "[Nickname]");
			System.out.printf("%20s", "[Money]");
			System.out.println();

			while (rs.next()) {
//				String pw = rs.getString(1);
//				System.out.printf("\n" + pw);
				String rank = rs.getString(1);
				String id = rs.getString(2);
				String nickname = rs.getString(3);
				int money1 = rs.getInt(4);

				System.out.print("  " + rank);
				System.out.printf("%15s", id);
				System.out.printf("%22s", nickname);
				System.out.printf("%24d", money1);
				System.out.println();

			}
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("ĳġ1");
		} finally {
			try {
				if (rs != null) {
					rs.close();
				}
				if (psmt != null) {
					psmt.close();
				}
				if (conn != null) {
					conn.close();
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				System.out.println("ĳġ2");
			}
		}
		return cnt;
	}

	public String nickname(MemberDTO dto) {

		String result = "";
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		String url = "jdbc:oracle:thin:@project-db-stu.ddns.net:1524:xe";
		String db_id = "campus_e_0516_5";
		String db_pw = "smhrd5";

		try {
			conn = DriverManager.getConnection(url, db_id, db_pw);
			if (conn != null) {
//				System.out.println("DB ���� ����");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		String sql = "select NICKNAME from member where id =?";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, dto.getId());
			rs = psmt.executeQuery();
			while (rs.next()) {
				result = rs.getString("NICKNAME");

			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return result;
	}

}
