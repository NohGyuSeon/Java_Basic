import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("총 몇 명의 학생이 존재합니까? ");
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
			System.out.println("학생의 이름을 입력하세요 : ");
			name = scan.next();
			System.out.println("학생의 나이을 입력하세요 : ");
			age = scan.nextInt();
			System.out.println("학생의 키을 입력하세요 : ");
			height = scan.nextInt();
			System.out.println("학생의 몸무게을 입력하세요 : ");
			weight = scan.nextInt(); 
			System.out.println("학생의 학번을 입력하세요 : ");
			studentID = scan.next();
			System.out.println("학생의 학년을 입력하세요 : ");
			grade = scan.nextInt();
			System.out.println("학생의 학점을 입력하세요 : ");
			gPA = scan.nextDouble();
			students[i]	= new Student(name, age, height, weight, studentID, grade, gPA);
		}
		for(int i = 0; i < number; i++)
		{
			students[i].show();
		}
		
	}
	
}
