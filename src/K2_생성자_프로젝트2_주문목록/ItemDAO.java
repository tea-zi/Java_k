package K2_������_������Ʈ2_�ֹ����;

import java.util.Vector;

public class ItemDAO {
	 Vector<Item> itemList;
	 ItemDAO(){
		itemList = new Vector<Item>();
	}
	
	 void setData() {
		itemList.add(new Item(0, "���", 1000));
		itemList.add(new Item(1, "�ٳ���", 1300));
		itemList.add(new Item(2, "��", 1200));
		itemList.add(new Item(3, "��", 1500));
	}
}
