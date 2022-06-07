import java.util.Scanner;
public class ulangfor {
	static Scanner input = new Scanner(System.in);
	public static void main(String[] ily3000) {
		int i,n;
		//perintah while
		//cetak string 3 kali
		i=1; //nilai awal
		while(i<=3) //kondisi
		{
			System.out.println("Selamat Pagi agan sista :* ");
			i++; //terminasi
		}

		//yang ini cetak string sebanyak n kali
		System.out.print("Masukkan jumlah perulangan : ");
		n=input.nextInt();
		i=1;
		while (i<=n)
			{
				System.out.println("Cetak String ke - "+i);
				i++;
			}

		//cetak string dengan konfirmasi
		System.out.println("-------------Cetak dengan konfirmasi---------------");
		char lagi;
		lagi='y'; //nilai lagi
		while(lagi=='y')
		{
			System.out.println("Selamat Siang agan sista");
			System.out.println("Cetak lagi? (y/n) : ");
			lagi=input.next().charAt(0);input.nextLine();
		}

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
		System.out.print("Masukkan jumlah deret : ");
		n=input.nextInt();
		for(i=1; i<=n; i++)
		{
			un=2*i-1;
			System.out.print(un+", ");
		}
	}
}