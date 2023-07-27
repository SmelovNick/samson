package taskOne.library;

import java.lang.annotation.*;

import static java.lang.annotation.ElementType.*;

@Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
@Target({METHOD, TYPE})
public @interface Selector {
    String xpath();
}