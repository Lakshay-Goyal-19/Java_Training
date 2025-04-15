//homework  - create circular doubly linked list
public class CSLinkedList {//circular linked list
    Node head;
    private int size;
    public int getSize() {
        return this.size;
    }
    
    public boolean isEmpty(){
        return head==null;
    }
    public void append(int data){
        Node newNode = new Node(data);
        if(isEmpty()){
            head=newNode;
            head.next=head;//here the head will point towards itself
            size++;
            return;
        }
        Node currentNode=head;
        while(currentNode.next!=head){
            currentNode=currentNode.next;
        }
        currentNode.next=newNode;
        newNode.next=head;
        size++;
    }

    public void preAppend(int data){
        Node newNode = new Node(data);
        if(isEmpty()){
            head=newNode;
            head.next=newNode;
            size++;
            return;
        }
        Node currentNode=head;
        while(currentNode.next!=head){
            currentNode=currentNode.next;
        }
        currentNode.next=newNode;
        newNode.next=head;
        head=newNode;
        size++;
    }

    public void removeFirst(){
        if(isEmpty()){
            System.out.println("List is empty");
            return;
        }
        Node currentNode=head;
        while(currentNode.next!=head){
            currentNode=currentNode.next;
        }
        currentNode.next=head.next;
        head=currentNode.next;
        size--;
    }


    public String toString(){
        if(isEmpty()){
            return "[ ]";
        }
        StringBuffer data = new StringBuffer("[ ");
        Node currentNode = head;
        while(currentNode.next!=head){
            data.append(currentNode.data+" --> ");
            currentNode=currentNode.next;
        }
        data.append(currentNode.data+" ]");
        return data.toString();
    }
    
    private class Node{//Node class can only be accessed inside the CSLinkedList
        //because of private keyword
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
}
