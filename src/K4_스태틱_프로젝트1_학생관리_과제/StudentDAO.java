package K4_����ƽ_������Ʈ1_�л�����_����;

import java.util.Scanner;
import java.util.Vector;

public class StudentDAO {
	static private int num = 1000;
	static private Vector<Student> studentList = new Vector<Student>();
	static private Scanner scan = new Scanner(System.in);

	static public int checkId(String id) {
		for (int i = 0; i < studentList.size(); i++) {
			if (studentList.get(i).getId().equals(id)) {
				return i;
			}
		}
		return -1;
	}

	static public void add() {
		System.out.print("[�л��߰�] ���̵� �Է� : ");
		String id = scan.next();
		if (checkId(id) == -1) {
			num++;
			Student student = new Student();
			student.setId(id);
			student.setNum(num);
			studentList.add(student);
			System.out.println("[�л��߰�]");
		} else {
			System.out.println("�ߺ��� ���̵� �Դϴ�.");
		}
	}

	static public void remove() {
		System.out.print("[�л�����] ���̵� �Է� : ");
		String id = scan.next();
		int index = checkId(id);
		if (index == -1) {
			System.out.println("���̰� �������� �ʽ��ϴ�.");
		} else {
			studentList.remove(index);
			SubjectDAO.remove(studentList.get(index).getNum());
			System.out.println("[�л�����]");
		}
	}

	static public void printStudent() {
		for (int i = 0; i < studentList.size(); i++) {
			Student student = studentList.get(i);
			System.out.println("====================");
			System.out.println("[" + student.getNum() + " | " + student.getId() + "]");
			SubjectDAO.printSubject(student.getNum());
		}
	}

	static public Student getStudent(int index) {
		return studentList.get(index);
	}
}
