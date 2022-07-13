package K3_캡슐화_프로젝트1_멤버관리;

import java.util.Scanner;
import java.util.Vector;

public 

class MemberDAO{
	private Scanner scan;
	private int num;
	private Vector<Member> memberList;
	
	public MemberDAO(){
		scan = new Scanner(System.in);
		num = 1000;
		memberList = new Vector<>();
	}
	
	public int checkId(String id) {
		for(int i = 0; i < memberList.size(); i++) {
			if(memberList.get(i).getId().equals(id)) {
				return i;
			}
		}
		return -1;
	}
	public int getNextNum() {
		num += 1;
		return num;
	}
	
	public void addMember(Member member) {	
		
		memberList.add(member);
		System.out.println("추가완료.");
		
	}	
	public void removeMember(int removeIndex) {
		memberList.remove(removeIndex);
		System.out.println("삭제완료.");
	}
	public void printMember() {
		for(int i = 0; i < memberList.size(); i++) {
			memberList.get(i).printMember();
		}
	}
	public int getSize() {
		return memberList.size();
	}
	public void join() {
		System.out.println("아이디 입력 : ");
		String id = scan.next();

		if (checkId(id) == -1) {
			Member member = new Member();
			member.setId(id);
			member.setNum(getNextNum());
			addMember(member);
		} else {
			System.out.println("중복아이디.");
		}
	}
	public void remove() {
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
}