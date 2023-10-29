import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

interface Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine()), sum = 0;
        while(n != -1) {
            sb.setLength(0);
            sb.append(n + " = 1");
            sum = 1;
            for(int i=2; i<n; i++) {
                if(n%i==0) {
                    sb.append(" + " + i);
                    sum += i;
                }
            }
            if(sum == n) {
                System.out.println(sb);
            } else {
                System.out.println(n + " is NOT perfect.");
            }
           n = Integer.parseInt(br.readLine());
        }
    }
}