package homework3;

public class Vehicul {

	private String brand;
	private String nivelPoluare;
	private String vitezaMedie;
	
	public String nume; 
	public String motorizare;
	
	public String getMotorizare() {
		return motorizare;
	}
	public void setMotorizare(String motorizare) {
		this.motorizare = motorizare;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getNivelPoluare() {
		return nivelPoluare;
	}
	public void setNivelPoluare(String nivelPoluare) {
		this.nivelPoluare = nivelPoluare;
	}
	public String getVitezaMedie() {
		return vitezaMedie;
	}
	public void setVitezaMedie(String vitezaMedie) {
		this.vitezaMedie = vitezaMedie;
	}
	public String getNume() {
		return nume;
	}
	public void setNume(String nume) {
		this.nume = nume;
	}
	
	public void detaliiVehicul() {
		System.out.println("Nivelul de poluare pentru" + nume + "este :" + nivelPoluare + "si viteza medie atinsa este de :" + vitezaMedie);
	}
	
	}


	