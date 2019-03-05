package _04_singleton._04_inner_static_singleton;

public class InnerStaticSingleton {

    private InnerStaticSingleton() {
    }

    private static class Implementation {
        private static final InnerStaticSingleton INSTANCE = new InnerStaticSingleton();
    }

    // This way guarantees to always get one instance of this singleton
    // even when we have multiple threads
    // without a need to use 'synchronized' at all
    public InnerStaticSingleton getInstance() {
        return Implementation.INSTANCE;
    }
}
