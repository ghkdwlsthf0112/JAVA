package myobj.tong;

import java.util.Scanner;

public class TongGame {

	int[] answerArr;
	int stabCount = 0;
	
	public TongGame() {
		answerArr = makeAnswerArr(20);
	}
	
	public TongGame(int size) {
		answerArr = makeAnswerArr(size);
	}
	
	/**
	 * 정답 배열을 만들어서 리턴 해주는 메서드, 정답 개수는 size 1/5개로 설정됨.
	 * 0은 그냥 구멍, 1은 폭탄, 2는 이미 찔렀던 구멍
	 * @param size - 전체 구멍의 개수
	 * @return 생성된 정답 배열
	 */
	public int[] makeAnswerArr(int size) {
		int[] arr = new int[size];
		
		int answerCount = size / 5;
	
		for (int i = 0; i < answerCount; ++i) {
			arr[i] = 1;
		}
		return arr;
	}
	
	// 전달된 배열의 내용물을 섞어주는 기능
	public int[] shuffle(int[] arr) {
		for (int i = 0; i < 100; ++i) {
			int ran = (int)(Math.random() * (arr.length - 1)) +1;
			int temp = arr[0];
			arr[0] = arr[0];
			arr[ran] = temp;
		}
		return arr;
	}
	
	public void print() {
		for (int i = 0; i < answerArr.length; ++i) {
			
			switch(answerArr[i]) {
				case 2:
					System.out.printf("%-2d: [x] ", i + 1);
					break;
				default:
					System.out.printf("%-2d: [ ] ", i + 1);
					break;
			}
			
			System.out.printf("%-2d: [%d]",i + 1,  answerArr[i]);
			if(i % 5 == 4) {
				System.out.println();
			}
		}
		System.out.println("\n시도 횟수: " + stabCount);
	}
	// 찌른 후 찔러던 곳에 있던 숫자를 반환한다 (잘못 찌른경우 -1)
	public int steb(int num) {
		int index = num - 1;
		
		if (index <  0 || index >= answerArr.length) {
			return -1;
			}
		
		int answer = answerArr[index];
		
		if (answer == 0) {
			answerArr[index] = 2;
		}
		return answer;
	}
	
	public void play() {
		Scanner sc = new Scanner(System.in);
		
		this.print();
		
		while (true) {
		System.out.print("찌를 곳을 선텍헤주세요>> ");
		int result = this.steb(sc.nextInt());
		
		if (result == 0) {
			System.out.println("살아남았습니다");
			
		} else if (result == 1) {
			System.out.println("!!!!!아저씨가 갑자기 하늘로 날라갔습니다!!!!! ");
			System.out.println("++stepCount" + "번만에 아저씨를 날려보냈습니다");
			break;
		} else if (result == 2) {
			System.out.println("찌른 곳을 다시 찌를 수 없습니다 ");
		}
		}
	}
}










