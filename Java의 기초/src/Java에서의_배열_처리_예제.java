
public class Java������_�迭_ó��_���� { // ���� for��
	public static void main(String[] args) {
		int[]a = {90,100,80,70,60,50,30}; // new int[7]; 
		int hap =0;
		float avg; // ��հ� �Ǽ��� ����
		for (int i : a) // a �迭�� ������ŭ for�� �ݺ�
			hap = hap + i;
		avg = (float)hap / a.length;
			System.out.printf("%d, %.2f", hap, avg);
	}
	
}
 