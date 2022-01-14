package LinkedList;

public class deleteNode {
    Node head;
    static class Node {
        int data;
        Node next;
        Node(int d){
            this.data = d;
            next = null;
        }
    }

    boolean EliminarNodo(Node n){
        if (n == null || n.next == null) return false;

        Node next = n.next;
        n.data = next.data;
        n.next = next.next;

        return true;

    }

    void ImprimirLista(){
        Node n = head;
        while (n != null){
            System.out.println(n.data + "");
            n = n.next;
        }
    }

    public static void main(String[] args) {
        deleteNode llist = new deleteNode();
        llist.head = new Node(0);
        Node segundo = new Node(1);
        Node tercero = new Node(2);
        Node cuarto = new Node(3);
        llist.head.next = segundo;
        segundo.next = tercero;
        tercero.next = cuarto;

        llist.ImprimirLista();
        llist.EliminarNodo(segundo);
        llist.ImprimirLista();
    }
}
