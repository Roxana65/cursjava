package homeworkC5;
import java.util.Scanner;

public class Factura {

	public static void main(String[] args) {

		double factura;
		//double disc1
		//double disc2
		
		//System.out.println(disc1);
		//System.out.println(disc2);

		Scanner scan = new Scanner(System.in);
		System.out.println("Introdu total factura : ");
		factura = scan.nextInt();
		
        double pretFinal;
		pretFinal= (factura>100) ? (factura-factura*10/100) : (factura-factura*5/100);
		System.out.println(pretFinal);
	}
}
