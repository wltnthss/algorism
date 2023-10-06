import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		/*
		 * 알파벳 소문자와 -, = 으로 이루어진 입력
		 * 
		 * 입력으로 주어진 단어가 몇 개의 크로아티아 알파벳으로 이루어져 있는지?
		 * 
		 * 입력한 문자열 중 arr에 담겨있는 값이 있으면 ?로 치환
		 * 
		 */
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		String[] arr = { "c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
		
		for (int i = 0; i < arr.length; i++) {
			if(str.contains(arr[i])) {
				str = str.replace(arr[i], "?");
			}
		}
		System.out.println(str.length());
	}
}