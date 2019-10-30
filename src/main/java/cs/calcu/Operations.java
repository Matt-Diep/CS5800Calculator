package cs.calcu;

public class Operations {

	public double add(double i, double j) {
		return i + j;
	}

	public double subtract(double i, double j) {
		return i - j;
	}

	public double multiply(double i, double j) {
		return i *j;
	}

	public double divide(double i, double j) {
		if(j == 0) {
			System.out.println("Cannot divide by Zero");
			return 0;
		}
		return i/j;
	}

	public double mod(double i, double j) {
		return i%j;
	}

}
