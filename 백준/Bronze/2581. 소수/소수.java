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
		 * 자연수 M과 N M이상 N이하 자연수 중 소수인 것들을 골라 소수의 합과 최솟값 구하기
		 * 소수가 없으면 첫째 줄에 -1 출력
		 */
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		int primeSum = 0;
		int min = M;
		/*
		 * 
		 */
		for (int i = N; i <= M; i++) {
			boolean isPrime = true;
			
			if(i == 1) {
				continue;
			}
			
			for (int j = 2; j < i; j++) {
				// 소수가 아닌 케이스
				if(i % j == 0) {
					isPrime = false;
					break;
				}
			}
			
			if(isPrime) {
				primeSum += i;
				if(min > i) {
					min = i;
				}
			}
		}
		if(primeSum == 0) {
			System.out.println(-1);
		}else {
			System.out.println(primeSum + "\n" + min);
		}
	}
}
