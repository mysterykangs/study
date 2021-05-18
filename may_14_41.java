
public class may_14_41 {

	public static void main(String[] args) {
	//1. int[5]배열을 만들고 해당 값으로 설정한다.
		int ar[] = new int[] {11,13,32,77,5,15,19};
		//역순으로 저장된 배열을 만든다
		int ar1[] = new int[5];
	//2. 정배열로 출력한다
		for(int i = 0; i <ar.length; i++)
		{
			System.out.println(ar[i]);
		}
	//3.역배열로 저장한다
		int k = 4;
		for (int i = 0; i<ar.length; i++)
		{
		    ar1[k] = ar[i];	
		    k = k - 1;
		}
	//3.역배열로 출력한다
		for(int i = 0; i <ar.length; i++)
		{
			
			System.out.println(ar1[i]);
		}

	}

	
}


