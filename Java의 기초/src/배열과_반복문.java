
public class �迭��_�ݺ��� {  
	/* Java������ ���� for���� ����� �� �ִµ�, ���� for����
	 ��ü�� ������θ� ������. Java������ �迭�� ��ü�� ����ϸ�,
	 �迭�� �̿��Ͽ� �۾� �� �� �ʿ��� ���� ������ �̹� API�� ����� 
	 �ξ��� ������ �� ��� ����ϸ� ��   */
	public static void main(String[] args) {
		int a[] =new int[5]; // C��� int a[5];
		int i;
		for (i=0; i<5; i++)
			a[i] = i+10; // a[i] 10 11 12 13 14
		for (i=0; i<5; i++)
			System.out.printf("%4d ",a[i]);
	} 
      // '''  10   11   12   13   14 
}
  