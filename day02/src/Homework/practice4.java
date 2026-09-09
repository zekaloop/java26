package Homework;

import java.util.Scanner;

public class practice4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        
        System.out.println("초 단위 정수를 입력하세요 : ");
        int totalSeconds = sc.nextInt();
        
        int hour = totalSeconds / 3600;
        int minute = (totalSeconds % 3600) / 60;
        int second = totalSeconds % 60;
        
        System.out.println(hour + "시간 " + minute + "분 " + second + "초");
	}
}
