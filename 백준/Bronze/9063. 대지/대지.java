import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {

		/*
		 *
		 */
//		Scanner sc = new Scanner(System.in);
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());	// 점의 개수
		
		int maxX = -10000;
		int minX = Integer.MAX_VALUE;
		int maxY = -10000;
		int minY = Integer.MAX_VALUE;
		
		for (int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			
			maxX = Math.max(maxX, x);
			minX = Math.min(minX, x);
			maxY = Math.max(maxY, y);
			minY = Math.min(minY, y);
		}
		System.out.print((maxX - minX) * (maxY - minY));	
	}
}
