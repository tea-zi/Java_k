package K2_������_�⺻�̷�;
/*
 * # ������ �����ε�
 * 1. �����ڵ� �޼����̱� ������ ���� �̸����� ������ ���� �� �ִ�.
 * 2. ��, �޼���� ���������� �Ű�����(parameter)�� ���� �ٸ��� �ؾ��Ѵ�.
 */

class Product {
	String name;
	int price;

	Product() {
		name = "�ڽ�";
		price = 1000;
		System.out.println("�⺻ ������");
	}

	Product(String name, int price) {
		this.name = name;
		this.price = price;
	}

	void printProduct() {
		System.out.println(name + " : " + price);
	}
}

public class ������_�⺻�̷�2 {
	public static void main(String[] args) {

		// �⺻ ������ ȣ��
		Product p1 = new Product();
		p1.printProduct();

		// ������ �����ε�
		Product p2 = new Product("��ڽ�", 2000);
		p2.printProduct();
	}
}