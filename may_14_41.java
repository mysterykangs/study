
public class may_14_41 {

	public static void main(String[] args) {
	//1. int[5]�迭�� ����� �ش� ������ �����Ѵ�.
		int ar[] = new int[] {11,13,32,77,5,15,19};
		//�������� ����� �迭�� �����
		int ar1[] = new int[5];
	//2. ���迭�� ����Ѵ�
		for(int i = 0; i <ar.length; i++)
		{
			System.out.println(ar[i]);
		}
	//3.���迭�� �����Ѵ�
		int k = 4;
		for (int i = 0; i<ar.length; i++)
		{
		    ar1[k] = ar[i];	
		    k = k - 1;
		}
	//3.���迭�� ����Ѵ�
		for(int i = 0; i <ar.length; i++)
		{
			
			System.out.println(ar1[i]);
		}

	}

	
}


