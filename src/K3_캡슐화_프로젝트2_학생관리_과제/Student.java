package K3_ĸ��ȭ_������Ʈ2_�л�����_����;

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
