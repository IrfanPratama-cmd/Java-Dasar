import java.util.Scanner;
public class PercabanganSwitch {
static Scanner input = new Scanner (System.in);
public static void main(String[] args) {
	int pilih,harga;
	System.out.println("Menu :");
	System.out.println("1.Nasi Goreng");
	System.out.println("2.Nasi Opor");
	System.out.println("3.Nasi Ayam");
	System.out.print("Masukkan Pilihan anda :");
	pilih = Input.nextInt();data.nextLine();
	harga=0;
	switch(pilih)
	{
	case 1:
	System.out.println("Anda memilih Nasi Goreng");
	harga=20000;
	break;
	case 2:
	System.out.println("Anda memilih Nasi Opor");
	harga=25000;
	break;
	case 3:
	System.out.println("Anda memilih Nasi Ayam");
	harga=30000;
	break;
	default :
	System.out.println("Pilihan anda Salah");
	harga=0;
	break;
	}
	System.out.println("Harga menu :+harga);
	
}}