package algo;

import java.util.Random;

public class Lotto04 {
    public static void main(String[] args) {
        // 1. 준비
        Random rand = new Random();
        int[] arr = new int[6];

        // 2. 로또 번호 받기
        int n;

        // 2.1 첫번째 추첨 [9][][][][][] - 픽스
        while(true){
            boolean isSame = false;
            n = rand.nextInt(45)+1; // <- 15
            if(!isSame){
                arr[0] = n;
                break;
            }
        }

        // 2.2 두번째 추첨 [9][15][][][][]
        while(true){
            boolean isSame = false;
            n = rand.nextInt(45)+1; // <- 15
            if(arr[0] == n){
                isSame = true;
            }
            if(!isSame){
                arr[1] = n;
                break;
            }
        }

        // 2.3 세번째 추첨 [9][15][20][][][]
        while(true){
            boolean isSame = false;
            n = rand.nextInt(45)+1; // <- 20
            if(arr[0] == n){
                isSame = true;
            }
            if(arr[1] == n){
                isSame = true;
            }
            if(!isSame){
                arr[2] = n;
                break;
            }
        }



        // 2.4 네번째 추첨 [9][15][20][30][][]
        while(true){
            boolean isSame = false;
            n = rand.nextInt(45)+1; // <- 30
            if(arr[0] == n){
                isSame = true;
            }
            if(arr[1] == n){
                isSame = true;
            }
            if(arr[2] == n){
                isSame = true;
            }
            if(!isSame){
                arr[3] = n;
                break;
            }
        }

        // 2.5 다섯번째 추첨 [9][15][20][30][40][]
        while(true){
            boolean isSame = false;
            n = rand.nextInt(45)+1; // <- 40
            if(arr[0] == n){
                isSame = true;
            }
            if(arr[1] == n){
                isSame = true;
            }
            if(arr[2] == n){
                isSame = true;
            }
            if(arr[3] == n){
                isSame = true;
            }
            if(!isSame){
                arr[4] = n;
                break;
            }
        }

        // 2.6 여섯번째 추첨 [9][15][20][30][40][43]
        // [9][15][][][][]
        while(true){
            boolean isSame = false;
            n = rand.nextInt(45)+1; // <- 43

            int i = 0;

            if(arr[i] == n){
                isSame = true;
            }
            i++;

            if(arr[i] == n){
                isSame = true;
            }
            i++;

            if(arr[i] == n){
                isSame = true;
            }
            i++;

            if(arr[i] == n){
                isSame = true;
            }
            i++;

            if(arr[i] == n){
                isSame = true;
            }
            i++;

            if(!isSame){
                arr[5] = n;
                break;
            }
        }


















    }
}
