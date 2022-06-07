import java.util.Scanner;

public class GajiKaryawan {
	public static void main(String[] args) {
	Scanner data = new Scanner (System.in);
	
	double gajipokok,tunjangan,gajikotor,pajak,gajibersih; 
	
	System.out.println("Masukkan gaji pokok");
	gajipokok = data.nextDouble();data.nextLine();
	
	tunjangan=0.10*gajipokok;
	gajikotor=gajipokok+tunjangan;
	pajak=0.05*gajikotor;
	gajibersih=gajikotor-pajak;
	
	System.out.println("Gaji anda sebesar: "+gajibersih);
	
	}
}
	
	