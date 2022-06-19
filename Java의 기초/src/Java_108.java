
public class Java_108 {
	public static void main (String[] args) {
		byte a = 15, b = 19;   // 1byte = 8bit
		System.out.printf("%d\n", ~a); // 10010000
		System.out.printf("%d\n", a^b); // 00011100 
		System.out.printf("%d\n", a&b); // 00000011
		System.out.printf("%d\n", a|b); // 00011111
	}
                        // a 15 00001111
}                       // b 19 00010011
                                    
                      // 2진수에서 ''' 1 
                     //             +1
                     //             10

/*
   ~ 부정 ''' 2의보수 = 1의보수 + 1
   ^ xor ''' 같으면 0, 서로 다르면 1
   & or ''' 곱하기  
   | and ''' 더하기 
  
*/
