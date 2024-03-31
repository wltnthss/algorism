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
         */


        Scanner sc = new Scanner(System.in);
        int cnt = 0;

        while(true){
            String str = sc.nextLine();

            for (int i = 0; i < str.length(); i++) {
                Character ch = str.charAt(i);

                if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                    cnt++;
                }
            }
            if(str.equals("#")){
                break;
            }
            System.out.println(cnt);
            cnt = 0;
        }
    }
}
