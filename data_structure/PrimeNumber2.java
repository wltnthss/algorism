package data_structure;

public class PrimeNumber2 {
    
    /*
     * 정수 n은 제곱근 이하의 어떤 소수로도 나누어떨어지지 않음.
     * 배열 arr 을 예로 arr[i] * arr[i] 2씩 증가하는 홀수 for문 써보자.
     */
    public static void main(String[] args) {
        
        int cnt = 0;        //곱셈, 나눗셈 횟수
        int ptr = 0;        //찾은 소수 개수
        int[] arr = new int[500];   // 소수 저장 배열

        arr[ptr++] = 2;     //2 소수
        arr[ptr++] = 3;     //3 소수

        for(int i=0; i<ptr; i++){
            System.out.println("arr[" + i + "]" + " " + arr[i]);
        }
        System.out.println("ptr?? -> " + ptr);

        for(int n=5; n<=1000; n += 2){
            boolean flag = false;
            for(int i=1; arr[i] * arr[i] <= n; i++){    
                cnt += 2;
                if(n % arr[i] == 0){    // 소수가 아닌경우
                    flag = true;    //flag가 false일 때만(n이 소수) cnt 증가
                    break;
                }
            }
            if(!flag){
                arr[ptr++] = n;
                cnt++;
            }
        }
        for(int j=0; j< ptr; j++){
            System.out.println("arr[" + j + "]" + " " + arr[j]);
        }

        System.out.println("곱셈과 나눗셈 수행 횟수 : " + cnt);


    }
}
