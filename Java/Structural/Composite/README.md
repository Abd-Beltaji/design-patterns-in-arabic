# Composite Design pattern 🧱

| **Pattern Name:** | **Pattern Type:** | **Programming Language:** | **Language:** |
| :---------------: | :---------------: | :-----------------------: | :-----------: |
|     Composite     |    Structural     |           Java            |      AR       |

## تعريف:

```TXT
 The composite pattern is a partitioning design pattern. The composite pattern describes a group of objects that are treated the same way as a single instance of the same type of object. The intent of a composite is to "compose" objects into tree structures to represent part-whole hierarchies.
```

## شرح مبسط 🚗

لنفترض بأننا نريد بأن نقوم بتوضيح تركيب السيارة باسلوب برمجي، قد يكون تفكيرنا الأولي أن يكون لدينا كل شيء يكونها عبارة عن Object منفصل، بحيث يكون لدينا أوبجكت خاص من نوع Engine و أوبجكت أخر من نوع CarBody وأوبجكت اخر من نوع هكذا، ولكن هذا يؤدي إلى فوضى، فعلى سبيل من المثال، لو أردنا مثلاً أن نقوم بحساب التكلفة الخاصة بالمحرك كتكلفة كلية، بحيث يتم حساب تكلفة جميع المكونات الداخلية له، ولكن بهذا الشكل وهذه الفوضى من الصعب القيام بمثل هذه الأمور، فهنا تكمن قوة ال `Composite Design pattern` بحيث يمكننا تخيل السيارة بشكل أفضل بالشكل الاتي:

<img src="https://github.com/Abd-Beltaji/design-patterns-in-arabic/raw/master/assets/Car-composite-parts.png" alt="Car composition illustration"  />

فبهذا الشكل يمكنني أن أقوم بتقسيم الشيء إلى مخطط شجري بحيث يمكنني من معرفة المكونات لكل جزء بشكل تتابعي، فمكونات السيارة مثلا، هي `هيكل السيارة`، و`المحرك` ومن ثم مكن تقسيم مكونات المحرك مثلاً، إلى `غرف احتراق` و `شمعاات الاحتراق (بوجيهات)`، وكذلك يمكننا تقسيم هيكل السيارة إلى `أبواب`و `إطارات`، بحيث يحتوي كل Object على قائمة من ال Objects التي تعد مكونات لهذا ال Object الرئيس، فيمكنني من خلال هذه الهيكلية الوصول إلى تفاصيل أي مكون بالإضافة لمكوناته الفرعية بكل سهولة.

## تطبيق على مثال السيارة 🚗

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