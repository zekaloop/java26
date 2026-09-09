package Homework;

import java.util.Scanner;

public class practice3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("원기둥의 밑면 반지름은?");
		int radius = sc.nextInt();
		
		System.out.println("원기둥의 높이는? ");
        int height = sc.nextInt();
        
        double volume = 3.14 * radius * radius * height;
        System.out.println("원기둥이 부피는 " + volume);	
        }
}
