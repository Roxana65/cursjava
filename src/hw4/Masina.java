package hw4;

public class Masina extends Vehicul{

	public Masina(String brand, int nivelPoluare, int vitezaMedie) {
		super(brand, nivelPoluare, vitezaMedie);
		// TODO Auto-generated constructor stub
	}

	@Override
		public String nume() {
			return "masina";
		}
		
	@Override
		public String motorizare() {
			return "motor";
		}
	}

