package K3_ĸ��ȭ_������Ʈ3_�ֹ����_����;

import java.util.Vector;

public class ItemDAO {
	private Vector<Item> itemList;
	public ItemDAO(){
		itemList = new Vector<Item>();
	}
	
	public void setData() {
		itemList.add(new Item(0, "���", 1000));
		itemList.add(new Item(1, "�ٳ���", 1300));
		itemList.add(new Item(2, "��", 1200));
		itemList.add(new Item(3, "��", 1500));
	}
}
