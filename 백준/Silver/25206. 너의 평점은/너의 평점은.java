import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		
		/*
		 * 전공평점 계산 프로그램 작성
		 * 전공평점 = 전공과목별 (학점 x 과목평점) 의 합을 학점의 총합으로 나눈값
		 *  A+	4.5
			A0	4.0
			B+	3.5
			B0	3.0
			C+	2.5
			C0	2.0
			D+	1.5
			D0	1.0
			F	0.0
		 * P/F 과목 중 P 인 과목은 계산에서 제외
		 */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st;
		Double sumCalc = 0.0;
		Double sumGrade = 0.0;
		
		for (int i = 0; i < 20; i++) {
			st = new StringTokenizer(br.readLine());
			
			String str = st.nextToken();
			Double hak = Double.parseDouble(st.nextToken());
			String grade = st.nextToken();
			double score = 0;
			
			if(!(grade.equals("P"))) {
				switch (grade) {
				case "A+":
					score = 4.5;
					break;
				case "A0":
					score = 4.0;
					break;
				case "B+":
					score = 3.5;
					break;
				case "B0":
					score = 3.0;
					break;
				case "C+":
					score = 2.5;
					break;
				case "C0":
					score = 2.0;
					break;
				case "D+":
					score = 1.5;
					break;
				case "D0":
					score = 1.0;
					break;
				case "F":
					score = 0.0;
					break;
				default:
					break;
				}
				sumCalc += (hak * score);
				sumGrade += hak;
			}
		}
		System.out.printf("%.6f", sumCalc/sumGrade);
		br.close();
	}
}
