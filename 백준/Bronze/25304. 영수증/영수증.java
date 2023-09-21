import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int X = sc.nextInt();	// 물건 가격
		int num = sc.nextInt();	// 물건 가지수
		int[] arr = new int[num];
		int total = 0;
		
		for(int i=0; i<num; i++) {
			int n1 = sc.nextInt();
			int n2 = sc.nextInt();
			
			arr[i] = n1 * n2;
			total += arr[i];
		}
		
		if(total == X) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}
}