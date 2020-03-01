package _18_null_object._02_dynamic_null_object;

import java.lang.reflect.Proxy;

public class NullObjectBuilder {

  // This will build a null object of any class with a default constructor!
  @SuppressWarnings("unchecked")
  public static <T> T build(Class<T> _interface) {
    return (T) Proxy.newProxyInstance(
            _interface.getClassLoader(),
            new Class<?>[]{_interface},
            (proxy, method, args) -> method.getReturnType().equals(Void.TYPE)
                    ? null
                    : method.getReturnType().getConstructor().newInstance()
    );
  }
}
