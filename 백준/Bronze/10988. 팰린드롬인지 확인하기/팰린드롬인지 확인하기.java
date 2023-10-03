
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		/*
		 *  알파벳 소문자로만 이루어진 단어가 주어진다. 이때, 이 단어가 팰린드롬인지 아닌지 확인하는 프로그램을 작성하시오.

			팰린드롬이란 앞으로 읽을 때와 거꾸로 읽을 때 똑같은 단어를 말한다. 
			
			level, noon은 팰린드롬이고, baekjoon, online, judge는 팰린드롬이 아니다.
			
			첫째 줄에 팰린드롬이면 1, 아니면 0을 출력한다.
			
			1. 입력한 String의 길이만큼 반복문
			2. 같은 값이 2개 이상 존재하면 펠립드롭이면 1 아니면 0을 출력
			
			1. 중간값 활용??
			2. chatAt(i)의 길이를 비교하며 중간값을 제외하고 앞의 순서와 뒤의 순서를 비교
		 */
		
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		
		int flag = 1;
		int mid = str.length() / 2;
		
		for (int i = 0; i < mid; i++) {
			if(str.charAt(i) != str.charAt(str.length() - 1 -i)) {
				flag = 0;
			}
		}
		System.out.println(flag);
	}
}
