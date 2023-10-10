import java.util.Scanner;

public class Main {

	public static void main(String[] args)   {
		
		/*
		 * N * M 크기 두 행렬 A,B 더하는 프로그램
		 */
		
		Scanner sc= new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		int[][] A = new int[N][M];
		int[][] B = new int[N][M];
		int[][] C = new int[N][M];
		
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				A[i][j] = sc.nextInt();
			}
		}
		
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				B[i][j] = sc.nextInt();
			}
		}	
		
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				C[i][j] += A[i][j];
			}
		}
		
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				C[i][j] += B[i][j];
			}
		}	
		
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				System.out.print(C[i][j] + " ");
			}
			System.out.println();
		}	
		
	}
}
