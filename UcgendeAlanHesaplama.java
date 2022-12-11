import java.util.Scanner;
public class UcgendeAlanHesaplama {

	public static void main(String[] args) {
		int a, b , c , cevre;
		double alan;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("a kenarýný giriniz : ");
		a = input.nextInt();
		
		System.out.print("b kenarýný giriniz : ");
		b = input.nextInt();
		
		System.out.print("c kenarýný giriniz : ");
		c = input.nextInt();
		
		cevre = a + b + c;
		int cevreninYarisi = cevre / 2;
		
		alan = Math.sqrt(cevreninYarisi * (cevreninYarisi - a) * (cevreninYarisi - b) * (cevreninYarisi - c));
		
		System.out.println("Ucgenin alani : " +alan);

	}

}
