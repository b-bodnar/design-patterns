package com.github.bbodnar.abstract_factory.facrories;

import com.github.bbodnar.abstract_factory.buttons.Button;
import com.github.bbodnar.abstract_factory.buttons.MacOSButton;
import com.github.bbodnar.abstract_factory.checkboxes.Checkbox;
import com.github.bbodnar.abstract_factory.checkboxes.MacOSCheckbox;

public class MacOSFactory implements GUIFactory{
    @Override
    public Checkbox createCheckbox() {
        return new MacOSCheckbox();
    }

    @Override
    public Button createButton() {
        return new MacOSButton();
    }
}
