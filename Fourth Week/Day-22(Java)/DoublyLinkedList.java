public class DoublyLinkedList {
    Node head;
    int size;

    public boolean isEmpty(){//checks if the list is empty or not
        return head==null;
    }

    public String toString(){//overriding the toString method
        //println calls the toString internally
        if(isEmpty()){
            return "[   ]";
        }
        String data ="[ ";  
        Node current =head;
        while(current.next!=null){
            data+=current.data+","; 
            current=current.next;
        }
        data+=current.data+" ]";//for the last node in the linked list
   
        return data;
    }

    public void addFirst(int data){//preappend an element in the doubly linked list
        Node newNode = new Node(data);
        newNode.next=head;
        if (head != null) {
            head.prev = newNode;//update the prev of the old head
        }
        head=newNode;
        newNode.prev =null;
        size++;
    }

    public void addLast(int data){//append an element to the last of the doubly linked list
        Node newNode = new Node(data);
        if (isEmpty()) {
            head = newNode;
            size++;
            return;
        }
        Node currentNode = head;
        while (currentNode.next != null) {
            currentNode = currentNode.next;
        }
        currentNode.next = newNode;
        newNode.prev = currentNode;
        size++;
    }

    public void add(int index, int data) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Invalid index");
        }
        if (index == 0) {
            addFirst(data);
            return;
        }
        if (index == size) {
            addLast(data);
            return;
        }
        Node newNode = new Node(data);
        Node currentNode = head;
        int count = 0;
    
        // Traverse to the node just before the index
        while (count < index - 1) {
            currentNode = currentNode.next;
            count++;
        }
    
        Node nextNode = currentNode.next;
        newNode.next = nextNode;
        newNode.prev = currentNode;
    
        currentNode.next = newNode;
        if (nextNode != null) {
            nextNode.prev = newNode;
        }
        size++;
}
    
}
class Node {
    int data;
    Node next;
    Node prev;
    Node(int data){
        this.data=data;
    }
    
}
