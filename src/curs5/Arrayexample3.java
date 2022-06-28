package curs5;

public class Arrayexample3 {

	int [] numbers  = {3, 4, 5, 8, 7, 9};
	/*
	 * vreau sa alfam indexul unui numar
	 * exemplu : index pt elem 8 este 3
	 * rezolvam cu for
	 * rexolvam cu for each
	 * rezolvam cu while
	 */
	
	
	public static void main(String[] args) {

		Arrayexample3 obj = new Arrayexample3();
		obj.rezolvareCuFor(9);
	}

	public void rezolvareCuFor(int element) {
		
		for(int i =0; i<numbers.length; i++) {
			
			if(numbers[i]== element) {
				System.out.println("index pentru " + element + " este " + i );

			}
		}
		
	}
	public void rexolvareCuForEach(int element) {
		int i=0;
		for(int nr : numbers) {
			
			if(nr== element) {
			System.out.println("index pt " + element + " este " + nr );
		}
			i++;
		}
	}
}
