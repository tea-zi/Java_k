package K2_생성자_기본이론;

class Test05 {

	// 생성자에 예외처리를 해놓으면 객체생성(new) 할때 try()catch() 를 반드시 해줘야한다.
	Test05() throws Exception {

	}
}

public class 생성자_기본이론5 {
	public static void main(String[] args) {
		// Test05 t5 = new Test05(); // 에러발생

		try {
			Test05 t6 = new Test05();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}