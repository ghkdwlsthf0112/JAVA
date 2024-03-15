package quiz;

import java.util.Arrays;

public class B14_Sort {
	
	/*
	 		-100 ~ 100 사이의 랜덤 정수 값이 20개 들어있는 배열을 하나 생성한 후
	 		
	 		(1) 해당 배열의 내용을 작은 값 부터 차례대로 저장한 새로운 배열을 생성하여 출력
	 			(오름차순, Ascending)
	 			
	 		(2) 해당 배열의 내용을 큰 값 부터 차례대로 저장한 새로운 배열을 생성하여 출력
	 		 (내림차순, Descending)
	 */
	
	public static void main(String[] args) {
		
		int[] arr = new int[20];
		
		for (int i = 0; i < arr.length; ++i) {
			arr[i] = (int)(Math.random() * 201 - 100);
			
		}
		System.out.println("- 원본 -");
		System.out.println(Arrays.toString(arr));
		
		int step = 0;
		while (step < arr.length) {
			// 가장 큰 것을 골라서 앞에 놓는다
			// 0단계일때 가장 큰 숫자를 골라서 0번 위치에 놓는다
			// 1단계 일댠ㄴ 0번위치에 이미 가장 큰 숫자가 있으므로
			// 1번 인덱스부터 비교할 수 있다, 나머지중 가장 큰 숫자를 골라서 1번 위치에 놓는다
			// .. 반복
			int biggestIndex = step;
			
			for (int i = 0; i < arr.length - step; ++i) {
				if (arr[biggestIndex] < arr[i]) {
					biggestIndex = i;
					
				}
			}
			
			int temp = arr[step];
			arr[step] = arr[biggestIndex];
			arr[biggestIndex] = temp;
			
			System.out.printf("- %d단계 정렬 후 -\n", step);
			System.out.println(Arrays.toString(arr));
			
			++step;
		}
		
		System.out.println("- 정렬 후 -");
		System.out.println(Arrays.toString(arr));
		
		
		// 가장 작은 것을 골라 맨 앞에 놓는다
		// or 가장 큰 것을 골라 맨 뒤에 놓는다 (추천)
		
		
		step = 0;
		while (step < arr.length) {
			int biggestIndex = step;
			
			for (int i = 0; i < arr.length; ++i) {
				if (arr[biggestIndex] < arr[i]) {
					biggestIndex = i;
				}
			}
			int temp = arr[step];
			arr[step] = arr[biggestIndex];
			arr[biggestIndex] = temp;
			
			++step;
	}	
		System.out.println("- %d단계 정렬 후 - \n");
		System.out.println(Arrays.toString(arr));
	
	// 제일 큰 숫자를 골라 맨 뒤부터 채우기
			step = 0;
			while (step < arr.length) {
				int biggestIndex = step;
				
				for (int i = 0; i < arr.length; ++i) {
					if (arr[biggestIndex] < arr[i]) {
						biggestIndex = i;
					}
				}
				int temp = arr[arr.length - 1 - step];
				arr[arr.length - 1 - step] = arr[biggestIndex];
				arr[biggestIndex] = temp;
				
				++step;
		}	
			System.out.println("- 오름차순 정렬(2) 후 -");
			System.out.println(Arrays.toString(arr));
	}
}
