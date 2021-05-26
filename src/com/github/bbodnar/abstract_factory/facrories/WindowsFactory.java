package com.github.bbodnar.abstract_factory.facrories;

import com.github.bbodnar.abstract_factory.buttons.Button;
import com.github.bbodnar.abstract_factory.buttons.WindowsButton;
import com.github.bbodnar.abstract_factory.checkboxes.Checkbox;
import com.github.bbodnar.abstract_factory.checkboxes.WindowsCheckbox;

public class WindowsFactory implements GUIFactory{
    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }

    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}
