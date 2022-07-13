package K3_캡슐화_프로젝트2_학생관리_과제;

import java.util.Scanner;
import java.util.Vector;

public class StudentDAO {
	private int num;
	private Vector<Student> studentList;
	private Scanner scan;

	public StudentDAO() {
		scan = new Scanner(System.in);
		num = 1000;
		studentList = new Vector<Student>();
	}

	public int checkId(String id) {
		for (int i = 0; i < studentList.size(); i++) {
			String studentId = studentList.get(i).getId();
			if (studentId.equals(id)) {
				return i;
			}
		}
		return -1;
	}

	public int getNextNum() {
		num += 1;
		return num;
	}

	public void addStudent(Student student) {
		studentList.add(student);
		System.out.println("추가완료");
	}

	public void removeStudent(int index) {
		studentList.remove(index);
		System.out.println("삭제완료");
	}

	public void add() {
		System.out.print("아이디 입력 : ");
		String id = scan.next();
		if (checkId(id) == -1) {
			Student student = new Student();
			student.setId(id);
			student.setNum(getNextNum());
			addStudent(student);
		} else {
			System.out.println("중복된 아이디 입니다.");
		}
	}

	public void remove(SubjectDAO subjectDAO) {
		System.out.print("아이디 입력 : ");
		String id = scan.next();
		int index = checkId(id);
		if (index == -1) {
			System.out.println("삭제할 아이디가 없습니다.");
		} else {
			int num = studentList.get(index).getNum();
			removeStudent(index);
			for (int i = 0; i < subjectDAO.getSize(); i++) {
				int studentNum = subjectDAO.getSubject(i).getNum();
				if (num == studentNum) {
					subjectDAO.removeSubject(i);
				}
			}
		}
	}

	public void printStudent(SubjectDAO subjectDAO) {
		for (int i = 0; i < studentList.size(); i++) {
			System.out.println("=======================");
			studentList.get(i).printStudent();
			System.out.println("-----------------------");
			int num = studentList.get(i).getNum();
			subjectDAO.printSubject(num);
		}
	}

	public Student getStudentList(int index) {
		return studentList.get(index);
	}
}
