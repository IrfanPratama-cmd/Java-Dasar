import java.util.Scanner;
public class Jarak {
static Scanner data = new Scanner (System.in);
public static void main(String[] args) {
	
	double kecepatanA,kecepatanB,jarak,waktu,jarakA,jarakB;
	
	System.out.print("Masukkan kecepatanA :");
	kecepatanA=data.nextDouble();data.nextLine();
	System.out.print("Masukkan kecepatanB :");
	kecepatanB=data.nextDouble();data.nextLine();
	System.out.print("Masukkan jarak :");
	jarak=data.nextDouble();data.nextLine();
	
	waktu=jarak/(kecepatanA+kecepatanB);
	jarakA=kecepatanA*waktu;
	jarakB=kecepatanB*waktu;
	System.out.println("Jarak dari A : " +jarakA);
	System.out.println("Jarak dari B : " +jarakB);
	System.out.print("Waktunya adalah :" +waktu);
	
}}
	
	