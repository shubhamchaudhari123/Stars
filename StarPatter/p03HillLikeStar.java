package StarPatter;

public class p03HillLikeStar
{
	public static void main(String[] args)
	{
		
		for(int i=1; i<=4; i++)
		{
			for(int j=1; j<=i; j++)
			{
				System.out.print("*");
			}
			System.err.println();
		}
		
		 for(int i = 4; i >= 1; i--)  
	        {
	            for(int j = 1; j <= i; j++)
	            {
	                System.out.print("*");
	            }
	            System.out.println();
	        }
	}
}

//*
//**
//***
//****
//****
//***
//**
//*

