package K4_����ƽ_�⺻�̷�;

class Product {
	static public int count;
	public String name;

	public Product() {
		count += 1;
	}
}

public class ����ƽ_�⺻�̷�4 {
	public static void main(String[] args) {

		// static Ȱ��� (1)

		for (int i = 0; i < 10; i++) {
			Product p = new Product();
		}

		// ������� ������ Product������ �˼��ִ�. (�޸� ����Ȯ�ο�)
		System.out.println(Product.count);

	}
}
