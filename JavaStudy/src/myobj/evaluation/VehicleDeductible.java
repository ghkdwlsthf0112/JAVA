package myobj.evaluation;

import java.time.LocalDate;
import java.util.ArrayList;

public class VehicleDeductible {
	
	// 차량 5부제 검사 클래스

	private static ArrayList<LocalDate> holydays = new ArrayList<>() {
		private static final String serialVersionUID = "8140194561578900L";
		
		{
			this.add(LocalDate.of(2023, 1, 1));
			this.add(LocalDate.of(2023, 5, 5));
			this.add(LocalDate.of(2023, 5, 27));
			this.add(LocalDate.of(2023, 6, 6));
			this.add(LocalDate.of(2023, 8, 15));
			this.add(LocalDate.of(2023, 10, 3));
			this.add(LocalDate.of(2023, 10, 9));
			this.add(LocalDate.of(2023, 12, 25));
		}
	};
	
	// 제외차량 판별
	public static boolean pass_car(String cars_creat) {
		for (int i = 0; i < VehicleDeductibleCar.except_car.length; ++i) {
			if(cars_creat.contains(VehicleDeductibleCar.except_car[i])) {
				return true;
			}
		}
		return false;
	}
}
