import java.util.Scanner;

/*
������ �� ��������������� ���� �� ������ � ������������� 17% �� ���� �� ������.
�������� ��������, ����� �� ��������� �������� �� ����� �� ������, �� �������� ������ �� ������.
*/
public class _07_MoonWeight {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double earthWeight = scanner.nextDouble();
        double moonWeight = (earthWeight / 100) * 17;

        System.out.format("Your weight on the moon is: %.2f", moonWeight);
    }
}
