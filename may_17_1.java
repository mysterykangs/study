
public class may_17_1 {

	public static void main(String[] args) {
	
		//1. 0~12������ ������ ���� �����Ѵ�
		
	    //2.������ ���ڸ� 20ũ���� int�迭�� ���ʷ� �����Ͻÿ�.
		int ar[] = new int[20];
		
		for(int i = 0; i < ar.length; i++)
		{
			int rn = (int)(Math.random() * 13);
			ar[i] = rn;
			System.out.println(ar[i]);
		}
		//3.0~12�� ��� ���ڰ� �̹迭�� ����ִ��� �˻��ϴ� �������� ����ÿ�

	}

}
