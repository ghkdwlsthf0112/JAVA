package quiz;

public class Lotto {
	
	public static void main(String[] args) {
	
		int lottonum[] = new int[7];
		
		int bonus = 0;
		
		int collect = 0;
		int ien = lottonum.length;
		
		// 당첨여부
		boolean win = false;
		
		boolean bonusCheck = false;
		
		int[] userNums = new int[6];
		
		// 등수
		int grade = 0;
		// 추첨된 횟수
		int count = 0;
		
		// 6개의 로또숫자 생성 (중복 X)
		for (int i = 0; i < lottonum.length; i++) {
			lottonum[i] = ((int) (Math.random() * 45) + 1);
			for (int j = 0; j < i; j++) {
				// 메인 숫자중 중복숫자 제거
				if (lottonum[i] == lottonum[j]) {
					i--;
				}
			}
		}
		
		System.out.println("당첨결과는 "+lottonum[0]+", "+lottonum[1]+", "+lottonum[2]+", "+lottonum[3]+", "+lottonum[4]+", "+lottonum[5]+"입니다.");
		
		while (!bonusCheck) {
			bonus = ((int) (Math.random() * 45) + 1);
			if (bonus == lottonum[0] || bonus == lottonum[1] || bonus == lottonum[2] || bonus == lottonum[3] || bonus == lottonum[4] || bonus == lottonum[5]) {
				bonusCheck = false;
			}
			else {
				bonusCheck = true;
			}
		}
		System.out.println("보너스 : "+bonus);
		
		while (!win) {
			for (int i = 0; i < userNums.length; i++) {
				userNums[i] = ((int) (Math.random() * 45) + 1);
				for (int j = 0; j < i; j++) {
					if (userNums[i] == userNums[j]) {
						i--;
					}
				}
			}
		
			for (int i = 0; i < 6; i++) {
				for (int j = 0; j < 6; j++) {
					if (lottonum[i] == userNums[j]) {
						collect++;
					}
				}
					
				if (bonus == userNums[i]) {
						count++;
						bonusCheck = true;
				}
			}
			count++;
			
			if (collect > 2) {
				win = true;
			} else {
				win = false;
			}
		}
		
		// 등수
		if (count == 6 && !bonusCheck)		grade = 1;
		else if (count == 6 && bonusCheck)	grade = 2;
		else if (count == 5)				grade = 3;
		else if (count == 4)				grade = 4;
		else if (count == 3)				grade = 5;
		
		// 추첨 결과 출력
		System.out.println("추첨숫자는 "+userNums[0]+", "+userNums[1]+", "+userNums[2]+", "+userNums[3]+", "+userNums[4]+", "+userNums[5]+"입니다.");
		System.out.println(count+"회 만에 "+grade+"등에 당첨 되셨습니다.");
	}
	
}

