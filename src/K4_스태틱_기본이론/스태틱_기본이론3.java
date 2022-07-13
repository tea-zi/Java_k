package K4_스태틱_기본이론;

import java.util.Vector;

class Client {
	private int number;
	private String name;
}

class StaticClientDAO {
	static public Vector<Client> clientList = new Vector<Client>();

	static public void addClient(Client c) {
		clientList.add(c);
	}
}

class ClientDAO {
	public Vector<Client> clientList = new Vector<Client>();

	public void addClient(Client c) {
		clientList.add(c);
	}
}

public class 스태틱_기본이론3 {
	public static void main(String[] args) {

		// static 활용 (2) DAO를 static 으로 만들면 편하다.
		for (int i = 0; i < 10; i++) {
			StaticClientDAO.addClient(new Client());
		}

		System.out.println("-----------------------------------");
		ClientDAO clientDAO = new ClientDAO();
		for (int i = 0; i < 10; i++) {
			clientDAO.addClient(new Client());
		}

	}
}