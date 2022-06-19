
public class Java의_문자열 {
	/* C언어에서는 문자열을 배열에 넣고 배열의 이름을 이용하든지
	 포인터 변수를 이용해 처리했지만 Java에서는 주소를 컨트롤하는
	 기능이 없기 때문에 불가능함. 하지만 Java에서는 문자열을 처리 할 수
	 있도록 클래스를 제공함. 클래스를 제공하므로 당연히 그에 따른 속성과
	 메소드도 지원하는데 여기서는 문제 풀이에 꼭 필요한 속성과 메소드만
	 언급하도록 하겠습니다   */
	public static void main(String[] args) {
		String str = "Information!"; // 배열 변수 선언 초기값
		int n = str.length(); // n=12
		char[] st = new char [n]; // 배열st 12개 (0~11)
		n--; // n=11  
		for (int k =n; k>=0; k--){ // k 11 10 9 ''' 2 1 0
			st[n-k] = str.charAt(k);
	  } // st[0] = str.charAt(11), st[1] = str.charAt (10), ''' 
		for(char k :st) {
			System.out.printf("%c",k);	 
	  }          // '''!noitamrofnI 
		
   }

}
