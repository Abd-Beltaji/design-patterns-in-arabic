# Simple Factory Design Pattern 🏭

| **Pattern Name:** | **Pattern Type:** | **Programming Language:** | **Language:** |
| :---------------: | :---------------: | :-----------------------: | :-----------: |
|  Simple Factory   |    Creational     |           Java            |      AR       |

> _**Factory**_ (EN) == **_مصنع_** (العربية)

## شرح مبسط 🍰

تخيل أن هنالك مصنع لصنع الكيك 🎂، بحيث يأتي الزبون ويطلب الكعكة بالنكهة والشكل اللذان يريدهما، وبعد أن يجهز طلبه يستلمه من المصنع.

في هذا السيناريو، لا يملك الزبون أي فكرة عن الكيفية التي تم إعداد قالب الحلوى من خلالها، كل ما بالأمر أنه قام بإرسال طلبه للمصنع، وحصل على الشيء الذي طلبه.

وكذلك الأمر بالنسبة لل `Factory design pattern` بحيث يتم من خلالها عزل الية إنشاء ال `Object` عن ال `Client`.

في هذا النمط، يتم إنشاء دالة تسمى بالـ
`Factory Method`
تكون مسؤولة عن عملية الإنشاء للكائن المراد، ويتم بداخلها تحديد النوع المناسب للكائن الذي سيتم إنشائه بناء على الاسلوب التي صممت من خلاله، هذا الأمر مفيد جداً، خصوصاً في حالات يكون فيها اسلوب وراثة، بحيث يكون لدي `Super-class` ويرث منه عدة من ال `Sub-Classes` في هذه الحالة تكون الدالةهي من يقرر أي الأبناء هو الأنسب ليتم إنشاء الكائن من خلاله حسب المعطيات التي يتم تمريرها للدالة.

> _**Client:**_<br>
> المقصود به هو المكان الذي سيتم استخدام الكائن داخله<br>
> فعلى سبيل المثال قد يكون المقصود به هو دالة `main`.

## مثال 🖼

> يمكن  تحميل الكود كاملاً من <a href="https://download-directory.github.io/?url=https%3A%2F%2Fgithub.com%2FAbd-Beltaji%2Fdesign-patterns-in-arabic%2Ftree%2Fmaster%2FJava%2FCreational%2FSimple-Factory%2FExamples%2FCake" target="_blank">هنا</a>

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

## أمثلة 🎈

- [Cake Example](/Examples/Cake)
- [Shapes Example](/Examples/Shapes)
