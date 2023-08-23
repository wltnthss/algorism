package data_structure;

public class PrimNumber1 {

    /*
     * 소수 나열, 자신과 1외의 정수로 나누어떨어지지 않는 정수 알고리즘
     * i % n == 0 , break로 하면 될까
     */

    public static void main(String[] args) {
    
    int counter = 0;
    int j;

    for(int i=2; i<=1000; i++){

        for(j=2; j < i; j++){
            counter ++;
            if(i % j == 0){
                break;
            }
        }
        if(i == j){
            System.out.println(i);
        }
    }
    System.out.println("나눗셈을 수행한 횟수 : " + counter);
    }

    // i가 2또는 3으로 나누어떨어지지않으면 4 또는 6도 해당됨.
    // 위와 같이 설계하면 불필요한 나눗셈을 하므로 수정 필요.
}

