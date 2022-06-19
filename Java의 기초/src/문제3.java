
public class 문제3 {
	public static void main(String[] args) {
		String str = "Programming";
		int n = str.length(); // n 11
		char[] st = new char [n]; // n개의 배열 st
		n--; // n 10
		for (int k=n; k>=0; k--) {
			st[n-k] = str.charAt(k);
		} // st[0] = str.charAt(10), st[1] = str.charAt(9), '''
		for (char k:st) { 
			System.out.printf("%c", k);
		}
	}             

}