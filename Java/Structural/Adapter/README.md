# Adapter Design pattern 🔌

| **Pattern Name:** | **Pattern Type:** | **Programming Language:** | **Language:** |
| :---------------: | :---------------: | :-----------------------: | :-----------: |
|      Adapter      |    Structural     |           Java            |      AR       |

## تعريف:

```TXT
In software engineering, the adapter pattern is a software design pattern (also known as wrapper, an alternative naming shared with the decorator pattern) that allows the interface of an existing class to be used as another interface. It is often used to make existing classes work with others without modifying their source code.
```

## ماذا يعني مصطلح _Adapter_?

يقصد بها وسيط، يأتي بين شيئين غير متوافقين ليقوم بعملية الربط بينهما، ففي الحياة الواقعية على سبيل المثال، لو قمت بالسفر إلى دولة أخرى قد تجد بأن شاحن هاتفك لا يتوافق مع القابس المتواجد هناك، فستحتاج إلى وسيط (Adapter) ليمكنك أن تقوم بالربط بينهما، واللذي سيكون شكله هكذا:

<img src="https://github.com/Abd-Beltaji/design-patterns-in-arabic/raw/master/assets/Adapter.jpeg" alt="Adapter example">

وبالمثل في عالم ال Software Engineering, لدينا ما يسمى بال Adapter Design pattern, بحيث يقوم على أنشاء كلاس منفصل يعمل كوسيط بين كلاسين غير متوافقين.

## Open-Closed Principal

قد يتبادر للذهن تساؤل، بأنه لماذا لا يمكننا تعديل أحد ال classes الغير متوافقة بحيث تسبح متوافقة؟

الإجابة تكمن في مبدأ يسمى ب `Open-Closed Principal`.

> **"** Objects or entities should be open for extension but closed for modification **"**

يعتمد هذا المبدأ على أنه يجب أن يكون ال Objects و ال Entites مفتوحة للتنفيذ ولكن مغلقة للتعديل، بحيث أنه لا يحق لك كمهندس أن تقوم بالتعديل على أي شيء، فقد يكون الكود الذي تستعمله مكتوب من قبل شخص أخر ولا يسمح لك بالتعديل عليه، أو قد يكون مقدم لك مثلاً عن طريق مكتبة أو أي مصدر خارجي ولا يمكنك الوصل إليه وتعديله، فهنا يتضح أهمية ال Adapter في ال Design patterns.

## شرح مبسط 🐈

لنفترض بأننا نريد أن نقوم بتوضيح عا~لة السنوريات (Felidae / القططيات) برمجياً، ولكننا في التطبيق واجهنا مشكلة، بحيث جميع أفراد هذه العائلة من الكائنات (الأسود، النمور، ... الخ) تقوم بعملية الزئير، ولكن يبقى لنا استثناء وهو القطط، فهي لا تقوم بالزئير، بل تقوم بالمواء، فلا يمكننا أن نجعل القطط أبناء مباشرة لل `Felidae`، بل نحتاج إلى وسيط يقوم بربط عملية المواء لدى القطة بعملية الزئير لدى النوع الرئيس `Felidae`, فنحتاج إلى تصميم كلاس أخر `CarAdapter` ليقوم بهذا الغرض، ويمكننا اعتباره من ثم ابناً مباشراً للسنوريات.

فلو طبقنا المثال السابق برمجياً:

> يمكن تحميل الكود كاملاً من <a href="https://download-directory.github.io/?url=https%3A%2F%2Fgithub.com%2FAbd-Beltaji%2Fdesign-patterns-in-arabic%2Ftree%2Fmaster%2FJava%2FStructural%2FAdapter%2FExamples%2FFelidae">هنا</a>

_Felidae.java_:

```JAVA
public interface Felidae{
    public void roar();
}
```

_Lion.java_:

```JAVA
public class Lion implements Felidae {
    public void roar(){
        System.out.println("The lion is Roaring!");
    }    
}
```

_Tiger.java_:

```JAVA
public class Tiger implements Felidae{
    public void roar(){
        System.out.println("The tiger is Roaring!");
    }    
}
```

_Cat.java_:

```JAVA
public class Cat {
    public void meow(){
        System.out.println("The cat is meowing!");
    }
}
```

_CatAdapter.java_:

```JAVA
public class CatAdapter implements Felidae {
    private Cat cat;

    public CatAdapter(Cat cat){
        this.cat = cat;
    }
    public void roar(){
        this.cat.meow();
    }
}
```

يمكننا الأن تجريب الكود وتنفيذه:

```JAVA
public class Main {
    public static void main(String[] args) {
        Felidae lion = new Lion();
        Felidae tiger = new Tiger();
        Felidae cat = new CatAdapter(new Cat());

        lion.roar();
        tiger.roar();
        cat.roar();
    }
}
```

ليكون الناتج:

```TXT
The lion is Roaring!
The tiger is Roaring!
The cat is meowing!
```