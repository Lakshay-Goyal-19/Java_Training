public class CSLinkedListDriver {
    public static void main(String[] args) {
        CSLinkedList list = new CSLinkedList();
        list.append(10);
        list.append(20);
        list.append(30);
        list.preAppend(100);
        list.removeFirst();
        list.removeFirst();
        System.out.println(list);
        System.out.println(list.getSize());
    }
}
