package K4_스태틱_프로젝트1_학생관리_과제;

import java.util.Scanner;

public class Controller {
	Scanner scan = new Scanner(System.in);

	public Controller() {
		mainMenu();
	}

	public void mainMenu() {
		while (true) {
			System.out.println("[1.학생추가][2.학생삭제][3.과목추가][4.과목삭제]\n[5.전체출력][8.저장][9.로드][0.종료]");
			int sel = scan.nextInt();
			if (sel == 1) { // 학생추가
				StudentDAO.add();
			} else if (sel == 2) { // 학생삭제
				StudentDAO.remove();
			} else if (sel == 3) { // 과목추가
				SubjectDAO.add();
			} else if (sel == 4) { // 과목삭제
				SubjectDAO.remove();
			} else if (sel == 5) {
				StudentDAO.printStudent();
			} else if (sel == 0) { // 종료
				System.out.println("[종료]");
				break;
			}
		}
	}
}
