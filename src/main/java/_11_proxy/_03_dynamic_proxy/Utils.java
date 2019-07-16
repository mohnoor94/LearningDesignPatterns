package _11_proxy._03_dynamic_proxy;

import java.lang.reflect.Proxy;

public class Utils {

    @SuppressWarnings("unchecked")
    static <T> T withLogging(T target, Class<T> _interface) {
        return (T) Proxy.newProxyInstance(
                _interface.getClassLoader(),
                new Class<?>[]{_interface},
                new LoggingHandler(target)
        );
    }
}
