import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int cnt = 0;
		String str = "";
		// n을 4로 나눌 때마다 long 이 추가.
		/*
		 * int t1 = n/4 
		 */
		n = n/4;
		
		for(int j=0; j<n; j++) {
			str += "long ";
		}
		
		System.out.println(str + "int");
	}
}