import java.util.Scanner;

/*
�������� �����, ����� ��������� ������ �� ������ �� ������ a, b � h.
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
