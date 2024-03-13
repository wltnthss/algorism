import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
	public static void main(String[] args) throws IOException {

		/*
		 * 다섯 개의 자연수 중 평균과 중앙값
		 * 
		 * input : 첫째 줄부터 다섯 번째 줄까지 100보다 작은 10배수 입력
		 *  
		 * output : 첫째 줄에는 평균, 둘째 줄에는 중앙값 
		 */

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		List<Integer> list = new ArrayList<Integer>();
		
		for (int i = 0; i < 5; i++) {
			int x = Integer.parseInt(br.readLine());
			list.add(x);
		}
		
		Collections.sort(list);
		int avg = (int) list.stream().mapToInt(Integer::intValue).average().orElse(0.0);
		
		System.out.println(avg);
		System.out.println(list.get(2));
	}
}
