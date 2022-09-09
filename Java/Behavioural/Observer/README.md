# Observer Design Pattern 🔭

| **Pattern Name:** | **Pattern Type:** | **Programming Language:** | **Language:** |
| :---------------: | :---------------: | :-----------------------: | :-----------: |
|     Observer      |    Behavioural    |           Java            |      AR       |

> _**Observer**_ (EN) == **_مراقب_** (العربية)

## شرح مبسط ☁

تخيل بأننا نريد تصميم برنامج يقوم بعرض حالة الطقس في منطقة معينة، بحيث تأتي المعلومات من مصدر ما، (في حالة المثال قررنا بأن تكون قادمة من class بداخل المشروع بحيث يكون مرتبط مثلاً بمحطة للأرصاد الجوية أو ما شابه)، بحيث يتم تحديث البيانات داخل التطبيق الخاص بنا تلقائياً في كل مرة يحدث تغير على الطقس، فيلزم لنا في هذه الحالة أن يكون هناك وسيلة للمصدر بأن يقوم بإعلام التطبيق بوجود تحديث جديد للمعلومات الخاصة بالطقس، فهذه تكمن بوظيفة ال _Observer Design pattern_، بحيث يكون التطبيق الخاص بي من نوع `Observer (مراقب)`، ويتم ربطه بالمزود الخاص بمعلومات الطقس عن طريق دالة يمتلكها (`subscribe`)، يمتلك المزود قائمة من ال _Observers_ يتم إضافة ال _Observer_ لها عندما يتم تمريه لدالة _subscribe_, بحيث يقوم المزود بإعلام جميع ال _Observers_ المشتركين لديه، بحيث يحتوي كل Observer منهم على دالة _update_ تحوي الأوامر المطلوب تنفيذها في حالة وجود معلومات جديدة، في حالة تطبيقنا مثلاً، كل ما تقوم به هذه الدالة هو أن يتم طباعة البيانات الجديدة للمستخدم.

## تنفيذ المثال 🌡

> يمكنك تحميل الكود كامل من <a href="https://download-directory.github.io/?url=https%3A%2F%2Fgithub.com%2FAbd-Beltaji%2Fdesign-patterns-in-arabic%2Ftree%2Fmaster%2FJava%2FBehavioural%2FObserver%2FExamples%2FWeather" targe="_blank">هنا</a>

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
