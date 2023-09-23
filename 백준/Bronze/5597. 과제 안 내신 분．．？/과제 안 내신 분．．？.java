import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = 0;
		int[] arr = new int[31];
		int flag = 0;
		
		/*
		 * 입력 28개, 1~30개의 출석번호중 없는 숫자를 작은거 순으로 출력
		 * 
		 * 30개중 입력되는 숫자를 지워나가거나 채워가면서?
		 */
		
		for(int i=1; i<29; i++) {
			int n = sc.nextInt();
			arr[n] = 1;
		}
		
		for(int j=1; j<arr.length; j++) {
			if(arr[j] != 1) {
				System.out.println(j);
			}
		}
	}
}