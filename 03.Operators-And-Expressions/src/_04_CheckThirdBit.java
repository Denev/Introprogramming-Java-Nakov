import java.util.Scanner;

/*
�������� �����, ����� �� ��������� ���� ������ ��� �� ������ ����� � 1 ��� 0.
*/
public class _04_CheckThirdBit {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int checkNumber = 8;
        int number = scanner.nextInt();
        if ((number & checkNumber) != 0){
            System.out.format("The third bit of %d is 1", number);
        } else{
            System.out.format("The third bit of %d is 0", number);
        }
    }
}
