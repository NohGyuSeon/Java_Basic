     /* Ŭ������ ��ü ������ ���� �ʵ�(�Ӽ�)�� �Լ�(�޼ҵ�)�� �����ϴ� 
  	 ���赵��, Java�� �ƹ��� ���� ���α׷��̶� Ŭ������ ���� ����ؾ���.
	 
	 ���� Ŭ���� �̸��� ���ϰ� ��ü ������ ���� �ʵ�(�Ӽ�)�� �Լ�(�޼ҵ�)��
	 ������. �̋� ����ϴ� ����� class �̴�.
	 
	 �ι����� �� ���� ��ü ������. Ŭ������ �̿��� ��ü�� �����ؾ� ���α׷�����
	 ����� �� ����. �� �� ����ϴ� ����� new �̴�.
	 
	 ���Ŀ��� ������ ��ü���� �̿��Ͽ� ���α׷��� �ڵ��ϸ��
	 �Լ� ��뿡 �־� �Լ��� �����ϰ� ȣ���ϴ� ����� C���� ���� �ٸ���
	 �� �˾Ƶα� �ٶ�.   */
	class Employee{   // class �Ӽ�
		String name;
		int idNum;
		int salary;
		boolean sex;
	}
	public class Ŭ������_�޼ҵ� {
	public static void main (String[] args) {
		Employee myjik = new Employee();
		myjik.name ="ȫ�浿";
		myjik.idNum =17001;
		myjik.salary =4500000;
		myjik.sex =true;
		System.out.printf("%s\n", myjik.name);
		System.out.printf("%s\n", myjik.idNum);
		System.out.printf("%s\n", myjik.salary);
		System.out.printf("%s\n", myjik.sex);
	}
	
}
