
public class Java_128 {
	public static int a = 1;  // ���� ���� a
	public static void main (String[] args) {
		increase();
		increase();
	}
	static void increase() {
		int b = 2;   // ���� ���� b
		System.out.printf("%d, %d\n", ++a, ++b);
	}

}
 