package ex06;

public class MyHash03 {
    public static void main(String[] args) {
        char[] arr = {'A','B','C'};

        int h = 0;

        // 스탭1
        int n = arr[0]; // 65

        h = h * 31 + n; // h = 65

        // 스탭2
        n = arr[1];
        h = h * 31 + n; // h = 2081

        // 스탭3
        n = arr[2];
        h = h * 31 + n; // h = 2081

        System.out.println(h);

        // 0000000000000000
        // 1111110010000010 = 64578

        // 00000000
        // 00000000
        // 11111100
        // 10000010
    }
}
