package K3_캡슐화_프로젝트3_주문목록_과제;

public class _OrderMain {
	public static void main(String[] args) {
		UserDAO userDAO = new UserDAO();
		ItemDAO itemDAO = new ItemDAO();		
		OrderDAO orderDAO = new OrderDAO();
		userDAO.setData();
		itemDAO.setData();
		orderDAO.setData();
		
		// 문제 1) id를 입력받아 해당 회원이 구입한 아이템 전체 출력해보시오.
		// 조건 1) 겹치는 아이템은 개수도 함께 출력하시오.
		// 예    1) 입력 : qwer
		// 출력 1) 사과2개, 배1개 (총합 3500원)
		
		// 문제 2) 회원 번호를 입력하면, 탈퇴시키시오.
		// 조건 2) orderList에서도 찾아서 삭제하시오.
		
		// 문제 3) 각아이디별 주문 목록 출력 
		
		// 문제 4) 각 아이템별 주문자 출력 
		
	}
}
