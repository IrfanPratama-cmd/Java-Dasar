import java.util.Scanner;
public class LuasKelilingsegi3 {
static Scanner data = new Scanner (System.in);
public static void main(String[] args) {
	
	
	double alas,tinggi,luas,keliling,sisimiring;
	
	System.out.println("Masukkan angka yang diinginkan");
	System.out.print("alas = ");
	alas = data.nextDouble();data.nextLine();
	System.out.println("tinggi = ");
	tinggi = data.nextDouble();data.nextLine();
	luas = (alas*tinggi)/2;
	System.out.println("Jadi luasnya adalah = " +luas);
	sisimiring=Math.sqrt(Math.pow((alas/2),2)+Math.pow(tinggi,2));
	keliling=(2*sisimiring)+alas;
	System.out.println("Keliling segitiga adalah = " +keliling);
	
}}
	
	
	
	
	
	
	