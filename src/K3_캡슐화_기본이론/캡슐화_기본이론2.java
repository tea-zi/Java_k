package K3_ĸ��ȭ_�⺻�̷�;

class Student1 {
	private String name;
	private int age;

	public Student1(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}
}

class Student2 {
	public String name;
	public int age;
}

public class ĸ��ȭ_�⺻�̷�2 {
	public static void main(String[] args) {

		Student1 hgd = new Student1("ȫ�浿", 11);

		System.out.println(hgd.getName());
		System.out.println(hgd.getAge());

		hgd.setName("�̸���");
		hgd.setAge(20);

		System.out.println(hgd.getName());
		System.out.println(hgd.getAge());

		// hgd.name = "aaa"; ���������� �Ұ��ϴ�.

		// �Ʒ��� �ξ� ���ѵ� �� ���� ���� ����ұ�? ������ ����
		Student2 s2 = new Student2();
		s2.name = "�̿���";
		s2.age = 10;

	}
}