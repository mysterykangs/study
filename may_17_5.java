
public class may_17_5 
{
	public static void main(String[] args) 
	{
		// 1.��ȣ�� ����� �迭�����
		// 2.��ȣ����(������ȣ)
		// 3.�ߺ��ľ��� ����
		// 4.���
		
		int nNumber;
		int [] arLotto = new int[6];	// �ζ� ��ȣ�� ����� �迭
		
		boolean isExist = false;
		int pos = 0;
				
		while(pos < arLotto.length)
		{
			//1. ��ȣ ����
			nNumber = (int)(Math.random() * 45) + 1; // 1~45
		
			//2. �̹�ȣ�� �����ϴ�?
			for (int k = 0; k < 6; k++)
			{
				// �̹� �� ��ȣ�� ������.
				if (nNumber == arLotto[k])
				{				
					isExist = true;
					break;
				}
						
			}
		
			// 3. �������� �ʴ� ���ο� ��ȣ�� �ζ� �迭�� ����, pos++;
			if (isExist == false)
			{				
				arLotto[pos] = nNumber;
				pos++;
			
			}
			else
			{
				isExist = false;
				
				
			}
		
		}// end of while statement
		
		// ���
		for (int i = 0; i < arLotto.length; i++)
		{
			System.out.println(arLotto[i]);
		}		
	}
}
