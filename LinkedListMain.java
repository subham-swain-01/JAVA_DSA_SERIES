import org.w3c.dom.Node;

import java.util.Arrays;

public class LinkedListMain {
    public static void main(String[] args) {
//    LinkedList list = new LinkedList();
//    list.insertFirst(12);
//    list.insertFirst(13);
//    list.insertFirst(14);
//    list.insertFirst(15);
//    list.insertLast(11);
//    list.insertAtPosn(21,2);
//    list.display();
//    list.deleteFirst();
//    list.display();
//    list.deleteLastNode();
//    list.display();
//    list.deleteAtAnyIndex(3);
//    list.display();

//        DoublyLl list = new DoublyLl();
//        list.insertFirst(12);
//        list.insertFirst(11);
//        list.insertFirst(10);
//        list.insertFirst(8);
//        list.display();
//        list.insertLast(13);
//        list.display();

        CircularLl ll = new CircularLl();
        ll.InsertFirst(13);
        ll.InsertFirst(12);
        ll.InsertFirst(8);
        ll.InsertFirst(5);
      //  ll.Display();
        ll.InsertLast(15);
        ll.InsertLast(18);
        ll.Display();
        ll.InsertAtposn(9,2);
        ll.Display();






    }
}
