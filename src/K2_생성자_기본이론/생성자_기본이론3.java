package K2_������_�⺻�̷�;

class Fruit {
	String name;
	int price;

	// �⺻ ������
	Fruit() {
	}

	// ������ �����ε�(overloading)
	Fruit(String name, int price) {
		this.name = name;
		this.price = price;
	}

	void setData(String name, int price) {
		this.name = name;
		this.price = price;
	}

	void printData() {
		System.out.println(name + "(" + price + "��)");
	}
}

public class ������_�⺻�̷�3 {
	public static void main(String[] args) {

		// # �ν��Ͻ� ���� �ʱ�ȭ��� 3����
		Fruit apple = new Fruit();
		// # ���1) .���� ������ �ʱ�ȭ
		apple.name = "���";
		apple.price = 1000;
		apple.printData();

		Fruit banana = new Fruit();
		// # ���2) �޼��带 ����� �ʱ�ȭ
		banana.setData("�ٳ���", 2000);
		banana.printData();

		// # ���3) �����ڸ� Ȱ���� �ʱ�ȭ
		Fruit melon = new Fruit("���", 3000);
		melon.printData();
	}
}