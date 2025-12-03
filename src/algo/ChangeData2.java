package algo;

public class ChangeData2 {
    public static void main(String[] args) {
        // {1,2,3,4,5,6,7} -> {7,6,5,4,3,2,1} reverse
        int[] arr = {2,3,4,5,6,7,1};
        int temp;
        int a = arr.length-1;
        int b = 0;
        int row = arr.length / 2;

        for (int i = 0; i < row; i++) {
            temp = arr[a];
            arr[a] = arr[b];
            arr[b] = temp;
            a--;
            b++;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }

    }
}
