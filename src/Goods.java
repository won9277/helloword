public class Goods {
	private String name;
	private int countStock;
	private int countSold;
	private int price;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCountStock() {
		return countStock;
	}

	public void setCountStock(int countStock) {
		this.countStock = countStock;
	}

	public int getCountSold() {
		return countSold;
	}

	public void setCountSold(int countSold) {
		this.countSold = countSold;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	public void show(){
		System.out.printf(   "상품이름  :" + getName() + "\r"
				             +"상품 가격 : " + getPrice() + "\r"
				             +"재고 수량 : " + getCountStock() + "\r"
				             +"팔린 수량 : " + getCountSold() + "\r");
	}
	
}


