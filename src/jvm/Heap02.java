package jvm;

class Dog {
    int age = 10;
    String name = "토토";
}

class Person{
    int age = 20;
    String name = "홍길동";

    Dog buyDog(){
        Dog d1 = new Dog();
        return d1;
    }
}

public class Heap02 {
    public static void main(String[] args) {
        Person p1 = new Person();
        Dog d = p1.buyDog();
    }
}
