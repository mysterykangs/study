
public class may_14_6
{

	public static void main(String[] args)
	{
	 //���� 1
	//1. 0~12������ �������� �����Ѵ� �׸��� �װ��� �迭�� �����Ѵ�.
		int rn;
		int arTarget[] = new int[50];
		
		for(int i = 0; i < 50; i++)
		{
			rn = (int)(Math.random() * 13);
			arTarget[i] = rn;
						
		}
	
	//2. ��� ���� ���̺��� �����.
		boolean[] arTable = new boolean[13];
		
		for(int i = 0; i < 13; i++)
			arTable[i] = false;
		
	//3. �������� ���� ����������̺��� �ش� ������ ���� true�� �����մϴ�.
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
