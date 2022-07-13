package K2_생성자_기본이론;

import java.util.Vector;

class Member {
	int number;
	String name;

	void init(int number, String name) {
		this.number = number;
		this.name = name;
	}

	Member() {

	}

	Member(int number, String name) {
		this.name = name;
		this.number = number;
	}
}

class MemberDAO {
	Vector<Member> memberList = new Vector<Member>();

	void memberInsert(Member member) {
		memberList.add(member);
	}

	void printMemberList() {
		System.out.println("-----------------------------");
		for (int i = 0; i < memberList.size(); i++) {
			System.out.println(memberList.get(i).number);
		}
		System.out.println("-----------------------------");
	}
}

public class 생성자_기본이론0 {
	public static void main(String[] args) {

		MemberDAO dao = new MemberDAO();
		for (int i = 0; i < 10; i++) {
			Member member = new Member();
			member.init(1000 + i, "aaaa" + i);
			dao.memberInsert(member);
		}
		dao.printMemberList();

		dao = new MemberDAO();
		for (int i = 0; i < 10; i++) {
			Member member = new Member(1000 + i, "bbbb" + i);
			dao.memberInsert(member);
		}
		dao.printMemberList();
	}
}