import java.util.Scanner;
public class PercabanganIf {
static Scanner data = new Scanner (System.in);
public static void main(String[] args) {
	int nilai;
	String statusLulus;
	//bagian input
	System.out.print("Masukkan nilai yang dihitung :");
	nilai = data.nextInt();data.nextLine();
	//if tanpa else..
	if(nilai==0)//dlm kurung harus punya nilai boolean (ture/false)
	{System.out.println("Siswa Drop Out..");}
	//if dengan else
	if(nilai>=60)
	{System.out.println("Siswa Dinyatakan Lulus");} else
	{System.out.println("Siswa Dinyatakan Tidak Lulus");}
	if(nilai<=60)
	{statusLulus= "Tidak Lulus";} else {statusLulus= "Lulus";}
	{System.out.println("Siswa Dinyatakan "+statusLulus);}
	//nested if
	/*
	0 -59  ----> C
	60-79  ----> B
	80-100 ----> A
	*/
	char konversiNilai;
	if (nilai<60)
	{ konversiNilai='C';}else
	{ if (nilai<80)
		{ konversiNilai='B';}else
		{ konversiNilai='A';}
	}
	System.out.println("Konversi Nilai Siswa "+konversiNilai);
		/*
	0 -49  ----> E
	50-59  ----> D
	60-69  ----> C
	70-84  ----> B
	85-100 ----> A
	*/
	char konversinilai;
	if (nilai<50)
	{ konversiNilai='E';}else
		if (nilai<60)
			{ konversiNilai='D';}else
			if (nilai<70)
				{ konversiNilai='C';}else
				if (nilai<85)
					{ konversiNilai='B';}else
					{ konversiNilai='A';}
	System.out.println("Konversi Nilai Siswa "+konversiNilai);
	//if dengan operator logika
	String kevalidan; //diantara 0-100
	if(nilai>=0 && nilai<=100)
	{kevalidan="VALID";}
	else
	{kevalidan="TIDAK VALID";}
	System.out.println("Nilai yang anda input :"+kevalidan);
	
	if(nilai<0 || nilai>100)
	{kevalidan="TIDAK VALID";}
	else
	{kevalidan="VALID";}
	System.out.println("Nilai yang anda input :"+kevalidan);
	

	
				
		
		
}}