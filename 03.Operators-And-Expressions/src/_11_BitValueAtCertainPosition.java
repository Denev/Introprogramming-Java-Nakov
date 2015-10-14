import java.util.Scanner;

/*
Дадено е число n и позиция p.
Напишете поредица от операции, които да отпечатат стойността на бита на позиция p от числото n (0 или 1).
Пример: n=35, p=5 -> 1. Още един пример: n=35, p=6 -> 0.
*/

public class _11_BitValueAtCertainPosition {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();
        int position = scanner.nextInt();
        int mask = 1 << position;
        int result = number & mask;

        if (result == 0){
            System.out.format("The bit at position %d is 0", position);
        } else{
            System.out.format("The bit at position %d is 1", position);
        }
    }
}
