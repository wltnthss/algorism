
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		
		/*
		 * 시간제한 0.15초
		 * 1 <= T <= 200,000,000
		 * 2 <= w,h <= 40,000
		 * 메모리 제한 256MB
		 * 
		 * (4,1) 에서 출발한 개미가 1시간마다 좌표를 하나씩 이동  (5,2) 이동
		 * 경계면에 부딪히면 같은 속력으로 반사되어 이동.
		 * 
		 * 1번째 줄에는 W, H 격자 공간 입력
		 * 2번째 줄에는 초기 위치 좌표값 P,Q가 입력
		 * 3번째 줄에는 개미가 움직일 시간 T가 주어짐.
		 * 
		 */
		
		/*
  		int currentX = P;	// 개미의 현재 X좌표
		int currentY = Q;	// 개미의 현재 Y좌표
		int deltaX = 1;		// 1시간이 흐를 때 X좌표 증가
		int deltaY = 1;		// 1시간이 흐를 때 Y좌표 증가
		
		시간복잡도는 T에 비례 O(T), T는 2억이므로 T에 비례하는 시간복잡도는 사용 불가.
		
		다른 방법은?
		그래프를 그려서 생각해봄으로써 문제를 풀 수 있음.
		문제가 너무 어려워 구글링을 참고해서 풀었으니 추후에 다시 한 번 풀어보기...
		 */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int W = Integer.parseInt(st.nextToken());
		int H = Integer.parseInt(st.nextToken());

		st = new StringTokenizer(br.readLine());
		int P = Integer.parseInt(st.nextToken());
		int Q = Integer.parseInt(st.nextToken());
		int T = Integer.parseInt(br.readLine());
		int x = W - Math.abs(W - (P + T) % (W * 2));
		int y = H - Math.abs(H - (Q + T) % (H * 2));
		System.out.println(x + " " + y);
	}
}




