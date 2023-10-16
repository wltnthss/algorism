import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {

		/*
		 * 테스트 케이스 T개 각 테스트 케이스는 거스름돈 C에 대한 쿼터, 다임, 니켈, 페니
		 * 
		 * 쿼터, 다임, 니켈, 페니 = 25, 10, 5, 1
		 */

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int N = Integer.parseInt(st.nextToken());
		int[] mount = new int[N];

		StringBuffer sb = new StringBuffer();
		
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			
			mount[i] = Integer.parseInt(st.nextToken());// 거스름돈

			int Quarter = mount[i] / 25;				// 4
			int Dime = (mount[i] % 25) / 10;			// 2
			int Nickel = ((mount[i] % 25) % 10) / 5;	// 0
			int Penny = (((mount[i] % 25) % 10) % 5);
//			System.out.print(Quarter + " " + Dime + " " + Nickel + " " + Penny);
			sb.append(Quarter + " " + Dime + " " + Nickel + " " + Penny + "\n");
		}
		System.out.println(sb);
	}
}
