public class ThueMorse {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);

        int sequenceLength = 1;
        while (sequenceLength < n) {
            sequenceLength *= 2;
        }

        boolean[] thueMorse = new boolean[sequenceLength];
        for (int i = 0; i < sequenceLength; i++) {
            thueMorse[i] = Integer.bitCount(i) % 2 == 0;
        }


        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (thueMorse[i] == thueMorse[j]) {
                    System.out.print("+  ");
                } else {
                    System.out.print("-  ");
                }
            }
            System.out.println();
        }
    }
}
