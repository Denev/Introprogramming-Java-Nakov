import java.util.Scanner;

/*
Напишете програма, която проверява дали дадено число n (n < 100) е просто.
*/
public class _13_CheckIfPrime {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        boolean isPrime = true;

        if (number > 1) {

            for (int i = 2; i <= Math.sqrt(number); i++){

                if (number % i == 0){

                    isPrime = false;
                    break;
                }
            }
        } else{
            isPrime = false;
        }

        System.out.println(isPrime);

    }
}
