package algo;

import java.util.Random;

public class Lotto05 {
    public static void main(String[] args) {
        // 1. 준비
        Random rand = new Random();
        int[] arr = new int[6];

        // 2. 로또 번호 받기
        int n;
        int k = 0;

        // 2.1 첫번째 추첨 [9][][][][][] - 픽스
        while(true){
            boolean isSame = false;
            n = rand.nextInt(45)+1; // <- 15

            int i = 0;
            for (int j = 0; j < k; j++) {
                if(arr[i] == n){
                    isSame = true;
                }
                i++;
            }

            if(!isSame){
                arr[k] = n;
                break;
            }
        }
        k++;

        // 2.2 두번째 추첨 [9][15][][][][]
        while(true){
            boolean isSame = false;
            n = rand.nextInt(45)+1; // <- 15

            int i = 0;
            for (int j = 0; j < k; j++) {
                if(arr[i] == n){
                    isSame = true;
                }
                i++;
            }

            if(!isSame){
                arr[k] = n;
                break;
            }
        }
        k++;

        // 2.3 세번째 추첨 [9][15][20][][][]
        while(true){
            boolean isSame = false;
            n = rand.nextInt(45)+1; // <- 20

            int i = 0;
            for (int j = 0; j < k; j++) {
                if(arr[i] == n){
                    isSame = true;
                }
                i++;
            }

            if(!isSame){
                arr[k] = n;
                break;
            }
        }
        k++;


        // 2.4 네번째 추첨 [9][15][20][30][][]
        while(true){
            boolean isSame = false;
            n = rand.nextInt(45)+1; // <- 30

            int i = 0;
            for (int j = 0; j < k; j++) {
                if(arr[i] == n){
                    isSame = true;
                }
                i++;
            }

            if(!isSame){
                arr[k] = n;
                break;
            }
        }
        k++;

        // 2.5 다섯번째 추첨 [9][15][20][30][40][]
        while(true){
            boolean isSame = false;
            n = rand.nextInt(45)+1; // <- 40

            int i = 0;
            for (int j = 0; j < k; j++) {
                if(arr[i] == n){
                    isSame = true;
                }
                i++;
            }

            if(!isSame){
                arr[k] = n;
                break;
            }
        }
        k++;

        // 2.6 여섯번째 추첨 [9][15][20][30][40][43]
        // [9][15][][][][]
        while(true){
            boolean isSame = false;
            n = rand.nextInt(45)+1; // <- 43

            int i = 0;
            for (int j = 0; j < k; j++) {
                if(arr[i] == n){
                    isSame = true;
                }
                i++;
            }

            if(!isSame){
                arr[k] = n;
                break;
            }
        }
        k++;

    }
}
