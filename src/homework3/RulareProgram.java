package homework3;

public class RulareProgram {

	public static void main(String[] args) {
		
		
		Vehicul bike = new Bicicleta();
		bike.setMotorizare("0");
		bike.setNume("bicicleta electrica");
		System.out.println(bike.getNume() + " , " + bike.getMotorizare());
		
		Vehicul auto = new Masina();
		auto.setMotorizare("motor2");
		auto.setNume("SUV");
		System.out.println(auto.getNume() + " , " + auto.getMotorizare());
		
		Vehicul bicicleta = new Bicicleta();
		bicicleta.setNume("bicileta electrica");
		bicicleta.setBrand("Afisport");
		bicicleta.setVitezaMedie("60 km/h");
		bicicleta.setNivelPoluare("0");
		
		Vehicul masina = new Masina();
		masina.setNume("SUV");
		masina.setBrand("VW");
		masina.setVitezaMedie("200 km/h");
		masina.setNivelPoluare("euro3");
		
		
	System.out.println("Nivelul de poluare pentru " + bicicleta.getNume() + " " + bicicleta.getBrand() + " este :" + bicicleta.getNivelPoluare() + " si viteza medie atinsa este de :" + bicicleta.getVitezaMedie());

	System.out.println("Nivelul de poluare pentru " + masina.getNume() + " " + masina.getBrand() +  " este : " + masina.getNivelPoluare()  + " si viteza medie atinsa este de : " + masina.getVitezaMedie());
	}


}
