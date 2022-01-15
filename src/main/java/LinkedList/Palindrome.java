package LinkedList;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class Palindrome {
    Node head;
    static class Node {
        int data;
        Node next;
        Node(int d){
             this.data = d;
            next = null;
        }
    }

    boolean EsPalindromo(Node node){
        Node reversed = cloneAnReplace(node);
        return isEqual(reversed, node);
    }

    Node cloneAnReplace(Node node) {
        Node head = null;
        while(node != null){
            Node next = new Node(node.data);
            node.next = head;
            head = next;
            node = node.next;
        }

        return head;
    }

    boolean isEqual(Node n1, Node n2){
        while(n1 != null && n2 != null){
            if(n1.data != n2.data){
                return  false;
            }
            n1 = n1.next;
            n2 = n2.next;
        }
        return true;
    }

    void ImprimirLista(){
        Node n = head;
        while(n != null){
            System.out.println(n.data);
            n = n.next;
        }
    }


    public static void main(String[] args) {
        Palindrome llist = new Palindrome();
        llist.head = new Node(0);
        Node second = new Node(1);
        Node tercero = new Node(1);
        Node cuarto = new Node(5);
        llist.head.next = second;
        second.next = tercero;
        tercero.next = cuarto;

        boolean resultado = llist.EsPalindromo(llist.head);
        System.out.println(resultado);

    }



}
