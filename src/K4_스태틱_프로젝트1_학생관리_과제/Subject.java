package K4_����ƽ_������Ʈ1_�л�����_����;

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

	public void setNum(int Num) {
		studentNum = Num;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public void setScore(int score) {
		this.score = score;
	}
}
