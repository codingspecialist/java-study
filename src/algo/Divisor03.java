package algo;

public class Divisor03 {
    public static void main(String[] args) {
        int n = 36; // 약수를 구할 숫자

        System.out.println(n + "의 약수:");

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {  // 나머지가 0이면 i는 n의 약수
                System.out.print(i + " ");
            }
        }
    }
}
