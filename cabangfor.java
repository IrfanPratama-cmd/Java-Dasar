import java.util.Scanner;
public class cabangfor {
	static Scanner input = new Scanner(System.in);
	public static void main(String[] arg) {
		int i,n;
		//perintah for
		//cetak string 3 kali
		for(i=1; i<=3; i++)
			{System.out.println("Selamat Pagi agan sista :* ");}

		//yang ini cetak string sebanyak n kali
		System.out.print("Masukkan jumlah perulangan : ");
		n=input.nextInt();
		for(i=1; i<=n; i++)
			{System.out.println("Cetak String ke - "+i);}

		//hitungan mundur
		System.out.print("Masukkan jumlah perulangan : ");
		n=input.nextInt();
		for(i=n; i>=1; i--)
			{System.out.println("Cetak String ke - "+i);}

		//hitung bilangan genap 1-100
		System.out.println("-------------------Cara pertama--------------------");
		for(i=2; i<=100; i+=2)
			{System.out.print(i+", ");}

		System.out.println("-------------------Cara kedua----------------------");
		for(i=1; i<=100; i++)
		{
			if(i%2==0) {System.out.print(i+", ");}
		}

		//dengan rumus deret
		System.out.println("-------------------Cara ketiga----------------------");
		int un;
		for(i=1; i<=50; i++)
		{
			un=2*i; //rumus deret
			System.out.print(un+", ");
		}

		//deret ganjil
		System.out.println("Masukkan jumlah deret : ");
		n=input.nextInt();
		for(i=1; i<=n; i++)
		{
			un=2*i-1;
			System.out.print(un+", ");
		}
	}
}