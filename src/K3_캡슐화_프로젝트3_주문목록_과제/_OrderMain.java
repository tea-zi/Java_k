package K3_ĸ��ȭ_������Ʈ3_�ֹ����_����;

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
		// ��    1) �Է� : qwer
		// ��� 1) ���2��, ��1�� (���� 3500��)
		
		// ���� 2) ȸ�� ��ȣ�� �Է��ϸ�, Ż���Ű�ÿ�.
		// ���� 2) orderList������ ã�Ƽ� �����Ͻÿ�.
		
		// ���� 3) �����̵� �ֹ� ��� ��� 
		
		// ���� 4) �� �����ۺ� �ֹ��� ��� 
		
	}
}
