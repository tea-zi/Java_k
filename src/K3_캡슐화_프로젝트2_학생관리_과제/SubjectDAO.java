package K3_ĸ��ȭ_������Ʈ2_�л�����_����;

import java.util.Scanner;
import java.util.Vector;

public class SubjectDAO {
	private Vector<Subject> subjectList;
	private Scanner scan;

	public SubjectDAO() {
		subjectList = new Vector<Subject>();
		scan = new Scanner(System.in);
	}

	public int checkSubject(int studentNum, String subject) {
		for (int i = 0; i < subjectList.size(); i++) {
			Subject sub = subjectList.get(i);
			if (sub.getNum() == studentNum && sub.getSubject().equals(subject)) {
				return i;
			}
		}
		return -1;
	}

	public void addSubject(Subject subject) {
		subjectList.add(subject);
		System.out.println("���� �߰��Ϸ�");
	}

	public void removeSubject(int index) {
		subjectList.remove(index);
		System.out.println("���� �����Ϸ�");
	}

	public void insert(StudentDAO studentDAO) {
		System.out.print("���̵� �Է� : ");
		String id = scan.next();
		int index = studentDAO.checkId(id);
		if (index == -1) {
			System.out.println("���̵� �������� �ʽ��ϴ�.");
		} else {
			int studentNum = studentDAO.getStudentList(index).getNum();
			System.out.print("[�����߰�] ���� �Է� : ");
			String subject = scan.next();
			int idx = checkSubject(studentNum, subject);
			if (idx == -1) {
				System.out.print("���� �Է� : ");
				int score = scan.nextInt();
				Subject sub = new Subject();
				sub.setNum(studentNum);
				sub.setSubject(subject);
				sub.setScore(score);
				addSubject(sub);
			} else {
				System.out.println("�ߺ��� �����Դϴ�.");
			}
		}
	}

	public void remove(StudentDAO studentDAO) {
		System.out.print("[�������] ���̵� �Է� : ");
		String id = scan.next();
		int index = studentDAO.checkId(id);
		if (index == -1) {
			System.out.println("���̵� �������� �ʽ��ϴ�.");
		} else {
			int studentNum = studentDAO.getStudentList(index).getNum();
			System.out.println("���� �Է� : ");
			String subject = scan.next();
			int idx = checkSubject(studentNum, subject);
			if (idx == -1) {
				System.out.println("���� �����Դϴ�.");
			} else {
				removeSubject(idx);
			}
		}
	}

	public void printSubject(int studentNum) {
		for (int i = 0; i < subjectList.size(); i++) {
			int num = subjectList.get(i).getNum();
			if (studentNum == num) {
				subjectList.get(i).printSubject();
			}
		}
	}

	public int getSize() {
		return subjectList.size();
	}

	public Subject getSubject(int index) {
		return subjectList.get(index);
	}
}
