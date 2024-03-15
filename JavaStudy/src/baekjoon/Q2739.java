package baekjoon;

public class Q2739 {
	
	public static void mian(String[] args){
        for (int line = 0; line < 9; ++line){
            int mul = line;
			for (int step = 0; step <= 2; ++step) {
				if (line == 0) {
					System.out.printf("", step);
				} else {
					System.out.printf("%d * %d = %d\t ", 
							step, mul, step * mul);
				}
			}
			System.out.println();
        }
    }
}


