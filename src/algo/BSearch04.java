package algo;

import java.util.Arrays;

// 11 찾기
public class BSearch04 {
    public static void main(String[] args) {
        int[] arr = {10, 4, 1, 2, 3, 0, 11}; // 7개

        // 1. 정렬
        Arrays.sort(arr); // 0, 1, 2, 3, 4, 10, 11

        int target = 11;
        int mid = arr.length/2; // 3

        // 2. 검색
        if(target == arr[mid]){ // 0, 1, 2, [3], 4, 10, 11
            System.out.println(target+"를 찾았습니다.");
            return;
        }

        if(target > arr[mid]){
            mid = 5;
        }

        if(target < arr[mid]){
            mid = 1;fdsajklfjadsk/
                    fdjsakfljaskl/
        }

        if(target == arr[mid]){ // 0, 1, 2, 3, 4, [10], 11
            System.out.println(target+"를 찾았습니다.");
            return;
        }

        if(target > arr[mid]){
            mid = 6;
        }

        if(target < arr[mid]){
            mid = 4;
        }

        if(target == arr[mid]){ // 0, 1, 2, 3, 4, 10, [11]
            System.out.println(target+"를 찾았습니다.");
            return;
        }


        System.out.println("main끝");
    }
}
