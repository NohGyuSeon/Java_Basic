import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("�� �� ���� �л��� �����մϱ�? ");
		int number = scan.nextInt();
		Student[] students = new Student[number];
		for(int i = 0; i < number; i++)
		{
			String name;
			int age;
			int height;
			int weight;
			String studentID;
			int grade;
			double gPA;
			System.out.println("�л��� �̸��� �Է��ϼ��� : ");
			name = scan.next();
			System.out.println("�л��� ������ �Է��ϼ��� : ");
			age = scan.nextInt();
			System.out.println("�л��� Ű�� �Է��ϼ��� : ");
			height = scan.nextInt();
			System.out.println("�л��� �������� �Է��ϼ��� : ");
			weight = scan.nextInt(); 
			System.out.println("�л��� �й��� �Է��ϼ��� : ");
			studentID = scan.next();
			System.out.println("�л��� �г��� �Է��ϼ��� : ");
			grade = scan.nextInt();
			System.out.println("�л��� ������ �Է��ϼ��� : ");
			gPA = scan.nextDouble();
			students[i]	= new Student(name, age, height, weight, studentID, grade, gPA);
		}
		for(int i = 0; i < number; i++)
		{
			students[i].show();
		}
		
	}
	
}
