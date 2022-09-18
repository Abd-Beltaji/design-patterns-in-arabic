package Examples.Books;

public class BooksCollection implements IContainer<Book> {
    private Book[] books;
    private int lastAddedIdx = 0;

    public BooksCollection(int size) {
        this.books = new Book[size];
    }

    public void addBook(Book book) {
        if (lastAddedIdx <= books.length - 1) {
            books[lastAddedIdx++] = book;
        }
    }

    public Iterator<Book> createIterator() {
        return new BookIterator();
    }

    private class BookIterator implements Iterator<Book> {
        private int currentPosition = 0;

        public boolean hasNext() {
            return currentPosition < lastAddedIdx;
        }

        public Book next() {
            return this.hasNext() ? books[currentPosition++] : null;
        }
    }
}