import java.util.Scanner; 
public class Array2DMatrix {
	static Scanner input = new Scanner (System.in);
	public static void main(String[]args) {
		int i,j;
		int ordo=4;
		int [][]A=new int[ordo][ordo];
		int [][]B=new int[ordo][ordo];
		int [][]C=new int[ordo][ordo];
		int [][]D=new int[ordo][ordo];
		
		//bagian inputan
		for(i=0;i<ordo;i++)
		{
			for(j=0;j<ordo;j++)
			{
				System.out.print("Masukkan matrix A["+i+"]["+j+"]:");
				A[i][j] = input.nextInt();
			}
		}
		for(i=0;i<ordo;i++)
		{
			for(j=0;j<ordo;j++)
			{
				System.out.print("Masukkan matrix B["+i+"]["+j+"]:");
				B[i][j] = input.nextInt();
			}
		}
		//bagian cetak
		System.out.println("Cetak Matrix A :");
		for(i=1;i<ordo;i++)
		{
			System.out.print("| ");
			for(j=1;j<ordo;j++)
			{
			System.out.print(A[i][j]+" ");
			}
			System.out.print("| ");
			System.out.println();
		}
		System.out.println("Cetak Matrix B :");
		for(i=1;i<ordo;i++)
		{
			System.out.print("| ");
			for(j=1;j<ordo;j++)
			{
			System.out.print(B[i][j]+" ");
			}
			System.out.print("| ");
			System.out.println();
		}
		for(i=1;i<ordo;i++)
		{
			for(j=1;j<ordo;j++){
			C[i][j]=A[i][j]+B[i][j];
			}
		}
		System.out.println("Matrix C :");
		for(i=1;i<ordo;i++)
		{
			System.out.print("| ");
			for(j=1;j<ordo;j++)
			{
				System.out.print(C[i][j]+" ");
			}
			System.out.print("| ");
			System.out.println();
		}
		for(i=1;i<ordo;i++)
		{
			for(j=1;j<ordo;j++){
				D[i][j]=A[i][1]*B[1][j]+A[i][2]*B[2][j]+A[i][3]*B[3][j];
			}
		}
		System.out.println("Matrix D :");
		for(i=1;i<ordo;i++)
		{
			System.out.print("| ");
			for(j=1;j<ordo;j++)
			{
				System.out.print(D[i][j]+" ");
			}
			System.out.print("| ");
			System.out.println();
		}
			
		
		
	}
}
		