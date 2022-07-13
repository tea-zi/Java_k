package K3_ĸ��ȭ_������Ʈ1_�������;

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
		System.out.println("�߰��Ϸ�.");
		
	}	
	public void removeMember(int removeIndex) {
		memberList.remove(removeIndex);
		System.out.println("�����Ϸ�.");
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
		System.out.println("���̵� �Է� : ");
		String id = scan.next();

		if (checkId(id) == -1) {
			Member member = new Member();
			member.setId(id);
			member.setNum(getNextNum());
			addMember(member);
		} else {
			System.out.println("�ߺ����̵�.");
		}
	}
	public void remove() {
		if (getSize() == 0) {
			System.out.println("������ �����Ͱ� �����ϴ�.");
			return;
		}
		System.out.println("���̵� �Է� : ");
		String id = scan.next();
		int index = checkId(id);
		if (index == -1) {
			System.out.println("������ ���̵� �����ϴ�.");
		} else {
			removeMember(index);
		}
	}
}