import java.util.Scanner;

/*
�������� �����, ����� �� ��������� ���� ������ ���� ����� � ����� ��� �������.
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
