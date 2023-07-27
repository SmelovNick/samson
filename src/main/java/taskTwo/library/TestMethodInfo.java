package taskTwo.library;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface TestMethodInfo {
    //Приоритет теста
    Priority priority() default Priority.MAJOR;

    //Автор теста
    String author() default "Bill Gates";

    //Дата последних изменений в тесте
    String lastModified() default "01.01.2019";
}
