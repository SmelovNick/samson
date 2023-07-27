package taskOne.implementation;

import taskOne.library.Selector;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MainPageDynamicProxy implements InvocationHandler {
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable{
        return method.getAnnotation(Selector.class).xpath();
    }
}
