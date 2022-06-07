import java.util.Scanner;
	public class KasirDua {
	static Scanner data = new Scanner (System.in);
	public static void main(String[] args) {
	int i, rego,a;
	int jml=5, banyak=5, total=0;
	String nama[] = {"Sosis", "Bakso", "Milk", "Pilus", "Nescafe"};
	int harga[] = {1000, 2000, 3500, 1500, 5000};
	int stok[] = {10, 20, 30, 25, 50};
	char lagi='y';
	/** 
		Mesin kasir dengan menggunakan array. 
		menggunakan instruksi for untuk perulangan menghitung total harga dan jumlah stok yang berkurang.
		menggunakan instruksi if sebagai syarat-syarat tertentu.
		Jika ingin menambah belanja maka akan muncul pilihan y/n, itu menggunkan perulangan While.
		Pemrograman kasir ini menampilkan kode barang, nama barang, harga stok, input kode, input jumlah, dan input harga.
	*/
	/* 
		NANDHIKA KURNIASARI 
		M3119065
	*/
	
	System.out.println("Kode\tNama Barang\tHarga(Rp)\t\tStok");
	System.out.println("--------------------------------------------------------------");
	
	for ( i = 1; i <= jml; i++) 
	{
		System.out.println(""+i+"\t"+nama[i-1]+"\t\t"+harga[i-1]+"\t\t\t"+stok[i-1]);
	}
	
	System.out.println("--------------------------------------------------------------");
	
	while(lagi=='y'||lagi=='Y')
	{
	i=i+1;
	System.out.print("Masukkan kode nomor barang yang ingin Anda beli: ");
	jml = data.nextInt();

	if (jml > banyak) 
	{
		System.out.println("Maaf kode yang Anda input tidak tersedia");
		System.out.println("--------------------------------------------------------------");
		System.out.println("--------------------------------------------------------------");
		System.out.print("Apakah Anda ingin berbelanja lagi (y/n) ? ");
		lagi=data.next().charAt(0);
		
	} else {
	
	System.out.print("Berapa jumlahnya? : ");
	a = data.nextInt();data.nextLine();
		for ( i = 1; i <= 1; i++){
		stok [jml-1] -= a;
			if ( stok [jml-1] >= 0 ){
		 			for (i = 1; i <= 1 ; i++)
					{
						rego = harga[jml-1] * a;
						total+=rego;
						System.out.println("Harga sebelumnya adalah = "+total);
						System.out.println("");
						System.out.print("Apakah Anda ingin berbelanja lagi (y/n) ? ");
						lagi=data.next().charAt(0);
					}
					} else { 
					System.out.println("--------------------------------------------------------------");
					System.out.println("Maaf stok tidak mencukupi");
					System.out.println("Harga Anda sebelumnya adalah = "+total);
					System.out.println("--------------------------------------------------------------");
					System.out.println("--------------------------------------------------------------");
					System.out.print("Apakah Anda ingin berbelanja lagi (y/n) ? ");
					lagi=data.next().charAt(0);
					}
	}
	}
	
	}
	System.out.println("");
	System.out.println("Total harga adalah = "+total);
	int uang, kembali=0;
	System.out.print("Masukkan jumlah uang Anda: ");
	uang = data.nextInt();
	if (uang >= total) {
	kembali = uang - total;
	System.out.println("Kembalian uang Anda: "+kembali);}  else {
	System.out.println("Maaf uang Anda tidak mencukupi");
	}
	}
	}