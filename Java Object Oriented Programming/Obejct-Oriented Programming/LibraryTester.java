//Write a Java program to create a class called "Library" with a collection of books and methods to add and remove books.

public class LibraryTester {
    public static void main(String[] args) {
        
        Library library = new Library();

        Book1 book1 = new Book1("Adventures of Tom Sawyer", "Mark Twain");
        Book1 book2 = new Book1("Ben Hur", "Lewis Wallace");
        Book1 book3 = new Book1("Time Machine", "H. G. Wells");
        Book1 book4 = new Book1("Anna Karenina", "Leo Tolstoy");

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);

        System.out.println("Books in the library: ");
        for(Book1 book : library.getBooks()) {
            System.out.println(book.getTitle() + " by " + book.getAuthor());
        }

        library.removeBook(book2);
        System.out.println("\nBooks in the library after removing " + book2.getTitle() + ": ");
        for(Book1 book : library.getBooks()) {
            System.out.println(book.getTitle() + " by " + book.getAuthor());
        }
    }
}