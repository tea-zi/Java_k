package K3_캡슐화_프로젝트1_멤버관리;

import java.util.Scanner;

public 
class Controller {
	private Scanner scan;
	private MemberDAO memberDAO;

	public Controller() {
		scan = new Scanner(System.in);
		memberDAO = new MemberDAO();
		
	}

	public void mainMenu() {
		while (true) {
			System.out.println("1.추가");
			System.out.println("2.삭제");
			System.out.println("3.전체출력");
			System.out.println("8.저장");
			System.out.println("9.로드");
			System.out.println("0.종료");
			int sel = scan.nextInt();
			if (sel == 0) {
				break;
			} else if (sel == 1) {
				memberDAO.join();
			} else if (sel == 2) {
				memberDAO.remove();
			} else if (sel == 3) {
				memberDAO.printMember();
			}
		}
	}
}
