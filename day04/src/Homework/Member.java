package Homework;

public class Member {
	private String name;
	private String id;
	private int pw;
	private int age;
	
	public Member(String name, String id, int pw, int age) {
		this.name = name;
		this.id = id;
		this.pw = pw;
		this.age = age;
	}
	
	public String getName() {return name;}
	public void setName(String name) {this.name = name;}
	
	public String getId() {return id;}
	public void setId(String id) {this.id = id;}
	
	public int getPw() {return pw;}
	public void setPw(int pw) {this.pw = pw;}
	
	public int getAge() {return age;}
	public void setAge(int age) {this.age = age;}
		

	}


