package StarPatter;

public class p06RightAlignedInverted {

	public static void main(String[] args)
	{
		for(int i=1; i<=4; i++)
		{
			for(int j=1; j<=i; j++)
			{
				System.out.print(" ");
			}
			
			for(int k=4; k>=i; k--)
			{
				System.out.print("*"); // println ऐवजी print वापर
			}
			
			System.out.println(); // एका पूर्ण ओळी नंतर नवीन ओळ
		}
	}

}

//
//****
//***
// **
//  *




