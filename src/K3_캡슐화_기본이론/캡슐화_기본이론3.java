package K3_캡슐화_기본이론;

class Product {
	private String regiDate;
	private String name;
	private int price;

	public Product(String date, String name, int price) {
		this.regiDate = date;
		this.name = name;
		this.price = price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getRegiDate() {
		return regiDate;
	}

	public String getName() {
		return name;
	}

	public int getPrice() {
		return price;
	}
}

public class 캡슐화_기본이론3 {
	public static void main(String[] args) {
		// [get set의 활용법]

		// 위 와같이 set메서드는 price만 만들어놓고 ,
		// 제조년과 상품이름의 set메서드를 만들지않으면
		// 제조년과 상품이름은 처음 저장한 이후 변경이 절대로 불가능하다.
		Product pr = new Product("20210420", "김치", 2000);
		System.out.println(pr.getName());
		System.out.println(pr.getRegiDate());
		System.out.println(pr.getPrice());

		pr.setPrice(1500);
		System.out.println(pr.getName());
		System.out.println(pr.getRegiDate());
		System.out.println(pr.getPrice());

	}
}