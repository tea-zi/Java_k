package K2_생성자_프로젝트2_주문목록;

public class User {
	int userNum;
	String userID;
	String userPW;

	User(int userNum, String userID, String userPW) {
		this.userNum = userNum;
		this.userID = userID;
		this.userPW = userPW;
	}
}
