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
         *  첫째 줄에 응시자의 수 N, 상을 받는 사람의 수 k
         *
         *  둘째 줄에는 각 학생의 점수 x가 공백을 사이에 두고 주어짐
         *
         *  ouput : 상을 받는 커트라인을 출력하라.
         */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        List<Integer> score = new ArrayList<>();

        st = new StringTokenizer(br.readLine(), " ");

        for(int i=0 ; i<N; i++){
            score.add(Integer.parseInt(st.nextToken()));
        }

        Collections.sort(score);
        Collections.reverse(score);
        System.out.println(score.get(k-1));
    }
}
