import java.util.Scanner; 
public class MethodSubprogram {
	static Scanner input = new Scanner (System.in);
	public static void main(String[]args) 
{
garis();
//cetaknama("Paijo Bin Bejo");
String nim="M3119xxx"; int usia=19;
cetakID(nim,usia);
int a=3,b=5;
System.out.println("Hasil "+a+"+"+b+"="+jumlah(a,b));
int c=jumlah(a,b);
System.out.println("Hasil "+a+"+"+b+"="+c);
jumlah2(a,b);
garis();
} //end main
//method dengan parameter dengan return
public static int jumlah(int x, int y)
{
	int z;
	z=x+y;
	return z;
}//end method garis

// method tanpa parameter
public static void jumlah2(int x, int y)
{
	int z;
	z=x+y;
	System.out.println("Hasil "+x+"+"+y+"="+z);
}//end method garis
public static void garis()
{
System.out.println("|-------------*-------------|");
}
//method dengan parameter return
public static void cetaknama (String nama)
{
System.out.println("Nama Saya adalah :"+nama);
}//end method cetak nama
public static void cetakID (String nim, int umur) //ada 2 parameter
{
System.out.println("Nim "+nim+" Mempunyai umur :"+umur);
cetaknama("Paijo Bin Bejo");
}
}