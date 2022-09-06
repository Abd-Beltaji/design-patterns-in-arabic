# Design Patterns

<img src="https://github.com/Abd-Beltaji/design-patterns-in-arabic/raw/master/assets/Banner.svg" alt="Design patterns">

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

# مصادر مفيدة 💾

- [design-patterns-for-humans](https://github.com/kamranahmedse/design-patterns-for-humans) _( Github repository )_
- [design_patterns_in_typescript](https://github.com/torokmark/design_patterns_in_typescript) _( Github repository )_
- [Java Design patterns](https://java-design-patterns.com/) _( Complete Guide )_
- [Refactoring Guru-Design patterns](https://refactoring.guru/design-patterns) _( Complete Guide )_

- [Design Patterns: Elements of Reusable Object-Oriented Software](https://github.com/Abd-Beltaji/design-patterns-in-arabic/blob/master/resources/Gang%20of%20Four%20-%20Design%20Patterns%20-%20Elements%20of%20Reusable%20Object-Oriented%20Software.pdf) _( Book )_
- [remembering "The Gang of four..!"](https://devrant.com/rants/1641491/programming-design-patterns-part-1-remembering-the-gang-of-four) _( Cheat-sheet )_
- [Useful posters of the GoF patterns](http://www.celinio.net/techblog/?p=65) _( Cheat-sheet )_