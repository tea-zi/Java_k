package K4_스태틱_프로젝트1_학생관리_과제;

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
		System.out.print("[과목추가] 아이디 입력 : ");
		String id = scan.next();
		int index = StudentDAO.checkId(id);
		if (index == -1) {
			System.out.println("아이디가 존재하지 않습니다.");
		} else {
			Student student = StudentDAO.getStudent(index);
			System.out.print("과목 입력 : ");
			String subject = scan.next();
			int idx = checkSubject(student.getNum(), subject);
			if (idx == -1) {
				System.out.print("점수 입력 : ");
				int score = scan.nextInt();
				Subject sub = new Subject();
				sub.setNum(student.getNum());
				sub.setSubject(subject);
				sub.setScore(score);

				subjectList.add(sub);
				System.out.println("[과목등록]");
			} else {
				System.out.println("과목이 등록되어 있습니다.");
			}
		}
	}

	static public void remove() {
		System.out.print("[과목삭제] 아이디 입력 : ");
		String id = scan.next();
		int index = StudentDAO.checkId(id);
		if (index == -1) {
			System.out.println("아이디가 존재하지 않습니다.");
		} else {
			Student student = StudentDAO.getStudent(index);
			System.out.print("과목 입력 : ");
			String subject = scan.next();
			int idx = checkSubject(student.getNum(), subject);
			if (idx == -1) {
				System.out.println("과목정보가 없습니다.");
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
