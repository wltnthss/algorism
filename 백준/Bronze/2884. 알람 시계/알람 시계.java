import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	
		int H = sc.nextInt(); //시간
		int M = sc.nextInt(); //분
		
		// 1.1 M < 45 M이 음수
		if(M < 45) {
			H --;
			M = 60-(45-M);
			// 2.1 H < 0 H가 음수
			if(H < 0) {
				H = 23;
			}
			System.out.println(H + " " + M);
		}
		// 1.2 M > 45 M이 양수
		else {
			System.out.println(H + " " + (M-45));
		}
		
	}
}
