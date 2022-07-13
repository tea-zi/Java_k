package K1_콜렉션벡터_알고리즘;

import java.util.Random;
import java.util.Vector;

class RanNum {
	int num;
	boolean check;

	void printRanNum() {
		System.out.println(num);
	}
}

public class 콜렉션벡터_알고리즘_중복숫자금지 {
	public static void main(String[] args) {
		Random ran = new Random();

		Vector<RanNum> ranList = new Vector<RanNum>();

		for (int i = 0; i < 5; i++) {
			RanNum ranNum = new RanNum();
			ranList.add(ranNum);
		}

		for (int i = 0; i < 5;) {
			int r = ran.nextInt(5);
			if (ranList.get(i).check == false) {
				ranList.get(i).num = r;
				ranList.get(i).check = true;
				i++;
			}
		}

		for (int i = 0; i < ranList.size(); i++) {
			ranList.get(i).printRanNum();
		}
	}
}
