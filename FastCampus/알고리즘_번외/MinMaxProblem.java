package FastCampus.알고리즘_번외;

public class MinMaxProblem {

	public static void main(String[] args) {
		
		/*
		 * 배열에 있는 여러 개 수 중에 큰 값과 작은 값
		 * 
		 * ex) 10 55 23 2 79 101 16 82 30 45
		 */
		
		int[] arr = {10, 55, 23, 2, 79, 101, 16, 82, 30, 45};
		int min = arr[0];
		int max = arr[0];
		
		for(int i=0; i<arr.length; i++) {
			if(min > arr[i]){
				min = arr[i];
			}
			if(max < arr[i]) {
				max = arr[i];
			}
		}
		System.out.print("최대값 : " + max);
		System.out.print("\t최소값 : " + min);
	}
}