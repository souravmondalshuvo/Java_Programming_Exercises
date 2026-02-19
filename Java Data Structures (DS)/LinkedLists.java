public class LinkedLists {

    class Node {

        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
        }
    }

    // add - first, last
    
    public void addFirst(String data) {

        Node new_node = new Node(data);

        if(head == null) {
            head = new_node;
            return;
        }

        new_node.next = head;
        head = new_node;
    }

    public static void main(String[] args) {
        
        LinkedLists list = new LinkedLists();


    }
}