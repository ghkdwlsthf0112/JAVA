package quiz;

public class B10_Gugudan2 {
	
	//for문으로 출력했던 구구단 2개를 while문으로 출력해보세요
	
	public static void main(String[] args) {
		
		int dan = 2;
		while (dan <= 9) {
			System.out.printf("%d단: ", dan);
			
			
			int gop = 1;
			while (gop <= 9) {
				System.out.printf("%dx%d=%-2d ", dan, gop, dan  *gop);
				++gop;
			}
			System.out.println();
			++dan;
		}
		
		
		System.out.println();
				
		int gop2 = 1;
		while (gop2 <= 9) {
			int dan2 = 2;
			while (dan2 <= 9) {
				System.out.printf("%d x %d = %d\t", dan2, gop2, dan2  *gop2);
				++dan2;
			}
			System.out.println();
			++gop2;
		}	
	}

}


