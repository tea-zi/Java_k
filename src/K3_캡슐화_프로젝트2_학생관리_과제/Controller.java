package K3_ĸ��ȭ_������Ʈ2_�л�����_����;

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
			System.out.println("1)�л��߰�");
			System.out.println("2)�л�����");
			System.out.println("3)�����߰�");
			System.out.println("4)�������");
			System.out.println("5)��ü���");
			System.out.println("8)����");
			System.out.println("9)�ε�");
			System.out.println("0)����");
			int sel = scan.nextInt();
			if (sel == 1) { // �л��߰�
				studentDAO.add();
			} else if (sel == 2) { // �л�����
				studentDAO.remove(subjectDAO);
			} else if (sel == 3) { // �����߰�
				subjectDAO.insert(studentDAO);
			} else if (sel == 4) { // �������
				subjectDAO.remove(studentDAO);
			} else if (sel == 5) { // ��ü���
				studentDAO.printStudent(subjectDAO);
			} else if (sel == 8) { // ����

			} else if (sel == 9) { // �ε�

			} else if (sel == 0) { // ����
				break;
			}
		}
	}
}
