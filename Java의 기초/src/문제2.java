
public class ����2 {
	public static void main(String args[]) {
		int[][]a = {{11, 12, 13, 14},
				    {21, 22, 23, 24},
		           };
		int hap = 0;         //         0   1   2   3
		for (int i[]:a)      // �迭a 0  11  12  13  14 
		{                    //      1  21  22  23  24
			for (int j:i)    // �迭i    11  12  13  14
				hap = hap+j; // �迭i    21  22  23  24
		}
		System.out.printf("%d", hap);
	}
	
}
