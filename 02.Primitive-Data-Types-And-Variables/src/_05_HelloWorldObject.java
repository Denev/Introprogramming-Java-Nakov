import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

/*
������������ ��� ���������� �� ��� String ��� ��������� "Hello" � "World".
������������ ���������� �� ��� Object. ��������� �� ���� ���������� ����������,
����� �� �������� �� �������������� �� ����� ��������� ���������� (�������� ��������, ��� � ����������).
����������� ������������ �� ��� Object.
������������ ���������� �� ��� String � ��������� �� ���������� ������������ �� ��� Object.
*/
public class _05_HelloWorldObject {
    public static void main(String[] args) {

        String firstString = "Hello";
        String secondString = "World";

        Object result = firstString + " " + secondString;

        System.out.println(result);

        String resultValue = result.toString();
    }
}
