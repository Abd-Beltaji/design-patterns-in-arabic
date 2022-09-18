package Examples.Books;

public interface IContainer<T> {
    public Iterator<T> createIterator();
}
