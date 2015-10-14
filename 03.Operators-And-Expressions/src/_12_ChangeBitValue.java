import java.util.Scanner;

/*
Дадено е число n, стойност v (v = 0 или 1) и позиция p.
Напишете поредица от операции, които да променят стойността на n, така че битът на позиция p да има стойност v.
Пример n=35, p=5, v=0 -> n=3. Още един пример: n=35, p=2, v=1 -> n=39.
*/
public class _12_ChangeBitValue {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();
        int value = scanner.nextInt();
        int position = scanner.nextInt();

        int mask = value << position;
        number = number & (~(1 << position));
        int result = number | mask;

        System.out.println(result);
    }
}
