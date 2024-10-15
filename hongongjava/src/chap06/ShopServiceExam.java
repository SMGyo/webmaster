package chap06;

public class ShopServiceExam {

	public static void main(String[] args) {
		ShopService Ss1 = ShopService.getInstance();
		ShopService Ss2 = ShopService.getInstance();
		
		if(Ss1 == Ss2) {
			System.out.println("같은 ShopService 객체입니다.");
		}else {
			System.out.println("다른 ShopService 객체입니다.");
		}

	}

}
