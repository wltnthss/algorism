import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {

		/*
		 * 입력
		 * f(n) = na1 + a0
		 * c
		 * n0
		 * 
		 */

		Scanner sc = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		
		int a0 = Integer.parseInt(st.nextToken());
		int a1 = Integer.parseInt(st.nextToken());
		
		int c = Integer.parseInt(br.readLine());
		int n0 = Integer.parseInt(br.readLine());
		
		if((a0 * n0) + a1 <= (c * n0) && c >= a0) {
			System.out.println(1);
		}else {
			System.out.println(0);
		}
	}
}
