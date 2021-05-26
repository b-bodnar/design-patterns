package com.github.bbodnar.abstract_factory.checkboxes;

public class WindowsCheckbox implements Checkbox{
    @Override
    public void paint() {
        System.out.println("Windows checkbox!");
    }
}
