import java.util.Scanner;

/*
�������� �����, ����� �� ��������� ���� ������ ���� ����� ������� 7 �� ����� ����� (������� �� ����).
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
