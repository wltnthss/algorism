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
		 *a,b,c 중 가장 큰 둘레
		 *
		 *c = a+b+1
		 *1. 두 변의 합이 가잔 긴 변보다 크면 a+b+c
		 *2. 아니면 짧은 (두 변 덧셈 * 2) - 1 이 되어야함. 
		 */
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] input = br.readLine().split(" ");
		
		int a = Integer.parseInt(input[0]);
		int b = Integer.parseInt(input[1]);
		int c = Integer.parseInt(input[2]);
		int[] s = {a, b, c};
		
		Arrays.sort(s);
		
		if(s[0] + s[1] > s[2]) {
			System.out.println(a+b+c);
		}else {
			System.out.println(((s[0]+s[1]) * 2) - 1);
		}
		
	}
}
