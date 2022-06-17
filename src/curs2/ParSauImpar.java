package curs2;

public class ParSauImpar {

	// UpperCamelCase --> clase
	// lowerCamelCase --> metode
	
	public void verificaParSauImpar(int numar) {
		// int numar = 4;
		
		if(numar % 2 == 0) {
			// se executa doar daca conditia din if este adevarata
			System.out.println(numar + " este par!");
		}else {
			// se executa doar daca contitia din if este falsa
			System.out.println(numar + " este impar!");
		}
		
		
	}
	
	
	
	
}
