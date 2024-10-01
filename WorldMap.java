public class WorldMap {
    public static void main(String[] args) {
        int width = StdIn.readInt();
        int height = StdIn.readInt();

        StdDraw.setCanvasSize(width, height);
        StdDraw.setXscale(0, width);
        StdDraw.setYscale(0, height);

        while (!StdIn.isEmpty()) {
            String regionName = StdIn.readString();
            int numVertices = StdIn.readInt();

            double[] xCoordinates = new double[numVertices];
            double[] yCoordinates = new double[numVertices];

            for (int i = 0; i < numVertices; i++) {
                xCoordinates[i] = StdIn.readDouble();
                yCoordinates[i] = StdIn.readDouble();
            }

            StdDraw.polygon(xCoordinates, yCoordinates);
        }
    }
}