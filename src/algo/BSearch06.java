package algo;


import java.util.Arrays;

public class BSearch06 {

    public static void main(String[] args) {
        int[] arr = {0,1,2,9,8,7,6,5,4,3,10};  // 11개 log11 -> 3~4회안에 끝남

        Arrays.sort(arr); // {0,1,2,3,4,5,6,7,8,9,10}

        int n = 1;
        int target = 10;
        int startIndex = 0;
        int endIndex = arr.length-1;
        int mid = 0;

        // {0,1,2,3,4,5,[6],7,8,9,10}
        // s=0, e=10, m=5 (1회전)
        // s=6, e=10, m=8 (2회전)
        // s=6, e=7, m=6 (3회전)
        while(true){
            mid = (endIndex - startIndex) / 2 + startIndex;
            if (target == arr[mid]) {
                System.out.println(target + "을 찾았습니다("+n+"라운드): " + arr[mid]);
                break;
            }

            if(target < arr[mid]){
                endIndex = mid - 1;
            }
            if(target > arr[mid]){
                startIndex = mid + 1;
            }
            n++;
        }


    }
}
