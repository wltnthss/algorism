
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		/*
		 * N개 만큼 입력
		 * 입력하는 문자가 연속해서 나타나면 그룹 단어
		 * 한 단어가 다시 등장하면 그룹 단어가 아님.
		 * 
		 * 그룹 단어 개수 출력
		 * 
		 * 1. 입력되는 String input 하나씩 꺼내기.
		 */
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int cnt = 0;
				
		for (int i = 0; i < N;  i++) {
			String s = sc.next();
			boolean[] alphabet = new boolean[26];
			boolean isCorrect = true;
			
			for (int j = 0; j < s.length(); j++) {
				int prev = 0;
				
				int idx = s.charAt(j) - 'a';	// 현재 문자열 저장
				
				// 이전에 사용한적이 있는 문자?
				if(alphabet[idx]) {
					// 이전 문자와 연속되지 않을 경우
					if(s.charAt(j) != s.charAt(j-1)) {
						// 그룹 단어임
						isCorrect = false;
						break;
					}
				// 사용한적이 없는 문자는 true
				}else {
					alphabet[idx] = true;
				}
			}
			if(isCorrect) cnt++;
		}
		System.out.println(cnt);
	}
}