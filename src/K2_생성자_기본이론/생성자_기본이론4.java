package K2_생성자_기본이론;

class Test04 {
	int a;

	// Test04(){}
	Test04(int value) {
		a = value;
	}
}

public class 생성자_기본이론4 {
	public static void main(String[] args) {

		// 생성자 오버로딩을 활용할때 , 기본생성자를 만들지않으면
		// 값을 넣지 않은채로 new(객체생성) 를 할수없다.
		// Test04 t4 = new Test04();
		Test04 t5 = new Test04(10); // 기본생성자가 없으면 반드시 값을 넣어야한다.
	}
}