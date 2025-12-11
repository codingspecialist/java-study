package ex06;

public class MyHash05 {
    public static void main(String[] args) {
        String[] arr = new String[3];
        String n1 = "홍길동";
        String n2 = "임꺽정";

        System.out.println(n1.hashCode());
        System.out.println(n2.hashCode());

        int indexN1 = n1.hashCode() % 3;
        int indexN2 = n2.hashCode() % 3;

        System.out.println(indexN1);
        System.out.println(indexN2);

        arr[indexN1]= n1; // 2
        arr[indexN2]= n2; // 0

        // 나는 홍길동 -> hashcode() -> %3
    }
}
