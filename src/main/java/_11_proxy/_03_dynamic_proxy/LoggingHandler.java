package _11_proxy._03_dynamic_proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

public class LoggingHandler implements InvocationHandler {
    private final Object target;
    private Map<String, Integer> calls = new HashMap<>();

    public LoggingHandler(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws InvocationTargetException, IllegalAccessException {
        // Intercept the invocation for every single method and do whatever you want!

        String name = method.getName();

        if (name.equals("toString")) {
            return calls.toString();
        }

        calls.merge(name, 1, Integer::sum);

        return method.invoke(target, args);
    }
}
