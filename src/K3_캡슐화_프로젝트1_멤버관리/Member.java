package K3_ĸ��ȭ_������Ʈ1_�������;

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