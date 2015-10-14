import java.util.Scanner;

/*
Силата на гравитационното поле на луната е приблизително 17% от това на земята.
Напишете програма, която да изчислява тежестта на човек на луната, по дадената тежест на земята.
*/
public class _07_MoonWeight {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double earthWeight = scanner.nextDouble();
        double moonWeight = (earthWeight / 100) * 17;

        System.out.format("Your weight on the moon is: %.2f", moonWeight);
    }
}
