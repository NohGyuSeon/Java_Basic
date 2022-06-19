     /* 클래스는 객체 생성을 위한 필드(속성)와 함수(메소드)를 정의하는 
  	 설계도로, Java는 아무리 작은 프로그램이라도 클래스를 만들어서 사용해야함.
	 
	 먼저 클래스 이름을 정하고 객체 생성을 위한 필드(속성)와 함수(메소드)를
	 정의함. 이떄 사용하는 명령이 class 이다.
	 
	 두번쨰로 할 일은 객체 생성임. 클래스를 이용해 객체를 생성해야 프로그램에서
	 사용할 수 있음. 이 떄 사용하는 명령이 new 이다.
	 
	 이후에는 생성된 객체들을 이용하여 프로그램을 코딩하면됨
	 함수 사용에 있어 함수를 선언하고 호출하는 방법이 C언어와 조금 다르니
	 잘 알아두기 바람.   */
	class Employee{   // class 속성
		String name;
		int idNum;
		int salary;
		boolean sex;
	}
	public class 클래스와_메소드 {
	public static void main (String[] args) {
		Employee myjik = new Employee();
		myjik.name ="홍길동";
		myjik.idNum =17001;
		myjik.salary =4500000;
		myjik.sex =true;
		System.out.printf("%s\n", myjik.name);
		System.out.printf("%s\n", myjik.idNum);
		System.out.printf("%s\n", myjik.salary);
		System.out.printf("%s\n", myjik.sex);
	}
	
}
