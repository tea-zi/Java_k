package K4_����ƽ_�⺻�̷�;

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

public class ����ƽ_�⺻�̷�3 {
	public static void main(String[] args) {

		// static Ȱ�� (2) DAO�� static ���� ����� ���ϴ�.
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