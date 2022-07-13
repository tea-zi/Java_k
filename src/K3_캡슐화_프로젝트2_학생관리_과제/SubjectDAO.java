package K3_캡슐화_프로젝트2_학생관리_과제;

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
		System.out.println("과목 추가완료");
	}

	public void removeSubject(int index) {
		subjectList.remove(index);
		System.out.println("과목 삭제완료");
	}

	public void insert(StudentDAO studentDAO) {
		System.out.print("아이디 입력 : ");
		String id = scan.next();
		int index = studentDAO.checkId(id);
		if (index == -1) {
			System.out.println("아이디가 존재하지 않습니다.");
		} else {
			int studentNum = studentDAO.getStudentList(index).getNum();
			System.out.print("[과목추가] 과목 입력 : ");
			String subject = scan.next();
			int idx = checkSubject(studentNum, subject);
			if (idx == -1) {
				System.out.print("점수 입력 : ");
				int score = scan.nextInt();
				Subject sub = new Subject();
				sub.setNum(studentNum);
				sub.setSubject(subject);
				sub.setScore(score);
				addSubject(sub);
			} else {
				System.out.println("중복된 과목입니다.");
			}
		}
	}

	public void remove(StudentDAO studentDAO) {
		System.out.print("[과목삭제] 아이디 입력 : ");
		String id = scan.next();
		int index = studentDAO.checkId(id);
		if (index == -1) {
			System.out.println("아이디가 존재하지 않습니다.");
		} else {
			int studentNum = studentDAO.getStudentList(index).getNum();
			System.out.println("과목 입력 : ");
			String subject = scan.next();
			int idx = checkSubject(studentNum, subject);
			if (idx == -1) {
				System.out.println("없는 과목입니다.");
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
