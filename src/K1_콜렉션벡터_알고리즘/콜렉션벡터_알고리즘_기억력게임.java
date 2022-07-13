package K1_�ݷ��Ǻ���_�˰���;

import java.util.Random;
import java.util.Scanner;
import java.util.Vector;

class Node {
	int front;
	int back;
}

class MemoryGame {
	Vector<Node> nodeList;
	int data[];
	final int SIZE = 10;
	int winCount = 0;
	Scanner scan = new Scanner(System.in);

	void shuffle() {
		Random ran = new Random();
		for (int i = 0; i < 100; i++) {
			int r1 = ran.nextInt(data.length);
			int r2 = ran.nextInt(data.length);
			int tmp = data[r1];
			data[r1] = data[r2];
			data[r2] = tmp;
		}
	}

	void dataInit() {
		data = new int[SIZE];
		for (int i = 0; i < SIZE; i++) {
			data[i] = (i + 2) / 2;
		}
	}

	void nodeInit() {
		nodeList = new Vector<>();
		for (int i = 0; i < SIZE; i++) {
			Node node = new Node();
			node.front = data[i];
			nodeList.add(node);
		}
	}

	void init() {
		dataInit();
		shuffle();
		nodeInit();
	}

	void print() {
		System.out.println("------------------------");
		for (int i = 0; i < SIZE; i++) {
			if (nodeList.get(i).back == 0) {
				System.out.print("[ ]");
			} else {
				System.out.print("[" + nodeList.get(i).back + "]");
			}
		}
		System.out.println();
		System.out.println("-------------------------");
	}

	void update() {
		while (true) {
			print();
			System.out.print("�ε���1 �� �Է��ϼ��� : (0~9)");
			int sel1 = scan.nextInt();
			if (sel1 == -1) {
				break;
			} else if (nodeList.get(sel1).back != 0) {
				System.out.println("�̹� ������ ī���Դϴ�.");
				continue;
			}

			System.out.print("�ε���2 �� �Է��ϼ��� : (0~9)");
			int sel2 = scan.nextInt();
			if (sel2 == -1) {
				break;
			} else if (nodeList.get(sel2).back != 0) {
				System.out.println("�̹� ������ ī���Դϴ�.");
				continue;
			}
			nodeList.get(sel1).back = nodeList.get(sel1).front;
			nodeList.get(sel2).back = nodeList.get(sel2).front;
			winCount++;
			print();

			if (nodeList.get(sel1).back != nodeList.get(sel2).back) {
				nodeList.get(sel1).back = 0;
				nodeList.get(sel2).back = 0;
				winCount--;
			}

			if (winCount == 5) {
				break;
			}
		}
		scan.close();
	}
}

public class �ݷ��Ǻ���_�˰���_���°��� {
	public static void main(String[] args) {
		MemoryGame mg = new MemoryGame();
		mg.init();
		mg.update();
	}
}
