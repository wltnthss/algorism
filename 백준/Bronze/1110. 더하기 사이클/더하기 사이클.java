import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {

		/*
		 *  주어진 수의 가장 오른쪽 자리 수와 앞에서 구한 합의 가장 오른쪽 자리 수를 이어 붙이면 새로운 수
		 *  N이 주어졌을 때, N의 사이클의 길이를 구하는 프로그램
		 * 
		 * input : 26
		 * 
		 * 1. 2 + 6 = 8 -> 68
		 * 2. 6 + 8 = 14 -> 84
		 * 3. 8 + 4 = 12 -> 42
		 * 4. 4 + 2 = 6 -> 26  ==== > 4 가 정답
		 *  
		 * output : 4
		 */

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int FirstN = N;
		
		int result = 0;
		String newNum = "";
		
		// 입력한 N이 10이상인 경우
		do {
			
			if((N / 10) >= 0) {
				
				int n10 = N / 10;
				int n1 = N % 10;
				
//				System.out.println("n10 => " + n10);
//				System.out.println("n1 => " + n1);
				
				// 1. 오른쪽 자리 수와 앞에서 구한 합의 가장 오른쪽 자리 수를 이어붙여 새로운 값을 구한다.
				// 2. 언제까지? 이어붙인 새로운 값이 N 이 될 때 까지
				
				// 첫쨰자리와 둘째 자리를 더한 값
				int sum = n10 + n1;
//				System.out.println("sum => " + sum);
				// 더한 값의 오른쪽 자리 수를 구한 값
				int rightNum = sum % 10;
//				System.out.println("rightNum => " + rightNum);
				
				// 새로운 수 
				newNum = "" + n1 + rightNum;
//				System.out.println("newNum => " + newNum);
				
				N = Integer.parseInt(newNum);
				result += 1;
				
//				System.out.println("N => " + N);
//				System.out.println("newNum => " + newNum);
				
				if(N == FirstN) {
					break;
				}
				
			} else {	// 입력한 N이 10미만인 경우 앞에 0을 붙인다.
				
				int n10 = 0;
				int n1 = N % 10;
				
//				System.out.println("n10 => " + n10);
//				System.out.println("n1 => " + n1);
				
				// 1. 오른쪽 자리 수와 앞에서 구한 합의 가장 오른쪽 자리 수를 이어붙여 새로운 값을 구한다.
				// 2. 언제까지? 이어붙인 새로운 값이 N 이 될 때 까지
				
				// 첫쨰자리와 둘째 자리를 더한 값
				int sum = n10 + n1;
//				System.out.println("sum => " + sum);
				// 더한 값의 오른쪽 자리 수를 구한 값
				int rightNum = sum % 10;
//				System.out.println("rightNum => " + rightNum);
				
				// 새로운 수 
				newNum = "" + n1 + rightNum;
//				System.out.println("newNum => " + newNum);
				
				N = Integer.parseInt(newNum);
				result += 1;
				
//				System.out.println("N => " + N);
//				System.out.println("newNum => " + newNum);
				
				
				if(N == FirstN) {
					break;
				}
			}
			
		} while(N == Integer.parseInt(newNum));
		
		System.out.println(result);
		
	}
}
