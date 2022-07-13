package K4_����ƽ_������Ʈ1_�л�����_����;

import java.util.Scanner;
import java.util.Vector;

public class SubjectDAO {
	static private Vector<Subject> subjectList = new Vector<Subject>();
	static private Scanner scan = new Scanner(System.in);

	static public int checkSubject(int Num, String subject) {
		for (int i = 0; i < subjectList.size(); i++) {
			Subject sub = subjectList.get(i);
			if (sub.getNum() == Num && sub.getSubject().equals(subject)) {
				return i;
			}
		}
		return -1;
	}

	static public void add() {
		System.out.print("[�����߰�] ���̵� �Է� : ");
		String id = scan.next();
		int index = StudentDAO.checkId(id);
		if (index == -1) {
			System.out.println("���̵� �������� �ʽ��ϴ�.");
		} else {
			Student student = StudentDAO.getStudent(index);
			System.out.print("���� �Է� : ");
			String subject = scan.next();
			int idx = checkSubject(student.getNum(), subject);
			if (idx == -1) {
				System.out.print("���� �Է� : ");
				int score = scan.nextInt();
				Subject sub = new Subject();
				sub.setNum(student.getNum());
				sub.setSubject(subject);
				sub.setScore(score);

				subjectList.add(sub);
				System.out.println("[������]");
			} else {
				System.out.println("������ ��ϵǾ� �ֽ��ϴ�.");
			}
		}
	}

	static public void remove() {
		System.out.print("[�������] ���̵� �Է� : ");
		String id = scan.next();
		int index = StudentDAO.checkId(id);
		if (index == -1) {
			System.out.println("���̵� �������� �ʽ��ϴ�.");
		} else {
			Student student = StudentDAO.getStudent(index);
			System.out.print("���� �Է� : ");
			String subject = scan.next();
			int idx = checkSubject(student.getNum(), subject);
			if (idx == -1) {
				System.out.println("���������� �����ϴ�.");
			} else {
				subjectList.remove(idx);
			}
		}
	}

	static public void remove(int Num) {
		for (int i = 0; i < subjectList.size(); i++) {
			Subject subject = subjectList.get(i);
			if (subject.getNum() == Num) {
				subjectList.remove(i);
			}
		}
	}

	static public void printSubject(int Num) {
		System.out.println("--------------------");
		for (int i = 0; i < subjectList.size(); i++) {
			Subject subject = subjectList.get(i);
			if (Num == subject.getNum()) {
				System.out.println(subject.getSubject() + " : " + subject.getScore());
			}
		}
	}
}
