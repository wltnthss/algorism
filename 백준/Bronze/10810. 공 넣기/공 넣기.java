import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();	// 바구니 개수
		int M = sc.nextInt();
		int[] arr = new int[N];
		
		/*
		 * a개 줄, i~j 까지 바구니에 k번 번호 넣음
		 * 
		 * output : 1번 ~ N번 공의 번호 출력
		 */
		
		for(int a=0; a<M; a++) {
			int i = sc.nextInt();
			int j = sc.nextInt();
			int k = sc.nextInt();
			
			for(int b=i-1; b<j; b++) {
				arr[b] = k;
			}
		}
		
		for(int c=0; c<arr.length; c++){
			System.out.print(arr[c] + " ");
		}
	}
}
