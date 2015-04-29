public class Student extends Person{
	
	public void set() {
	      age = 30;
	      name = "홍길동";
	      height = 175;
	      //weight = 65; //프라이벳이라 안됨 그렇다면?
	   }

	   public static void main( String[] args ) {
	      Student s = new Student();
	      s.set();
	   }
	   
	   public Student() {
	       System.out.println("Student 클래스의 생성자가 호출 되었습니다."); 
	   }


}