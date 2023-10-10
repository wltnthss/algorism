import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException   {
		
		/*
		 * 배열을 하나만 생성 후 후에 다시 반복문 돌릴 때 값을 더해주는 방법
         * 
         * Scanner 대신 BufferReader 로 성능향상해주기.
		 */
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		int[][] A = new int[N][M];
		
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < M; j++) {
				A[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		StringBuffer sb = new StringBuffer();
		
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < M; j++) {
				sb.append(A[i][j] + Integer.parseInt(st.nextToken()) + " ");
			}
			sb.append("\n");
		}
		System.out.println(sb);
		br.close();
	}
}