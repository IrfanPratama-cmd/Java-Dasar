import java.util.Scanner; 
public class SoalMethod4 {
	static Scanner input = new Scanner (System.in);
	public static void main(String[]args)
	
	{
		int n;
		System.out.print("Nilai Faktorial yg ingin dihitung :");
		n=input.nextInt();input.nextLine();
		System.out.println("Jadi "+n+"! adalah "+faktorial(n));	
	}
	
	public static int faktorial (int x)
	{
		int hasil=1;
		if (x !=0)
		{
			for (int i=1;i<=x;i++)
			{
				hasil=hasil*i;
			}
		}
		else
		{
			hasil=1;
		}
		return hasil;
	}
}