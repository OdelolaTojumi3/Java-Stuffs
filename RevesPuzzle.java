public class RevesPuzzle {
    private static void hanoi(int n, String from, String temp, String to) {
        if (n == 0) return;
        hanoi(n-1, from, to, temp);
        System.out.println("Move disc " + n + " from " + from + " to " + to);
        hanoi(n-1, temp, from, to);
    }

    private static void reve(int n, String from, String temp1, String temp2, String to) {
        if (n == 0) return;
        int k = (int) Math.round(n + 1 - Math.sqrt(2 * n + 1));
        reve(k, from, to, temp2, temp1);
        hanoi(n-k, from, temp2, to);
        reve(k, temp1, from, temp2, to);
    }

    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        reve(n, "A", "B", "C", "D");
    }
}
