import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int cnt = 0;			// 배열에서 V와 일치하면 cnt++
		
		int N = sc.nextInt();	// N개 수 입력
		int[] arr = new int[N];
		
		for(int i=0; i<N; i++) {
			arr[i] = sc.nextInt();
		}
		
		int V = sc.nextInt();	// 찾으려는 V값
		
		for(int j=0; j<arr.length; j++) {
			if(V == arr[j]) {
				cnt++;
			}
		}
		System.out.println(cnt);
	}
}