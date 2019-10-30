package cs.calcu;

public class Inputparser {

	public boolean checkInput(String string) {
		if(string == "x")
			return false;
		else if(countWhitespace(string) != 2) {
			System.out.println("wrong format");
			return false;
		}
		else
			return true;
	}

	public Equation seperateInput(String string) {
		Equation equation = new Equation();
		String[] splitString = string.trim().split("\\s+");
		equation.setFirst(Double.parseDouble(splitString[0]));
		equation.setOprand(splitString[1]);
		equation.setSecond(Double.parseDouble(splitString[2]));
		return equation;
	}

	public int countWhitespace(String string) {
		string = string.trim();
		int spaceCount = 0;
		for(int i = 0; i<string.length(); i++)
		{
			char ch = string.charAt(i);
			if(ch == ' ')
				spaceCount++;
		}
		return spaceCount;
	}

}
