
public class Java에서의_배열_처리_예제 { // 향상된 for문
	public static void main(String[] args) {
		int[]a = {90,100,80,70,60,50,30}; // new int[7]; 
		int hap =0;
		float avg; // 평균값 실수형 선언
		for (int i : a) // a 배열의 개수만큼 for문 반복
			hap = hap + i;
		avg = (float)hap / a.length;
			System.out.printf("%d, %.2f", hap, avg);
	}
	
}
 