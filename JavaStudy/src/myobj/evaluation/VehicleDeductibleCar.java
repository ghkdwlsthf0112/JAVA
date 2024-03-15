package myobj.evaluation;

import java.util.Random;

public class VehicleDeductibleCar {
	// 랜덤 차량 만들어주는 클래스
	
	static Random ran = new Random();
	public static String[] cars = {
			"장애인차", "유아동승차", "경차", "임산부동승차", "하이브리드", "중형차", "대형차", "버스", "택시", "11인 미만 승합차"};
	public static String[] except_car = {"장애인차, 유아동승차"};
	
	String number;
	String car;
	
	public VehicleDeductibleCar() {
		this.number = String.format("%04d", ran.nextInt(10000));
		this.car = cars [ran.nextInt(cars.length)];
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("[%s%s]", number, car);
	}
	
	
}
