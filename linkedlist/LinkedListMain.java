import java.util.LinkedList;

public class LinkedListMain {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(0);
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(1, 5);
        linkedList.add(2, 6);

        for (Integer integer : linkedList) {
            System.out.println(integer);
        }

        System.out.println("============");

        LinkedListClass linkedListclass = new LinkedListClass();
        linkedListclass.insert(3);
        linkedListclass.insert(5);
        linkedListclass.insert(4);
        linkedListclass.show();

        System.out.println("============");

        LinkedListClass linkedList1 = new LinkedListClass();
        linkedList1.insert(0);
        linkedList1.insert(1);
        linkedList1.insert(2);
        linkedList1.insert(3);

        linkedList1.insertAt(1, 5);
        linkedList1.insertAt(2, 6);
        linkedList1.show();
    }
}
