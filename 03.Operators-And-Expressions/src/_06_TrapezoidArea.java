import java.util.Scanner;

/*
Напишете израз, който изчислява площта на трапец по дадени a, b и h.
*/
public class _06_TrapezoidArea {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double aSide = scanner.nextDouble();
        double bSide = scanner.nextDouble();
        double height = scanner.nextDouble();

        double area = ((aSide + bSide) * height) / 2;
        System.out.format("The area of the trapezoid is: %.2f", area);
    }
}
