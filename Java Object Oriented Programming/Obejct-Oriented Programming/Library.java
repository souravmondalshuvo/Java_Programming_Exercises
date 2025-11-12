import java.util.ArrayList;
public class Library {
    
    private ArrayList<Book1> books;

    public Library() {
        books = new ArrayList<Book1>();
    }

    public void addBook(Book1 book) {
        books.add(book);
    }

    public void removeBook(Book1 book) {
        books.remove(book);
    }

    public ArrayList<Book1> getBooks() {
        return books;
    }
}