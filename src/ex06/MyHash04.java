package ex06;

import java.util.HashMap;

public class MyHash04 {
    public static void main(String[] args) {
        HashMap arr = new HashMap<>();
        arr.put("주호", 1);
        arr.put("name", "홍길동");
        arr.put("name", "임꺽정");

        System.out.println(arr.get("name"));
    }
}
