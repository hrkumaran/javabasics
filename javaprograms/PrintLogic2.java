package basic.javaprograms;

public class PrintLogic2 {

	public static void main(String[] args) {
		for(int i=0;i<=5;i++)
		{
			for(int m=0; m<i; m++)
			{
				System.out.print(" ");
			}
			for(int j=5-i;j>=1; j--)
			{
			System.out.print(j);
			}
			System.out.println();
			}

	}

}
