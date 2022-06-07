import java.util.Scanner;
import java.util.*;

public class PelatihanLembaga{
static Scanner data=new Scanner(System.in);
public static void main (String[] args) 
{
	// DEKLARASI
int jmlh=100;
String jpelatihan[]=new String [jmlh];
jpelatihan[0]="Digital Marketing";
jpelatihan[1]="Web Developer\t";
jpelatihan[2]="Desain\t\t";
jpelatihan[3]="Bahasa Asing\t";

double price []=new double[jmlh];
price[0]=150000;
price[1]=400000;
price[2]=150000;
price[3]=250000;
int jml[] = new int[5];
int KodeDaftar[] = new int[5];
int KodePilih [][] = new int[5][5];
int jumlah=5,jumlahpelatihan=4,total=0,banyakpilih=1,pilihan=1;
char lagi = 'n';

//Mencoba menambah biodata
	String [] nama=new String [jmlh]; // biodata nama
	nama[0]="Meila Purnawati\t";
	nama[1]="M. Irfan Pratama";
	nama[2]="M. Rano Pane Trias";
	nama[3]="Nandhika Kurniasari";
	nama[4]="Pacar\t\t";
	int [] umur=new int [jmlh]; // biodata umur
	umur[0]=18;
	umur[1]=18;
	umur[2]=18;
	umur[3]=17;
	umur[4]=18;
	String [] pend=new String [jmlh]; // biodata pendidikan
	pend[0]="S3";
	pend[1]="S4";
	pend[2]="S5";
	pend[3]="S7";
	pend[4]="S1";
	String [] alamat=new String [jmlh]; // biodata alamat
	alamat[0]="Kediri";
	alamat[1]="Sragen";
	alamat[2]="Nganjuk";
	alamat[3]="Ngawi";
	alamat[4]="Masa Depan";
	
	// HALAMAN MUKA 
System.out.println("-----------------------------------------------------------------------------");
System.out.println("-----------------------------------------------------------------------------");
Calendar kalender = new GregorianCalendar();
System.out.println("------------------------------SELAMAT DATANG---------------------------------");
System.out.println("----------------------PT. LANCAR KERJA MAKMUR SENTOSA------------------------");
System.out.println("\t|| ANDA LOGIN SEBAGAI ADMIN || " + new Date() +" || "); 
System.out.println("-----------------------------------------------------------------------------");
System.out.println("-----------------------------------------------------------------------------");
	  
int n=0;	
while (n != 5) 
{ 
		System.out.println(" ");
		System.out.println("1. Lihat Daftar Anggota");
		System.out.println("2. Lihat Daftar Pelatihan ");
		System.out.println("3. Edit Menu");
		System.out.println("4. Mulai Mendaftar Pelatihan");
              //  System.out.println("5. Lihat Anggota yang Mendaftar Pelatihan dan Pelatihannya");
                System.out.println("5. Keluar");
		System.out.print("Masukkan kode pilihan: ");
		n = data.nextInt();data.nextLine();
switch (n)
{ case 1:
lihatAnggota(nama,umur,pend,alamat,jumlah); break ;
case 2:
lihatPelatihan(jpelatihan,price,jumlahpelatihan); break ;
case 3:
	int pilih=0;
		while(pilih!=3)
			{
			System.out.println("====================================");
			System.out.println("1. Tambah Anggota");
			System.out.println("2. Tambah Jenis Pelatihan ");
			System.out.println("3. Keluar");
			System.out.println("====================================");
			System.out.print("Masukkan Pilihan Anda:");
			pilih = data.nextInt();data.nextLine();
				switch(pilih)
				{case 1: 
					System.out.println("Masukkan Identitas Anggota Baru");
					jumlah=TambahAnggota(nama,umur,pend,alamat,jumlah);break;
				case 2: 
					System.out.println("Masukkan Daftar Pelatihan Baru");
					jumlahpelatihan=tambahPelatihan(jpelatihan,price,jumlahpelatihan); 
					 
				case 3: 
					System.out.println("Keluar Program");
					// BREAK
				default: 
				System.out.println("Pilihan Salah");
				}
			}
	;break ;
	case 4:
	System.out.println("Daftar Data Diri yang Terdaftar: ");
        lihatAnggota(nama,umur,pend,alamat,jumlah);
        System.out.print("Pilihlah Data Diri Anda"+banyakpilih+": ");
        KodeDaftar[banyakpilih]=data.nextInt();data.nextLine();
        KodeDaftar[banyakpilih] -=1;
        System.out.println(nama[KodeDaftar[banyakpilih]]+", Silahkan Memilih Jenis Pelatihan Dibawah Ini:");
        pilihan=1;
        do { lihatPelatihan(jpelatihan,price,jumlahpelatihan);
        System.out.print("\nMasukkan Nomor Pelatihan ke-"+banyakpilih+pilihan+" yang Ingin Anda Ikuti : ");
        KodePilih[banyakpilih][pilihan] = data.nextInt();data.nextLine();
	KodePilih[banyakpilih][pilihan] -=1;
        System.out.println("\nAnda Ingin Mengikuti "+jpelatihan[KodePilih[banyakpilih][pilihan]]);
        System.out.print("Masukkan Berapa Lama Anda Akan Mengikuti Pelatihan "+jpelatihan[KodePilih[banyakpilih][pilihan]]+"(Bulan) : ");
        jml[KodePilih[banyakpilih][pilihan]] = data.nextInt();data.nextLine();
        System.out.print("\nIngin mengikuti program lain lagi? (y/n)");
        lagi = data.next().charAt(0);
        pilihan++;
        }    
        while((lagi == 'y') || (lagi == 'Y'));
        System.out.println("NO. \tNAMA ANGGOTA \tJENIS PELATIHAN \tHARGA BARANG \tLAMA PELATIHAN \tTOTAL");
        for(int j=1;j<=banyakpilih;j++){
        if(nama[KodeDaftar[j]].length()>0){
        for(int k=1;(k+1)<=pilihan;k++){ 
            System.out.println((j)+".\t"+nama[KodeDaftar[j]]+" \t"+jpelatihan[KodePilih[j][k]]+"\t"+price[KodePilih[j][k]]+"\t"+jml[KodePilih[j][k]]+" bulan"+"\t\t"+price[KodePilih[j][k]]*jml[KodePilih[j][k]]);
            total += jml[KodePilih[j][k]]*price[KodePilih[j][k]];
            }
            }
        
        
        }
        System.out.println("Total Biaya "+nama[KodeDaftar[banyakpilih]]+" : Rp "+total);
        banyakpilih++;
        break;
        /* case 5:
	
            break; */
        case 5:
	System.out.println("Keluar Program");break;
        default: 
		System.out.println("Pilihan Salah");
	}
}

} // end main

// METHOD I
public static void lihatPelatihan (String [] jpelatihan, double [] price, int jumlahpelatihan) {
 System.out.println("NO. \tJENIS PELATIHAN \tHARGA BARANG");
 for(int i = 0; i <jumlahpelatihan; i++)
 {
  System.out.println((i+1)+".\t"+jpelatihan[i]+"\t"+price[i]);
 }
}
// METHOD II
public static void lihatAnggota (String [] name, int [] tua, String [] edu, String [] addres, int jum) {
System.out.println("NO. \tNAMA ANGGOTA \t\tUMUR \tPENDIDIKAN \tALAMAT");
 for(int i = 0; i <jum; i++)
 {
  System.out.println((i+1)+".\t"+name[i]+"\t"+tua[i]+"\t"+edu[i]+"\t\t"+addres[i]);
 }
}
// METHOD III
public static int tambahPelatihan(String [] jpelatihan, double [] price,int jumlahpelatihan )
{
            System.out.print("Masukkan Jenis Pelatihan ke "+(jumlahpelatihan+1)+": ");
	    jpelatihan[jumlahpelatihan] = data.nextLine();
            System.out.print("Masukkan Harga: ");
	    price[jumlahpelatihan] = data.nextInt();data.nextLine(); 
            jumlahpelatihan++;
    return jumlahpelatihan;
}
//METHOD IV
public static int TambahAnggota (String [] name, int [] tua, String [] edu, String [] addres, int jum) 
{
            System.out.println("Masukkan Biodata ke "+(jum+1)+": ");
	    System.out.print("Nama: ");
            name[jum] = data.nextLine();
            System.out.print("Umur: ");
	    tua[jum] = data.nextInt();data.nextLine(); 
            System.out.print("Pendidikan: ");
            edu[jum] = data.nextLine();
            System.out.print("Alamat: ");
            addres[jum] = data.nextLine();
            jum++;
    return jum;    
}

}// end class