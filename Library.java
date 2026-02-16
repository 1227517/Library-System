import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

public class Library {
    List<BookCollection> books = new ArrayList<>();
    Map<Integer, Integer> issueBooks = new HashMap<>();
    void addBook(BookCollection book){
        books.add(book);
    }
    void showBooks() {
    for(BookCollection b:books){
      System.out.println(b.id + " - " + b.title  +" by " + b.author + (b.isAvailable ? "Available" : "Issued" ));
        }
    }
void issueBooks(int bookId, Member member){
    for(BookCollection b: books){
        if(b.id == bookId &&  b.isAvailable){
            b.isAvailable = false;
        issueBooks.put(bookId, member.memberId);
        System.out.println("Book Issued to " + member.name);
        return;
    }
}
System.out.println("Book not available!");
}
void returnBook(int bookId){
    for(BookCollection b: books){
        if(b.id == bookId && !b.isAvailable){
            b.isAvailable = true;
        issueBooks.remove(bookId);
        System.out.println("Book returned succesfully.");
        return ;
    }
}
System.out.println("Invalid Request.");
 }
}
