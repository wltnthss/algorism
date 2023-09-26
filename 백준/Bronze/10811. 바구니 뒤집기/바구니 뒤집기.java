import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		/*
		 * N개의 바구니, 왼쪽부터 1~N번
		 * M번 바구니 순서 역순 변경 
		 * 
		 * 1 , 2 -> 2번, 1번
		 * 2, 1, 3, 4 -> 2, 1, 4, 3
		 * 1, 2, 3, 4 -> 3, 4, 1, 2, 5
		 */
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		int[] arr = new int[N];
		int[] reversedArr = new int[N];
		
		for(int z=0; z<N; z++) {
			arr[z] = z + 1;
		}
		
		for(int a=0; a<M; a++) {
			int i = sc.nextInt() - 1;
			int j = sc.nextInt() - 1;
			
			/*
			 * 거꾸로 된 값을 배열에 담아보자
			 * 1, 2 일 때 arr[0] = 2, arr[1] = 1
			 * 3, 4 일 때 arr[2] = 4, arr[3] = 3
			 * 2 1 4 3 순서 ->  3 4 1 2
			 * 1, 2, 3, 4 일 떄 arr[0] = 3, arr[1] = 4, arr[2] = 1, arr[3] = 2
			 */
			while(i < j) {
				int tmp = arr[i];
				arr[i++] = arr[j];
				arr[j--] = tmp;
			}
		}
		for(int result : arr) {
			System.out.println(result);
		}
	}
}