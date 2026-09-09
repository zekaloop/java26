package Homework;

import java.util.Scanner;

public class practice7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.println("정수를 입력하세요 : ");
        int x = sc.nextInt();

        boolean cond1 = (x % 4 == 0) && (x % 5 == 0);
        boolean cond2 = (x % 4 == 0) || (x % 5 == 0);
        boolean cond3 = (x % 4 == 0) ^ (x % 5 == 0); 

        System.out.println("1) 4와 5로 나누어지는지: " + cond1);
        System.out.println("2) 4 또는 5로 나누어지는지: " + cond2);
        System.out.println("3) 4 나 5 중 하나로만 나누어지는지: " + cond3);
	}
}
