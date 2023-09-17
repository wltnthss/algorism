package FastCampus.ch01_문자열;

import java.util.Scanner;

public class 소금폭탄v1 {
    
    public static void main(String[] args) {
        
        /*
         * 첫째 줄 입력은 현재 시간 hh:mm:ss
         * 두 번째 줄에는 소금 투하 시간 hh:mm:ss
         * 
         * 출력은 소금이 투하할때까지 필요한 시간 hh:mm:ss 출력
         */

        Scanner sc = new Scanner(System.in);
        String currentTime = sc.next();
        String targetTime = sc.next();

        String[] arrayCurrentTime = currentTime.split(":");

        int currentHour = Integer.parseInt(arrayCurrentTime[0]);
        int currentMinute = Integer.parseInt(arrayCurrentTime[1]);
        int currentSecond = Integer.parseInt(arrayCurrentTime[2]);

        String[] arrayTargetTime = targetTime.split(":");

        int targetHour = Integer.parseInt(arrayTargetTime[0]);
        int targetMinute = Integer.parseInt(arrayTargetTime[1]);
        int targetSecond = Integer.parseInt(arrayTargetTime[2]);

        int currentTotalTime = currentHour * 3600 + currentMinute * 60 + currentSecond;
        int currentTargetlTime = targetHour * 3600 + targetMinute * 60 + targetSecond;

        int needTime = currentTargetlTime - currentTotalTime;

        if(needTime <= 0){       
            needTime += 24 * 3600;
        }

        int needHour = needTime / 3600;
        int needMinute = (needTime % 3600) / 60;
        int needSecond = needTime % 60;

        System.out.printf("%02d:%02d:%02d", needHour, needMinute, needSecond);
        
         
         
    }
}
