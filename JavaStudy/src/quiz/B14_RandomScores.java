package quiz;

import java.util.Random;

public class B14_RandomScores {
	
	/*
	 	1. 300개의 랜덤 점수를 생성한다 (각 점수는 0 ~ 20000점)
	 	
	 	2. 해당 점수들을 한 줄에 5개씩 보기좋게 출력한다
	 	
	 	3. 모든 점수들의 평균을 줄력한다 (소수 셋째 자리에서 반올림)
	 	
	 	4. 가장 높은 점수와 가장 낮은 점수를 찾아 
	 		그 점수가 몇 번째 사람인지를 출력한다 (중복인 경우 모두 출력한다)
	 */
	
	public static void main(String[] args) {
		
		Random ran = new Random();
	 	
		int scores[] = new int[300];
		
		for (int i = 0; i < scores.length; ++i) {
			scores[i] = (int)(Math.random() * 20001);
		}
		
		int sum = 0;
		
		for (int i = 0; i < scores.length; ++i) {
			 
			sum += scores[i];
		}
		 
		System.out.println(scores[i] + "\t");
			if (i % 5 == 4) {
				System.out.println();
			}
		
		System.out.println("----------------------");
		System.out.println("총점 :" + sum);
		System.out.printf("평균: %.2f점\n", 
		sum / (double) scores.length);
		
		
		// 제일 높은 범수와 제일 낮은 점수를 구한다
		// -> 첫 번째 점수로 초기화 해놓고 두 번째 점수부터 하나씩 비교한다
		int bestScore = scores[0];
		int worstScore = scores[0];
		
		for (int i = 0; i < scores.length; ++i) {
			// 현재 최고 점수보다 1번째 점수가 더 크다면 그 점수를 최고 점수로 바꾼다
			if (scores[i] > bestScore) {
				bestScore = scores[i];
			}
			
			if (scores[i] > worstScore) {
				worstScore = scores[i];
		}
		System.out.println("최고 점수 :" + bestScore);
		
		for (int i = 0; i < scores.length; ++i) {
			int score = scores[i];
			if (score == bestScore) {
				System.out.printf("%d번째 참가자[d%점]\n", i, score);
			}	
			
		}
		
		System.out.println("최저 점수 :" + worstScore);
		
		}
	}
}


