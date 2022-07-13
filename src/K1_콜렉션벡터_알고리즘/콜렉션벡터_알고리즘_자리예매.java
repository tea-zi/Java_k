package K1_콜렉션벡터_알고리즘;

import java.util.Scanner;
import java.util.Vector;

class Seat {
	int num;
	boolean check;
}

public class 콜렉션벡터_알고리즘_자리예매 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Vector<Seat> seatList = new Vector<Seat>();

		for (int i = 0; i < 10; i++) {
			Seat seat = new Seat();
			seat.check = false;
			seat.num = i;
			seatList.add(seat);
		}

		while (true) {
			for (int i = 0; i < seatList.size(); i++) {
				if (seatList.get(i).check == false) {
					System.out.print("[ ]");
				} else {
					System.out.print("[X]");
				}
			}
			System.out.println();
			System.out.println("[1. 예매][0. 종료]");
			int sel = scan.nextInt();
			if (sel == 1) {
				System.out.print("번호를 선택 : ");
				int num = scan.nextInt();
				if (num < 0 || num > seatList.size()) {
					System.out.println("선택이 불가능합니다.");
					continue;
				}
				if (seatList.get(num).check == false) {
					seatList.get(num).check = true;
					System.out.println(num + "번 좌석 [예매완료]");
				} else {
					System.out.println("예매가 완료된 좌석입니다.");
				}
			} else if (sel == 0) {
				break;
			}
		}
	}
}
