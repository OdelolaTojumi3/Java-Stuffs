public class Checkerboard {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);

        StdDraw.setScale(0, n);
        StdDraw.setCanvasSize(600, 600);
        double squaresize = 1.0/n;

        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                if ((row + col) % 2 == 0) {
                    StdDraw.setPenColor(StdDraw.BLUE);
                } else {
                    StdDraw.setPenColor(StdDraw.LIGHT_GRAY);
                }
                double x = col * squaresize;
                double y = row * squaresize;

                StdDraw.filledSquare(x + squaresize / 2, y + squaresize / 2, squaresize / 2);
            }
        }
    }
}