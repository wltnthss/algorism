import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		 
		String s = sc.nextLine();
		
		/*
		 * 문자열이 몇 개의 단어로 이루어져있는지?
		 */
		
		// st에 공백을 기준으로 나눈 토큰 저장.
		StringTokenizer st = new StringTokenizer(s, " ");
		
		// 토큰 개수 반환
		System.out.println(st.countTokens());
	}
}