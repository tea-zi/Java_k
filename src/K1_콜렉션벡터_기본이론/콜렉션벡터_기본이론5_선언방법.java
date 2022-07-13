package K1_콜렉션벡터_기본이론;

import java.util.Scanner;
import java.util.Vector;

public class 콜렉션벡터_기본이론5_선언방법 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		Vector<Integer> vector1 = new Vector<>();// 이렇게 <> 안에 자료형을 생략하수있으나 추천하지않음(헷갈리다)

		Vector<Integer> vector2 = new Vector<Integer>();// 이렇게 하는것이 좀더 명확하다.
	}
}