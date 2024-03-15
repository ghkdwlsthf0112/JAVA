
public class B05_Operator03 {
	
	/*
	 	# 대입 연산자
	 	
	 	- : 왼쪽의 변수에 오른쪽 값을 넣는다
	 	
	 	# 복합 대입 연산자
	 
	 += : 왼쪽의 변수에 오른쪽의 값을 더해 누적 시킨다
	 -+ : 왼쪽의 변수에 오른쪽의 값을 빼서 누적 시킨다
	 += : 왼쪽의 변수에 오른쪽의 값을 곱해서 누적 시킨다
	 /= : 왼쪽의 변수에 오른쪽의 값을 나눠서 누적 시킨다
	 %= : 왼쪽의 변수에 오른쪽의 값을 나눈 나머지를 누적 시킨다 
	 
	 	# 단항 연산자
	 	
	 	 ++ : 해당 변수에 1을 더해 누적시킨다
	 	 -- : 해당 변수에 1을 빼서 누적시킨다
	 
	  -단항 연산자가 변수의 뒤에 붙으면 해당 
	   줄의 모든 명령을 실행하기 전에 값을 먼저 변환 시킨다
	   ex)  a++, a--
	   
	   -단항 연산자가 변수의 앞에 붙으면 해당 
	    줄의 모든 명령을 실행하기 후에 값을 변환 시킨다
	   ex)  ++a, --a
	   
	   
	 */
	public static void mail(String[] args) {
		
		int num = 10;
		
		num = num + 2;
		num += 2; //위에를 줄여서 표현한 것
		
		
		
		int a = 20;
		
		System.out.println(a);	// 25	
		a += 5;
		
		System.out.println(a);	// 15
		a -= 10;
		
		System.out.println(a);  // 45	
		a *= 3;
		
		System.out.println(a);	// 1
		a %= 1;
		
		// boolean 타입의 복합 대입 연산자
		boolean readable = true;
				
		readable &= false; // OR 한 후 누적시킨다
		System.out.println(readable);
		
		readable ^= true; // XOR 연산 한 후 누적시킨다
		System.out.println(readable);
		
		
		int count = 10;
		
		count++;
		System.out.println(count);   // 11
		count++;
		System.out.println(count); 	 // 12
		System.out.println(count++); // 12 : ++이 뒤에 붙으면 ;끝나고 다음 줄에서 더하기 계산
		System.out.println(++count); // 14 : ++이 앞에 붙으면 더하기 먼저 계산
	}

}
