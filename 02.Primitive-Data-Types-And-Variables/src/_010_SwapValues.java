/*
������������ ��� ���������� �� ��� int. ������� �� ��������� ��������� 5 � 10. ��������� ����������� �� � �� �����������.
 */
public class _010_SwapValues {
    public static void main(String[] args) {
        int firstNumber = 5;
        int secondNumber = 10;
        System.out.println("First number before swapping: " + firstNumber);
        System.out.println("Second number before swapping: " + secondNumber);
        int temp = firstNumber;
        firstNumber = secondNumber;
        secondNumber = temp;
        System.out.println();
        System.out.println("First number after swapping: " + firstNumber);
        System.out.println("Second number after swapping: " + secondNumber);
    }
}
