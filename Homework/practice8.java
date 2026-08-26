package Homework;

import java.util.Scanner;

public class practice8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.println("0~999 사이의 숫자를 입력하세요 : ");
        int num = sc.nextInt();

        int hundreds = num / 100;
        int tens = (num % 100) / 10;
        int ones = num % 10;

        int sum = hundreds + tens + ones;

        System.out.println("각 자릿수의 합 = " + sum);
	}
}
