package hw4;

public class DetaliiVehicul {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Bicicleta bicicleta = new Bicicleta("Pegas", 0, 90);
		bicicleta.detaliiVehicul();
		
		Masina masina = new Masina("Dacia", 86, 190);
		masina.detaliiVehicul();
		
		verificaMotorizarea(bicicleta);
		verificaMotorizarea(masina);
	}

	public static void verificaMotorizarea(Vehicul obj) {
		System.out.println("Aceasta este o " + obj.nume() + " si are " + obj.motorizare() );
	}
}
