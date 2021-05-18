
public class may_14_2 {

	public static void main(String[] args) 
	{
		//10~100의 배열을 만든다
		int ar[] = new int[] {10,20,30,40,50,60,70,80,90,100};
		int total = 0;
		
		//모든 배열의 합을 구한다
	for(int i = 0; i < ar.length; i++)
	{
		total = total + ar[i];
	}
	
	  System.out.println(total);
		
	}
}
	
