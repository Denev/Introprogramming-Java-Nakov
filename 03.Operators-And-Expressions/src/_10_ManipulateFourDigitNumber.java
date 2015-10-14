import java.util.IntSummaryStatistics;
import java.util.Scanner;

/*
Напишете програма, която приема за вход четирицифрено число във формат abcd и след това извършва следните действия върху него:
-     Пресмята сбора от цифрите на числото.
-     Разпечатва на конзолата цифрите в обратен ред: dcba.
-     Поставя последната цифра, на първо място: dabc.
-     Разменя мястото на втората и третата цифра: acbd.
*/
public class _10_ManipulateFourDigitNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();
        int manipulatedNumber = number;
        //1st
        int sum = 0;
        for (int i = 0; i < 4; i++){
            sum += manipulatedNumber % 10;
            manipulatedNumber /= 10;
        }
        System.out.format("The sum of the number %d is: %d", number, sum);

        manipulatedNumber = number;
        System.out.println();

        //2nd
        String reversedNumber[] = new String[4];
        for (int i = 0; i < 4; i++){
            reversedNumber[i] = String.valueOf(manipulatedNumber % 10);
            manipulatedNumber /= 10;
        }
        StringBuilder reversedNumberResult = new StringBuilder();
        for(String s : reversedNumber) {
            reversedNumberResult.append(s);
        }
        reversedNumberResult.toString();

        System.out.format("The number %d in reversed order is: %s", number, reversedNumberResult);

        manipulatedNumber = number;
        System.out.println();

        //3rd
        int lastDigit = manipulatedNumber % 10;

        String numberString = Integer.toString(manipulatedNumber);
        String lastDigitString = numberString.substring(0, numberString.length() - 1);
        String finalLastToFirst = lastDigit + lastDigitString;

        System.out.format("The number %d in new order (last digit to first): %s", number, finalLastToFirst);
        System.out.println();

        //4th
        char secondDigit = numberString.charAt(1);
        char thirdDigit = numberString.charAt(2);

        StringBuilder sb = new StringBuilder(numberString);
        sb.setCharAt(1, thirdDigit);
        sb.setCharAt(2, secondDigit);

        String changeSecondAndThird = sb.toString();

        System.out.format("The number %d in new order (exchange 2nd and 3rd digit): %s", number, changeSecondAndThird);
    }
}
