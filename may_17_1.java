
public class may_17_1 {

	public static void main(String[] args) {
	
		//1. 0~12사이의 임의의 값을 생성한다
		
	    //2.생성된 숫자를 20크기의 int배열에 차례로 저장하시오.
		int ar[] = new int[20];
		
		for(int i = 0; i < ar.length; i++)
		{
			int rn = (int)(Math.random() * 13);
			ar[i] = rn;
			System.out.println(ar[i]);
		}
		//3.0~12의 모든 숫자가 이배열에 들어있는지 검사하는 프고르램을 만드시오

	}

}
