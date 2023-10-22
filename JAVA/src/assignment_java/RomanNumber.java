
//B. Enter a Roman Number as input and convert it to an integer. (ex IX = 9) 
package assignment_java;

public class RomanNumber {

	public static int convertRomanToInteger(String romanNumber) {
		int result = 0;
		int previousValue = 0;

		for (int i = romanNumber.length() - 1; i >= 0; i--) {
			char current = romanNumber.charAt(i);
			int value;
			switch (current) {
			case 'I':
				value = 1;
				break;
			case 'V':
				value = 5;
				break;
			case 'X':
				value = 10;
				break;
			case 'L':
				value = 50;
				break;
			case 'C':
				value = 100;
				break;
			case 'D':
				value = 500;
				break;
			case 'M':
				value = 1000;
				break;
			default:
				throw new IllegalArgumentException("Invalid roman Number:" + current);
			}
			if (value < previousValue) {
				result -= value;
			} else {
				result += value;
			}
			previousValue = value;
		}
		return result;
	}

	public static void main(String[] args) {
		String romanNumber = "XX";
		int convertedNumber = convertRomanToInteger(romanNumber);
		System.out.println("Integer Value :" + convertedNumber);

	}

}
