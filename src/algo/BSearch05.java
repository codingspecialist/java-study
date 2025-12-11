package algo;


import java.util.Arrays;

public class BSearch05 {
    
    public static void main(String[] args) {
        int[] arr = {0,1,2,9,8,7,6,5,4,3,10};  // 11개 log11 -> 3~4회안에 끝남
        
        Arrays.sort(arr); // {0,1,2,3,4,5,6,7,8,9,10}

        int target = 6;
        int startIndex = 0;
        int endIndex = 10;
        int mid = (endIndex - startIndex) / 2; // 5번지

        if (target == arr[mid]) {
            System.out.println(target + "을 찾았습니다(1라운드): " + arr[mid]);
        }

        startIndex = mid + 1; // 8번지
        mid = (endIndex - startIndex) / 2 + startIndex; // 8번지
        if (target == arr[mid]) {
            System.out.println(target + "을 찾았습니다(2라운드): " + arr[mid]);
        }

        // {0,1,2,3,4,5-----x,6,7,[8],9,10}    s=6, e=7
        endIndex = mid - 1;
        mid = (endIndex - startIndex) / 2 + startIndex; // 9번지
        if (target == arr[mid]) {
            System.out.println(target + "을 찾았습니다(3라운드): " + arr[mid]);
        }
    }
}
