package K3_Ä¸½¶È­_ÇÁ·ÎÁ§Æ®1_¸â¹ö°ü¸®;

public class Member{
	private String id;
	private int num;	
	
	public void printMember() {
		System.out.println("num : " + num + ", id : " + id );
	}
	public String getId() {
		return id;
	}
	public int getNum() {
		return num;
	}
	public void setId(String id) {
		this.id = id;
	}
	public void setNum(int num) {
		this.num = num;
	}
	
}