import java.util.Scanner;

/*
Напишете програма, която за подадени дължина и височина на правоъгълник, изкарват на конзолата неговият периметър и лице.
*/
public class _05_PerimeterAndArea {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double height = scanner.nextDouble();
        double width = scanner.nextDouble();

        double perimeter = 2 * (height + width);
        double area = height * width;

        System.out.format("The perimeter is: %.2f\n", perimeter);
        System.out.format("The area is: %.2f", area);
    }
}
