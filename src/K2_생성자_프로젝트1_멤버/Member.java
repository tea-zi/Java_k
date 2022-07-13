package K2_생성자_프로젝트1_멤버;

public class Member {
	String id;
	int num;

	Member(String id, int num) {
		this.id = id;
		this.num = num;
	}
	
	void printMember() {
		System.out.println("num : " + num + ", id : " + id);
	}

	String getId() {
		return id;
	}

	int getNum() {
		return num;
	}

	void setId(String id) {
		this.id = id;
	}

	void setNum(int num) {
		this.num = num;
	}

}