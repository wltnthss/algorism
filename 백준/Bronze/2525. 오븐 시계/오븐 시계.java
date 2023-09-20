import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int i1 = sc.nextInt();
		int i2 = sc.nextInt();
		int add = sc.nextInt();
		
		/*
		 * 시간을 분으로 바꿔서 계산
		 */
		int total = 60 * i1 + i2 + add;

		int hour = (total / 60) % 24;
		int minute = total % 60;

		System.out.println(hour + " " + minute);
	}
}