package quiz;

import java.util.Arrays;

public class B15_Array2Quiz {
	
	public static void main(String[] args) {
		
		int[][] myArr = {
				{1, 1, 1, 1, 1, 1},
				{1, 1, 1, 1},
				{1, 1},	
				{1, 1, 1, 1, 1, 1, 1, 1},
				{1, 1, 1, 1}	
		};
		
		// 1. myArr의 모든 값을 1 ~ 500 사이의 랜덤 값으로 바꾸기
		for (int i = 0; i < myArr.length; ++i) {
			for (int j = 0; j < myArr[i].length; ++j) {
				myArr[i][j] = (int)(Math.random() * 500 + 1);
			}
		}
		
		
		// 2. 랜덤으로 바뀐 모든 값의 총핪과 평균 구하기
		int sum = 0;
		int count = 0;
		for (int i = 0; i < myArr.length; ++i) {
			count += myArr[i].length;
			for (int j = 0; j < myArr[i].length; ++j) {
				sum += myArr[i][j];
				
			}
		}
		System.out.println("총합: " + sum);
		System.out.println("총합: " + sum / (double)count);
		
		// 3. myArr의 각 행의 합을 구해서 출력하기
		int[] rowSum = new int[myArr.length];
		
		for (int row = 0; row < myArr.length; ++row) {
			for (int col = 0; col < myArr[row].length; ++col) {
				rowSum[row] += myArr[row][col];
				 
			}
		}
		System.out.println("각 행의 합: " + Arrays.toString(rowSum));
		
		// 4. myArr의 각 열의 합을 구해서 출력하기
		int maxColSize = 0;
		
		for (int i = 0; i < myArr.length; ++i) {
			 int colSize = myArr[i].length;
			if (maxColSize < colSize) {
				maxColSize = colSize;
			}
		}
		
		int[] colSum = new int[maxColSize];
		
		for (int row = 0; row < myArr.length; ++row) {
			for (int col = 0; col < myArr[row].length; ++col) {
				colSum[col] += myArr[row][col];
			}
		}
		System.out.println("열의 합: " + Arrays.toString(colSum));
	}

}
