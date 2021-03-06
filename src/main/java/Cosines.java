
public class Cosines {

    public static double fact(double num) {
        return (num <= 0) ? 1 : num * fact(num - 1);
    }

    public static double cos(double num) {
        double result = 0, term;
        for (int i = 0; i < 8; i++) {
            term = Math.pow(-1, i) * Math.pow(num, 2 * i) / fact(2 * i);
            result += term;
        }
        return result;
    }

}