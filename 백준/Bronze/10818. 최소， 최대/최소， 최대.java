import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int min = 1000000;
		int max = -1000000;
		int n = sc.nextInt();
		int[] ar = new int[n];
		
		for(int i=0; i<n; i++) {
			ar[i] = sc.nextInt();
			if(max < ar[i]) {
				max = ar[i];
			}
			if(min > ar[i]) {
				min = ar[i];
			}
		}
		System.out.println(min +" "+max);
	}
}