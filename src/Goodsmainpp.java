import java.io.ObjectInputStream.GetField;


public class Goodsmainpp {

	public static void main(String[] args) {
		Goods camera = new Goods();
		
		camera.setName("Nikon");
		camera.setPrice(400000);
		camera.setCountStock(30);
		camera.setCountSold(50);
		
/*		System.out.println("상품 이름 : " + camera.getName());
		System.out.println("상품 가격 : " + camera.getPrice());
		System.out.println("재고 수량 : " + camera.getCountStock());
		System.out.println("팔린 수량 : " + camera.getCountSold());*/
		
		camera.show();

	}

}
