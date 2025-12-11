package ex07;

abstract class 동물{
    public 동물() {
        System.out.println("동물의 기본 생성자가 호출됩니다.");
    }
}

class 강아지 extends 동물{
    public 강아지() {
        //super();
        System.out.println("강아지의 기본 생성자가 호출됩니다.");
    }
}


public class GoodTest {
    public static void main(String[] args) {

    }
}
