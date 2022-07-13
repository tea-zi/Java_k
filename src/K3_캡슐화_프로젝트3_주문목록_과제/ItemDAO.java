package K3_캡슐화_프로젝트3_주문목록_과제;

import java.util.Vector;

public class ItemDAO {
	private Vector<Item> itemList;
	public ItemDAO(){
		itemList = new Vector<Item>();
	}
	
	public void setData() {
		itemList.add(new Item(0, "사과", 1000));
		itemList.add(new Item(1, "바나나", 1300));
		itemList.add(new Item(2, "귤", 1200));
		itemList.add(new Item(3, "배", 1500));
	}
}
