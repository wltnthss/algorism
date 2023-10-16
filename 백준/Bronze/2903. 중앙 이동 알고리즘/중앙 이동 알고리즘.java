import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {

		/*
		 * 1. 초기 상태 - 점4개
		 * 2. 각 변의 중앙에 점을 하나 추가, 정사각형 중심에 점 하나 추가
		 * ex) 1번하면 
		 */
		
		/*
		 * 0 -> 2*2 (4)
		 * 1 -> 3*3 (9)
		 * 2 -> 5*5 (25)
		 * 3 -> 9*9 
		 * 4 -> 17*17
		 * 5 -> 33*33
		 * 
		 * ans 는 (2의 n승 + 1)의 2승
		 */
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
	
		// 2의 n승 
		System.out.print((int)Math.pow(Math.pow(2, N) + 1, 2));
	}
}
