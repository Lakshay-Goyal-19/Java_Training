//do sorting based on the price field of Book class object array
//Natural Sorting
//Now Custom Sorting
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
public class BookDriver {
    public static void main(String[] args) {
        Book[] books =new Book[4];
        books[0] = new Book("harry", "don't know", 1000,4.5);        
        books[1] = new Book("got", "don't know", 200,5);        
        books[2] = new Book("hobbits", "don't know", 700,3.7);        
        books[3] = new Book("", "don't know", 700,3.7); 
        Scanner sc=new Scanner(System.in);
        String s= sc.nextLine();
        switch (s) {
            case "name":
            Arrays.sort(books,new TitleComparator());
            for(Book book:books){
                System.out.println(book);
            }
                break;
            case "rating":
            Arrays.sort(books,new RatingComparator());
            for(Book book:books){
                System.out.println(book);
            }
                break;
            default:
                System.out.println("Either enter name or rating");
                break;
        }

        // System.out.println("Before Sorting:------------------ ");       
        // for(Book b:books){
        //     System.out.println(b);
        // }
        // Arrays.sort(books);/this will give the ClasscastException
        // Arrays.sort(books);//sort function call the compareTo method which is overridden in Book class
        // Arrays.sort(books,new RatingComparator());//comparing based on rating only
        // Arrays.sort(books,new TitleComparator());//comparing based on rating only

        // System.out.println("After Sorting:---------------------------- ");
    }
}