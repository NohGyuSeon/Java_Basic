
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
                                    
                      // 2�������� ''' 1 
                     //             +1
                     //             10

/*
   ~ ���� ''' 2�Ǻ��� = 1�Ǻ��� + 1
   ^ xor ''' ������ 0, ���� �ٸ��� 1
   & or ''' ���ϱ�  
   | and ''' ���ϱ� 
  
*/
