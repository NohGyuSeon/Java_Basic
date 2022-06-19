
public class Java_128 {
	public static int a = 1;  // 전역 변수 a
	public static void main (String[] args) {
		increase();
		increase();
	}
	static void increase() {
		int b = 2;   // 지역 변수 b
		System.out.printf("%d, %d\n", ++a, ++b);
	}

}
 