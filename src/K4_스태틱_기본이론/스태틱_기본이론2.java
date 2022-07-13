package K4_����ƽ_�⺻�̷�;

import java.util.Vector;

class StaticTest {

	static private int score; // ������ ��� ������ static ���� ����� �����Ǿ� ������.
	static private String name;

	private int score2;
	private String name2;

	static public int getScore() {
		return score;
	}

	static public void setScore(int score) {
		StaticTest.score = score;
	}

	static public String getName() {
		return name;
	}

	static public void setName(String name) {
		StaticTest.name = name;
	}

	public int getScore2() {
		return score2;
	}

	public void setScore2(int score2) {
		this.score2 = score2;
	}

	public String getName2() {
		return name2;
	}

	public void setName2(String name2) {
		this.name2 = name2;
	}

}

class StaticTestDAO {
	public Vector<StaticTest> testList = new Vector<StaticTest>();

	public void addTest(StaticTest test) {
		testList.add(test);
	}

	public void printTestList() {
		for (int i = 0; i < testList.size(); i++) { // ���� ���������� ���´�.
			System.out.print(testList.get(i).getName());
			System.out.println(" " + testList.get(i).getScore());
		}
		System.out.println("--------------------------------------------");
		for (int i = 0; i < testList.size(); i++) {
			System.out.print(testList.get(i).getName2());
			System.out.println(" " + testList.get(i).getScore2());
		}
	}
}

public class ����ƽ_�⺻�̷�2 {
	public static void main(String[] args) {
		/*
		 * [����ƽ Ȱ��� ���� ����] DAO �� static ���� ���������� ��ü�� ������ ����count �ϴ� ������ �����ϰ� ����
		 * �����̵��� ������ static���� �����ȵȴ�.
		 */
		StaticTestDAO STD = new StaticTestDAO();

		String dataName[] = { "aaa", "bbb", "ccc", "ddd" };
		int dataScore[] = { 43, 54, 12, 94 };
		for (int i = 0; i < dataName.length; i++) {
			StaticTest t = new StaticTest();
			t.setName(dataName[i]);
			t.setScore(dataScore[i]);
			t.setName2(dataName[i]);
			t.setScore2(dataScore[i]);

			STD.addTest(t);
		}
		STD.printTestList();

	}
}