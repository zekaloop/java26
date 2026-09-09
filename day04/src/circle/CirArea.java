package circle;

import java.util.Scanner;

public class CirArea {

	static int num = 10;
	
	
	public static void main(String[] args) {
		
		
//		원의 반지름 입력받아서 넓이를 출력하는 프로그램
		Scanner sc = new Scanner(System.in);
		System.out.println("원의 반지름 : ");
		double radius = sc.nextDouble();
		
//		Circle 객체 생성
		Circle c = new Circle(radius);
		
//		Circle 객체에게 면적 계산 요청
		double area = c.getArea();
		
//		면적 출력
		System.out.printf("[객체]반지름 %.2f인 원의 넓이는 %.2f입니다.\n", c.getRadius(),area);
		
		
//		Circle 객체없이 원의 면적을 구하기
		area = Circle.getArea(radius);
		System.out.printf("[Static]반지름이 %.1f인 원의 넓이는 %.2f입니다.", radius, area);
	}

}
