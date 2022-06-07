import java.util.Scanner;

public class PercIf {
public static void main(String[] arguments)
	{	Scanner input = new Scanner(System.in);
		
		int nilai;
		System.out.print("Masukkan nilai anda");
		nilai = input.nextInt();
		/*
		0-48   -->E
		50-59  -->D
		60-69  -->C
		70-84  -->B 
		85-100 -->A
		*/
		char konversi;
		if(nilai<50){konversi='E';}else
		if(nilai<60){konversi='D';}else
		if(nilai<70){konversi='C';}else
		if(nilai<85){konversi='B';}else
			{konversi='A';}
		System.out.println("Konversi nilai anda :"+konversi);
		if(nilai>=85){konversi='A';}else
		if(nilai>=70){konversi='B';}else
		if(nilai>=60){konversi='C';}else
		if(nilai>=50){konversi='D';}else
			{konversi='E';}
		System.out.println("Konversi nilai anda :"+konversi);
		
}}
		
		