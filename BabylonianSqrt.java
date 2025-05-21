public class BabylonianSqrt {
    public static double squareRoot(double n) {
        double x = n;
        double y = 1;
        double e = 0.000001;

        while (Math.abs(x - y) > e) {
            x = (x + y) / 2;
            y = n / x;
        }
        return x;
    }

    public static void main(String[] args) {
        double num = 25;
        System.out.printf("Square root: %.2f " , squareRoot(num));
    }
}
