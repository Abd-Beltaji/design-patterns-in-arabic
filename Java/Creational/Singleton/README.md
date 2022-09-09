# Singleton 💍

| **Pattern Name:** | **Pattern Type:** | **Programming Language:** | **Language:** |
| :---------------: | :---------------: | :-----------------------: | :-----------: |
|     Singleton     |    Creational     |           Java            |      AR       |

## شرح مبسط 🎲

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
public static void main (String[]args)
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

> يمكن  تحميل الكود كاملاً من <a href="https://download-directory.github.io/?url=https%3A%2F%2Fgithub.com%2FAbd-Beltaji%2Fdesign-patterns-in-arabic%2Ftree%2Fmaster%2FJava%2FCreational%2FSingleton%2FExamples%2FRandom" target="_blank">هنا</a>

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

## كيف يتم تكوين كلاس ب Singleton Design pattern ? 🏗

يتركب أي Class مصمم ب Singleton من عدة أمور أساسية:

- يكون ال `Constructor` الخاص به `private`، بحيث يمنع أي عملية لإنشاء Object من خارج ال Class نفسه، فبهذا الشكل نتأكد أن عملية الإنشاء ستتم حسب القيود بداخل ال Class نفسه فقط.

- متغير يستعمل كـ `instance` ليتم تخزين ال Object الوحيد بحيث يتم إرجاعه ذاته في حالة محاولة الإنشاء مرة أخرى، ويكون من نوع `Private`و `static`.

- دالة `getInstance` (أو أي بديل لها) ليتم من خلالها الوصول إلى ال instance الوحيد، بحيث يكون نوع البيانات التي يتم إرجاعها من الدالة من نفس نوع ال Class الذي يحتويها، ويجب أن تكون من نوع `public` و `static`.
