
import java.util.*;

public class Calculator {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("첫번째 숫자를 입력하세요");
		double a = sc.nextInt();
		System.out.println("연산자를 입력하세요");
		String giho = sc.next();
		System.out.println("두번째 숫자를 입력하세요");
		double b = sc.nextInt();
		double result = 0;

		switch (giho) {
		case "+":
			result = a + b;

			break;
		case "-":
			result = a - b;

			break;
		case "*":
			result = a * b;

			break;
		case "/":
			result = a / b;

			break;
		}

		System.out.println("결과값 : " + result);

	}

}
