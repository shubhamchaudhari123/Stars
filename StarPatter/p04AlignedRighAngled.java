package StarPatter;

public class p04AlignedRighAngled {

	public static void main(String[] args)
	{
		
		 for(int i = 1; i <= 4; i++)  // Rows
	        {
	            for(int j = 4; j > i; j--)  // Spaces
	            {
	                System.out.print(" ");
	            }

	            for(int k = 1; k <= i; k++)  // Stars
	            {
	                System.out.print("*");
	            }

	            System.out.println();  // New line after each row
	        }
	}

}

//*
//**
//***
//****

