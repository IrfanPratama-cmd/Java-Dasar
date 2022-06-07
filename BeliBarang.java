import java.util.Scanner;
public class BeliBarang {
static Scanner data = new Scanner (System.in);
public static void main(String[] args) {
	
	double A,B,hargaA,hargaB,diskonA,diskonB,total;
	
	System.out.print("Masukkan jumlah item A (@1000) :");
	A=data.nextDouble();data.nextLine();
	System.out.print("Masukkan jumlah item B (@2000) :");
	B=data.nextDouble();data.nextLine();
	
	hargaA=A*1000;
	hargaB=B*2000;
	diskonA=1000*0.1*A;
	diskonB=2000*0.05*B;
	total=(hargaA-diskonA)+(hargaB-diskonB);
	
	System.out.println("Total bayar = Rp." +total);
	
	}
}
	
	
	
	
	