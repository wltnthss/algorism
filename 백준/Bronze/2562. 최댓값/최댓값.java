import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [] ar = new int[9];
		int max = ar[0];
		int num = 0;
		
		for(int i = 0; i < ar.length; i++) {
			ar[i] = sc.nextInt();
		}
		
		//최대값
		for(int i = 0; i < ar.length; i++) {
			if(max < ar[i]) {
				max = ar[i];
				num = i+1;
			}
		}	
		System.out.println(max);
		System.out.println(num);
	}
}
