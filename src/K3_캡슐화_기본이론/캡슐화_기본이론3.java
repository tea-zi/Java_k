package K3_ĸ��ȭ_�⺻�̷�;

class Product {
	private String regiDate;
	private String name;
	private int price;

	public Product(String date, String name, int price) {
		this.regiDate = date;
		this.name = name;
		this.price = price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getRegiDate() {
		return regiDate;
	}

	public String getName() {
		return name;
	}

	public int getPrice() {
		return price;
	}
}

public class ĸ��ȭ_�⺻�̷�3 {
	public static void main(String[] args) {
		// [get set�� Ȱ���]

		// �� �Ͱ��� set�޼���� price�� �������� ,
		// ������� ��ǰ�̸��� set�޼��带 ������������
		// ������� ��ǰ�̸��� ó�� ������ ���� ������ ����� �Ұ����ϴ�.
		Product pr = new Product("20210420", "��ġ", 2000);
		System.out.println(pr.getName());
		System.out.println(pr.getRegiDate());
		System.out.println(pr.getPrice());

		pr.setPrice(1500);
		System.out.println(pr.getName());
		System.out.println(pr.getRegiDate());
		System.out.println(pr.getPrice());

	}
}