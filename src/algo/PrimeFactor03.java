package algo;

public class PrimeFactor03 {
    public static void main(String[] args) {
        int n = 27;

        for (int i = 2; i <= n; i++) {
            while (n % i == 0) {
                n = n / i;
                System.out.print(i + " ");
            }
        }
    }
}
