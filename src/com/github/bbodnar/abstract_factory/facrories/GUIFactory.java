package com.github.bbodnar.abstract_factory.facrories;

import com.github.bbodnar.abstract_factory.buttons.Button;
import com.github.bbodnar.abstract_factory.checkboxes.Checkbox;

public interface GUIFactory {

    Checkbox createCheckbox();

    Button createButton();
}
