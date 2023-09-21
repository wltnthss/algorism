import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		int[] arr = new int[T];
		
		int n1 = 0, n2 = 0;
		
		for(int i =0 ; i < T; i++) {
			n1 = sc.nextInt();
			n2 = sc.nextInt();
			arr[i] = n1 + n2;
		}
		
		for(int result : arr) {
			System.out.println(result);
		}
	}
}