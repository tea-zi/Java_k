package K2_������_������Ʈ2_�ֹ����;

import java.util.Vector;

public class UserDAO {
	Vector<User> userList;

	UserDAO() {
		userList = new Vector<User>();
	}

	void setData() {
		userList.add(new User(0, "qwer", "1234"));
		userList.add(new User(1, "abcd", "1234"));
		userList.add(new User(2, "haha", "1234"));
		userList.add(new User(3, "java", "1234"));
	}

	void remove(OrderDAO orderDAO, int number) {
		boolean check = false;
		for (int i = 0; i < userList.size(); i++) {
			if (userList.get(i).userNum == number) {
				String id = userList.get(i).userID;
				orderDAO.remove(id);
				userList.remove(i);
				check = true;
			}
		}
		if (check == false) {
			System.out.println("���� ȸ����ȣ �Դϴ�.");
		}
	}

	void print() {
		for (int i = 0; i < userList.size(); i++) {
			System.out.println(userList.get(i).userNum + " " + userList.get(i).userID);
		}
	}
}
