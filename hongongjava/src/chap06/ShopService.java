package chap06;

public class ShopService {
	//싱글톤 기법 사용
	//필드
	private static ShopService Ss = new ShopService();
	//생성자->외부 접근 막아야 함
	private ShopService() {}
	//메소드
	static ShopService getInstance() {
		return Ss;
	}
}