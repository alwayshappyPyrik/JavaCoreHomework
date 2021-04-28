package HomeWork11;

public class Main {

    static Calculator calc = Calculator.instance.get();
    static double a = calc.plus.apply(1, 2);
    static double b = calc.minus.apply(1,1);
    static double c = calc.devide.apply(a, b);

//    1. поля должны быть ста-ие, чтобы их можно использовать в мейн
//    2. нужно использовать тип double, чтобы деления происходило правильно, когда не получается разделить нацело

    public static void main(String[] args) {
        calc.println.accept(c);
    }


}
