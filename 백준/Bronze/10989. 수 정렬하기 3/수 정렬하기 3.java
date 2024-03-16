/**
 * packageName :
 * fileName : ${NAME}
 * author :  jisoo Son
 * date : 2024-03-15
 * description :
 * ===========================================================
 * DATE                 AUTHOR                NOTE
 * -----------------------------------------------------------
 * 2024-03-15             jisoo Son             최초 생성
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws IOException {

        /*
         *
         *  input :
         *
         *  첫째 줄에 수의 개수 N개, 둘째 줄부터는 N개의 줄에는 수 이 수는 1,000,000 보다 작거나 같은 정수
         *
         *  ouput :
         *
         *  N개의 줄에 오름차순으로 정렬한 결과 출력
         */

        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];

        for(int i = 0; i < N; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(arr);

        for(int i = 0; i < N; i++){
            sb.append(arr[i]).append('\n');
        }

        System.out.println(sb);
    }
}
