package cs.calcu;

import java.util.Scanner;

public class Inputparser {

	public String getUserInput() {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Equation in 'x + y' format (with whitespace)");
		System.out.println("Enter 'x' to stop");
		String inputString = input.nextLine();
		input.close();
		return inputString;
	}
	
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
