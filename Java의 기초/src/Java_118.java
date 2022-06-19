
public class Java_118 {
	public static void main (String[] args) {
		int a, b, c, hap;
		a = b = c = 2;
		hap = ++a|b--&c--;
		System.out.printf("%d %d %d %d", hap, a, b, c);
	}

}
/*
 0000''''0010 2       
 0000''''0011 3
 
 0000''''0011 3 hap 
 
*/







