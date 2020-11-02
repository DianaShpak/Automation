package math;

public class Variables {

    public int a = 10;

    public String helloWorld = "Hello world!";

    public static String someStatic = "Static";


    @Override // вывод содержимого переменных класса
    public String toString() {
        return "Variables{" +
                "a=" + a +
                ", helloWorld='" + helloWorld + '\'' +
                '}';
    }
}
