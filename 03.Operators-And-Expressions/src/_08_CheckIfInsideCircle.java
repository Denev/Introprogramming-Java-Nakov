import java.util.Scanner;

/*
Напишете програма, която проверява дали дадена точка О (x, y) е вътре в окръжността К ((0,0), 5).
*/
public class _08_CheckIfInsideCircle {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int myPointX = Integer.parseInt(scanner.next());
        int myPointY = Integer.parseInt(scanner.next());

        int centerX = 0;
        int centerY = 0;
        int radius = 5;

        if ((myPointX - centerX) * (myPointX - centerX)
                + (myPointY - centerY) * (myPointY - centerY) <= radius * radius){

            System.out.format("The point with coordinates (%d, %d) is inside the circle", myPointX, myPointY);
        } else {
            System.out.format("The point with coordinates (%d, %d) is outside the circle", myPointX, myPointY);
        }

    }
}
