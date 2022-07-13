package K3_캡슐화_프로젝트3_주문목록_과제;

public class Order {
	private int orderNum;
	private String userId;
	private String itemName;
	
	public Order() {}
	public Order(int orderNum, String userId, String itemName) {
		this.orderNum = orderNum;
		this.userId = userId;
		this.itemName = itemName;
	}
}
