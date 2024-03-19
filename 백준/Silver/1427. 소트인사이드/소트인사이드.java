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
import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws IOException {

        /*
         *
         *  input :
         *
         *  첫째 줄에 정렬하려고 하는 수 N,  N은 1,000,000,000보다 작거나 같은 자연수
         *
         *  ouput :
         *
         *  첫째 줄에 자리수를 내림차순으로 정렬한 수를 출력
         */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String N = br.readLine();
        char[] ch = N.toCharArray();

        Arrays.sort(ch);

        for (int i = ch.length - 1; i >= 0; i--) {
            System.out.print(ch[i]);
        }
    }
}
