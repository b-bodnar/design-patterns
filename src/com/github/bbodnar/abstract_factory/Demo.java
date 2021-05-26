package com.github.bbodnar.abstract_factory;

import com.github.bbodnar.abstract_factory.app.Application;
import com.github.bbodnar.abstract_factory.facrories.GUIFactory;
import com.github.bbodnar.abstract_factory.facrories.MacOSFactory;
import com.github.bbodnar.abstract_factory.facrories.WindowsFactory;

public class Demo {

    private static Application configureApplication() {
        Application app;
        GUIFactory factory;
        String operSystemName = System.getProperty("os.name").toLowerCase();
        if (operSystemName.contains("mac")) {
            factory = new MacOSFactory();
        } else {
            factory = new WindowsFactory();
        }
        app = new Application(factory);
        return app;
    }

    public static void main(String[] args) {
        Application app = configureApplication();
        app.paint();
    }
}
