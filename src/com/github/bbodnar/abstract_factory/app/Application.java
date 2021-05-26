package com.github.bbodnar.abstract_factory.app;

import com.github.bbodnar.abstract_factory.buttons.Button;
import com.github.bbodnar.abstract_factory.checkboxes.Checkbox;
import com.github.bbodnar.abstract_factory.facrories.GUIFactory;

public class Application {

    private final Checkbox checkbox;
    private final Button button;

    public Application(GUIFactory factory) {
        this.checkbox = factory.createCheckbox();
        this.button = factory.createButton();
    }

    public void paint() {
        checkbox.paint();
        button.paint();
    }
}
