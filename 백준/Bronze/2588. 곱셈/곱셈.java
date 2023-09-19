import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n1 = sc.nextInt();
		int n2 = sc.nextInt();

		int o1 = (n2 % 100) % 10 * n1;
		int o2 = (n2 % 100) / 10 * n1;
		int o3 = (n2 / 100) * n1;
				
		System.out.println(o1);
		System.out.println(o2);
		System.out.println(o3);
		System.out.println(n1 * n2);
	}
}