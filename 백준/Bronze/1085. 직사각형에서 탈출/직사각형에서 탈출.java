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
		 * 입력 - x,y,w,h 출력 - 경계선까지 최솟값
		 * 왼쪽 아래 꼭짓점 (0,0) 오른쪽 위 꼭짓점 (w,h)
		 * 현수 (x,y)에 위치 
		 */
		
		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();
		int y = sc.nextInt();
		int w = sc.nextInt();
		int h = sc.nextInt();
		
		int minX = Math.min(x, w-x);
		int minY = Math.min(y, h-y);
		
		System.out.println(Math.min(minX, minY));
	}
}
