import java.util.Scanner ;
public class Kasir {
	static  Scanner data = new Scanner ( System.in) ;
	public static void main (String [] args) { 

        int []stokbrg = {87,50,70,100,100};
	 	String barang[] = {"LEVIST","VOLCOM","FROGST","ROCKER","FAXERS"};
        String kode[] = {"KOD1","KOD2","KOD3","KOD4","KOD5"};
        double []harga = {200000,250000,200000,100000,150000};
        int jml[] = new int[5];

        int KodeBeli;
        char lagi = 'n';
        double total = 0;


        do
        {
        	System.out.println("---------------------------------------------------");
            System.out.println("-------------------- CJ CLOTHES ---------------------");
            System.out.println("---------------------------------------------------");
        
            System.out.println("NO.   KODE     NAMA BARANG     STOK          HARGA BARANG");

            for(int i = 0; i <= 4; i++)
            {
                System.out.println(+(i+1)+".    "+kode[i]+"     "+barang[i]+"            "+stokbrg[i]+"          Rp "+harga[i]);
            }

            System.out.print("Masukkan pilihan barang anda : ");
            KodeBeli = data.nextInt();
            KodeBeli -= 1;

            System.out.println("Anda akan membeli pakaian "+barang[KodeBeli]);
            System.out.print("Masukkan jumlah pembelian pakaian "+barang[KodeBeli]+" : ");
            jml[KodeBeli] = data.nextInt();

            if(jml[KodeBeli] <= stokbrg[KodeBeli])
            {
                System.out.println("Terimakasih sepatu "+barang[KodeBeli]+" sebanyak "+jml[KodeBeli]+" telah berhasil masuk dalam list belanja anda!");
                stokbrg[KodeBeli] -= jml[KodeBeli];

                System.out.print("Apakah anda ingin membeli lagi? (y/n)");
                lagi = data.next().charAt(0);
            }
            else 
            {
                System.out.println("Maaf stok pakaian yang anda pilih telah habis !");
                System.out.println("Stok pakaian masih tersedia " + stokbrg[KodeBeli]);

                jml[KodeBeli] = 0;

                System.out.print("Apakah anda ingin membeli lagi? (y/n)");
                lagi = data.next().charAt(0);
            }
            }
            while((lagi == 'y') || (lagi == 'Y'));

            //KWITANSI

        System.out.println("NO  KODE     NAMA BARANG    QTY     HARGA");
        for(int i = 0; i <= 4; i++)
        {
            if(jml[i] > 0)
            {

                System.out.println((i+1)+".  "+kode[i]+"     "+barang[i]+"          "+jml[i]+"      Rp "+harga[i]*jml[i]);
                total += jml[i]*harga[i];
            }
        }
        System.out.println("---------------------------------------------------------------------------");
        System.out.println("TOTAL                                                    Rp "+total);
        System.out.println("---------------------------------------------------------------------------");
        System.out.println("------------------ TERIMAKASIH TELAH BERBELANJA CJ CLOTHES----------------");
    	System.out.println("------------------------------- HAVE A NICE DAY ---------------------------");
    	System.out.println("---------------------------------------------------------------------------");
        
            
	
	}
}