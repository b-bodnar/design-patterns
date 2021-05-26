package com.github.bbodnar.abstract_factory.checkboxes;

public class MacOSCheckbox implements Checkbox {
    @Override
    public void paint() {
        System.out.println("MacOS checkbox!");
    }
}
