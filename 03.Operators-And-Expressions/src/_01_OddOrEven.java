import java.util.Scanner;

/*
Напишете израз, който да проверява дали дадено цяло число е четно или нечетно.
*/
public class _01_OddOrEven {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        if (number % 2 == 0){
            System.out.format("%d is even", number);
        } else{
            System.out.format("%d is odd", number);
        }
    }

}
