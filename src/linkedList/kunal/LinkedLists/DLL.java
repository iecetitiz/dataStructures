package linkedList.kunal.LinkedLists;

public class DLL {
    Node head;
    public void insertFirst(int val) {
        Node node = new Node(val);
        node.next = head;
        node.prev = null;
        if(head != null) {
            head.prev = node;
        }
        head = node;
    }

    public void display() {
        Node node = head;
        Node last = null;
        while(node != null) {
            System.out.print(node.val + " --> ");
            last = node;
            node = node.next;
        }
        System.out.println("Null");
        System.out.println("Reversed");
        while(last != null) {
            System.out.print(last.val + " --> ");
            last = last.prev;
        }
        System.out.println("Null");
    }

    public void insertAfter(int after, int val) {
        Node p = find(after);
        if(p == null) {
            System.out.print(" does not exist");
            return;
        }

        Node node = new Node(val);
        node.next = p.next;
        p.next = node;
        node.prev = p;
        if(node.next != null) {
            node.next.prev = node;
        }

    }

    public Node find(int value) {
        Node node = head;
        while(node != null) {
            if(node.val == value) {
                return node;
            }
            node = node.next;
        }
        return null;
    }

    public void insertLast(int val) {
        Node node = new Node(val);
        Node last = head;
        node.next = null;
        if(head == null) {
           node.prev = null;
           head = node;
           return;
        }

        while(last.next != null) {
            last = last.next;
        }

        last.next = node;
        node.prev = last;
    }







    private class Node {
        int val;
        Node next;
        Node prev;

        public Node(int val) {
            this.val = val;
        }

        public Node(int val, Node next, Node prev) {
            this.val = val;
            this.next = next;
            this.prev = prev;
        }
    }
}
