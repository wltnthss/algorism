import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		
		/*
		 */
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			
			int x = sc.nextInt();
			int y = sc.nextInt();
			
			if(x - y == 0) {
				break;
			}
			if(y % x == 0) {
				System.out.println("factor");
			}else if(x % y == 0) {
				System.out.println("multiple");
			}else {
				System.out.println("neither");
			}	
		}
	}
}
