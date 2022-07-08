package homework7;

import java.io.IOException;
import java.util.Scanner;

public class TestLegume {

	public static void main(String[] args) throws IOException {

		Legume obj = new Legume();
		obj.writePropertiesFile();
		
		String leguma;
		do {
		Scanner scan = new Scanner(System.in);
		System.out.println("Ce leguma doresti sa cumperi? ");
		leguma = scan.next();
				
	}while(!obj.readPropertiesFile(leguma));
	}

}
