
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		/*
		 * 가로, 세로 크기 100 흰색 도화지, 가로, 세로 크기 10 정사각형
		 * 
		 * boolean 2차원 배열 사용 크기는 101
		 */
		
		Scanner sc = new Scanner(System.in);
		int[][] arr = new int[100][100];
		int N = sc.nextInt();
		int width = 0;
		
		for (int i = 0; i < N; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			
			for (int j = x; j < x+10; j++) {
				for (int k = y; k < y+10; k++) {
					arr[j][k] = 1;
				}
			}
		}
		
		for (int i = 0; i < 100; i++) {
			for (int j = 0; j < 100; j++) {
				if(arr[i][j] == 1) {
					width++;
				}
			}
		}
		System.out.println(width);
	}
}