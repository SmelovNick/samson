package taskOne;

import org.testng.annotations.Test;
import taskOne.implementation.MainPageDynamicProxy;
import taskOne.library.MainPage;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

import static org.testng.Assert.*;

public class MethodInterceptionTest {

    @Test
    public void annotationValue() {
        MainPage mainPage = createPage(MainPage.class);
        assertNotNull(mainPage);
        assertEquals(mainPage.buttonSearch(), ".//*[@test-attr='button_search']");
        assertEquals(mainPage.textInputSearch(), ".//*[@test-attr='input_search']");
    }

    private MainPage createPage(Class clazz) {
        InvocationHandler invocationHandler = new MainPageDynamicProxy();
        ClassLoader mainPageClassLoader = clazz.getClassLoader();
        return (MainPage) Proxy
                .newProxyInstance(mainPageClassLoader, new Class[]{clazz}, invocationHandler);
    }
}
