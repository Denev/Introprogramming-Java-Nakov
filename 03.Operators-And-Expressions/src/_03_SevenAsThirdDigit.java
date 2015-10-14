import java.util.Scanner;

/*
Напишете израз, който да проверява дали дадено цяло число съдържа 7 за трета цифра (отдясно на ляво).
*/
public class _03_SevenAsThirdDigit {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();
        int digitChecker = (number / 100) % 10;

        if (digitChecker == 7){
            System.out.println("Yes");
        } else{
            System.out.println("No");
        }
    }
}
