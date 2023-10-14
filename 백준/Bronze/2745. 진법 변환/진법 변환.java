import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		/*
		 * 10진법 바꿔서 출력
		 * 
		 * N과 B 입력
		 * B진법 수 N을 10진법으로 출력한 결과
		 */
		//36진법 ZZZZZ 를 10진법으로 바꾸면?
		
		Scanner sc = new Scanner(System.in);

		String s = sc.next();
		int N = sc.nextInt();
		int tmp = 1;
		int ans = 0;
		
		for (int i = s.length()-1; i >= 0; i--) {
			char c = s.charAt(i);
			
			if('A'<= c && c <= 'Z') {
				ans += (c-'A'+10)*tmp;
			}else {
				ans += (c-'0')*tmp;
			}
			tmp *= N;
		}
		System.out.println(ans);
	}
}
