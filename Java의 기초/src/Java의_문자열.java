
public class Java��_���ڿ� {
	/* C������ ���ڿ��� �迭�� �ְ� �迭�� �̸��� �̿��ϵ���
	 ������ ������ �̿��� ó�������� Java������ �ּҸ� ��Ʈ���ϴ�
	 ����� ���� ������ �Ұ�����. ������ Java������ ���ڿ��� ó�� �� ��
	 �ֵ��� Ŭ������ ������. Ŭ������ �����ϹǷ� �翬�� �׿� ���� �Ӽ���
	 �޼ҵ嵵 �����ϴµ� ���⼭�� ���� Ǯ�̿� �� �ʿ��� �Ӽ��� �޼ҵ常
	 ����ϵ��� �ϰڽ��ϴ�   */
	public static void main(String[] args) {
		String str = "Information!"; // �迭 ���� ���� �ʱⰪ
		int n = str.length(); // n=12
		char[] st = new char [n]; // �迭st 12�� (0~11)
		n--; // n=11  
		for (int k =n; k>=0; k--){ // k 11 10 9 ''' 2 1 0
			st[n-k] = str.charAt(k);
	  } // st[0] = str.charAt(11), st[1] = str.charAt (10), ''' 
		for(char k :st) {
			System.out.printf("%c",k);	 
	  }          // '''!noitamrofnI 
		
   }

}
