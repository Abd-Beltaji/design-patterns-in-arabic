package Examples.Books;

public class Main {
    public static void main(String[] args) {
        BooksCollection collection = new BooksCollection(5);
        collection.addBook(new Book(1, "Book 1"));
        collection.addBook(new Book(2, "Book 2"));
        collection.addBook(new Book(3, "Book 3"));

        Iterator<Book> itr = collection.createIterator();
        while (itr.hasNext()) {
            Book b = itr.next();
            System.out.println(b.title);
        }
    }
}
