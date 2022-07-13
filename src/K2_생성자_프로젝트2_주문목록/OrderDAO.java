package K2_������_������Ʈ2_�ֹ����;

import java.util.Vector;

public class OrderDAO {
	Vector<Order> orderList;

	OrderDAO() {
		orderList = new Vector<Order>();
	}

	void setData() {
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

	void orderListprint(ItemDAO itemDAO, String id) {
		int total = 0;
		for (int i = 0; i < itemDAO.itemList.size(); i++) {
			String itemName = itemDAO.itemList.get(i).itemName;
			int price = itemDAO.itemList.get(i).itemPrice;
			int cnt = 0;
			for (int j = 0; j < orderList.size(); j++) {
				String orderitemName = orderList.get(j).itemName;
				String userId = orderList.get(j).userId;
//				System.out.println(itemName + " " + orderitemName + " " + id + " " + userId);
				if (itemName.equals(orderitemName) && id.equals(userId)) {
					total += price;
					cnt++;
				}
			}
			if (cnt > 0) {
				System.out.println(itemName + cnt + "�� ");
			}
		}
		System.out.println("(" + total + "��)");

	}

	void remove(String id) {
		for (int i = 0; i < orderList.size(); i++) {
			String userId = orderList.get(i).userId;
			if (id.equals(userId)) {
				orderList.remove(i);
			}
		}
	}

	void print() {
		for (int i = 0; i < orderList.size(); i++) {
			System.out.println(
					orderList.get(i).orderNum + " " + orderList.get(i).userId + " " + orderList.get(i).itemName);
		}
	}

	void printOrderId(UserDAO userDAO) {
		for (int i = 0; i < userDAO.userList.size(); i++) {
			String userId = userDAO.userList.get(i).userID;
			for (int j = 0; j < orderList.size(); j++) {
				String orderId = orderList.get(j).userId;
				if (userId.equals(orderId)) {
					System.out.println(orderList.get(j).orderNum + " , " + orderList.get(j).userId + " , "
							+ orderList.get(j).itemName);
				}
			}
		}
	}

	void printOrderItem(ItemDAO itemDAO) {
		for (int i = 0; i < itemDAO.itemList.size(); i++) {
			String itemName = itemDAO.itemList.get(i).itemName;
			for (int j = 0; j < orderList.size(); j++) {
				String orderItem = orderList.get(j).itemName;
				if (itemName.equals(orderItem)) {
					System.out.println(orderList.get(j).orderNum + " , " + orderList.get(j).userId + " , "
							+ orderList.get(j).itemName);
				}
			}
		}
	}

}
