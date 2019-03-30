package _06_bridge._02_with_dependency_injection;

import com.google.inject.AbstractModule;
import com.google.inject.Binder;

public class ShapeModule extends AbstractModule {

    /**
     * Configures a {@link Binder} via the exposed methods.
     */
    @Override
    protected void configure() {
        super.configure();
        bind(Renderer.class).to(VectorRenderer.class);
    }
}
