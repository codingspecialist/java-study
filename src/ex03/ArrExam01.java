package ex03;

public class ArrExam01 {
    public static void main(String[] args) {
        int[][] arr = {
                { 3, 5, 1 },
                { 7, 2, 9 },
                { 4, 6, 8 }
        };

        int max = arr[0][0];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                }
            }
        }

        System.out.println("가장 큰 값: " + max);
    }
}
