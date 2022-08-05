public class LinkedListClass {
    private Node head;

    void insert(int data) {
        Node node = new Node();
        node.setData(data);

        if (head == null) {
            head = node;
        } else {
            Node traveler = head;
            while (traveler.getNext() != null) {
                traveler = traveler.getNext();
            }
            traveler.setNext(node);
        }
    }

    void show() {
        Node traveler = head;
        while (traveler.getNext() != null) {
            System.out.println(traveler.getData());
            traveler = traveler.getNext();
        }
        System.out.println(traveler.getData());
    }

    void insertAt(int targetIndex, int data) {
        int currentIndex = 0;
        Node newNode = new Node();
        newNode.setData(data);
        Node traveler = head;
        Node beforeTarget = new Node();
        while (traveler.getNext() != null) {
            if (currentIndex == targetIndex - 1) {
                beforeTarget = traveler;
            }
            if (currentIndex == targetIndex) {
                beforeTarget.setNext(newNode);
                newNode.setNext(traveler);
                break;
            }
            traveler = traveler.getNext();
            currentIndex++;
        }
    }
}
