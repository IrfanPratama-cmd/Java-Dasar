import java.io.*;
public class InputReader {
public static void main(String[] args) throws java.lang.Exception {
BufferedReader Input =new BufferedReader (new InputStreamReader(System.in));
	String nama;
	int umur;
	double tinggi;
	char jk;
	boolean aktif;
	System.out.print("Masukkan nama anda :");
	nama = Input.readLine();
	System.out.println("Masukkan umur anda :");
	umur = Integer.parseInt(Input.readLine());
	System.out.print("Masukkan tinggi badan anda (dlm meter) :");
	tinggi = Double.parseDouble(Input.readLine());
	System.out.print("Masukkan JK (L/P) :");
	jk = (Input.readLine()).charAt(0);;
	System.out.print("aktif ?:");
	aktif = Boolean.parseBoolean(Input.readLine());
	System.out.println("Nama "+nama+" umur "+umur+" tinggi "+tinggi+" jk "+jk);
	System.out.println("Aktif "+aktif);}}