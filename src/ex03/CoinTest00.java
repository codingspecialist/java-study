package ex03;

/**
 * 동전 종류 : 500, 100, 50, 10 - 4가지 종류
 * money를 입력받아서 1200원
 * 각각의 동전의 최소 개수를 구할예정
 */
public class CoinTest00 {
    public static void main(String[] args) {
        int money = 1270;
        int restMoney = money;

        // 1. 500원으로 나눠서 개수를 구할거다.
        int count = restMoney/500;
        restMoney = restMoney%500;
        System.out.println("500동전 개수 : "+count);
        System.out.println("남은 금액 : "+restMoney);

        // 2. 100원으로 나눠서 개수를 구할거다.
        int count2 = restMoney/100;
        restMoney = restMoney%100;
    }
}
