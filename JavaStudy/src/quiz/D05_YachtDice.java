package quiz;

import myobj.yacht.YachtDice;

public class D05_YachtDice {
	/*
	 	1. 주사위를 다섯개 던진다
	 	
	 	2. 각 주사위의 눈을 가지고 어떤 패가 만들어졌는지 구분해야 한다
	 	
	 	3. 다섯개의 주사위 눈을 통해 다음을 구분한다
	 	
	 		(1) 풀 하우스 (같은 눈이 3/2개)
	 			ex> 11222, 33311, 55566, 56556 ...
	 		
	 		(2) 스몰 스트레이트 (1234/2345/3456)
	 			ex> 12346, 64513 ...
	 			
	 		(3) 라지 스트레이트 (12345/23456)
	 			ex> 54321, 24356 ...
	 			
	 		(4) Three of kind (같은 주사위 눈이 3개)
	 			ex> 31323, 66651, ...
	 			
	 		(5) Four of kind (같은 눈이 4개)
	 			ex> 44144, ...	
	 		
	 		(6) Yacht (같은 눈 5개)
	 			ex> 66666, 11111 ...
	 */
	public static void main(String[] args) {
		
		for (int i = 0; i < 20; ++i) {
			YachtDice dice1 = new YachtDice();
		
			System.out.println(dice1);
			dice1.showAvailableRanks();
		}
	}
}


