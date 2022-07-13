package K3_캡슐화_프로젝트3_주문목록_과제;

import java.util.Vector;

public class OrderDAO {
	private Vector<Order> orderList;
	
	public OrderDAO(){
		orderList = new Vector<Order>();
	}
	
	public void setData() {
		orderList.add(new Order(0, "qwer", "사과"));
		orderList.add(new Order(1, "haha", "귤"));
		orderList.add(new Order(2, "java", "바나나"));
		orderList.add(new Order(3, "abcd", "배"));
		orderList.add(new Order(4, "qwer", "사과"));
		orderList.add(new Order(5, "haha", "배"));
		orderList.add(new Order(6, "abcd", "바나나"));
		orderList.add(new Order(7, "java", "사과"));
		orderList.add(new Order(8, "qwer", "배"));
	}
}
