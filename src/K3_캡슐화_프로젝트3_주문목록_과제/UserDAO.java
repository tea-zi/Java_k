package K3_ĸ��ȭ_������Ʈ3_�ֹ����_����;

import java.util.Vector;

public class UserDAO {
	private Vector<User> userList;
	public UserDAO(){
		userList = new Vector<User>();
	}
	
	public void setData() {
		userList.add(new User(0, "qwer", "1234"));
		userList.add(new User(1, "abcd", "1234"));
		userList.add(new User(2, "haha", "1234"));
		userList.add(new User(3, "java", "1234"));
	}
}
