package K3_ĸ��ȭ_������Ʈ2_�л�����_����;

public class Subject {
	private int studentNum;
	private String subject;
	private int score;

	public void printSubject() {
		System.out.println("name : " + subject + " score : " + score);
	}

	public int getNum() {
		return studentNum;
	}

	public String getSubject() {
		return subject;
	}

	public int getScore() {
		return score;
	}

	public void setNum(int num) {
		this.studentNum = num;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public void setScore(int score) {
		this.score = score;
	}
}
