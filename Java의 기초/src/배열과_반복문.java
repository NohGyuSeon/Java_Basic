
public class 배열과_반복문 {  
	/* Java에서는 향상된 for문을 사용할 수 있는데, 향상된 for문은
	 객체를 대상으로만 가능함. Java에서는 배열을 객체로 취급하며,
	 배열을 이용하여 작업 할 떄 필요할 만한 내용은 이미 API로 만들어 
	 두었기 때문에 잘 골라서 사용하면 됨   */
	public static void main(String[] args) {
		int a[] =new int[5]; // C언어 int a[5];
		int i;
		for (i=0; i<5; i++)
			a[i] = i+10; // a[i] 10 11 12 13 14
		for (i=0; i<5; i++)
			System.out.printf("%4d ",a[i]);
	} 
      // '''  10   11   12   13   14 
}
  