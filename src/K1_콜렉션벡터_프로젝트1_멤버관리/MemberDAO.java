package K1_콜렉션벡터_프로젝트1_멤버관리;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;
import java.util.Vector;

public class MemberDAO {
	Scanner scan;
	int num;
	String fileName = "src/K1_콜렉션벡터_프로젝트2_멤버관리/MemberDAO";
	Vector<Member> memberList;

	void init() {
		scan = new Scanner(System.in);
		num = 1000;
		memberList = new Vector<>();
	}

	int checkId(String id) {
		for (int i = 0; i < memberList.size(); i++) {
			if (memberList.get(i).id.equals(id)) {
				return i;
			}
		}
		return -1;
	}

	int getNextNum() {
		num += 1;
		return num;
	}

	void addMember(Member member) {

		memberList.add(member);
		System.out.println("추가완료.");

	}

	void removeMember(int removeIndex) {
		memberList.remove(removeIndex);
		System.out.println("삭제완료.");
	}

	void printMember() {
		for (int i = 0; i < memberList.size(); i++) {
			memberList.get(i).printMember();
		}
	}

	int getSize() {
		return memberList.size();
	}

	void join() {
		System.out.println("아이디 입력 : ");
		String id = scan.next();

		if (checkId(id) == -1) {
			Member member = new Member();
			member.id = id;
			member.num = getNextNum();
			addMember(member);
		} else {
			System.out.println("중복아이디.");
		}
	}

	void remove() {
		if (getSize() == 0) {
			System.out.println("삭제할 데이터가 없습니다.");
			return;
		}
		System.out.println("아이디 입력 : ");
		String id = scan.next();
		int index = checkId(id);
		if (index == -1) {
			System.out.println("삭제할 아이디가 없습니다.");
		} else {
			removeMember(index);
		}
	}

	void save() {
		String data = "";
		for (int i = 0; i < memberList.size(); i++) {
			data += memberList.get(i).num;
			data += ",";
			data += memberList.get(i).id;
			data += "\n";
		}
		data = data.substring(0, data.length() - 1);
		try {
			FileWriter fw = new FileWriter(fileName);
			fw.write(data);
			fw.close();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	void load() {
		String data = "";
		try {
			FileReader fr = new FileReader(fileName);
			while (true) {
				int read = fr.read();
				if (read != -1) {
					data += (char) read;
				} else {
					break;
				}
			}
			fr.close();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		String[] token = data.split("\n");

		for (int i = 0; i < token.length; i++) {
			String[] token2 = token[i].split(",");
			Member member = new Member();
			member.id = token2[1];
			member.num = Integer.parseInt(token2[0]);
			addMember(member);
		}
	}
}
