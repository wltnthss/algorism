import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {

		/*
		 *  N개의 수 오름차순 정렬 
		 *  
		 *  input : 첫째 줄에 수의 개수 N, 둘째 줄 부터는 N개의 줄에는 수가 주어짐
		 *  
		 *  ouput : 첫째 줄부터 N개의 줄에 오름차순 정렬 결과 한 줄에 하나씩 출력
		 */

		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		List<Integer> list = new ArrayList<Integer>();
		
		for(int i=0; i<N; i++) {
			int num = sc.nextInt();
			list.add(num);
		}
		
		Collections.sort(list);
		list.forEach(i -> System.out.println(i));
	}
}
