
public class 문제4 {
	public static void main (String[] args) {
		int[][]a = new int[3][5];
		for(int i=0; i<3; i++) {
			for(int j=0; j<5; j++) {
				a[i][j] = i+j;
				System.out.printf("%d ", a[i][j]);
			}
			System.out.println();
		}
	}

}                   
                      /*   <출력>
                           0 1 2 3 4                               
                           1 2 3 4 5
                           2 3 4 5 6   */
                       
                       