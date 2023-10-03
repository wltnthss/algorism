import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		/*
		 * 입력 : 첫째 줄 N 입력
		 * 
		 * 출력 : 2 * N -1 출력
		 * 
			    *
			   ***
			  *****
			 *******
			*********
			 *******
			  *****
			   ***
			    *
		 */
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		for (int i = 1; i <= N; i++) {
			
			for (int j = 0; j < N-i; j++) {
				System.out.print(" ");
			}
			
			for (int b = 0; b < 2*i -1; b++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for (int i = N - 1; i >= 0; i--) {
			
			for (int j = 0; j < N-i; j++) {
				System.out.print(" ");
			}
			
			for (int b = 0; b < 2*i -1; b++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
