package K3_ĸ��ȭ_������Ʈ3_�ֹ����_����;

import java.util.Vector;

public class OrderDAO {
	private Vector<Order> orderList;
	
	public OrderDAO(){
		orderList = new Vector<Order>();
	}
	
	public void setData() {
		orderList.add(new Order(0, "qwer", "���"));
		orderList.add(new Order(1, "haha", "��"));
		orderList.add(new Order(2, "java", "�ٳ���"));
		orderList.add(new Order(3, "abcd", "��"));
		orderList.add(new Order(4, "qwer", "���"));
		orderList.add(new Order(5, "haha", "��"));
		orderList.add(new Order(6, "abcd", "�ٳ���"));
		orderList.add(new Order(7, "java", "���"));
		orderList.add(new Order(8, "qwer", "��"));
	}
}
