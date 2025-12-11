package ex06.ch02;

class Car {
    void run(){}
}

class Morning extends Car{
    void run(){
        System.out.println("모닝 달린다");
    }
}

class Sonata extends Car{
    // 부모의 메서드를 재정의하면
    // 자식의 부모의 메서드를 오버라이드한다.
    // 오버라이드 : 무시하고 대신한다.
    void run(){
        System.out.println("소나타 달린다");
    }
}


public class ExMeh01 {
    public static void main(String[] args) {
        Car a1 = new Morning(); // [Morning, Car(v)]
        a1.run();

        Car a2 = new Sonata(); // [Sonata, Car(v)]
        a2.run();
    }
}
