package Calc;

/**
 *
 * @author Juan
 */
public class Factorial {

    public static int calculo(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Numero" + n + "no puede ser < 0");
        }
        int fact = 1;
        for (int i = 2; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

}
