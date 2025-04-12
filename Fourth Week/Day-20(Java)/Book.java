import java.util.Comparator;

public class Book {
    String name;
    String author;
    int Price;
    Double rating;
    public Book(String name,String author,int Price,double rating){
        super();
        this.name=name;
        this.author=author;
        this.Price=Price;
        this.rating=rating;
    }

    @Override
    public String toString(){
        return "Name- "+name+ " Author-" + author + " Price- "+Price+" Rating- "+rating; 
    }
}
    // @Override
    // public int compareTo(Object o){
    //     Book b2 =(Book) o; //following way is one way to define sorting mechanism
    //     if(this.Price< b2.Price){
    //         return -1;
    //     }
    //     if(this.Price>b2.Price){
    //         return 1;
    //     }
    //     else{
    //         return 0;
    //     }
    // }


//     @Override
//     public int compareTo(Object o){
//         Book b2=(Book) o;
//         // return this.Price-b2.Price;//this is another way 
//         // return this.rating.compareTo(b2.rating);
//         if(this.Price!=b2.Price){
//             return this.Price-b2.Price;
//         }//if the prices are same then check on the basis of rating
//         if(!this.rating.equals(b2.rating)){
//             return this.rating.compareTo(b2.rating);
//         }
//         return this.name.compareTo(b2.name);
//     }
// }


//class to apply custom sort based on rating
class RatingComparator implements Comparator { 
    @Override
    public int compare(Object o1,Object o2){
        Book b1 = (Book) o1;
        Book b2=(Book) o2;
        return b1.rating.compareTo(b2.rating);
    }
    
}


//class to apply custom sort based on title name
class TitleComparator implements Comparator {
    @Override
    public int compare(Object o1,Object o2){
        Book b1 = (Book) o1;
        Book b2=(Book) o2;
        return b1.name.compareTo(b2.name);
    }
    
}

