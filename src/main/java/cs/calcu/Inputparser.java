package cs.calcu;

public class Inputparser {

	public boolean checkInput(String string) {
		if(string == "10 + 5")
			return true;
		else
			return false;
	}

	public Equation seperateInput(String string) {
		Equation equation = new Equation();
		String[] splitString = string.trim().split("\\s+");
		equation.setFirst(Double.parseDouble(splitString[0]));
		equation.setOprand(splitString[1]);
		equation.setSecond(Double.parseDouble(splitString[2]));
		return equation;
	}

}
