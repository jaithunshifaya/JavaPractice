public class GaussSeidel {
    public static void main(String[] args) {
        double x=0, y=0, z=0, x1, y1, z1;
        double e = 0.0001;
        int count = 1;

        do {
            x1 = (17 - y + 2*z)/20;
            y1 = (-18 - 3*x + z)/20;
            z1 = (25 - 2*x + 3*y)/20;

            if (Math.abs(x - x1) < e && Math.abs(y - y1) < e && Math.abs(z - z1) < e)
                break;

            x = x1; y = y1; z = z1;
            count++;
        } while (true);

        System.out.printf("x=%.4f y=%.4f z=%.4f (in %d iterations)", x, y, z, count);
    }
}

