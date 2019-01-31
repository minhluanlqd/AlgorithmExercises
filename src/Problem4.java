//This problem was asked by Google.
//
//        Given the head of a singly linked list, swap every two nodes and return its head.
//
//        For example, given 1 -> 2 -> 3 -> 4, return 2 -> 1 -> 4 -> 3.

public class Problem4 {
    private Node head;
    private static class Node{
        int data;
        Node next;

        Node(int d){
            data = d;
            next = null;
        }
    }
    private void printList(){
        Node n = head;
        while (n != null){
            System.out.print(n.data + " ");
            n = n.next;
        }
    }
    private void swap_two_node(){
        Node current = head;
        while (current != null && current.next != null){
            int k = current.data;
            current.data = current.next.data;
            current.next.data = k;
            current = current.next.next;
        }
    }
    public static void main(String [] args){
        Problem4 linkedList = new Problem4();
        linkedList.head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        Node fourth = new Node(4);

        linkedList.head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = null;

        linkedList.printList();
        linkedList.swap_two_node();
        System.out.print("==>");
        linkedList.printList();
    }
}
