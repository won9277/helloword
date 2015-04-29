
public class ColorPoint extends Point {
	String color ;
	

	public ColorPoint(int x , int y, String color){
		//setX(x);
		//setY(y);
		super(x,y);	
		this.color = color;
	}
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}


	public void show(){
		System.out.println("좌표 " + getX() + " 와 "+ getY() + "에" + getColor() +" 그렸습니다");
	}
	
	
}
