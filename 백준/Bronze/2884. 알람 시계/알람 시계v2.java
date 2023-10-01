import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		/*
		 * 원래 알람보다 45분 앞선 알람시간을 출력
		 */
		Scanner sc = new Scanner(System.in);
		
		int H = sc.nextInt();
		int M = sc.nextInt();
		
		/*
		 * 분이 0 밑으로 내려가는 경우  
		 * 
		 * 1. 시간 1씩 감소
		 * 2. 분은 원래 있던 분 + 60 - 45
		 * 3. 시간이 0밑으로 내려가면 23으로 초기화
		 */
		
		if(M - 45 < 0) {
			if(H == 0) {
				H = 24;
			}
			H--;
			M = (M + 60) - 45;
			System.out.println(H + " " + M);
		}else {
			System.out.println(H + " " + (M - 45));
		}
	}
}
