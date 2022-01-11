package LinkedList;

public class LastElement {
    Node head;

    static  class Node {
        int data;
        Node next;
        Node(int d){
            this.data = d;
            next = null;
        }
    }

    int printLasElement(Node head, int k){
        if(head == null) return 0;

        int index = printLasElement(head.next, k) + 1;
        if(index == k){
            System.out.println(k + "th to last node is" + head.data);
        }

        return index;

    }

    public static void main(String[] args) {

        LastElement llist = new LastElement();
        llist.head = new Node(1);
        Node segundo = new Node(2);
        Node tercer = new Node(3);
        Node cuarto = new Node(3);
        Node quinto = new Node(4);
        Node sexto = new Node(43);

        llist.head.next = segundo;
        segundo.next = tercer;
        tercer.next = cuarto;
        cuarto.next = quinto;
        quinto.next = sexto;

        int index = llist.printLasElement(llist.head, 2);

        System.out.println(index);

    }
}
