import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		/*
		 * ex)13 : 1 -> 4 -> 13
		 * ex)58 : 1 -> 6 -> 17 -> 34 -> 58
		 * 
		 * +6, +12 , +18, +24
		 * 6의 2배만큼 증가하는 규칙
		 * 
		 * 각 방을 지날 때마다 pos + 1 을 해주자.
		 */
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		int pos = 1;	// 시작
		int range = 2;
		
		if(N == 1) {
			System.out.print(1);
		}else {
			while(range <= N) {
				range = range + (pos * 6);
				pos++;
			}
			System.out.println(pos);
		}
	}
}
