# Command Design Pattern 🖇

| **Pattern Name:** | **Pattern Type:** | **Programming Language:** | **Language:** |
| :---------------: | :---------------: | :-----------------------: | :-----------: |
|      Command      |    Behavioural    |           Java            |      AR       |

> _**Command**_ (EN) == **_أمر_** (العربية)

## شرح مبسط 🧮

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