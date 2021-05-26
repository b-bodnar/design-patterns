package com.github.bbodnar.abstract_factory.buttons;

public class WindowsButton implements Button{
    @Override
    public void paint() {
        System.out.println("Windows button!");
    }
}
