public class Elimination_Game {
    public static int lastRemaining(int n) {
        if (n == 1)
            return 1;
        return 2 * (1 + n / 2 - lastRemaining(n / 2));
    }

    public static void main(String[] args) {
        int n=9;
        System.out.println(lastRemaining(n));
    }
}
