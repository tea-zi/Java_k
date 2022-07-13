package K4_스태틱_프로젝트1_학생관리_과제;

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
