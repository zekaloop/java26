package homework;

public class Parent {
	String name = "영조";
	
	public void print() {
		System.out.println("나는 영조이다");
	}
}

class Child extends Parent{
	String name = "사도세자";
	
	@Override
	public void print() {
		System.out.println("나는 사도세자이다");
	}
}
