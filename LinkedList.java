public class LinkedList
{
    private Node head;
    private Node tail;
    private int size;

    public LinkedList(){
        this.size=0;
    }

    public void insertFirst(int val){
       Node node = new Node(val);
       node.next = head;
       head = node;

       if(tail == null){
           tail = head;
       }
       size+=1;

    }

    public void insertLast(int val){
        if(tail == null){
            insertFirst(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        tail= node;
        size++;
    }

    public void insertAtPosn(int val,int index){
        if(index==0){
            insertFirst(val);
            return;
        }
        if(index==size){
            insertLast(val);
            return;
        }
        Node temp = head;
        for(int i=1;i<index;i++){
            temp = temp.next;
        }
        Node node = new Node(val,temp.next);
        temp.next = node;
        size++;
    }

    public void deleteFirst(){
        int val = head.value;
        head = head.next;
        if(head== null){
            tail = null;
        }
        size--;
        System.out.println(val+" deleted from list.");
    }

    public void deleteLastNode(){
        if(head==null){
            System.out.println("list is empty.");
        }
        if(head.next==null){
            deleteFirst();
            return;
        }
        Node temp = head;
        while (temp.next.next!=null){
            temp = temp.next;

        }
        temp.next = null;
    }

    public void deleteAtAnyIndex(int index){
        if(head == null){
            System.out.println("list is empty !");
        }
        if(index==0){
            deleteFirst();
            return;
        }
        Node temp = head;
        int count = 0;

        while (temp != null && count < index - 1) {
            temp = temp.next;
            count++;
        }
        if (temp == null || temp.next == null) {
            System.out.println("Invalid index.");
            return;
        }


        temp.next = temp.next.next;

    }

    public void display(){
        Node temp = head;
        while (temp!=null){
            System.out.print(temp.value+" -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }

    public Node find(int value){
        Node node = head;
        while (node!=null){
            if(node.value==value){
                return node;
            }
            node = node.next;
        }
        return null;
    }


    private class Node{
        int value;
        Node next;

        public Node(int value){
            this.value = value;
        }

        public Node(int value,Node next){
            this.value = value;
            this.next = next;
        }

    }



}
