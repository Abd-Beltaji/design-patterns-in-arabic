# Design Patterns

<img src="https://github.com/Abd-Beltaji/design-patterns-in-arabic/raw/master/assets/Banner.svg" alt="Design patterns">

<p align="center">
    <img src="https://badgen.net/github/license/Abd-Beltaji/design-patterns-in-arabic" alt="License"/>
    <img src="https://badgen.net/github/commits/Abd-Beltaji/design-patterns-in-arabic" alt="Commits"/>
    <img src="https://badgen.net/github/stars/Abd-Beltaji/design-patterns-in-arabic" alt="Stars"/>
    <img src="https://badgen.net/github/forks/Abd-Beltaji/design-patterns-in-arabic" alt="Forks"/>
    <img src="https://badgen.net/github/last-commit/Abd-Beltaji/design-patterns-in-arabic" alt="Last Commit"/>
    <img src="http://hits.dwyl.com/Abd-Beltaji/design-patterns-in-arabic.svg" alt="Hits"/>
    <img src="https://img.shields.io/badge/contributions-welcome-brightgreen.svg?style=flat" alt="Contributions (Welcome)"/>
</p>

# فهرس الحتويات:

- [Design Patterns](#design-patterns)
- [فهرس الحتويات:](#فهرس-الحتويات)
  - [تعريف **Design patterns:**](#تعريف-design-patterns)
  - [نقاط مهمة ⚠](#نقاط-مهمة-)
  - [لماذا أستخدم ال Design patterns ؟ 🤔](#لماذا-أستخدم-ال-design-patterns--)
  - [كيف تم التوصل إليهم، ومن هم الذين توصلوا إليهم ؟ 👨‍🏫](#كيف-تم-التوصل-إليهم-ومن-هم-الذين-توصلوا-إليهم--)
  - [أقسام ال design patterns :](#أقسام-ال-design-patterns-)
    - [حسب الغاية:](#حسب-الغاية)
      - [Creational:](#creational)
      - [Structural:](#structural)
      - [Beahavioral:](#beahavioral)
    - [حسب المجال:](#حسب-المجال)
      - [مجال ال Class:](#مجال-ال-class)
      - [مجال ال Object:](#مجال-ال-object)
- [Creational Design patterns:](#creational-design-patterns)
  - [نقاط مهمة: 🧩](#نقاط-مهمة--1)
  - [تقسيم Creational Design Patterns حسب ال scope:](#تقسيم-creational-design-patterns-حسب-ال-scope)
    - [Class Scope:](#class-scope)
    - [Object Scope:](#object-scope)
  - [Singleton 💍](#singleton-)
    - [تعريف:](#تعريف)
    - [شرح مبسط 🎲](#شرح-مبسط-)
    - [كيف يتم تكوين كلاس ب Singleton Design pattern ? 🏗](#كيف-يتم-تكوين-كلاس-ب-singleton-design-pattern--)
  - [Simple Factory Design Pattern 🏭](#simple-factory-design-pattern-)
    - [تعريف:](#تعريف-1)
    - [شرح مبسط 🍰](#شرح-مبسط--1)
    - [مثال 🖼](#مثال-)
    - [أمثلة 🎈](#أمثلة-)
- [Structural Patterns:](#structural-patterns)
  - [نقاط مهمة: ⚠](#نقاط-مهمة--2)
  - [Adapter Design pattern 🔌](#adapter-design-pattern-)
    - [تعريف:](#تعريف-2)
    - [ماذا يعني مصطلح _Adapter_?](#ماذا-يعني-مصطلح-adapter)
    - [Open-Closed Principal](#open-closed-principal)
    - [شرح مبسط 🐈](#شرح-مبسط--2)
  - [Composite Design pattern 🧱](#composite-design-pattern-)
    - [تعريف:](#تعريف-3)
    - [شرح مبسط 🚗](#شرح-مبسط--3)
    - [تطبيق على مثال السيارة 🚗](#تطبيق-على-مثال-السيارة-)
- [Beahvioral Patterns:](#beahvioral-patterns)
  - [نقاط مهمة: ⚠](#نقاط-مهمة--3)
  - [Command Design Pattern 🖇](#command-design-pattern-)
    - [تعريف:](#تعريف-4)
    - [شرح مبسط 🧮](#شرح-مبسط--4)
  - [Observer Design Pattern 🔭](#observer-design-pattern-)
    - [تعريف:](#تعريف-5)
    - [شرح مبسط ☁](#شرح-مبسط--5)
    - [تنفيذ المثال 🌡](#تنفيذ-المثال-)
- [مصادر مفيدة 💾](#مصادر-مفيدة-)

> تعريف **Design patterns:** هي عبارة عن حلول لمشاكل متكررة، وتشكل قواعد إرشادية لكيفية التعامل مع تلك المشاكل المحددة.

> هي ليست عبارة عن `Classes` ولا `Packages` ولا أي مكتبات أو أكواد جاهزة بحيث يتم استخدامها مباشرة بداخل الكود الخاص بك، في المقابل ما هي إلا أساليب متبعة لحل المشاكل المتكررة التي يمكن أن تواجهها خلال عملية كتابة الكود.

## تعريف **Design patterns:**

```txt
In software engineering, a software design pattern is a general reusable solution to a commonly occurring problem within a given context in software design. It is not a finished design that can be transformed directly into source or machine code. It is a description or template for how to solve a problem that can be used in many different situations.
```

## نقاط مهمة ⚠

- لا تعتبرها كـ _حلول سحرية_ للمشاكل التي قد تواجهها، فهي ليست عبارة عن قوالب جاهزة يتم التعامل معها إنما هي عبارة عن حلول يجب عليك أن تكيفها حسب البيئة والمشكلة اللتان تريد تطبيقها عليهم.
- عندما يتم استخدامهم بالشكل الصحيح فإنها تعتبر منقذة، بحيث يتم حل المشكلة بالشكل المناسب وتساهم في إنتاج كود مرتب ومنسق بالشكل الصحيح، بينما الاستخدام الخاطىء لها يؤدي إلى فوضى.

## لماذا أستخدم ال Design patterns ؟ 🤔

- توفر حلول عامة، `documented` بشكل مجرد وغير مرتبط بتفاصيل مشكلة معينة.
- تساهم بتسريع عملية التطوير، بحيث توفر نماذج تطوير مجربة مسبقاً ومثبة الفعالية.
- تعد ال `design patterns` نتاج لدراسات وخبرات مطورين سابقين، فيعد استخدامها إيجابية بحيث أنك تستفيد من تلك الخبرات الخاصة بهم.
- تمنع من الوقوع في مشكلات الدقيقة التي تؤدي إلى مشاكل ضخمة.
- ينتج من خلالها كود سهل القراءة، خصوصاً لدا أولئك الذين يمتلكون معرفة بال `design patterns` المستخدمة.

## كيف تم التوصل إليهم، ومن هم الذين توصلوا إليهم ؟ 👨‍🏫

يرجع الفضل الأكبر في هذا الاكتشاف لمجموعة تسمى ب [_The Gang of Four (GoF)_](http://wiki.c2.com/?GangOfFour) حيث قاموا بإنشاء كتاب باسم: [_Design Patterns: Elements of Reusable Object-Oriented Software_](https://github.com/Abd-Beltaji/design-patterns-in-arabic/blob/master/resources/Gang%20of%20Four%20-%20Design%20Patterns%20-%20Elements%20of%20Reusable%20Object-Oriented%20Software.pdf)، يشرح هذا الكتاب عن 23 design patterns باللإضافة إلى أمثلة وأكواد مكتوبة بلغة `c++`.

## أقسام ال design patterns :

### حسب الغاية:

#### Creational:

تهتم بالكيفية التي يتم من خلالها إنشاء ال Objects و ال Classs.

#### Structural:

تهتم بتكوين ال Objects و ال Classes.

#### Beahavioral:

تهتم بالتفاعل بين ال Objects و ال Classes بالإضافة إلى أنها تهتم بالمسؤواليات الخاصة بكل منها.

### حسب المجال:

#### مجال ال Class:

توضح العلاقات بين ال classes و ال classes الفرعية، ويتم تعريفها بشكل `static`.

#### مجال ال Object:

توضح العلاقات بين ال Objects ، ويتم تعريفها بشكل `dynamic`.

# Creational Design patterns:

تقوم بتجريد عملية إنشاء ال Objects، مما يساعد في الحصول على نظام مستقل في كيفية الانشاء، التكوين والعرض لل Objects الخاصة به.

## نقاط مهمة: 🧩

- تستخدم ال Creational patterns الوراثة(`inhiretance`) للتفريق بين ال classes التي يتم إنشائها.
- في ال Creational patterns يتم توكيل عملية إنشاء ال Objects إلى Class اخر.

## تقسيم Creational Design Patterns حسب ال scope:

### Class Scope:

- Factory Method

### Object Scope:

- Abstract Factory
- Builder
- Prototype
- Singleton

## Singleton 💍

### تعريف:

```TXT
In software engineering, the singleton pattern is a software design pattern that restricts the instantiation of a class to one "single" instance. This is useful when exactly one object is needed to coordinate actions across the system.
```

### شرح مبسط 🎲

تخيل بأننا نريد إنشاء برنامج يقوم بتوليد أرقام عشوائية، فقمنا بتصميم Class ليقوم بتلك الوظيفة:

```Java
public class Random {
    private int seed = 0;

    public int getRandInteger(int from, int to) {
        // Pseudorandom-number-generator
        this.seed++;
        float a = seed * 15485863;
        float v = (a * a * a % 2038074743) / 2038074743;
        return (int) (v * (to - from) + from);
    }
}
```

فلو جربنا الكود السابق :

```JAVA
public static void main (String[] args)
{
    Random rand1 = new Random();
    System.out.println(rand1.getRandInteger(1, 5));
    Random rand2 = new Random();
    System.out.println(rand2.getRandInteger(8, 50));
    Random rand3 = new Random();
    System.out.println(rand3.getRandInteger(7, 9));
    Random rand4 = new Random();
    System.out.println(rand4.getRandInteger(-50, 50));
}
```

سيكون الناتج:

```txt
2
19
7
-23
```

عظيم، إذن الكود يعمل بشكل صحيح! ، ولكن لو تمعننا لوهلة سنلاحظ بإننا نجرب باستخدام فترات مختلفة في كل مرة، لنعد التجربة باستخدام ذات القيم:

```JAVA
public static void main (String[]args)
{
    Random rand1 = new Random();
    System.out.println(rand1.getRandInteger(1, 5));
    Random rand2 = new Random();
    System.out.println(rand2.getRandInteger(1, 5));
    Random rand3 = new Random();
    System.out.println(rand3.getRandInteger(1, 5));
}
```

يصبح الناتج:

```txt
2
2
2
```

جميع النتائج جاءت بنفس النتيجة! وهذا يخالف هدف الذي صمم له ال class، في الواقع، الكود السابق مصمم باستخدام خوارزمية `Pseudorandom-number-generator` والتي تعتمد على ال `seed` والتي يجب أن يتم تغيير قيمتها للحصول على الرقم العشوائي في كل مرة، لذلك يجب أن يتم التعامل مع Object واحد فقط من الكلاس Random خلال الكود الخاص بي، لذلك فالأنسب هو استخدام ال Singleton Design pattern بحيث يوفر خاصية أن يتم إنشاء Object وحيد فقط من ال Class خلال الكود كاملاً.

لذلك، وبعد تغير هيكلية الكود باستخدام Singleton Design Pattern:

> يمكن تحميل الكود كاملاً من <a href="https://download-directory.github.io/?url=https%3A%2F%2Fgithub.com%2FAbd-Beltaji%2Fdesign-patterns-in-arabic%2Ftree%2Fmaster%2FJava%2FCreational%2FSingleton%2FExamples%2FRandom">هنا</a>

```Java
class Random {
    private int seed = 0;
    private static Random instance;

    private Random() {
    } // Empty private Constructor

    public int getRandInteger(int from, int to) {
        // Pseudorandom-number-generator
        this.seed++;
        float a = seed * 15485863;
        float v = (a * a * a % 2038074743) / 2038074743;
        return (int) (v * (to - from) + from);
    }

    public static Random getInstance() {
        if (instance == null)
            instance = new Random();
        return instance;
    }
}
```

يمكننا تنفيذه بالشكل التالي:

```JAVA
public class Main {
    public static void main(String[] args) {
        Random rand = Random.getInstance();
        System.out.println(rand.getRandInteger(1, 5));
        System.out.println(rand.getRandInteger(8, 50));
        System.out.println(rand.getRandInteger(7, 9));
        System.out.println(rand.getRandInteger(-50, 50));
    }
}
```

فبهذا الشكل قد حصرنا أنه سيتم تكوين Object وحيد من ال Random.

### كيف يتم تكوين كلاس ب Singleton Design pattern ? 🏗

يتركب أي Class مصمم ب Singleton من عدة أمور أساسية:

- يكون ال `Constructor` الخاص به `private`، بحيث يمنع أي عملية لإنشاء Object من خارج ال Class نفسه، فبهذا الشكل نتأكد أن عملية الإنشاء ستتم حسب القيود بداخل ال Class نفسه فقط.

- متغير يستعمل كـ `instance` ليتم تخزين ال Object الوحيد بحيث يتم إرجاعه ذاته في حالة محاولة الإنشاء مرة أخرى، ويكون من نوع `Private`و `static`.

- دالة `getInstance` (أو أي بديل لها) ليتم من خلالها الوصول إلى ال instance الوحيد، بحيث يكون نوع البيانات التي يتم إرجاعها من الدالة من نفس نوع ال Class الذي يحتويها، ويجب أن تكون من نوع `public` و `static`.

## Simple Factory Design Pattern 🏭

> _**Factory**_ (EN) == **_مصنع_** (العربية)

### تعريف:

```TXT
 The factory method pattern is a creational pattern that uses factory methods to deal with the problem of creating objects without having to specify the exact class of the object that will be created. This is done by creating objects by calling a factory method—either specified in an interface and implemented by child classes, or implemented in a base class and optionally overridden by derived classes—rather than by calling a constructor.
```

### شرح مبسط 🍰

تخيل أن هنالك مصنع لصنع الكيك 🎂، بحيث يأتي الزبون ويطلب الكعكة بالنكهة والشكل اللذان يريدهما، وبعد أن يجهز طلبه يستلمه من المصنع.

في هذا السيناريو، لا يملك الزبون أي فكرة عن الكيفية التي تم إعداد قالب الحلوى من خلالها، كل ما بالأمر أنه قام بإرسال طلبه للمصنع، وحصل على الشيء الذي طلبه.

وكذلك الأمر بالنسبة لل `Factory design pattern` بحيث يتم من خلالها عزل الية إنشاء ال `Object` عن ال `Client`.

في هذا النمط، يتم إنشاء دالة تسمى بالـ
`Factory Method`
تكون مسؤولة عن عملية الإنشاء للكائن المراد، ويتم بداخلها تحديد النوع المناسب للكائن الذي سيتم إنشائه بناء على الاسلوب التي صممت من خلاله، هذا الأمر مفيد جداً، خصوصاً في حالات يكون فيها اسلوب وراثة، بحيث يكون لدي `Super-class` ويرث منه عدة من ال `Sub-Classes` في هذه الحالة تكون الدالةهي من يقرر أي الأبناء هو الأنسب ليتم إنشاء الكائن من خلاله حسب المعطيات التي يتم تمريرها للدالة.

> _**Client:**_<br>
> المقصود به هو المكان الذي سيتم استخدام الكائن داخله<br>
> فعلى سبيل المثال قد يكون المقصود به هو دالة `main`.

### مثال 🖼

> يمكن تحميل الكود كاملاً من <a href="https://download-directory.github.io/?url=https%3A%2F%2Fgithub.com%2FAbd-Beltaji%2Fdesign-patterns-in-arabic%2Ftree%2Fmaster%2FJava%2FCreational%2FSimple-Factory%2FExamples%2FCake">هنا</a>

لو طبقنا المثال الذي تم ذكره سابقاً، بشكل برمجي، سيكون شكله بالشكل التالي:

```Java
public enum Shape {
    CIRCULAR,
    RECTANGULAR,
    IRREGULAR
}

public enum Flavour {
    CHOCOLATE,
    VANILLA
}

public interface Cake {
    public Shape getShape();
    public Flavour getFlavour();
}

```

**_ChocolateCake.java_** :

```JAVA
public class ChocolateCake implements Cake {
    private Shape shape;
    private Flavour flavour;

    public ChocolateCake(Shape shape) {
        this.shape = shape;
        this.flavour = Flavour.CHOCOLATE;
    }

    @Override
    public Shape getShape() {
        return this.shape;
    }

    @Override
    public Flavour getFlavour() {
        return this.flavour;
    }

}
```

**_VanillaCake.java_** :

```JAVA
public class VanillaCake implements Cake {
    private Shape shape;
    private Flavour flavour;

    public VanillaCake(Shape shape) {
        this.shape = shape;
        this.flavour = Flavour.VANILLA;
    }

    @Override
    public Shape getShape() {
        return this.shape;
    }

    @Override
    public Flavour getFlavour() {
        return this.flavour;
    }

}
```

وفي هذا المثال، يكون ال `Client` لدي، هو ال `Main class` :

```Java
public class Main {
    public static void main(String[] args) {
        Cake myChocolateCake = CakeFactory.makeCake(Flavour.CHOCOLATE, Shape.CIRCULAR);
        Cake myVanillaCake = CakeFactory.makeCake(Flavour.VANILLA, Shape.RECTANGULAR);

        System.out.println("The shape of the " +
                myChocolateCake.getFlavour() +
                " cake is " +
                myChocolateCake.getShape());

        System.out.println("The shape of the " +
                myVanillaCake.getFlavour() +
                " cake is " +
                myVanillaCake.getShape());
    }
}
```

كما نلاحظ، تمكننا من خلال استدعاء دالة ال `factory` (_makeCake_) من إنشاء الكائن المناسب من خلال تحديد النكهة والشكل للدالة وهي التي تكفلت بعملية تحديد النوع المناسب.

### أمثلة 🎈

- [Cake Example](https://github.com/Abd-Beltaji/design-patterns-in-arabic/tree/master/Java/Creational/Simple-Factory/Examples/Cake)
- [Shapes Example](https://github.com/Abd-Beltaji/design-patterns-in-arabic/tree/master/Java/Creational/Simple-Factory/Examples/Shapes)

# Structural Patterns:

تهتم بالية تجمع ال Classes و ال Objects في تكوين أكبر.

## نقاط مهمة: ⚠

- ال `Structural Class paatterns` تستخدم مبادىء الوراثة فيتكوين ال `interfaces` أو ال `Classes`.
- ال `Structural Object Patterns` تصف الية تجمع أكثر من أوبجكت للحصول على وظائف جديدة.
- تعطي ال `Structural Object Patterns` نوعاً من المرونة في عملية ال Composition للأوبجكت، وذلك نابع من القدرة على تغيير ال Composition في أثناء التنفيذ (Dynamically).

## Adapter Design pattern 🔌

### تعريف:

```TXT
In software engineering, the adapter pattern is a software design pattern (also known as wrapper, an alternative naming shared with the decorator pattern) that allows the interface of an existing class to be used as another interface. It is often used to make existing classes work with others without modifying their source code.
```

### ماذا يعني مصطلح _Adapter_?

يقصد بها وسيط، يأتي بين شيئين غير متوافقين ليقوم بعملية الربط بينهما، ففي الحياة الواقعية على سبيل المثال، لو قمت بالسفر إلى دولة أخرى قد تجد بأن شاحن هاتفك لا يتوافق مع القابس المتواجد هناك، فستحتاج إلى وسيط (Adapter) ليمكنك أن تقوم بالربط بينهما، واللذي سيكون شكله هكذا:

<img src="https://github.com/Abd-Beltaji/design-patterns-in-arabic/raw/master/assets/Adapter.jpeg" alt="Adapter example">

وبالمثل في عالم ال Software Engineering, لدينا ما يسمى بال Adapter Design pattern, بحيث يقوم على أنشاء كلاس منفصل يعمل كوسيط بين كلاسين غير متوافقين.

### Open-Closed Principal

قد يتبادر للذهن تساؤل، بأنه لماذا لا يمكننا تعديل أحد ال classes الغير متوافقة بحيث تسبح متوافقة؟

الإجابة تكمن في مبدأ يسمى ب `Open-Closed Principal`.

> **"** Objects or entities should be open for extension but closed for modification **"**

يعتمد هذا المبدأ على أنه يجب أن يكون ال Objects و ال Entites مفتوحة للتنفيذ ولكن مغلقة للتعديل، بحيث أنه لا يحق لك كمهندس أن تقوم بالتعديل على أي شيء، فقد يكون الكود الذي تستعمله مكتوب من قبل شخص أخر ولا يسمح لك بالتعديل عليه، أو قد يكون مقدم لك مثلاً عن طريق مكتبة أو أي مصدر خارجي ولا يمكنك الوصل إليه وتعديله، فهنا يتضح أهمية ال Adapter في ال Design patterns.

### شرح مبسط 🐈

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

## Composite Design pattern 🧱

### تعريف:

```TXT
 The composite pattern is a partitioning design pattern. The composite pattern describes a group of objects that are treated the same way as a single instance of the same type of object. The intent of a composite is to "compose" objects into tree structures to represent part-whole hierarchies.
```

### شرح مبسط 🚗

لنفترض بأننا نريد بأن نقوم بتوضيح تركيب السيارة باسلوب برمجي، قد يكون تفكيرنا الأولي أن يكون لدينا كل شيء يكونها عبارة عن Object منفصل، بحيث يكون لدينا أوبجكت خاص من نوع Engine و أوبجكت أخر من نوع CarBody وأوبجكت اخر من نوع هكذا، ولكن هذا يؤدي إلى فوضى، فعلى سبيل من المثال، لو أردنا مثلاً أن نقوم بحساب التكلفة الخاصة بالمحرك كتكلفة كلية، بحيث يتم حساب تكلفة جميع المكونات الداخلية له، ولكن بهذا الشكل وهذه الفوضى من الصعب القيام بمثل هذه الأمور، فهنا تكمن قوة ال `Composite Design pattern` بحيث يمكننا تخيل السيارة بشكل أفضل بالشكل الاتي:

<img src="https://github.com/Abd-Beltaji/design-patterns-in-arabic/raw/master/assets/Car-composite-parts.png" alt="Car composition illustration"  />

فبهذا الشكل يمكنني أن أقوم بتقسيم الشيء إلى مخطط شجري بحيث يمكنني من معرفة المكونات لكل جزء بشكل تتابعي، فمكونات السيارة مثلا، هي `هيكل السيارة`، و`المحرك` ومن ثم مكن تقسيم مكونات المحرك مثلاً، إلى `غرف احتراق` و `شمعاات الاحتراق (بوجيهات)`، وكذلك يمكننا تقسيم هيكل السيارة إلى `أبواب`و `إطارات`، بحيث يحتوي كل Object على قائمة من ال Objects التي تعد مكونات لهذا ال Object الرئيس، فيمكنني من خلال هذه الهيكلية الوصول إلى تفاصيل أي مكون بالإضافة لمكوناته الفرعية بكل سهولة.

### تطبيق على مثال السيارة 🚗

> يمكن تحميل الكود كاملاً من <a href="https://download-directory.github.io/?url=https%3A%2F%2Fgithub.com%2FAbd-Beltaji%2Fdesign-patterns-in-arabic%2Ftree%2Fmaster%2FJava%2FStructural%2FComposite%2FExamples%2FCar">هنا</a>

_CarElement.java_:

```JAVA
public interface CarElement {
    float getPrice();
    void printDetails();
}
```

_CarPart.java_:

```JAVA
public class CarPart implements CarElement{
    String model;
    float price;

    public CarPart(String model, float price) {
        this.model = model;
        this.price = price;
    }

    String getModel() {
        return this.model;
    }

    public float getPrice() {
        return this.price;
    }

    public void printDetails() {
        System.out.println("The part Model: (" + this.model + "), price (" + this.getPrice() + ")");
    }
}
```

_CarComposite.java_:

```JAVA
import java.util.ArrayList;
import java.util.List;

public class CarComposite implements CarElement {
    String model;
    List<CarElement> parts;

    public CarComposite(String model) {
        parts = new ArrayList<>();
        this.model = model;
    }

    String getModel() {
        return this.model;
    }

    void addPart(CarElement part) {
        this.parts.add(part);
    }

    public float getPrice() {
        float price = 0;
        for (CarElement p : parts)
            price += p.getPrice();
        return price;
    }

    public void printDetails() {
        System.out.println("The part Model: (" + this.model + "), price (" + this.getPrice() + ")");
        if (!parts.isEmpty()) {
            System.out.println("It has the following sub-parts: ");
            for (CarElement p : parts)
                p.printDetails();
        }
        System.out.println("================================");
    }
}
```

ويمكننا التطبيق بالشكل الاتي:

```JAVA
package Java.Structural.Composite.Examples.Car;

public class Main {
    public static void main(String[] args) {
        CarComposite car = new CarComposite("Audi R8");

        CarComposite engine = new CarComposite("5.2L V10 FSI");
        CarComposite carBody = new CarComposite("Audi R8 Body");

        CarPart wheel1 = new CarPart("Audi R8 Wheels", 2400);
        CarPart wheel2 = new CarPart("Audi R8 Wheels", 2400);
        CarPart wheel3 = new CarPart("Audi R8 Wheels", 2400);
        CarPart wheel4 = new CarPart("Audi R8 Wheels", 2400);

        carBody.addPart(wheel1);
        carBody.addPart(wheel2);
        carBody.addPart(wheel3);
        carBody.addPart(wheel4);

        CarPart door1 = new CarPart("Audi R8 Door", 5000);
        CarPart door2 = new CarPart("Audi R8 Door", 5000);

        carBody.addPart(door1);
        carBody.addPart(door2);

        CarPart piston1 = new CarPart("V10 Piston", 1500);
        CarPart piston2 = new CarPart("V10 Piston", 1500);
        CarPart piston3 = new CarPart("V10 Piston", 1500);
        CarPart piston4 = new CarPart("V10 Piston", 1500);
        CarPart piston5 = new CarPart("V10 Piston", 1500);
        CarPart piston6 = new CarPart("V10 Piston", 1500);

        engine.addPart(piston1);
        engine.addPart(piston2);
        engine.addPart(piston3);
        engine.addPart(piston4);
        engine.addPart(piston5);
        engine.addPart(piston6);

        CarPart sparkPlug1 = new CarPart("NGK Spark plug", 80);
        CarPart sparkPlug2 = new CarPart("NGK Spark plug", 80);
        CarPart sparkPlug3 = new CarPart("NGK Spark plug", 80);
        CarPart sparkPlug4 = new CarPart("NGK Spark plug", 80);
        CarPart sparkPlug5 = new CarPart("NGK Spark plug", 80);
        CarPart sparkPlug6 = new CarPart("NGK Spark plug", 80);

        engine.addPart(sparkPlug1);
        engine.addPart(sparkPlug2);
        engine.addPart(sparkPlug3);
        engine.addPart(sparkPlug4);
        engine.addPart(sparkPlug5);
        engine.addPart(sparkPlug6);

        car.addPart(carBody);
        car.addPart(engine);


        car.printDetails();
    }
}
```

ويكون الناتج:

```TXT
The part Model: (Audi R8), price (29080.0)
It has the following sub-parts:
The part Model: (Audi R8 Body), price (19600.0) 
It has the following sub-parts:
The part Model: (Audi R8 Wheels), price (2400.0)
The part Model: (Audi R8 Wheels), price (2400.0)
The part Model: (Audi R8 Wheels), price (2400.0)
The part Model: (Audi R8 Wheels), price (2400.0)
The part Model: (Audi R8 Door), price (5000.0)
The part Model: (Audi R8 Door), price (5000.0)
================================
The part Model: (5.2L V10 FSI), price (9480.0)
It has the following sub-parts:
The part Model: (V10 Piston), price (1500.0)
The part Model: (V10 Piston), price (1500.0)
The part Model: (V10 Piston), price (1500.0)
The part Model: (V10 Piston), price (1500.0)
The part Model: (V10 Piston), price (1500.0)
The part Model: (V10 Piston), price (1500.0)
The part Model: (NGK Spark plug), price (80.0)
The part Model: (NGK Spark plug), price (80.0)
The part Model: (NGK Spark plug), price (80.0)
The part Model: (NGK Spark plug), price (80.0)
The part Model: (NGK Spark plug), price (80.0)
The part Model: (NGK Spark plug), price (80.0)
================================
================================
```

استطعنا من خلال تطبيق ال Composite pattern من التعامل مع أي شجرة فرعية (عنصر ومجموعة العناصر المكونة له) بشكل منفصل، والخحصول على المعلومات الخاصة بهم بكل سهولة،.

# Beahvioral Patterns:

تهتم بالخوارزميات وبتقسيم المسؤوليات بين ال Objects.

## نقاط مهمة: ⚠

- ال `Behavioural Class patterns` تستخدم مبادىء الوراثة لتقسيم المهام والسلوك على ال classes المكونة لها.
- ال `Behavioural Object patterns` تسدخدم ال _composition_ بدلاً من الوراثة، يوضح بعضها عن كيف يمكن لأكثر من Object التعاون في إنجاز مهمة معينة لايمكن لإحداها إنجازها لوحده.

## Command Design Pattern 🖇

> _**Command**_ (EN) == **_أمر_** (العربية)

### تعريف:

```TXT
The command pattern is a behavioral design pattern in which an object is used to encapsulate all information needed to perform an action or trigger an event at a later time. This information includes the method name, the object that owns the method and values for the method parameters.
```

### شرح مبسط 🧮

لو طلب منك أن تقوم بتصميم برنامج الة حاسبة بسيطة تقوم بالعمليات الأساسية _(جمع، طرح، ضرب، قسمة)_ سيكون بهذا الشكل غالباً:

```JAVA
public class Calculator {
    int value = 0;

    public void add(int amount) {
        this.value += amount;
    }

    public void subtract(int amount) {
        this.value -= amount;
    }

    public void multiply(int amount) {
        this.value *= amount;
    }

    public void divide(int amount) {
        this.value /= amount;
    }
}
```

وهذا الكود ممتاز ويعمل بالشكل اللازم، ويمكننا تنفيذه:

```JAVA
public class Main{
    public static void main(String[] args) {
        Calculator c = new Calculator();
        c.add(5);
        c.multiply(2);
        c.subtact(3);
        System.out.println(c.value); // 7
    }
}
```

ولكن لنفترض بأننا نريد أن نضيف خاصية التراجع (Undo) لهذه الحاسبة، بهذا الكود الحالي سيكون الأمر صعب.

لذلك يصبح الحل الأمثل هو أن نعيد هيكلة الكود باستخدام _Command Design pattern_.

ما سنفعله هو أن نسنخرج كل المهام التي يقوم بها ال class الخاص بنا، وفصل كل منها على حدة في Command خاص، فعلى سبيل المثيل في مثالنا السابق، لدينا ال class المسمى `Calculator` يحوي على أربعة مهام يقوم بها (add, subtract, divide, multiply) ممثلة بالدوال التي يمتلكها، فنقوم بإنشاء class جديد لكل منها _(من نوع Command)_ يحوي على دالتين أساسيتين:

- `execute`:

تقوم بتنفيذ العملية الأساسية المطلوبة.

- `undo`:

تقوم بالتراجع عن العملية الأساسية، من خلال تنفيذ المعكوس للعملية الأساسية.

---

فعلى سبيل المثال، في حالة الأمر `add`، تكون دالة _execute_ تقوم بإضافة الرقم إلى القيمة الحالية، بينما تكون دالة _undo_ تقوم بطرح الرقم من القيمة الموجودة _(معكوس عملية الجمع هي عملية الطرح)_.

فيصبح لدينا `Add.java` بالشكل التالي:

> يمكنك تحميل الكود كاملاً من <a href="https://download-directory.github.io/?url=https%3A%2F%2Fgithub.com%2FAbd-Beltaji%2Fdesign-patterns-in-arabic%2Ftree%2Fmaster%2FJava%2FBehavioural%2FCommand%2FExamples%2FCalculator">هنا</a>

```JAVA
public class Add implements Command {
    private int value;
    private Calculator calculator;
    public Add(Calculator calc, int value){
        this.calculator = calc;
        this.value = value;
    }
    public void execute(){
        this.calculator.value += this.value;
    }

    public void undo(){
        this.calculator.value -= this.value;
    }
}
```

بحيث يكون `Command.java` :

```JAVA
public interface Command {
    public void execute();
    public void undo();
}
```

وكذلك الأمر بالنسبة لكل من:

_Subtract.java_ :

```JAVA
public class Subtract implements Command {
    private int value;
    private Calculator calculator;

    public Subtract(Calculator calc, int value) {
        this.calculator = calc;
        this.value = value;
    }

    public void execute() {
        this.calculator.value -= this.value;
    }

    public void undo() {
        this.calculator.value += this.value;
    }
}
```

_Multiply.java_ :

```JAVA
public class Multiply implements Command {
    private int value;
    private Calculator calculator;
    public Multiply(Calculator calc, int value){
        this.calculator = calc;
        this.value = value;
    }
    public void execute(){
        this.calculator.value *= this.value;
    }

    public void undo(){
        this.calculator.value /= this.value;
    }
}
```

_Divide.java_ :

```JAVA
public class Divide implements Command {
    private int value;
    private Calculator calculator;
    public Divide(Calculator calc, int value){
        this.calculator = calc;
        this.value = value;
    }
    public void execute(){
        this.calculator.value /= this.value;
    }

    public void undo(){
        this.calculator.value *= this.value;
    }
}
```

---

الأن نحتاج أن نقوم بتعديل ال class الأساسي الخاص بنا (`Calculator`)، فنحتاج أن نقوم بتعديله بحيث يقوم باستقبال ال Commands ويخزنها وينفذها.

بدايةً، نحتاج أن نقوم بتخزين الأوامر التي يتم تنفيذها حتى نتمكن من تطبيق تقنية التراجع، فنحتاج إلى نوع مناسب من ال قوائم، من الممكن أن نختار `Linked List` على سبيل المثال، ولكن الاختيار الأفضل أن يكون `Stack`، وذلك لأنه عندما نقوم بالتراجع سنحتاج أن نقوم بالتراجع عن الأمر الأخير الذي تم تنفيذه، فذلك يجعل ال `Stack` خيارنا الأمثل.
فسنقوم بإضافة:

```JAVA
private Stack<Command> commands = new Stack<>();
```

وسنحتاج أيضاً إلى دالة تقوم بتنفيذ الأمر بالنسبة لل `Calculator`:

```JAVA
public void execuetCommand(Command cmd) {
    this.commands.add(cmd);
    cmd.execute();
}
```

تقوم هذه الدالة بإذافة الأمر الذي تم تنفيذه للقائمة ومن ثم تنفيذه.

وبالنسبة لالية التراجع يمكننا القيام بها الان عن طريق دالة:

```JAVA
public void undoCommand() {
    Command cmd = this.commands.pop();
    if (cmd == null) return;
    cmd.undo();
}
```

تقوم هذه الدالة بجلب اخر أمر تم تنفيذه وإزالته من القائمة، ومن ثم اتسدعاء دالة `undo` التي يمتلكها للتراجع.

---

فيصبح `Calculator.java` بالشكل الاتي:

```JAVA
import java.util.Stack;

public class Calculator {
    public int value = 0;
    private Stack<Command> commands = new Stack<>();

    public void execuetCommand(Command cmd) {
        this.commands.add(cmd);
        cmd.execute();
    }

    public void undoCommand() {
        Command cmd = this.commands.pop();
        if (cmd == null)
            return;
        cmd.undo();
    }
}
```

ويمكننا تنفيذ وتجربة الكود :

```JAVA
public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        calc.execuetCommand(new Add(calc, 5));
        calc.execuetCommand(new Multiply(calc, 3));
        calc.execuetCommand(new Subtract(calc, 5));

        System.out.println(calc.value);

        calc.undoCommand();
        System.out.println(calc.value);
        calc.undoCommand();
        System.out.println(calc.value);
        calc.undoCommand();
        System.out.println(calc.value);
    }
}
```

ويكون الناتج:

```TXT
10
15
5
0
```

## Observer Design Pattern 🔭

> _**Observer**_ (EN) == **_مراقب_** (العربية)

### تعريف:

```TXT
The observer pattern is a software design pattern in which an object, named the subject, maintains a list of its dependents, called observers, and notifies them automatically of any state changes, usually by calling one of their methods.
```

### شرح مبسط ☁

تخيل بأننا نريد تصميم برنامج يقوم بعرض حالة الطقس في منطقة معينة، بحيث تأتي المعلومات من مصدر ما، (في حالة المثال قررنا بأن تكون قادمة من class بداخل المشروع بحيث يكون مرتبط مثلاً بمحطة للأرصاد الجوية أو ما شابه)، بحيث يتم تحديث البيانات داخل التطبيق الخاص بنا تلقائياً في كل مرة يحدث تغير على الطقس، فيلزم لنا في هذه الحالة أن يكون هناك وسيلة للمصدر بأن يقوم بإعلام التطبيق بوجود تحديث جديد للمعلومات الخاصة بالطقس، فهذه تكمن بوظيفة ال _Observer Design pattern_، بحيث يكون التطبيق الخاص بي من نوع `Observer (مراقب)`، ويتم ربطه بالمزود الخاص بمعلومات الطقس عن طريق دالة يمتلكها (`subscribe`)، يمتلك المزود قائمة من ال _Observers_ يتم إضافة ال _Observer_ لها عندما يتم تمريه لدالة _subscribe_, بحيث يقوم المزود بإعلام جميع ال _Observers_ المشتركين لديه، بحيث يحتوي كل Observer منهم على دالة _update_ تحوي الأوامر المطلوب تنفيذها في حالة وجود معلومات جديدة، في حالة تطبيقنا مثلاً، كل ما تقوم به هذه الدالة هو أن يتم طباعة البيانات الجديدة للمستخدم.

### تنفيذ المثال 🌡

> يمكنك تحميل الكود كامل من <a href="https://download-directory.github.io/?url=https%3A%2F%2Fgithub.com%2FAbd-Beltaji%2Fdesign-patterns-in-arabic%2Ftree%2Fmaster%2FJava%2FBehavioural%2FObserver%2FExamples%2FWeather">هنا</a>

_WeatherType.java_ :

```JAVA
public enum WeatherType {
    NORMAL,
    SUNNY,
    CLOUDY,
    RAINY,
    STORMY
}
```

_WeatherObserver.java_ :

```JAVA
public interface WeatherObserver {
    void update();
    void setProvider(Weather provider);
}
```

_Weather.java_ :

```JAVA
import java.util.ArrayList;
import java.util.List;

public class Weather {
    private WeatherType currentWeather = WeatherType.NORMAL;
    public final List<WeatherObserver> observers;

    public Weather() {
        this.observers = new ArrayList<>();
    }

    public void subscribe(WeatherObserver observer) {
        this.observers.add(observer);
        observer.setProvider(this);
    }

    public void setWeather(WeatherType type) {
        this.currentWeather = type;
        for(WeatherObserver observer : this.observers){
            observer.update();
        }
    }

    public WeatherType getWeather() {
        return this.currentWeather;
    }
}
```

_Application.java_ :

```JAVA
public class Application implements WeatherObserver {
    private Weather provider;

    @Override
    public void update() {
        System.out.println("The Weather has changed to: " + this.provider.getWeather());
    }

    @Override
    public void setProvider(Weather provider) {
        this.provider = provider;
    }
}
```

_Main.java_ :

```JAVA
public class Main {
    public static void main(String[] args) {
        Weather weatherProvider = new Weather();

        Application myApplication = new Application();

        weatherProvider.subscribe(myApplication);

        weatherProvider.setWeather(WeatherType.CLOUDY);
        weatherProvider.setWeather(WeatherType.RAINY);
        weatherProvider.setWeather(WeatherType.STORMY);
        weatherProvider.setWeather(WeatherType.SUNNY);
    }
}

```

ناتج التنفيذ: 💻

```TXT
The Weather has changed to: CLOUDY
The Weather has changed to: RAINY
The Weather has changed to: STORMY
The Weather has changed to: SUNNY
```

# مصادر مفيدة 💾

- [design-patterns-for-humans](https://github.com/kamranahmedse/design-patterns-for-humans) _( Github repository )_
- [design_patterns_in_typescript](https://github.com/torokmark/design_patterns_in_typescript) _( Github repository )_
- [Java Design patterns](https://java-design-patterns.com/) _( Complete Guide )_
- [Refactoring Guru-Design patterns](https://refactoring.guru/design-patterns) _( Complete Guide )_
- [Design Patterns: Elements of Reusable Object-Oriented Software](https://github.com/Abd-Beltaji/design-patterns-in-arabic/blob/master/resources/Gang%20of%20Four%20-%20Design%20Patterns%20-%20Elements%20of%20Reusable%20Object-Oriented%20Software.pdf) _( Book )_
- [Head First Design Patterns: A Brain-Friendly Guide](https://github.com/Abd-Beltaji/design-patterns-in-arabic/blob/master/resources/Head%20First%20Design%20Patterns.pdf) _( Book )_
- [remembering "The Gang of four..!"](https://devrant.com/rants/1641491/programming-design-patterns-part-1-remembering-the-gang-of-four) _( Cheat-sheet )_
- [Useful posters of the GoF patterns](http://www.celinio.net/techblog/?p=65) _( Cheat-sheet )_
- [Design-patterns-Relationships](https://github.com/Abd-Beltaji/design-patterns-in-arabic/blob/master/resources/Design-patterns-Relationships.jpg) _( Cheat-sheet )_
