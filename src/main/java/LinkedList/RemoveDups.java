package LinkedList;

import java.util.HashSet;

public class RemoveDups {

    Node head;

    static class Node {
        int data;
        Node next;
        Node(int d){
            this.data = d;
            next = null;
        }
    }

    void deleteDup(Node n) {
        HashSet<Integer> set = new HashSet<Integer>();
        Node prev = null;
        while (n != null) {
            if (set.contains(n.data)) {
                prev.next = n.next;
            } else {
                set.add(n.data);
                prev = n;
            }
            n = n.next;
        }
    }

    int longitudLlist(){
        Node n = head;
        int count = 0;
        while(n != null){
            n = n.next;
            count++;
        }
        return count;
    }

    void imprimiLinkedList(){
        Node n = head;
        while(n != null){
            System.out.println(n.data + " ");
            n = n.next;
        }
    }

    public static void main(String[] args) {

        RemoveDups llist = new RemoveDups();
        llist.head = new Node(1);
        Node second = new Node(2);
        Node tercero = new Node(3);
        Node cuarto = new Node(3);
        Node quinto = new Node(4);
        Node sexto = new Node(4);

        llist.head.next = second;
        second.next = tercero;
        tercero.next = cuarto;
        cuarto.next = quinto;
        quinto.next = sexto;

        llist.deleteDup(llist.head);

        llist.imprimiLinkedList();

        int longitud = llist.longitudLlist();
        System.out.println(longitud);
    }
}
