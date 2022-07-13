package K2_생성자_프로젝트2_주문목록;

import java.util.Vector;

public class ItemDAO {
	 Vector<Item> itemList;
	 ItemDAO(){
		itemList = new Vector<Item>();
	}
	
	 void setData() {
		itemList.add(new Item(0, "사과", 1000));
		itemList.add(new Item(1, "바나나", 1300));
		itemList.add(new Item(2, "귤", 1200));
		itemList.add(new Item(3, "배", 1500));
	}
}
