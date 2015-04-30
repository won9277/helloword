public abstract class Point implements Drawable {

	private int x;
	private int y;

	public Point() {
		System.out.println("call point()");
	}

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public void show(boolean visible) {
		if (visible == true) {
			show();
		} else {
			System.out.println("좌표 " + getX() + " 와 " + getY() + "에 점을 지웠슴돠");
		}
	}

	public void show() {
		System.out.println("좌표 " + getX() + " 와 " + getY() + "에 그렸습니다");
	}
	
	public void draw(){
		System.out.println("dd");
	}

}
