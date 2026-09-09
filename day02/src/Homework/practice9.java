package Homework;

import java.util.Scanner;

public class practice9 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

	    System.out.print("전공 이수 학점 : ");
	    int major = sc.nextInt();

	    System.out.print("교양 이수 학점 : ");
	    int general = sc.nextInt();

	    System.out.print("일반 이수 학점 : ");
	    int elective = sc.nextInt();

	    int total = major + general + elective;

	    boolean isTotalPass = total >= 140;
	    boolean isMajorPass = major >= 70;
	    boolean isOtherPass = (general >= 30 && elective >= 30) || (general + elective >= 80);

	    if (isTotalPass && isMajorPass && isOtherPass) {
	        System.out.println("졸업 가능");
	    } else {
	        System.out.println("졸업 불가");
	    }
	    
	}
}
