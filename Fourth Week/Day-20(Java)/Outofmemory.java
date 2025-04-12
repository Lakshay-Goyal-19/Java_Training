public class Outofmemory {
    public static void main(String[] args) {
        int[] arr = new int[Integer.MAX_VALUE];
        System.out.println(arr[Integer.MAX_VALUE]);
    }
}
