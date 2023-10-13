import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		
		/*
		 * 다섯 줄 입력, A-Z, a-z, 0-9 까지 최소 1개~15개 글자
		 * 
		 * 세로로 읽은 순서대로 글자 출력
		 * 
		 */
		
		char[][] arr = new char[5][15];
		StringBuilder sb = new StringBuilder();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int max = 0;
		
		// 2차원 배열 길이 만큼
		for (int i = 0; i < arr.length; i++) {
			String str = br.readLine();
			for (int j = 0; j < str.length(); j++) {
				arr[i][j] = str.charAt(j);

				max = Math.max(max, str.length());
			}
		}
		
		// 세로로 출력 (0,0),(1,0),(2,0),(3,0),(4,0)...
		for (int i = 0; i < max; i++) {
			for (int j = 0; j < 5; j++) {
				if(arr[j][i] == '\0') {
					continue;
				}
				sb.append(arr[j][i]);
			}
		}
		System.out.print(sb);
	}
}