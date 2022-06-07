import java.util.Scanner;
public class PendaftaranLembagaPelatihan{
static Scanner data=new Scanner(System.in);
public static void main (String[] args) 
{
String biodata=null;
String jpelatihan[]={"Digital Marketing" , "Web Developer\t", "Desain\t\t", "Bahasa Asing\t", "Barang 5"};
double []price = {150000,400000,150000,250000,1000000};
int jml[] = new int[5];
double total=0,uang=0,kembali=0;
char lagi = 'n'; 
int i=0;
//contoh
contoh();
//proses
biodata=inputan(biodata);
do{
 System.out.println("NO. \tJENIS PELATIHAN \tHARGA BARANG");
 for(i = 0; i <= 4; i++)
 {
  System.out.println((i+1)+".\t"+jpelatihan[i]+"\t"+price[i]);
 }
 System.out.print("\nMasukkan Nomor Pelatihan yang Ingin Anda Ikuti : ");
 int KodeBeli = data.nextInt();
 KodeBeli -= 1;

 System.out.println("\nAnda Ingin Mengikuti "+jpelatihan[KodeBeli]);
 System.out.print("Masukkan Berapa Lama Anda Akan Mengikuti Pelatihan "+jpelatihan[KodeBeli]+"(Bulan) : ");
 jml[KodeBeli] = data.nextInt();
 
 
  System.out.print("\nIngin mengikuti program lain lagi? (y/n)");
  lagi = data.next().charAt(0);
 } while((lagi == 'y') || (lagi == 'Y'));
 
for(i = 0; i <= 4; i++){
              if(jml[i] > 0){
                total += jml[i]*price[i];
               }
            }
 if((lagi!='y') || (lagi!='Y'))
                {
                  //System.out.println("Total biaya yang akan anda bayar : Rp"+total);
                System.out.println("================================");
                }
System.out.println(biodata);    
System.out.println("NO. \tJENIS PELATIHAN \tBIAYA PELATIHAN \tLAMA PELATIHAN \tTOTAL");
for(i = 0; i <= 4; i++){
            if(jml[i] > 0){
                System.out.println((i+1)+".\t"+jpelatihan[i]+"\t"+price[i]+"\t\t"+jml[i]+" bulan"+"\t\t"+price[i]*jml[i]);
            }
}
System.out.println("TOTAL BIAYA\t\t\t\t\t\t\t\tRp "+total);


}

//method
public static void contoh()
{
System.out.println("------------------------------------------------");
System.out.println("|CONTOH FORM PENDAFTARAN LEMBAGA PELATIHAN 2019|");
System.out.println("------------------------------------------------\n\n");
System.out.println("Nama\t\t: Muhammad Rano Pane Trias");
System.out.println("Tempat Lahir\t: Nganjuk");
System.out.println("Tanggal Lahir\t: Tanggal: 6\n\t\t  Bulan: 2\n\t\t  Tahun: 2001");
System.out.println("Alamat\t\t: Jalan Apa");
System.out.println("Agama\t\t: Islam");

}

public static String inputan(String n)
{
int umur,thnskr=2019,thn = 0;
String nama,agama,tempat,alamat,jk,tamatan,kerja,nohp,email;
System.out.println("-----------------------------------------");    
System.out.println("|FORM PENDAFTARAN LEMBAGA PELATIHAN "+thnskr+"|");
System.out.println("-----------------------------------------");
System.out.print("Nama\t\t: ");
nama=data.nextLine();//inputnama
System.out.print("Tempat Lahir\t: ");
tempat=data.nextLine();//inputtempatlahir
umur=cetakumur(thn,thnskr);//inputumur
System.out.print("Jenis Kelamin\t: ");
jk=data.nextLine();//inputjeniskelamin
System.out.print("Tamat Pendidikan : ");
tamatan=data.nextLine();//inputtamatanpendidikan
System.out.print("Pekerjaan\t: ");
kerja=data.nextLine();//inputpekerjaan
System.out.print("Alamat\t\t: ");
alamat=data.nextLine();//inputtempatlahir
System.out.print("Agama\t\t: ");
agama=data.nextLine();//inputagama
System.out.print("No. HP\t\t: ");
nohp=data.nextLine();//inputnohp
System.out.print("Email\t\t: ");
email=data.nextLine();//inputemail
return "Nama\t\t: "+nama+
        "\nTempat Lahir\t: "+tempat+
        "\nUmur\t\t: "+umur+
        "\nJenis Kelamin\t: "+jk+
        "\nTamat Pendidikan : "+tamatan+
        "\nPekerjaan\t: "+kerja+
        "\nAlamat\t\t: "+alamat+
        "\nNo. HP\t\t: "+nohp+
        "\nEmail\t\t: "+email;
}


public static int cetakumur(int thn, int tahun)
{
    int hasil=0,tgl,bln;
    System.out.print("Tanggal Lahir\t: ");
    System.out.print("Tanggal: ");
    tgl=data.nextInt();
    System.out.print("\t\t  Bulan: ");
    bln=data.nextInt();
    System.out.print("\t\t  Tahun: ");
    thn=data.nextInt();data.nextLine();
    hasil=tahun-thn;
 return hasil;
}

}