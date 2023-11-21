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
		 * i -> 1 ~ n-2
		 * j -> i+1 ~ n-1
		 * k -> j+1 ~ n
		 * 
		 * ex) n = 7
		 * i -> 1 ~ 5 , i = 1 
		 * j -> , i+1 ~ 6
		 * k -> , j+1 ~ 7
		 * 
		 * n-2+n-1+n = 3n-3
		 * n * n-1
		 * 
		 * 7개중 3개
		 * 
		 * 7!
		 * (7-3) 4!*3!
		 * 
		 * 7 * 6 * 5 / 3 * 2
		 * n * (n-1) * (n-2) / 6
		 */

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		long n = Long.parseLong(br.readLine());
		System.out.println(n*(n-1)*(n-2) / 6);
		System.out.println(3);
	}
}
