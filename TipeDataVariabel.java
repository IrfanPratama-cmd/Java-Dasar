public class TipeDataVariabel {
	public static void main (String[] abc ){
	String nama; //deklarasi variabel
	nama = "Paijo bin Bejo"; //inisialisasi var(beri nilai)
	int umur,tahunlahir;//2 dekralasi langsung
	tahunlahir=1999;
	//umur = 18;
	umur = 2017-tahunlahir;//perhitungan dgn operator -
	double ipk=3.5;//deklarasi sekaligus inisialisasi
	char kelas ='C';
	boolean mhsaktif=true;
	System.out.println("Nama saya "+nama);//cetak var
	System.out.println("Tahun lahir "+tahunlahir);
	System.out.println("umur saya "+umur+" tahun");
	System.out.println("IPK :"+ipk);
	System.out.println("kelas :"+kelas);
	System.out.println("status keaktifan :"+mhsaktif);
	System.out.println("dua tahun lagi umur saya "+(umur+2)+" tahun");
	
	int tiga_th_lalu;
	tiga_th_lalu=umur-3;
	System.out.println("tiga th yg lalu umur saya "+tiga_th_lalu+" tahun");
	
	
	}//end main
}//end class