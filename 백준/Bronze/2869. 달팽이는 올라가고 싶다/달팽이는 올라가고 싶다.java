import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		
		/*
		 * 낮에 A미터 올라감, 밤에 B미터 미끄러짐, 높이가 V미터
		 * 
		 * 올라가는데 며칠이 걸리는지?
		 * 
		 * 하루동안 올라간 높이 = A-B 
		 * 정상 올라가기 전날의 위치는 달팽이가 낮에 올라갈 수 있는 높이보다 같거나 낮게 떨어짐.
		 * 이 때의 최소 높이 = V-A
		 * 
		 * 마지막 날 달팽이가 오르는 거리를 빼고 계산
		 * 
		 */
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		int V = Integer.parseInt(st.nextToken());
		int day = 0;
		
		int oneHeight = A - B;
		int minHeight = V - A;
		
		day = minHeight/oneHeight;
		
		if(minHeight % oneHeight != 0) {	// 정상까지 높이가 짧을 때
			day++;
		}
		System.out.println(day+1);	// 마지막 날 오르는 거리 포함
	}
}
