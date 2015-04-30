
public class ShapeAPP {

	public static void main(String[] args) {
		/*Point point1 = new Point();
		point1.setX(2);
		point1.setY(5);
		
		Point point2 = new Point();
		point2.setX(5);
		point2.setY(10);
		
		Point point3 = new Point(50,50);
		
		point1.show();
		point2.show();
		point3.show();
		point3.show(false);*/
		
		//ColorPoint point4 = new ColorPoint(10,50,"red");
/*		point4.setX(10);
		point4.setY(50);
		point4.setColor("red");*/
		//point4.show();
		
		//Drawable drawable = new Point(10,20);
		//drawable.draw();
		
		Circle c = new Circle();
		System.out.println(c instanceof Circle);
		System.out.println(c instanceof Shape);
		System.out.println(c instanceof Drawable);
	
		//System.out.println(c instanceof Rect); //Error임영
		System.out.println(c instanceof Visible);		
		// 이거는 되네?? - 인터페이스는 된다!
		

		Shape s = c;
		System.out.println(s instanceof Rect);
	}

}
