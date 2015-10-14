import java.util.Scanner;

/*
Напишете програма, която проверява дали дадена точка О (x, y) е вътре в окръжността К ((0,0), 5) и е извън правоъгълника ((-1, 1), (5, 5).
*/
public class _09_CheckIfInsideCircleAndOutsideRectangle {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int myPointX = Integer.parseInt(scanner.next());
        int myPointY = Integer.parseInt(scanner.next());

        int centerX = 0;
        int centerY = 0;
        int radius = 5;

        if (((myPointX - centerX) * (myPointX - centerX)
                + (myPointY - centerY) * (myPointY - centerY) < radius * radius) && (myPointX < -1 || myPointX > 5 || myPointY < 1 || myPointY > 5) ){

            System.out.format("The point with coordinates (%d, %d) is inside the circle and outside the rectangle", myPointX, myPointY);
        } else {
            System.out.format("The point with coordinates (%d, %d) doesn't fulfill the requirements", myPointX, myPointY);
        }
    }
}
