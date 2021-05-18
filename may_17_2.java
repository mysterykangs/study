
public class may_17_2 {

	public static void main(String[] args) {
	 
		int dan = 2;
		int mul = 1;
		
		for(int i = 0; i < 8 ; i++)
		{
			System.out.println(dan+"´Ü");
			mul = 1;
			for(int k = 0; k < 9; k++)
			{
				System.out.println(dan + "*" + mul + "=" +(dan*mul) );
				mul++;
			}
			dan++;
		}

	}

}
