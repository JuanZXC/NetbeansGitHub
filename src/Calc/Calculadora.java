package Calc;
/**
 *
 * @author Juan
 */
public class Calculadora {

    private int num1;
    private int num2;

    public Calculadora(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public int suma() {
        int result = num1 + num2;
        return result;
    }

    public int resta() {
        int result = num1 - num2;
        return result;

    }

    public int resta_otro() {
        int result;
        if (resta2_otro()) {
            result = num1 - num2;
        } else {
            result = num2 - num1;
        }
        return result;
    }

    public boolean resta2_otro() {
        if (num1 >= num2) {
            return true;
        } else {
            return false;
        }
    }

    public int multiplica() {
        int result = num1 * num2;
        return result;
    }

    public int divide() {
        int result = num1 / num2;
        return result;
    }

    public Integer divide_otro() {
        if (num2 == 0) {
            return null;
        } else {
            int result = num1 / num2;
            return result;
        }

    }

}
