import java.util.Scanner;

/*
�������� ����� �����, ����� �� ��������� ���� ������ ���� ����� �� ���� �� 5 � �� 7 ��� �������.
*/
public class _02_DivisibleBy5or7 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();
        boolean isDivisible = (number % 5 == 0 && number % 7 == 0) ? true : false;
        System.out.println(isDivisible);
    }
}
