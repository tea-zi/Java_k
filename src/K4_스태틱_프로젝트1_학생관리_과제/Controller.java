package K4_����ƽ_������Ʈ1_�л�����_����;

import java.util.Scanner;

public class Controller {
	Scanner scan = new Scanner(System.in);

	public Controller() {
		mainMenu();
	}

	public void mainMenu() {
		while (true) {
			System.out.println("[1.�л��߰�][2.�л�����][3.�����߰�][4.�������]\n[5.��ü���][8.����][9.�ε�][0.����]");
			int sel = scan.nextInt();
			if (sel == 1) { // �л��߰�
				StudentDAO.add();
			} else if (sel == 2) { // �л�����
				StudentDAO.remove();
			} else if (sel == 3) { // �����߰�
				SubjectDAO.add();
			} else if (sel == 4) { // �������
				SubjectDAO.remove();
			} else if (sel == 5) {
				StudentDAO.printStudent();
			} else if (sel == 0) { // ����
				System.out.println("[����]");
				break;
			}
		}
	}
}
