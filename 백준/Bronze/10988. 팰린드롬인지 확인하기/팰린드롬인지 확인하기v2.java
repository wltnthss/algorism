package 알고리즘;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String s = sc.next();
		int flag = 1;
		
		for (int i = 0; i < s.length(); i++) {
			if(s.charAt(i) != s.charAt(s.length() -1 -i)) {
				flag = 0;
			}
		}
		System.out.println(flag);
	}
}