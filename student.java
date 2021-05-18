
public class student {
	//이름
	String mName;
	//학년
	int mGrade;
	//번호
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
