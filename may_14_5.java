
public class may_14_5 {

	public static void main(String[] args) {
	
	//1. int[5]�迭�� ����� �ش� ������ �����Ѵ�.
		int ar[] = new int[] {11,13,32,77,5,15,19,50,25};
	//2.�������� ����� �迭�� �����(���� ar.length ar[]�迭�� ���ڰ� �þ ��밡��)
		int ar1[] = new int[ar.length];
		
	//3.���迭�� �����Ѵ�(���� k = ar.length ar[]�迭�� ���� ������� ��밡��)
		int k = ar.length - 1;
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
