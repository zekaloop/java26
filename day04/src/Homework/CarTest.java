package Homework;

class Car{
	private static int numofCar = 0;
	private static int numofRedCar = 0;
	
	public Car(String color) {
		numofCar++;
		
		if(color.equalsIgnoreCase("red")) {
			numofRedCar++;
		}
	}
	
	public static int getNumofCar() {
		return numofCar;
	}
	
	public static int getNumofRedCar() {
		return numofRedCar;
	}
}


public class CarTest {
	public static void main(String[] args) {
		Car c1 = new Car("red");
		Car c2 = new Car("blue");
		Car c3 = new Car("RED");
		
		
		System.out.printf("자동차 수 : %d, 빨간색 자동차 수 : %d", Car.getNumofCar(), Car.getNumofRedCar());
	}
}
