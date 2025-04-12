public class DoublyLinkedListDriver {
    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        list.add(1, 200);
        System.out.println(list);
        System.out.println(list.size);
    }
}
