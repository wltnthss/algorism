import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
						
		int[] ar = new int[10];			// 배열 입력
		int count = 0;					// 나머지 개수 출력
		int[] counts = new int[42];		// 
		
		for(int i=0; i<ar.length; i++) {
			ar[i] = sc.nextInt();
		}
		for(int i=0; i<ar.length; i++) {
			counts[ar[i]%42]++;
		}
		for(int i=0; i<counts.length; i++) {
			if(counts[i] != 0) {
				count++;
			}
		}
		System.out.println(count);
	}
}
