package K2_������_������Ʈ2_�ֹ����;

import java.util.Scanner;

public class _OrderMain {
	public static void main(String[] args) {
		UserDAO userDAO = new UserDAO();
		ItemDAO itemDAO = new ItemDAO();
		OrderDAO orderDAO = new OrderDAO();
		userDAO.setData();
		itemDAO.setData();
		orderDAO.setData();

		// ���� 1) id�� �Է¹޾� �ش� ȸ���� ������ ������ ��ü ����غ��ÿ�.
		// ���� 1) ��ġ�� �������� ������ �Բ� ����Ͻÿ�.
		// �� 1) �Է� : qwer
		// ��� 1) ���2��, ��1�� (���� 3500��)
		Scanner scan = new Scanner(System.in);
		System.out.print("���̵� �Է� : ");
		String id = scan.next();
		orderDAO.orderListprint(itemDAO, id);
		System.out.println("---------------------");

		// ���� 2) ȸ�� ��ȣ�� �Է��ϸ�, Ż���Ű�ÿ�.
		// ���� 2) orderList������ ã�Ƽ� �����Ͻÿ�.
		System.out.print("ȸ����ȣ �Է� : ");
		int number = scan.nextInt();
		userDAO.remove(orderDAO, number);
		userDAO.print();
		orderDAO.print();
		System.out.println("---------------------");
		// ���� 3) �����̵� �ֹ� ��� ���
		orderDAO.printOrderId(userDAO);
		System.out.println("---------------------");
		// ���� 4) �� �����ۺ� �ֹ��� ���
		orderDAO.printOrderItem(itemDAO);
	}
}
