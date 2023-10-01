import java.util.Scanner;

public class Main {

   public static void main(String[] args) {
          
	Scanner sc = new Scanner(System.in);	
	//테스트 케이스 개수 T
	int c = sc.nextInt();
	int arr[] = new int[c];
	
	for(int i=0; i<c; i++) {
		//A, B 입력
		int a = sc.nextInt();
		int b = sc.nextInt();
		arr[i] = a + b;
	}	
	for (int j : arr) {
		System.out.println(j);
	}	
   }
}


