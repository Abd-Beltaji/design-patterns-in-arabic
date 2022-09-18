# Iterartor Design Pattern 🔃

| **Pattern Name:** | **Pattern Type:** | **Programming Language:** | **Language:** |
| :---------------: | :---------------: | :-----------------------: | :-----------: |
|     Iterator      |    Behavioural    |           Java            |      AR       |

## تعريف:

```TXT
In object-oriented programming, the iterator pattern is a design pattern in which an iterator is used to traverse a container and access the container's elements. The iterator pattern decouples algorithms from containers; in some cases, algorithms are necessarily container-specific and thus cannot be decoupled.
```

## شرح مبسط 📚

لو كان لدينا Class بسيط بهذا الشكل:

```JAVA
public class Book {
    String title;
    int id;

    public Book(int id, String title) {
        this.id = id;
        this.title = title;
    }
}
```

يمثل نوع بيانات خاص لكتاب، ويحوي جميع الخصائص  والمعلومات الخاصة به.
لو أردنا أن نصمم كلاس أخر (BooksCollection) يشكل مجموعة من الكتب.

يمكننا تصميمه بهذا الشكل:

```JAVA
public class BooksCollection {
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
}
```

المشكلة في الكود السابق تكم في مشكلة الوصول إلى جميع العناصر، نعم يتم تخزين البيانات هنا مثلاً في  Array فيمكن الوصل إليها عن طريق for loop اعتيادية، ولكن تخيل بأنني أقوم بتخزين البيانات بهيكلية أكثر تعقيداً، بشكل يصعب الوصول المباشر من خلاله، أو على سبيل المثال بأننا أردنا الوصول إليها بترتيب وبشكل معين، ليس بالشكل المباشر الافتراضي، بل عن طريق مثلاُ تقسيمهم إلى أقسام معينة، ومعالجة كل قسم على حدة، أو لأي سبب أخر يمنعني من فكرة الوصول البسيط و المباشر.

لذلك سنحتاج إلى طريقة للوصول إلى جميع عناصر المجموعة، فهنا يأتي دور ال Iterator Design pattern، بحيث يوفر لي طريقة أستطيع من خلالها الوصول إلى جميع العناصر بشكل تتابعي أستطيع الوصول إليها من خلال عمل `Loop` عليها.

يكمن مبدأ ال Iterator Pattern في جعل الكلاس المحتوي على مجموعة ال Objects من نوع يسمى ب Iterable.

## Iterable class

هو عبارة عن كلاس أستطيع أن أقوم بعمل حلقات تكرارية عليها، والوصول إلى جميع عناصرها بشكل تتابعي.

يحتوي كل Itrable class على دالتين أساسيتين:

- hasNext

تقوم بإرجاع قيمة boolean (true / false)، تدل اذا وصل ال iterator إلى العنصر الأخير أم لا، فإذا كان وصل إلى أخر عنصر، فلن يوجد عنصر تالي فتكون النتيجة (false)
وهذا الكود ممتاز ويعمل بالشكل اللازم، ويمكننا تنفيذه:

- next

تقوم بإرجاع العنصر التالي ، وفي حال كانت قد وصلت لاخر عنصر بالفعل تقوم بإرجاع null.

---
فلو طبقنا ال Iterator Pattern على الكود السابق:

> يمكنك تحميل الكود كاملاً من <a href="https://download-directory.github.io/?url=https%3A%2F%2Fgithub.com%2FAbd-Beltaji%2Fdesign-patterns-in-arabic%2Ftree%2Fmaster%2FJava%2FBehavioural%2FIterator%2FExamples%2FBooks">هنا</a>

_Iterator.java_ :

```JAVA
public interface Iterator<T> {
    boolean hasNext();

    T next();
}
```

_IContainer.java_:

```JAVA
public interface IContainer<T> {
    public Iterator<T> createIterator();
}
```

_BooksCollection.java_ :

```JAVA
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

```

يمكننا الأن تنفيذ الكود:

```JAVA
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
```

ويكون الناتج:

```TXT
Book 1
Book 2
Book 3
```