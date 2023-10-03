import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		/*
		 * 16개의 피스를 사용하며, 킹 1개, 퀸 1개, 룩 2개, 비숍 2개, 나이트 2개, 폰 8개로 구성
		 * 
		 * 개수 1 1 2 2 2 8
		 * 
		 * 입력 0 1 2 2 2 7
		 * 출력 1 0 0 0 0 1
		 * 
		 * 입력 2 1 2 1 2 1
		 * 출력 -1 0 0 1 0 7
		 * 
		 * 1. 정답인 개수를 배열에 저장.
		 * 2. 배열의 개수만큼 입력
		 * 3. 양수의 개수만큼 +, 음수의 개수만큼 -
		 * 
		 */
		
		Scanner sc = new Scanner(System.in);
		
		int[] correct = {1, 1, 2, 2, 2, 8};
		int[] input = new int[6];
		int[] output = new int[6];
		
		for (int i = 0; i < correct.length; i++) {
			input[i] = sc.nextInt();
			
			if(input[i] < correct[i]) {
				output[i] = correct[i] - input[i];
			}else if(input[i] == correct[i]) {
				output[i] = 0;
			}else {
				output[i] = -(input[i] - correct[i]);
			}
		}
		
		for (int i = 0; i < output.length; i++) {
			System.out.print(output[i] + " ");
		}
	}
}
