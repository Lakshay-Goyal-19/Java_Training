public class LinkedList {
    Node head;
    int size;
    public void append(int data){//adding at last
        Node newNode = new Node(data);
        if(isEmpty()){//case 1 when the linked list is empty
            head=newNode;
            size++;
            return;
        }
        //case 2 when the linked list is not empty and we have to traverse linked list until we 
        //find the node with null address stored inside it and then append a node 
        Node currentNode = head;
        while(currentNode.next!=null){
            currentNode=currentNode.next;
        }
        currentNode.next=newNode;
        size++;
       
    }

    public void preappend(int data){//adding before the head
        Node newnode = new Node(data);
        newnode.next=head;
        head=newnode;
        size++;
    }

    public void add(int data,int index){//to insert a node in between two nodes
        if (index < 0) {
            System.out.println("Invalid index");
            return;
        }
        if (index == 0) {
            preappend(data);
            return;
        }
        Node currentNode = head;
        int counter = 0;
        // Traverse to node at (index - 1)
        while (currentNode != null && counter < index - 1) {
            currentNode = currentNode.next;
            counter++;
        }
        if (currentNode == null) {
            System.out.println("Index out of bounds");
            return;
        }
        if (currentNode.next == null && counter == index - 1) {
            append(data); // cleanly use append when index is at the end
            return;
        }
        // insert in the middle
        Node newNode = new Node(data);
        newNode.next = currentNode.next;
        currentNode.next = newNode;
        size++;
    }


    public void insert(int index,int data){//sir's implementation
    //to insert element at a particular index
        if(index==0){
            preappend(data);
            return;
        }
        if(isEmpty()){
            System.out.println("List is empty");
        }
        if(index==size){
            append(data);
            return;
        }
        if(index>size || index<0){
            throw new ListIndexOutOfBoundsException();
        }
        int count=1;
        Node currentNode=head;
        Node newNode = new Node(data);
        while(count<index){
            currentNode=currentNode.next;
            count++;
        }
        newNode.next = currentNode.next;
        currentNode.next = newNode;
        size++;
    }


    public void removeFirst(){ // to remove the first element in the linked list
        if(isEmpty()){
            System.out.println("List is empty");
            return ;
        }
        head=head.next;
        size--;
        return ;

    }

    public void removeLast(){//remove the last element
        if(isEmpty()){
            System.out.println("List is empty");
            return ;
        }
        if(size==1){
            head=null;
            size--;
            return ;
        }
        Node currentNode = head;
        while (currentNode.next.next!=null) {
            currentNode=currentNode.next;
        }
        currentNode.next=null;
        size--;
        return ;
    }

    public void remove(int index){//remove an element of a particular index
        if(isEmpty()){//if the list is empty
            System.out.println("List is empty");
            return;
        }
        if(index==0){
            removeFirst();
            return;
        }
        if(size-1==index){
            removeLast();
            return;
        }
        if(index>=size || index<0){
            throw new ListIndexOutOfBoundsException();
        }
        Node currentNode=head;
        int c=0;
        Node prev = null;
        while(index>c){
            prev=currentNode;
            currentNode=currentNode.next;
            c++;
        }
        prev.next=currentNode.next;
        currentNode=null;
        size--;
    }


    public int get(int index){//to get the element at a particular index 
        if(isEmpty()){
            System.out.println("List is empty");
            return 0;
        }
        if(index<0){
            throw new ListIndexOutOfBoundsException();
        }
        Node currentNode=head;
        int counter=0;
        while(currentNode!=null){
            if(counter==index){
                return currentNode.data;
            }
            counter++;
            currentNode=currentNode.next;
        }
        throw new ListIndexOutOfBoundsException();
    }

    public boolean contains(int data) {//to check whether an element is present in list or not
        Node currentNode = head;
        while (currentNode != null) {
            if (currentNode.data == data) {
                return true;
            }
            currentNode = currentNode.next;
        }
        return false;
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

    public boolean isEmpty(){//checks if the list is empty or not
        return head==null;
    }
}

class Node{//structure of the node
    int data;
    Node next;
    Node(int data){
        this.data=data;
    }
}
