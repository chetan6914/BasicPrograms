package basic_programs;

public class Third_Quadrant_Star {

	public static void main(String[] args) {

		for(int i=0; i<5; i++)
		{			
			for(int j = 5; j>i; j--)
			{
				System.out.print(" ");
				
				for(int k=1; k>j; k--)
				{
					System.out.print("*");
				}
			}
			System.out.println("");
		}
	}

}
