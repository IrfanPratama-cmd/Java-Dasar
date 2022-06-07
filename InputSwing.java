import javax.swing.JOptionPane;
public class InputSwing {
public static void main(String[] args) {
	String nama,x; int umur; double tinggi; char jk; boolean aktif;
	 nama=JOptionPane.showInputDialog("nama anda :");
	 x=JOptionPane.showInputDialog("umur anda :");
	 umur = Integer.parseInt(x);
	 x=JOptionPane.showInputDialog("tinggi anda :");
	 tinggi = Double.parseDouble(x);
	 x=JOptionPane.showInputDialog("aktif? :");
	 aktif = Boolean.parseBoolean(x);
	 x=JOptionPane.showInputDialog("JK anda :");
	 jk = x.charAt(0);
System.out.println("Nama "+nama+" umur "+umur+" tinggi "+tinggi+" jk "+jk);
System.out.println("Aktif "+aktif);}}