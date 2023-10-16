import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		
		/*
		 * 10진법 수 N B진법 출력
		 * 
		 * ex) 60466175 36
		 * 
		 * ZZZZZ
		 */
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		
		List<Character> list = new ArrayList<Character>();
		
		while(N > 0) {
			if(N % B < 10) {
				list.add((char) (N % B + '0'));
			}else {
				list.add((char) (N % B + 'A' - 10) );
			}
			N /= B;
		}
		for (int i = list.size()-1; i >= 0; i--) {
			System.out.print(list.get(i));
		}
	}
}
