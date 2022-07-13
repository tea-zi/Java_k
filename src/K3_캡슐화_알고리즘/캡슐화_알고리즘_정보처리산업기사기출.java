package K3_캡슐화_알고리즘;

import java.util.Vector;

class Member1 {
	private int custno; // 회원번호
	private String custname; // 회원성명
	private String phone; // 회원전화
	private String address; // 통신사
	private String joindate; // 가입일자
	private String grade; // 고객등급
	private String city; // 거주도시

	public Member1(int custno, String custname, String phone, String address, String joindate, String grade,
			String city) {
		this.custno = custno;
		this.custname = custname;
		this.phone = phone;
		this.address = address;
		this.joindate = joindate;
		this.grade = grade;
		this.city = city;
	}

	public int getCustno() {
		return custno;
	}

	public String getCustName() {
		return custname;
	}
}

class Money {
	private int custno; // 회원번호
	private int saleno; // 판매번호
	private int pcost; // 단가
	private int amount; // 수량
	private int price; // 가격(매출)
	private String pcode; // 상품코드
	private String sdate; // 판매일자

	public Money() {

	}

	public Money(int custno, int saleno, int pcost, int amount, int price, String pcode, String sdate) {
		this.custno = custno;
		this.saleno = saleno;
		this.pcost = pcost;
		this.amount = amount;
		this.price = price;
		this.pcode = pcode;
		this.sdate = sdate;
	}

	public int getCustno() {
		return custno;
	}

	public int getPrice() {
		return price;
	}
}

class Manager {
	private Vector<Member1> memberList = new Vector<Member1>();
	private Vector<Money> moneyList = new Vector<Money>();

	public void init() {
		memberList.add(new Member1(100001, "김행복", "010-1111-2222", "SK", "20151202", "A", "01"));
		memberList.add(new Member1(100002, "이축복", "010-1111-3333", "SK", "20151206", "B", "01"));
		memberList.add(new Member1(100003, "장믿음", "010-1111-4444", "SK", "20151001", "B", "30"));
		memberList.add(new Member1(100004, "최사랑", "010-1111-5555", "SK", "20151113", "A", "30"));
		memberList.add(new Member1(100005, "진평화", "010-1111-6666", "SK", "20151225", "B", "60"));
		memberList.add(new Member1(100006, "차공단", "010-1111-7777", "SK", "20151211", "C", "60"));

		moneyList.add(new Money(100001, 20160001, 500, 5, 2500, "A001", "20160101"));
		moneyList.add(new Money(100001, 20160002, 1000, 4, 4000, "A002", "20160101"));
		moneyList.add(new Money(100001, 20160003, 500, 3, 1500, "A008", "20160101"));
		moneyList.add(new Money(100002, 20160004, 2000, 1, 2000, "A004", "20160102"));
		moneyList.add(new Money(100002, 20160005, 500, 1, 500, "A001", "20160103"));
		moneyList.add(new Money(100003, 20160006, 1500, 2, 3000, "A003", "20160103"));
		moneyList.add(new Money(100004, 20160007, 500, 2, 1000, "A001", "20160104"));
		moneyList.add(new Money(100004, 20160008, 300, 1, 300, "A005", "20160104"));
		moneyList.add(new Money(100004, 20160009, 600, 1, 600, "A006", "20160104"));
		moneyList.add(new Money(100004, 20160010, 3000, 1, 3000, "A007", "20160106"));
	}

	public void descendingOrder() {
		int total[] = totalPrice();
		int rank[] = new int[total.length];
		for (int i = 0; i < total.length; i++) {
			if (total[i] != 0) {
				rank[i] = 1;
				for (int j = 0; j < total.length; j++) {
					if (total[i] < total[j]) {
						rank[i]++;
					}
				}
			}
			System.out.println(rank[i]);
		}

		int cnt = 1;
		int i = 0;
		while (true) {
			if (i >= memberList.size()) {
				break;
			}
			int num = memberList.get(i).getCustno();
			String name = memberList.get(i).getCustName();
			if (rank[i] == cnt) {
				System.out.println(num + "  " + name + "  " + total[i]);
				System.out.println("----------------------------------");
				cnt++;
				i = 0;
			}
			i++;
		}
	}

	public int[] totalPrice() {
		int total[] = new int[memberList.size()];
		for (int i = 0; i < memberList.size(); i++) {
			int custNo = memberList.get(i).getCustno();
			for (int j = 0; j < moneyList.size(); j++) {
				int custno = moneyList.get(j).getCustno();
				if (custNo == custno) {
					total[i] += moneyList.get(j).getPrice();
				}
			}
			System.out.println(total[i]);
		}
		return total;
	}
}

public class 캡슐화_알고리즘_정보처리산업기사기출 {
	public static void main(String[] args) {
		Manager mg = new Manager();
		mg.init();

//		   [문제] 아 래와 같이 출력  매출(price) 의 합계 + 내림차순 
//		  
//			100001	김행복		8000
//			--------------------------------
//			100004	최사랑		4900
//			--------------------------------
//			100003	장믿음		3000
//			--------------------------------
//			100002	이축복		2500
//			--------------------------------
		mg.descendingOrder();

	}
}