import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		
		/*
		 * 분이 0밑으로 내려갔을 때 분기
		 */
		if(n2 - 45 < 0) {
			if(n1 == 0) {
				n1 = 24;
			}
			n1--;
			n2 = 60 + n2 - 45;
			
		}else {
			n2 = n2 - 45;
		}
		System.out.println(n1 + " " + n2);
	}
}
