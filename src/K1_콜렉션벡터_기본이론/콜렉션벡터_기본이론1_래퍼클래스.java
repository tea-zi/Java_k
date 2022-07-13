package K1_콜렉션벡터_기본이론;
/*
* # 래퍼 클래스(wrapper class)
* - 래퍼 클래스란, 기본 자료형을 클래스로 만들어 놓은 것을 의미한다.
* [기본형]          [래퍼 클래스]
* byte             Byte
* short            Short
* int              Integer
* long             Long
* float            Float
* double           Double
* char             Character
* boolean          Boolean
*/

public class 콜렉션벡터_기본이론1_래퍼클래스 {
	public static void main(String[] args) {
		int i1 = 10;
		Integer i2 = Integer.valueOf(10);
		System.out.println(i1);
		System.out.println(i2);

		float f1 = 10.1f;
		Float f2 = Float.valueOf(10.1f);
		System.out.println(f1);
		System.out.println(f2);

		double d1 = 10.11;
		Double d2 = Double.valueOf(10.11);
		System.out.println(d1);
		System.out.println(d2);

		char ch1 = 'a';
		Character ch2 = Character.valueOf('a');
		System.out.println(ch1);
		System.out.println(ch2);

		long l1 = 1000000000000000l;
		Long l2 = Long.valueOf(1000000000000000l);
		System.out.println(l1);
		System.out.println(l2);

		boolean b1 = false;
		Boolean b2 = Boolean.valueOf(true);
		System.out.println(b1);
		System.out.println(b2);

	}
}