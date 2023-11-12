import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		/*
		 * 	Equilateral :  세 변의 길이가 모두 같은 경우
			Isosceles : 두 변의 길이만 같은 경우
			Scalene : 세 변의 길이가 모두 다른 경우
			
			단 주어진 세 변의 길이가 삼각형의 조건을 만족하지 못하는 경우에는 "Invalid" 를 출력한다. 
			예를 들어 6, 3, 2가 이 경우에 해당한다. 
			가장 긴 변의 길이보다 나머지 두 변의 길이의 합이 길지 않으면 삼각형의 조건을 만족하지 못한다.
			
			
		 */
		
		Scanner sc = new Scanner(System.in);
		
		int a = 0;
		int b = 0;
		int c = 0;
		
		while(true) {
			
			a = sc.nextInt();
			b = sc.nextInt();
			c = sc.nextInt();
			
			if(a == 0 && b == 0 && c == 0) {
				break;
			}
			
			int max = a;
			/*
			 * 입력한 세 값중 가장 큰 값 구하기
			 */
			if(b > max) {
				max = b;
			}
			if(c > max) {
				max = c;
			}
			
			if(max >= (a+b+c) - max) {
				System.out.println("Invalid");
			}else {
				if(a != b && b != c && a != c) {
					System.out.println("Scalene");
				}else {
					if(a == b && b == c && a == c) {
						System.out.println("Equilateral");
					}else if(a == b || b == c || a == c) {
						System.out.println("Isosceles");
					}
				}
			}
		}
	}
}
