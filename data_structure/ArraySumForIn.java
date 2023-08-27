package data_structure;

public class ArraySumForIn {
    /*
     * 확장 for문 사용
     * 1. 배열의 길이 조사하는 코드 간결화
     * 2. iterator와 같은 방법 스캔 가능
     */
    public static void main(String[] args) {
        double[] a = {1.0, 2.0, 3.0, 4.0, 5.0};

        for(int i=0; i<a.length; i++){
            System.out.println("a[" + i + "] = " + a[i]);
        }

        double sum = 0;

        for(double i : a){
            sum += i;
        }
        
        System.out.println("모든 요소의 합은 " + sum + "입니다.");
    }

}
