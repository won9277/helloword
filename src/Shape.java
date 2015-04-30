
public abstract class Shape  {
	private int x ;
	private int y ;
	
	
	
	public void draw() {
		System.out.println("구체적인 도형을 그릴 수 없습니다.");

	}

	
	public abstract double calculatearea();
}

class Circle extends Shape implements Drawable{
	private int radius ;
	
	
	public int getR() {
		return radius;
	}

	public void setR(int r) {
		this.radius = radius;
	}

	public void draw(){
		System.out.println("원을 그렸습니다.");

	}
	
	//override
	public double calculatearea(){
		return Math.PI * radius*radius;
	}
}

class Rect extends Shape implements Drawable{
	private int height ;
	private int weight ;
	
	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public void draw(){
	System.out.println("사각형을 그렸습니다.");
	}
	
	//override
		public double calculatearea(){
			return weight * height;
		}
}


