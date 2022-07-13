package K3_캡슐화_프로젝트2_학생관리_과제;

public class Student {
	private String studentId;
	private int studentNum;

	public void printStudent() {
		System.out.println("num : " + studentNum + " id : " + studentId);
	}

	public String getId() {
		return studentId;
	}

	public int getNum() {
		return studentNum;
	}

	public void setId(String id) {
		this.studentId = id;
	}

	public void setNum(int num) {
		this.studentNum = num;
	}
}
