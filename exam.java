
public class exam {

	public static void main(String[] args) {

		student s1 = new student();
		student s2 = new student();
		
		s1.mName = "Kang";
		s1.mGrade = 1;
		s1.mNumber = 1;
		
		s2.mName = "Kim";
		s2.mGrade = 1;
		s2.mNumber = 2;
		
		System.out.println(s1.mName);
		System.out.println(s1.mNumber);
		System.out.println(s1.mGrade);
		
		System.out.println(s2.mName);
		System.out.println(s2.mNumber);
		System.out.println(s2.mGrade);
	}

}
