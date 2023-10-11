import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		
		/*
		 * 9*9 이중배열에
		 * 최댓값이 몇 행 몇 열에 위치한 수인가?
		 * 
		 * 입력 : 1째 ~ 9째 줄까지 9*9 배열
		 * 출력 : 1째 줄 : 최댓값 2째 줄 : 몇 행 몇 열
		 * 		최대값이 두 개 이상인 경우 그 중 한 곳의 위치를 출력
		 */
		
		int max = 0;
		Scanner sc = new Scanner(System.in);
		int[][] a = new int[9][9];
		int iIdx = 0;
		int jIdx = 0;
		
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				 a[i][j] = sc.nextInt();
				 if(max < a[i][j]) {
					 max = a[i][j];
					 iIdx = i;
					 jIdx = j;
				 }
			}
		}
		System.out.println(max);
		System.out.println((iIdx+1) + " " + (jIdx+1));
	}
}
