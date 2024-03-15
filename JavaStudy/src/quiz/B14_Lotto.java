package quiz;

import java.util.Arrays;

public class B14_Lotto {
	
	/*
	 	1. 	랜덤으로 로또 당첨 번호를 생성해보세요
	 		(1 ~ 45의 중복없는 랜덤 숫자 7개, 마지막 번호는 보너스 번호)
	 		
	 		[1] 1 ~ 45 사이의 숫자를 뽑는다
	 		[2] 예전에 뽑은 숫자가 있다면 같은 숫자가 있는지 검사한다
	 		[3] 중복이 있다고 판단되면 다시 뽑는다
	 	
	 	2. 	1등에 당첨 될 때까지 로또 번호를 자동으로 계속 생성하여 
	 		몇 번 만에 당첨되었는지 출력해보세요 
	 		(자동 번호는 1 ~ 45의 중복 없는 랜덤 숫자 6개)
	 		
	 	3.	1등에 당첨 될 때까지 뽑는 동안
	 		2등에 당첨되는 번호들이 있으면 출력해주세요
	 */
	public static void main(String[] args) {
		
		int winNums[] = new int[7];
		
		int i = 0;		
		int len = winNums.length;

		// 랜덤 값 넣기
		while (i < len) {
			winNums[i] = (int)(Math.random() * 45 + 1);
				
			// i : 방금 뽑은 숫자의 새 인덱스
			// j : 여태까지 뽑았던 숫자들의 인덱스
			int j = 0;
			boolean duplicate = false;
			while (j < i) {
				if (winNums[j] == winNums[i]) {
					duplicate = true;
					break;
					// 중복을 하나 찾고나면 더 찾을 필요 없으므로 break
				}
				++j;
			}
			
			// 중복이 없는 경우에만 다음 숫자로 넘어가겠다
			if (!duplicate) {
				++i;
			}
		}
		
		// 출력하기
		for (i = 0; i < len; ++i) {
			System.out.printf("winNums[%d: %d\n", i, winNums[i]);	
		}
		
		// 자동 로또 돌리기
		int[] userNums = new int[6];
		int buyCount = 0;
		
		// 무한으로 반복
		while (true) {
		i = 0;
		len = userNums.length;
		while (i < len) {
			userNums[i] = (int)(Math.random() * 45 + 1);
			
			int j = 0;
			boolean duplicate = false;
			while (j < i) {
				if (userNums[j] == userNums[i]) {
					 duplicate = true;
					 break;
				}
				++j;
			}
			if (!duplicate) {
				++i;
			}
		}
		++buyCount;
		
		// 당첨 여부를 확인
		// 당첨번호 7개 vs 자동번호 6개
		boolean hasBounsNum = false;
		int winCount = 0;
		
		// 자동번호 하나마다 모든 당첨번호를 검사한다
		for (int userIndex = 0; userIndex < userNums.length; ++userIndex) {
			for (int winIndex = 0; winIndex < winNums.length; ++winIndex) {
				//일치하는 당첨번호가 있을 때
				if (userNums[userIndex] == winNums[winIndex]) {
					// 해당 번호가 마지막 번호(보너스 번호)인 경우
					if (winIndex == 6) {
						hasBounsNum = true;
					}
					++winCount;
				}
			}
		}
		
		// 당첨번호가 6개일 때
		if (winCount == 6) {
			// 번호 출력해주기 (배열을 문자열로 변환하기 Arrays.toString(arr))
			System.out.printf("%s vs %s\n", Arrays.toString(winNums),
					Arrays.toString(userNums));
			
			// 보너스 번호를 가지고 있으면 2등
			if (hasBounsNum) {
				System.out.println("2등입니다!("+ buyCount + "회)");
			} else {
				System.out.println(buyCount + "회만에 1등입니다");
				break;
				}
			}
		}
		
		System.out.println("프로그램을 종료합니다");
	}
}

