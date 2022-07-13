package K4_스태틱_기본이론;

class Product {
	static public int count;
	public String name;

	public Product() {
		count += 1;
	}
}

public class 스태틱_기본이론4 {
	public static void main(String[] args) {

		// static 활용법 (1)

		for (int i = 0; i < 10; i++) {
			Product p = new Product();
		}

		// 현재까지 생성된 Product갯수를 알수있다. (메모리 누수확인용)
		System.out.println(Product.count);

	}
}
