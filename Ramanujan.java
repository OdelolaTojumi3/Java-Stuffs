public class Ramanujan {
    public static boolean isRamanujan(long n) {
        for (long a = 1; a * a * a < n; a++) {
            long b3 = n - a * a * a;
            long b = (long) Math.cbrt(b3);
            if (b * b * b == b3) {
                for (long c = a + 1; c * c * c < n; c++) {
                    long d3 = n - c * c * c;
                    long d = (long) Math.cbrt(d3);
                    if (d * d * d == d3) {
                        return true;
                    }
                }
            }
        }
        return false;

    }

    public static void main(String[] args) {
        long n = Long.parseLong(args[0]);
        boolean isRamanujanNUmber = isRamanujan(n);

        System.out.println(isRamanujanNUmber);
    }
}
