package ex06;

class MyLikedList {
    Node root;

    public void add(Node node){

    }

    public void remove(Node node){

    }

    public MyNode get(String key){
        return null;
    }
}

class MyNode {
    String key;
    String value;
    Node next;

    public MyNode(String key, String value, Node next) {
        this.key = key;
        this.value = value;
        this.next = next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}



public class MyList02 {
    public static void main(String[] args) {
        MyLikedList myList = new MyLikedList();

        myList.add(null);
        myList.add(null);
        myList.add(null);

        myList.remove(null);

        MyNode node = myList.get("name");
    }
}
