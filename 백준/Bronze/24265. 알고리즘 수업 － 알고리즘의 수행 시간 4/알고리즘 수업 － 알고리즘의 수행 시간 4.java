import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {

		/*
		 * 이중배열 i  -> 1부터 n -1
		 * 		 j  -> i + 1 부터 n
		 * 
		 * n = 5
		 * i는 1 ~ 4 
		 * j는 2 ~ 5
		 * 
		 * i = 1, j = 2,3,4,5
		 * i = 2, j = 3,4,5
		 * i = 3, j = 4,5
		 * i = 4, j = 5
		 * 
		 * n-1 + n-2 + n-3... + n
		 * (n * n-1) / 2
		 */

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long n = Long.parseLong(br.readLine());
		
		System.out.println(n * (n-1)/2);
		System.out.println(2);
	}
}
