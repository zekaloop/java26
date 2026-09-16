package homework;

public class Person {
	String name;
	int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void show() {
		System.out.println("사람[이름 : " + name + ", 나이 : " + age + "]");
	}
}

class Student extends Person{
	int studentId;
	
	public Student(String name, int age, int studentId) {
		super(name, age);
		this.studentId = studentId;
	}
	
	@Override
	public void show() {
		System.out.println("학생[이름 : " + name + ", 나이 : " + age + ", 학번 : " + studentId + "]");
	}
}

class ForeignStudent extends Student {
	String country;
	
	public ForeignStudent(String name, int age, int studentId, String country) {
		super(name, age, studentId);
		this.country = country;
	}
	
	@Override
	public void show() {
		System.out.println("외국학생[이름 : "+ name + ", 나이 : " + age + ", 학번 : " + studentId + ", 국적 : " + country + "]");
	}
}
