package K3_캡슐화_프로젝트2_학생관리_과제;

import java.util.Scanner;

public class Controller {
	private Scanner scan;
	private StudentDAO studentDAO;
	private SubjectDAO subjectDAO;

	public Controller() {
		scan = new Scanner(System.in);
		studentDAO = new StudentDAO();
		subjectDAO = new SubjectDAO();
	}

	public void mainMenu() {
		while (true) {
			System.out.println("1)학생추가");
			System.out.println("2)학생삭제");
			System.out.println("3)과목추가");
			System.out.println("4)과목삭제");
			System.out.println("5)전체출력");
			System.out.println("8)저장");
			System.out.println("9)로드");
			System.out.println("0)종료");
			int sel = scan.nextInt();
			if (sel == 1) { // 학생추가
				studentDAO.add();
			} else if (sel == 2) { // 학생삭제
				studentDAO.remove(subjectDAO);
			} else if (sel == 3) { // 과목추가
				subjectDAO.insert(studentDAO);
			} else if (sel == 4) { // 과목삭제
				subjectDAO.remove(studentDAO);
			} else if (sel == 5) { // 전체출력
				studentDAO.printStudent(subjectDAO);
			} else if (sel == 8) { // 저장

			} else if (sel == 9) { // 로드

			} else if (sel == 0) { // 종료
				break;
			}
		}
	}
}
