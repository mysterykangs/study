
public class may_14_6
{

	public static void main(String[] args)
	{
	 //숙제 1
	//1. 0~12사이의 랜덤값을 생성한다 그리고 그값을 배열에 저장한다.
		int rn;
		int arTarget[] = new int[50];
		
		for(int i = 0; i < 50; i++)
		{
			rn = (int)(Math.random() * 13);
			arTarget[i] = rn;
						
		}
	
	//2. 결과 저장 테이블을 만든다.
		boolean[] arTable = new boolean[13];
		
		for(int i = 0; i < 13; i++)
			arTable[i] = false;
		
	//3. 랜덤값에 따라 결과저장테이블의 해당 숫자의 값을 true로 설정합니다.
		int value;
		for(int i =0; i < 50; i++)
		{
			value = arTarget[i];
			arTable[value] = true;
			System.out.println(arTable[i]);
		}
		
	//4. 
	}

}
