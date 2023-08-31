package repeat;

import java.util.Scanner;

public class c7 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("x값 입력 : ");
        int x = sc.nextInt();
        System.out.print("y값 입력 : ");
        int y = sc.nextInt();
    
        System.out.println("x, y를 포함한 사이의 모든 정수값은? " + sum(x, y));
    }

    public static int sum(int x, int y){
        int sum = 0;

        if(x > y){
            for(int i=y; i<=x; i++){
                sum += i;
            }
            
        }else if(x < y){
            for(int i=x; i<=y; i++){
                sum += i;
            }
        }
        return sum;
    }
}
