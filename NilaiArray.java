import java.util.Scanner; 
public class NilaiArray {
	static Scanner input = new Scanner (System.in);
	public static void main(String[]args) {
		
	int i  ;
	int jml=5;
	int [] nilaiMath=new int[jml];
	int [] nilaiAlgo=new int[jml];
	double [] rataIndividu=new double[jml];
	String nama[]={"AA","BB","CC","DD","EE"}; //bagian inputan
	for(i=0;i<jml;i++) 
	{
		System.out.print("Masukkan nilai Matematika Siswa ke-"+(i+1)+":");
		nilaiMath[i] = input.nextInt();
	}
	for(i=0;i<jml;i++) 
	{
		System.out.print("Masukkan nilai Algoritma Siswa ke-"+(i+1)+":");
		nilaiAlgo[i] = input.nextInt();
	}
	//bagian prose / hitung
	int totalMath=0; int totalAlgo=0;
	for(i=0;i<jml;i++) 
	{
		totalMath=totalMath+nilaiMath[i];
		totalAlgo=totalAlgo+nilaiAlgo[i];
		rataIndividu[i]=(nilaiMath[i]+nilaiAlgo[i])/2;
	}
	double rataMath,rataAlgo;
	rataMath=(double)totalMath/jml;
	rataAlgo=(double)totalAlgo/jml;
	
	//bagian output
	for(i=0;i<jml;i++)
	{
		System.out.println("Nama Siswa Ke-"+(i+1)+":"+nama[i]);
		System.out.println("Nilai Matematika Siswa ke-"+(i+1)+":"+nilaiMath[i]);
		System.out.println("Nilai Algoritma Siswa ke-"+(i+1)+":"+nilaiMath[i]);
		System.out.println("Rata-rata Nilai Siswa ke-"+(i+1)+":"+rataIndividu[i]);
		
	}
	System.out.println("Rata-rata Kelas Matematika:"+rataMath);
	System.out.println("Rata-rata Kelas Algoritma:"+rataAlgo);
	
	
		
		
	}
}