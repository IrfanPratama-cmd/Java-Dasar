import java.util.Scanner;
public class HitungOperator {
static Scanner data = new Scanner (System.in);
public static void main (String[] args) {
	
	//bagian deklarasi
	int x,y,jumlah,kurang,kali,modulo;
	double bagi;
	
	//bagian input
	System.out.print("Masukkan nilai pertama :"); //bagian input
	x = data.nextInt();data.nextLine();
	System.out.print("Masukkan nilai kedua :");
	y = data.nextInt();data.nextLine();
	
	//bagian proses
	jumlah=x+y;
	kurang=x-y;
	kali=x*y;
	modulo=x%y;
	bagi=(double)x/y; //konversi unt integer bagi integer
	
	//bagian output
	System.out.println(x+" + "+y+" = "+jumlah); 
	System.out.println(x+" - "+y+" = "+kurang);
	System.out.println(x+" * "+y+" = "+kali);
	System.out.println(x+" % "+y+" = "+modulo);
	System.out.println(x+" / "+y+" = "+bagi);
	
	System.out.println("Nilai x adalah :"+x);
	System.out.println("Nilai x adalah :"+(x++));//x=x+1
	System.out.println("Nilai x adalah :"+(++x));//x=x+1
	System.out.println("Nilai x adalah :"+x);
	x++;//X=x+1
	System.out.println("Nilai x adalah :"+x);
	++x;//x=x-1
	System.out.println("Nilai x adalah :"+x);
	x+=2;//x=x+2;
	System.out.println("Nilai x adalah :"+x);
	System.out.println("Nilai x adalah :"+(x+=3));//x=x+3
	System.out.println("Nilai x adalah :"+(x-=1));//x=x-1
	System.out.println("Nilai x adalah :"+(x*=2));//x=x*2
	System.out.println("Nilai x adalah :"+(x%=3));//x=x%3
}}