import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

/*
Декларирайте две променливи от тип String със стойности "Hello" и "World".
Декларирайте променлива от тип Object. Присвоете на тази променлива стойността,
която се получава от конкатенацията на двете стрингови променливи (добавете интервал, ако е необходимо).
Отпечатайте променливата от тип Object.
Декларирайте променлива от тип String и присвоете на последната променливата от тип Object.
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
