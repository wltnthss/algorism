import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
        /*
         * 배열 한 개 만으로도 풀 수 있는 문제.
         */
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[] {1, 1, 2, 2, 2, 8};
		int[] input = new int[6];
		
		for (int i = 0; i < arr.length; i++) {
			input[i] = sc.nextInt();
			System.out.print(arr[i] - input[i] + " ");
		}
	}
}

