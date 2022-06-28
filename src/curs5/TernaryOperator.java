package curs5;

public class TernaryOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1 = 15;
		int num2 = 80;
		
		int x;
		
		x = (num1>num2) ? num1 : num2;
		System.out.println(x);

		if(num1>num2) {
			x= num1;
		}else {
			x= num2;
		}
	}

}
