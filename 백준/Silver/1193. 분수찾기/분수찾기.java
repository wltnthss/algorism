import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		/*
		 * 지그재그 분수 X번째 구하기.
		 * 
		 *  1. 입력받는 숫자 분수 몇 번째 그룹인지
		 *  2. 행의 몇번 째 값인지
		 *  3. 짝수 - 분자 증가, 분모 감소
		 *  4. 홀수 - 분자 감소, 분모 증가
		 */
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int X=Integer.parseInt(br.readLine());
		int n=0;
		int top=1;
		int bot=1;
		int cnt=0;
		if(X==1) {
			System.out.println("1/1");
		}else {
			while(cnt<X){
				n++;
				cnt=n*(n+1)/2; //몇번 째 행인지 찾는 코드
			}
			int num=X-(n-1)*n/2;  //행의 몇번 째 값인지 찾는 코드
			if(n%2==0) {  //짝수 행일 시 
				top=num;
				bot=n-num+1;
			}else {
				top=n-num+1;
				bot=num;
			}
			System.out.println(top+"/"+bot);
		}
	}
}
