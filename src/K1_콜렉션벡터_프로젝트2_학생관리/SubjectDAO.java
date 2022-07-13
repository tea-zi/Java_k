package K1_�ݷ��Ǻ���_������Ʈ2_�л�����;

import java.util.Scanner;
import java.util.Vector;

public class SubjectDAO {
	Scanner scan;
	Vector<Subject> subjectList;

	void init() {
		scan = new Scanner(System.in);
		subjectList = new Vector<Subject>();
	}

	boolean checkSubject(int studentNum, String subject) {
		for (int i = 0; i < subjectList.size(); i++) {
			Subject sub = subjectList.get(i);

			if (sub.studentNum == studentNum && sub.subject.equals(subject)) {
				return true;
			}
		}

		return false;
	}

	void addSubject(Subject subject) {
		subjectList.add(subject);
	}

	Vector<Subject> getOneStudentSubjectList(int studentNum) {
		Vector<Subject> oneStudentSubjectList = new Vector<Subject>();

		for (int i = 0; i < subjectList.size(); i++) {
			if (subjectList.get(i).studentNum == studentNum) {
				oneStudentSubjectList.add(subjectList.get(i));
			}
		}

		return oneStudentSubjectList;

	}

	void printSubjectList(Subject[] subjectList) {
		for (int i = 0; i < subjectList.length; i++) {
			subjectList[i].printSubject();
		}
	}

	void insertSubject(StudentDAO studentDAO) {
		System.out.println("[�����߰�] �л� ���̵� �Է� : ");
		String id = scan.next();
		Student student = studentDAO.checkId(id);
		if (student == null) {
			System.out.println("ã�� �л��� �����ϴ�. ");
		} else {
			System.out.println("[�����߰�] ���� �̸� �Է� : ");
			String subjectName = scan.next();
			boolean check = checkSubject(student.studentNum, subjectName);
			if (check == true) {
				System.out.println("[�޼���] �ߺ� �����Դϴ�.");
			} else {
				System.out.println("[�����߰�] ���� �Է� : ");
				int score = scan.nextInt();
				Subject subject = new Subject();
				subject.score = score;
				subject.studentNum = student.studentNum;
				subject.subject = subjectName;
				addSubject(subject);
				System.out.println("�����߰� ����.");
			}
		}

	}

	void remove(StudentDAO studentDAO) {
		System.out.print("[�������] ���̵� �Է� : ");
		String id = scan.next();
		Student student = studentDAO.checkId(id);
		if (student != null) {
			System.out.print("���� �Է� : ");
			String subject = scan.next();
			removeSubject(student, subject);
		}
	}

	void removeSubject(Student student, String subject) {
		if (subject.equals("All")) {
			for (int i = 0; i < subjectList.size(); i++) {
				if (student.studentNum == subjectList.get(i).studentNum) {
					subjectList.remove(i);
				}
			}
		} else {
			for (int i = 0; i < subjectList.size(); i++) {
				if (student.studentNum == subjectList.get(i).studentNum && subject.equals(subjectList.get(i).subject)) {
					subjectList.remove(i);
				}
			}
		}
	}

}
