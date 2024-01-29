package revaluationtask1;

public class reverse {

	public static void main(String[] args) {
		int inputNumber = 876;
        int reversedNumber = reverseNumber(inputNumber);
        System.out.println("Input: " + inputNumber + ", Output: " + reversedNumber);
    }

    public static int reverseNumber(int number) {
        int reversedNumber = 0;
        while (number > 0) {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number = number / 10;
        }
        return reversedNumber;

	}

}