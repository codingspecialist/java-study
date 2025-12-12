package ex13;

class 사람{}

class 홍길동 extends 사람{}


// new 할때 타입을 결정할 수 있게 해주는 제네릭
class Box2<T>{
    T data;
}

public class Ge02 {
    public static void main(String[] args) {
        Box2<String> box2 = new Box2();
        box2.data = "안녕";
        int len = box2.data.length();
        System.out.println(len);

        Box2<Integer> box3 = new Box2();
        box3.data = 5;
        System.out.println(box3.data);
    }
}
