
public class student {
	//�̸�
	String mName;
	//�г�
	int mGrade;
	//��ȣ
	int mNumber;

	student(String name, int grade, int number)
	{
		
		mName = name;
		mGrade = grade;
		mNumber = number;
		
	}
	
	void setName(String name)
	{
		mName = name;
	}
	
	String getName()
	{
		return mName;
	}
	
}
