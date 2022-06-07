import java.util.Scanner;
public class volKelSegi3 {
static Scanner data = new Scanner (System.in);
public static void main(String[] args) {

	double alas,tinggi,simir,luas,kel;
	//bagian input
	System.out.print("Masukkan panjang alas :");//inputan Angka desimal
	alas = data.nextDouble();data.nextLine();
	System.out.print("Masukkan tinggi :");
	tinggi = data.nextDouble();data.nextLine();
	
	//bagian proses
	luas = 0.5 *alas*tinggi
	simir = Math.sqrt(Math.pow((alas/2),2)+Math.pow(tinggi,2));
	kel =(2*simir)+alas;