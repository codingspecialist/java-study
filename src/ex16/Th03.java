package ex16;

class FruitBox {
    private String fruit;

    public void put(String fruit) {
        this.fruit = fruit;
    }

    public String get() {
        return fruit;
    }
}

class StrawberryListener implements Runnable {

    private FruitBox box;

    public StrawberryListener(FruitBox box) {
        this.box = box;
    }

    @Override
    public void run() {
        while (true) {
            String fruit = box.get();

            if ("딸기".equals(fruit)) {
                System.out.println("🚨 알림: 딸기가 들어왔습니다!");
                break; // 알림 후 종료
            }

            try {
                Thread.sleep(500); // 계속 돌지 않게 잠깐 대기
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}



public class Th03 {
    public static void main(String[] args) throws InterruptedException {
        FruitBox box = new FruitBox();

        // 리스너 스레드 시작
        Thread listener = new Thread(new StrawberryListener(box));
        listener.start();

        // 과일 순서대로 들어옴
        Thread.sleep(1000);
        box.put("사과");
        System.out.println("사과 들어옴");

        Thread.sleep(1000);
        box.put("바나나");
        System.out.println("바나나 들어옴");

        Thread.sleep(1000);
        box.put("딸기");
        System.out.println("딸기 들어옴");
    }
}
