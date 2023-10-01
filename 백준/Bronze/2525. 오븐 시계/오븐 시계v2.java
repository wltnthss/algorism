import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		/*
		 * 입력한 시간과 분에서 두번 째 줄에 입력한 시간을 더한값 출력.
		 */
		Scanner sc = new Scanner(System.in);
		
		int H = sc.nextInt();
		int M = sc.nextInt();
		int C = sc.nextInt();
		
		/*
		 * 분과 입력한 시간을 더한 값이 60을 넘을 때
		 * 
		 * 1. 분을 60으로 나눈 값 만큼 시간 증가, 나머지는 분
		 * 2. 시간이 24이상인 경우 증가한 시간만큼 -24
		 * 3. 분이 60인 경우는 0으로 표기 
		 */
		if((M+C) >= 60) {
			int addHour;
			int minute;
			 
			addHour = H + ((M+C) / 60);
			minute = (M+C) % 60;
			
			if((addHour) >= 24) {
				addHour = addHour - 24;
			}
			if(minute == 60) {
				minute = 0;
			}
			
			System.out.println(addHour + " " + minute);
			
		}else {
			System.out.println(H + " " + (M + C));
		}
	}
}
