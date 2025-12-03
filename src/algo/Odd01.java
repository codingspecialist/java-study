package algo;

/**
 * 1부터 100까지 수를 출력하는데, 홀수면 홀수, 짝수면 짝수로 출력하시오
 * (1) 비지니스 상상해보기
 * (2) 샘플링하기 5개 (1~5)까지만 해야지!!
 * (3) 노가다
 * (4) 패턴찾기
 */
public class Odd01 {
    public static void main(String[] args) {
        int num = 1;
        String result = "홀수";

        // num = 1
        if(num%2 == 0){ // false
            result = "짝수";
        }else{
            result = "홀수";
        }
        System.out.println(num+"은 "+result+"입니다");
        num++;

        // num = 2
        if(num%2 == 0){ // true
            result = "짝수";
        }else{
            result = "홀수";
        }
        System.out.println(num+"은 "+result+"입니다");
        num++;


        // num = 3
        if(num%2 == 0){ // true
            result = "짝수";
        }else{
            result = "홀수";
        }
        System.out.println(num+"은 "+result+"입니다");
        num++;


        // num = 4
        if(num%2 == 0){ // true
            result = "짝수";
        }else{
            result = "홀수";
        }
        System.out.println(num+"은 "+result+"입니다");
        num++;

        // num = 5
        if(num%2 == 0){ // true
            result = "짝수";
        }else{
            result = "홀수";
        }
        System.out.println(num+"은 "+result+"입니다");
        num++;
    }
}
