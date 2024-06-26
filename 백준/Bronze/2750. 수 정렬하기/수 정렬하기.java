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

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		List<Integer> list = new ArrayList<Integer>();
		
		for(int i=0; i<N; i++) {
			int num = Integer.parseInt(br.readLine());
			list.add(num);
		}
		
		Collections.sort(list);
		list.forEach(System.out::println);
	}
}
