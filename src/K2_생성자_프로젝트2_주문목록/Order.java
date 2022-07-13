package K2_생성자_프로젝트2_주문목록;

public class Order {
	int orderNum;
	String userId;
	String itemName;

	Order(int orderNum, String userId, String itemName) {
		this.orderNum = orderNum;
		this.userId = userId;
		this.itemName = itemName;
	}
}
