
public class Shape {
	private int x ;
	private int y ;
	
	
	
	public void draw() {
		System.out.println("구체적인 도형을 그릴 수 없습니다.");

	}

}

class Circle extends Shape{
	public void draw(){
		System.out.println("원을 그렸습니다.");

	}
}

class Rect extends Shape{
	public void draw(){
	System.out.println("사각형을 그렸습니다.");
	}
}


