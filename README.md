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

> <u>تعريف **Design patterns:**</u> هي عبارة عن حلول لمشاكل متكررة، وتشكل قواعد إرشادية لكيفية التعامل مع تلك المشاكل المحددة.

> هي ليست عبارة عن `Classes` ولا `Packages` ولا أي مكتبات أو أكواد جاهزة بحيث يتم استخدامها مباشرة بداخل الكود الخاص بك، في المقابل ما هي إلا أساليب متبعة لحل المشاكل المتكررة التي يمكن أن تواجهها خلال عملية كتابة الكود.

## <u>تعريف **Design patterns:**</u>

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

> يمكن إيجاد الكود لهذا المثال كاملاً [هنا](https://github.com/Abd-Beltaji/design-patterns-in-arabic/tree/master/Java/Creational/Simple-Factory/Examples/Cake)

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

# مصادر مفيدة 💾

- [design-patterns-for-humans](https://github.com/kamranahmedse/design-patterns-for-humans) _( Github repository )_
- [design_patterns_in_typescript](https://github.com/torokmark/design_patterns_in_typescript) _( Github repository )_
- [Java Design patterns](https://java-design-patterns.com/) _( Complete Guide )_
- [Refactoring Guru-Design patterns](https://refactoring.guru/design-patterns) _( Complete Guide )_

- [Design Patterns: Elements of Reusable Object-Oriented Software](https://github.com/Abd-Beltaji/design-patterns-in-arabic/blob/master/resources/Gang%20of%20Four%20-%20Design%20Patterns%20-%20Elements%20of%20Reusable%20Object-Oriented%20Software.pdf) _( Book )_
- [remembering "The Gang of four..!"](https://devrant.com/rants/1641491/programming-design-patterns-part-1-remembering-the-gang-of-four) _( Cheat-sheet )_
- [Useful posters of the GoF patterns](http://www.celinio.net/techblog/?p=65) _( Cheat-sheet )_
- [Design-patterns-Relationships](https://github.com/Abd-Beltaji/design-patterns-in-arabic/blob/master/resources/Design-patterns-Relationships.jpg) _( Cheat-sheet )_
