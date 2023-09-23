import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();	// 바구니 개수
		int M = sc.nextInt();
		int[] arr = new int[N];
		int tmp;
		
		/*
		 * a개 줄, i~j 까지 바구니에 k번 번호 넣음
		 * 
		 * output : 1번 ~ N번 공의 번호 출력
		 */
		for(int i = 0; i<arr.length; i++) {
			arr[i] = i+1;
		}
		
		for(int a=0; a<M; a++) {
			int i = sc.nextInt();
			int j = sc.nextInt();
			
			tmp = arr[i-1];
			arr[i-1] = arr[j-1];
			arr[j-1] = tmp;
			
		}
		
		for(int rslt : arr) {
			System.out.print(rslt + " ");
		}
	}
}