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
		 * 정수 N 소인수분해 결과 오름차순 출력
		 */

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		for (int i = 2; i <= Math.sqrt(N); i++) {
			while(N % i == 0) {
				System.out.println(i);				
				N /= i;
			}
		}
		if(N != 1) {
			System.out.println(N);
		}
	}
}
