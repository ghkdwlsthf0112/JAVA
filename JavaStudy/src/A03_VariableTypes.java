
public class A03_VariableTypes {
	
	/*
	    # 정수타입
	    
	    -byte	(1byte, 8bit)
	    2^8(256) 가지
	    -128 ~ -1 / 0 ~ 127
	    
	    - short	(2byte, 16bit)
	    2^16(65536)가지의 값을 표현할 수 있다
	    -32,768 ~ -1 / 0 ~ 32,767
	     
	     - char	(2byte, 16bit, 양수만)
	     0~65535 까지의 값을 사용할 수 있다(65536 가지의 양수 값)
	     
	     - int	(4byte, 32bit)
	      2^32(4,294,967,296)
	     -2,147,483,648 ~ 1 / 0 ~ 2,147,483,647
	      
	     - long	(8byte, 64bit)
	      2^64 (18,446,744,073,709,551,616)
	      -9,223,372,036,854,775,808 ~ 1 / 0 ~ 9,223,372,036,854,775,807
	    
	    #실수타입
	    
	    -부동 소수점 방식
	    - float		(4byte)
	    - double	(8byte)
	    
	    #참,거짓타입
	    
	    -boolean
	    
	    #문자열
	    
	    -string
	 */
	public static void main(String[] args) {
		
	byte byte_min = -128, byte_max = 127;	
		
	System.out.println("byte 타입의 최소값은" + byte_min +"이고" 
					+ "최대값은" + byte_max + " 입니다.");
	
	short short_min = -32768, short_max = 32367;
	
	System.out.println("short 타입의 최소은값" + short_min +"이고" 
			+ "최대값은" + short_max + " 입니다.");
	
	// 자바에서 미리 저장해놓은 각 타입의 최대 최소값이 있다
	
	int int_min = -2147483648, int_max = 2147483647;
	
	System.out.println("int 타입의 최소값은" + int_min +"이고" 
			+ "최대값은" + int_max + " 입니다.");
	
	long long_min = -9223372036854775808L, long_max = 9223372036854775807L;
	
	System.out.println("long 타입의 최소값은" + long_min +"이고" 
			+ "최대값은" + long_max + " 입니다.");
	
	
	// AC00 -> 44032
	
	// char 타입에 넣는 정수 값은 우리에게 보여줄때 문자로 바꿔서 보여준다.
	char ch1 = 44032;
	int num1 = 44032;

	System.out.println(ch1);
	System.out.println(num1);
	
	 // ''도 실제로는 정수 값을 가지고 있다
	char ch2 = 'F'; 
	char ch3 = '값';
	
	//문자 타입 리터널은 실제로 정수값아기 때문에 다른 정수타입네도 저장 할 수 없다
	int num2 = 'F';
	int num3 = '값';
	
	// 숫자 타입에 젇장한 문자 리터널을 출력하면 
	System.out.println(ch2);
	System.out.println(ch3);
	System.out.println(num2);
	System.out.println(num3);
	
	//ASCII 코드 : 0 ~127번까지 코드
	char ch4 = 65;
	System.out.println(ch4);
	
	// 그냥 소수만 적는 것은 doUble 타입이기 때문에
	float avg_score = 96.8F;
	
	
	System.out.println("평균 점수:"+avg_score);
	System.out.println("평균 몸무계:"+avg_score);
	
	
	boolean isMale = true;
	boolean goonpil = true;
	boolean rich = false;
	boolean powerOn = false;
	
	//문자열 
	String msg = "어서오세요 환영합니다!!";
	
			
	}
}
