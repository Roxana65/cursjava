package homework3;

public class RulareProgram {

	public static void main(String[] args) {
		
	
		
		
		Vehicul bicicleta = new Bicicleta();
		bicicleta.setNume("bicileta electrica");
		bicicleta.setBrand("Afisport");
		bicicleta.setVitezaMedie("60 km/h");
		bicicleta.setNivelPoluare("0");
		bicicleta.setMotorizare("0");
		
		
		Vehicul masina = new Masina();
		masina.setNume("SUV");
		masina.setBrand("VW");
		masina.setVitezaMedie("200 km/h");
		masina.setNivelPoluare("euro3");
		masina.setMotorizare("motor2");
		
	
		
	System.out.println("Nivelul de poluare pentru " + bicicleta.getNume() + " " + bicicleta.getBrand() + " este :" + bicicleta.getNivelPoluare() + " si viteza medie atinsa este de :" + bicicleta.getVitezaMedie());

	System.out.println("Nivelul de poluare pentru " + masina.getNume() + " " + masina.getBrand() +  " este : " + masina.getNivelPoluare()  + " si viteza medie atinsa este de : " + masina.getVitezaMedie());
	}

	public static void verificaMotorizarea(Vehicul obj) {
		System.out.println(obj.nume + " , " + obj.motorizare);
	}

}
